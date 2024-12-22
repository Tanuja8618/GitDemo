package com.auto.util;

public class Gmail {

    private static final Logger LOGGER = LoggerFactory.getLogger(GMail.class);
    CommonMethods commonMethods = new CommonMethods();

    static String fromadress;
    static Message[] messages = null;
    static String result = "";

    public void getotptsimail() {
        LOGGER.info("In GMail Open method");
        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(HOSTNAME, GMAILUSERNAME, GMAILPASSWORD);
            Folder emailInbox = store.getFolder("Inbox");
            emailInbox.open(Folder.READ_WRITE);
            messages = emailInbox.getMessages();
            System.out.println("Number of mails" + messages.length);
            for (int i = messages.length - 1; i < messages.length; i++) {
                Message message = messages[i];
                try {
                    LOGGER.info("subject: " + message.getSubject());
                    if (message.getSubject().equals(ENGLISHMAILSUBJECT) ||
                            message.getSubject().equals(SPANISHMAILSUBJECT)) {
                        Address[] recipients = message.getFrom();
                        fromadress = Arrays.asList(recipients).toString();
                        if (fromadress.equalsIgnoreCase("[no-reply@orientalbank.com]")) {
                            String msg = getTextFromMessage(message);
                            OTP = getOTP(msg);
                            LOGGER.info("OTP is :" + OTP);
                        }
                    }
                    message.setFlag(Flags.Flag.DELETED, true);
                    break;
                } catch (MessagingException me) {
                    me.printStackTrace();
                }
            }
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    public void getotpauthmail() {
        LOGGER.info("In GMail Open method");
        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(HOSTNAME, GMAILUSERNAME, GMAILPASSWORD);
            Folder emailInbox = store.getFolder("Inbox");
            emailInbox.open(Folder.READ_WRITE);
            messages = emailInbox.getMessages();
            for (int i = messages.length - 1; i < messages.length; i++) {
                Message message = messages[i];
                try {
                    LOGGER.info("subject: " + message.getSubject());
                    if (message.getSubject().equals(ENGLISHMAILSUBJECT) ||
                            message.getSubject().equals(SPANISHMAILSUBJECT)) {
                        Address[] recipients = message.getFrom();
                        fromadress = Arrays.asList(recipients).toString();
                        if (fromadress.equalsIgnoreCase("[no-reply@orientalbank.com]")) {
                            String msg = getTextFromMessage(message);
                            OTP = getOTP(msg);
                        }
                    }
                    message.setFlag(Flags.Flag.DELETED, false);
                    break;
                } catch (MessagingException me) {
                    me.printStackTrace();
                }
            }
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    public void gmailOpenUserId() {
        LOGGER.info("In GMail Open method");
        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(HOSTNAME, GMAILUSERNAME, GMAILPASSWORD);
            Folder emailInbox = store.getFolder("Inbox");
            emailInbox.open(Folder.READ_WRITE);
            messages = emailInbox.getMessages();
            for (int i = messages.length - 1; i < messages.length; i++) {
                Message message = messages[i];
                try {
                    LOGGER.info("subject: " + message.getSubject());
                    if (message.getSubject().equals(ENGLUserIdSUBJECT) ||
                            message.getSubject().equals(ESPUserIdSUBJECT)) {
                        Address[] recipients = message.getFrom();
                        fromadress = Arrays.asList(recipients).toString();
                        if (fromadress.equalsIgnoreCase("[no-reply@orientalbank.com]")) {
                            String msg = getTextFromMessage(message);
                            FORGOTUSERID = getuserid(msg);
                            LOGGER.info("UserId is :" + FORGOTUSERID);
                        }
                    }
                    message.setFlag(Flags.Flag.DELETED, false);
                    break;
                } catch (MessagingException me) {
                    me.printStackTrace();
                }
            }
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    public static void gmailunlocklink() {
        LOGGER.info("In GMail Open method");
        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(HOSTNAME, GMAILUSERNAME, GMAILPASSWORD);
            Folder emailInbox = store.getFolder("Inbox");
            emailInbox.open(Folder.READ_WRITE);
            messages = emailInbox.getMessages();
            for (int i = messages.length - 1; i < messages.length; i++) {
                Message message = messages[i];
                try {
                    LOGGER.info("subject: " + message.getSubject());
                    if (message.getSubject().equals(ENGLISHMAILSUBJECT) ||
                            message.getSubject().equals(SPANISHMAILSUBJECT)) {
                        Address[] recipients = message.getFrom();
                        fromadress = Arrays.asList(recipients).toString();
                        if (fromadress.equalsIgnoreCase("[no-reply@orientalbank.com]")) {
                            UNLOCKACCOUNTURL = getLinkFromMail(message);
                            LOGGER.info("Unlock account link : " + UNLOCKACCOUNTURL);

                        }
                    }
                    message.setFlag(Flags.Flag.DELETED, true);
                    break;
                } catch (MessagingException me) {
                    me.printStackTrace();
                }
            }
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    public void getTemporaryPassword() {
        LOGGER.info("In GMail Open method");
        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(HOSTNAME, GMAILUSERNAME, GMAILPASSWORD);
            Folder emailInbox = store.getFolder("Inbox");
            emailInbox.open(Folder.READ_WRITE);
            messages = emailInbox.getMessages();
            for (int i = messages.length - 1; i < messages.length; i++) {
                Message message = messages[i];
                try {
                    LOGGER.info("subject: " + message.getSubject());
                    if (message.getSubject().equals(ENGtemppwdSUBJECT) ||
                            message.getSubject().equals(ESPtemppwdSUBJECT)) {
                        Address[] recipients = message.getFrom();
                        fromadress = Arrays.asList(recipients).toString();
                        if (fromadress.equalsIgnoreCase("[no-reply@orientalbank.com]")) {
                            String msg = getTextFromMessage(message);
                            TEMPORARYPASSWORD = gettemppwd(msg);
                            LOGGER.info("Temporary Password is : " + TEMPORARYPASSWORD);
                        }
                    }
                    message.setFlag(Flags.Flag.DELETED, true);
                    break;
                } catch (MessagingException me) {
                    me.printStackTrace();
                }
            }
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    private static String getOTP(String msg) {
        String regex = "[^\\d]+";
//        LOGGER.info(msg);
        String[] OTParr = msg.split(regex);
        String  strSub = msg.substring(msg.indexOf("<br><br>"), msg.lastIndexOf("</b>."));
        LOGGER.info("OTP Mail Content : "+ strSub);
//        OTP = OTParr[1];
        OTP = strSub.substring(strSub.indexOf("<b>")+3);
        System.out.println("OTP: " + OTP);
        return OTP;
    }

    private static String getuserid(String msg) {
        String[] Message = msg.split(" ");
        for (int i = 0; i < Message.length; i++) {
            if (Message[i].equals("Username:"))
                FORGOTUSERID = Message[i + 1].trim();
        }
        System.out.println("UserId: " + FORGOTUSERID);
        return FORGOTUSERID;
    }

    private static String gettemppwd(String msg) {
        String[] Message = msg.split(" ");
        for (int i = 0; i < Message.length; i++) {
            if (Message[i].equals("to:"))
                TEMPORARYPASSWORD = Message[i + 1].trim();
        }
        if (TEMPORARYPASSWORD.contains("&#39;"))
            TEMPORARYPASSWORD = TEMPORARYPASSWORD.replace("&#39;", "'");
        else if (TEMPORARYPASSWORD.contains("&quot;"))
            TEMPORARYPASSWORD = TEMPORARYPASSWORD.replace("&quot;", "\"");
        else if (TEMPORARYPASSWORD.contains("&amp;"))
            TEMPORARYPASSWORD = TEMPORARYPASSWORD.replace("&amp;", "&");

        LOGGER.info("Temporary Password : " + TEMPORARYPASSWORD);

        return TEMPORARYPASSWORD;
    }

    public void getInvitationLinkFromMessage() {
        LOGGER.info("In Get Invitation link  method");
        commonMethods.waitforSometimeInSeconds(20);
        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(HOSTNAME, GMAILUSERNAME, GMAILPASSWORD);
            Folder emailInbox = store.getFolder("Inbox");
            emailInbox.open(Folder.READ_WRITE);
            messages = emailInbox.getMessages();
            for (int i = messages.length - 1; i < messages.length; i++) {
                Message message = messages[i];
                try {
                    LOGGER.info("subject: " + message.getSubject());
                    if (message.getSubject().equals(ENGLISHINVITATIONMAILSUBJECT) ||
                            message.getSubject().equals(SPANISHINVITATIONMAILSUBJECT)) {
                        Address[] recipients = message.getFrom();
                        fromadress = Arrays.asList(recipients).toString();
                        if (fromadress.equalsIgnoreCase("[no-reply@orientalbank.com]")) {
                            INVITATION_URL = getUrlsFromMessage(message, ENGLISH_INVITATION_LINKTEXT).get(0);
                            LOGGER.info("Invitation link : " + INVITATION_URL);

                        }
                    } else
                        throw new Exception("Subject with " + ENGLISHINVITATIONMAILSUBJECT + "/" + SPANISHINVITATIONMAILSUBJECT + " mail not found.");
                    message.setFlag(Flags.Flag.DELETED, false);
                    break;
                } catch (MessagingException me) {
                    me.printStackTrace();
                }
            }
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    private String getlinkText(Message message) throws MessagingException, IOException {
        LOGGER.info("inside multipart");
        MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
        String result = "";
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result = result + "\n" + bodyPart.getContent();
                break;
            } else if (bodyPart.isMimeType("text/html")) {
                LOGGER.info("Multipart HTML");
                String html = (String) bodyPart.getContent();
                result = result + "\n" + html;
            } else if (bodyPart.getContent() instanceof MimeMultipart) {
                result = result + getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent());
            }
        }
        return result;
    }


    public boolean compareOTPMessage(String language) {
        String OTPMessage;
        if (language.toLowerCase(Locale.ROOT).equalsIgnoreCase("english")) {
            OTPMessage = ENGOTPMESSAGE1 + OTP + ENGOTPMESSAGE2;
            LOGGER.info(OTPMessage);
            return result.contains(OTPMessage);
        } else if (language.toLowerCase(Locale.ROOT).equalsIgnoreCase("spanish")) {
            OTPMessage = SPANISHOTPMESSAGE1 + OTP + SPANISHOTPMESSAGE2;
            LOGGER.info(OTPMessage);
            return result.contains(OTPMessage);
        }
        return false;
    }

    private String getTextFromMessage(Message message) throws MessagingException, IOException {
        if (message.isMimeType("text/html")) {
            LOGGER.info("GMail message is in HTML format");
            String html = (String) message.getContent();
            result = org.jsoup.Jsoup.parse(html).text();
        } else if (message.isMimeType("multipart/*")) {
            LOGGER.info("inside multipart");
            MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
            result = getTextFromMimeMultipart(mimeMultipart);
        } else if (message.isMimeType("TEXT/PLAIN")) {
            LOGGER.info("GMail message is in Plain format");
            result = message.getContent().toString();
        } else {
            LOGGER.info("GMail message is not in Plain/HTML format");
            result = message.getContentType();
        }
//        LOGGER.info("result: " + result);
        return result;
    }

    private String getTextFromMimeMultipart(
            MimeMultipart mimeMultipart) throws MessagingException, IOException {
        String result = "";
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result = result + "\n" + bodyPart.getContent();
                break;
            } else if (bodyPart.isMimeType("text/html")) {
                LOGGER.info("Multipart HTML");
                String html = (String) bodyPart.getContent();
//                result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
                result = result + "\n" + html;
            } else if (bodyPart.getContent() instanceof MimeMultipart) {
                result = result + getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent());
            }
        }
        return result;
    }

