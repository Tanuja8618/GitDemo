package com.auto.util;

public class EmailUtils {

    private Folder folder;
    private Properties properties = null;

    public enum EmailFolder {
        INBOX("INBOX"),
        SPAM("SPAM");

        private String text;

        private EmailFolder(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    /**
     * Uses email.username and email.password properties from the properties file. Reads from Inbox folder of the email application
     *
     * @throws MessagingException
     */
//    public EmailUtils() throws MessagingException {
//        this(EmailFolder.INBOX);
//    }

    /**
     * Uses username and password in properties file to read from a given folder of the email application
     *
     * @param emailFolder Folder in email application to interact with
     * @throws MessagingException
    //     */
//    public EmailUtils(EmailFolder emailFolder) throws MessagingException {
//        this(getEmailUsernameFromProperties(),
//                getEmailPasswordFromProperties(),
//                getEmailServerFromProperties(),
//                emailFolder);
//    }

    /**
     * Connects to email server with credentials provided to read from a given folder of the email application
     *
     * @param username Email username (e.g. janedoe@email.com)
     * @param password Email password
     * @param server   Email server (e.g. smtp.email.com)
     *                 //     * @param emailFolder Folder in email application to interact with
     */
    public EmailUtils(String username, String password, String server) {
//        Properties props = System.getProperties();
//        try {
//            props.load(new FileInputStream(new File("resources/email.properties")));
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.exit(-1);
//        }
        properties = new Properties();
        try {
            properties.setProperty("mail.store.protocol", "imaps");

            Session session = Session.getInstance(properties);
            Store store = session.getStore("imaps");
            store.connect(server, username, password);


//        folder = store.getFolder(emailFolder.getText());
            folder = store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);
        } catch (MessagingException e) {
            System.out.println(e.toString());
        }
    }


    //************* GET EMAIL PROPERTIES *******************

    public static String getEmailAddressFromProperties() {
        return System.getProperty("email.address");
    }

    public static String getEmailUsernameFromProperties() {
        return System.getProperty("email.username");
    }

    public static String getEmailPasswordFromProperties() {
        return System.getProperty("email.password");
    }

    public static String getEmailProtocolFromProperties() {
        return System.getProperty("email.protocol");
    }

    public static int getEmailPortFromProperties() {
        return Integer.parseInt(System.getProperty("email.port"));
    }

    public static String getEmailServerFromProperties() {
        return System.getProperty("email.server");
    }


    //************* EMAIL ACTIONS *******************

    public void openEmail(Message message) throws Exception {
        message.getContent();
    }

