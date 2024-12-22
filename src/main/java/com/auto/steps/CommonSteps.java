package com.auto.steps;

public class CommonSteps  extends BaseClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);
    LoginPage loginPage;
    CommonMethods commonMethods;
    GMail gMail;

    @Step("user waited for some time")
    public void waitforSometime(int min) {
        try {
            Thread.sleep((long) min * 60 * 1000);
            LOGGER.info("Waited for " + min + " minutes.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step("Capture OTP from GMAIL using GMail API")
    public void getOTPMailMessage() {
        commonMethods.waitforSometimeInSeconds(30);
        gMail.getotptsimail();
    }

    @Step("Capture OTP from GMAIL ")
    public void getOTPMailMessageAuth() {
        loginPage.getOTPFromGMail();
    }

    @Step("user captures User ID from eMail")
    public void getUsetId() {
        commonMethods.waitforSometimeInSeconds(20);
        gMail.gmailOpenUserId();
    }

    @Step("user captures temp password from eMail")
    public void getTempPassword() {
        commonMethods.waitforSometimeInSeconds(20);
        gMail.getTemporaryPassword();
    }

    @Step("user captures unlock account link from eMail")
    public void getUnlockaccountlink() {
        commonMethods.waitforSometimeInSeconds(20);
        GMail.gmailunlocklink();
    }

    @Step("user needs to wait for sometime")
    public void waitforSometimeInSeconds(int intSec) {
        loginPage.waitForSometime(intSec);
    }
}