    private static String getLinkFromMail(Message message) throws MessagingException, IOException {
        String html = (String) message.getContent();
        String link = null;
        String arr[] = html.split("\n");
        for (String s : arr) {
            if (s.contains("https:")) {
                String str = s.substring(s.indexOf("https"));
                link = str.substring(0, str.indexOf(">"));
                break;
            }
        }
        return link;
    }

    public List<String> getUrlsFromMessage(Message message, String linkText) throws Exception {
        LOGGER.info("In getURLsFromMessage method");
        String html = getlinkText(message);
        List<String> allMatches = new ArrayList<String>();
        Matcher matcher = Pattern.compile("(<a [^>]+>)" + linkText + "</a>").matcher(html);
        while (matcher.find()) {
            String aTag = matcher.group(1);
            allMatches.add(aTag.substring(aTag.indexOf("http"), aTag.indexOf("\">")));
        }
        return allMatches;
    }


    @Test
    public void case1() {
//        GMail gmail = new GMail();
//        gmail.getotpauthmail();

//        String URL ="https://api-dt-qa.orientalbank.com/autoloanapi/application/getSpecificDetails?applicationId=0001-487&eventName=CollateralInformation";
//        String str = "getSpecificDetails";
//        if (URL.contains(str))
//            System.out.println("found");

//        getInvitationLinkFromMessage();
        getotpauthmail();

    }
}