    public int getNumberOfMessages() {
        try {
            return folder.getMessageCount();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getNumberOfUnreadMessages() throws MessagingException {
        return folder.getUnreadMessageCount();
    }

    /**
     * Gets a message by its position in the folder. The earliest message is indexed at 1.
     */
    public Message getMessageByIndex(int index) throws MessagingException {
        return folder.getMessage(index);
    }

    public Message getLatestMessage() throws MessagingException {
        return getMessageByIndex(getNumberOfMessages());
    }

    /**
     * Gets all messages within the folder
     */
    public Message[] getAllMessages() throws MessagingException {
        return folder.getMessages();
    }

    /**
     * @param maxToGet maximum number of messages to get, starting from the latest. For example, enter 100 to get the last 100 messages received.
     */
    public Message[] getMessages(int maxToGet) throws MessagingException {
        Map<String, Integer> indices = getStartAndEndIndices(maxToGet);
        return folder.getMessages(indices.get("startIndex"), indices.get("endIndex"));
    }

    /**
     * Searches for messages with a specific subject
     *
     * @param subject     Subject to search messages for
     * @param unreadOnly  Indicate whether to only return matched messages that are unread
     * @param maxToSearch maximum number of messages to search, starting from the latest. For example, enter 100 to search through the last 100 messages.
     */
    public Message[] getMessagesBySubject(String subject, boolean unreadOnly, int maxToSearch) {
        try {
            Map<String, Integer> indices = getStartAndEndIndices(maxToSearch);
            Message[] messages = folder.search(
                    new SubjectTerm(subject),
                    folder.getMessages(indices.get("startIndex"), indices.get("endIndex")));

            if (unreadOnly) {
                List<Message> unreadMessages = new ArrayList<Message>();
                for (Message message : messages) {
                    if (isMessageUnread(message)) {
                        unreadMessages.add(message);
                    }
                }
                messages = unreadMessages.toArray(new Message[]{});
                return messages;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("There are no unread mails.");
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Returns HTML of the email's content
     */
    public String getMessageContent(Message message) throws Exception {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(message.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        return builder.toString();
    }

    /**
     * Returns all urls from an email message with the linkText specified
     */
    public List<String> getUrlsFromMessage(Message message, String linkText) throws Exception {
        String html = getMessageContent(message);
        List<String> allMatches = new ArrayList<String>();
        Matcher matcher = Pattern.compile("(<a [^>]+>)" + linkText + "</a>").matcher(html);
        while (matcher.find()) {
            String aTag = matcher.group(1);
            allMatches.add(aTag.substring(aTag.indexOf("http"), aTag.indexOf("\">")));
        }
        return allMatches;
    }

    private Map<String, Integer> getStartAndEndIndices(int max) {
        int endIndex = getNumberOfMessages();
        int startIndex = endIndex - max;

        //In event that maxToGet is greater than number of messages that exist
        if (startIndex < 1) {
            startIndex = 1;
        }

        Map<String, Integer> indices = new HashMap<String, Integer>();
        indices.put("startIndex", startIndex);
        indices.put("endIndex", endIndex);

        return indices;
    }

    /**
     * Gets text from the end of a line.
     * In this example, the subject of the email is 'Authorization Code'
     * And the line to get the text from begins with 'Authorization code:'
     * Change these items to whatever you need for your email. This is only an example.
     */
    public String getAuthorizationCode() throws Exception {
        Message email = getMessagesBySubject("Authorization Code", true, 5)[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));

        String line;
        String prefix = "Authorization code:";

        while ((line = reader.readLine()) != null) {
            if (line.startsWith(prefix)) {
                return line.substring(line.indexOf(":") + 1);
            }
        }
        return null;
    }

    /**
     * Gets one line of text
     * In this example, the subject of the email is 'Authorization Code'
     * And the line preceding the code begins with 'Authorization code:'
     * Change these items to whatever you need for your email. This is only an example.
     */
    public String getVerificationCode() throws Exception {
        Message email = getMessagesBySubject("Authorization Code", true, 5)[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Authorization code:")) {
                return reader.readLine();
            }
        }
        return null;
    }


    //************* BOOLEAN METHODS *******************

    /**
     * Searches an email message for a specific string
     */
    public boolean isTextInMessage(Message message, String text) throws Exception {
        String content = getMessageContent(message);

        //Some Strings within the email have whitespace and some have break coding. Need to be the same.
        content = content.replace("&nbsp;", " ");
        return content.contains(text);
    }

    public boolean isMessageInFolder(String subject, boolean unreadOnly) throws Exception {
        int messagesFound = getMessagesBySubject(subject, unreadOnly, getNumberOfMessages()).length;
        return messagesFound > 0;
    }

    public boolean isMessageUnread(Message message) throws Exception {
        return !message.isSet(Flags.Flag.SEEN);
    }

    public String getEMailVerificationOTP() {
        try {
            int size = getMessagesBySubject("Oriental Verification", true, 4).length;
            Message email = getMessagesBySubject("Oriental Verification", true, 4)[size - 1];
            BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));
            String line;

            String prefix = "</p>";
            while ((line = reader.readLine()) != null) {
                if (line.contains(prefix)) {
                    return line;
                }
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
