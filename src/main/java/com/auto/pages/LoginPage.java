package com.auto.pages;

public class LoginPage extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);
    ExcelDriver excelDriver = new ExcelDriver();
    CommonMethods commonMethods = new CommonMethods();
    GMail gMail;

    //******** User ID Page

    @FindBy(xpath = "//img[contains(@src,'PortalLogo')]")
    WebElementFacade lblDealerPortalLogo;
    @FindBy(xpath = "//div[@role='button']")
    WebElementFacade langDropdown;
    @FindBy(xpath = "//div[contains(@class,'Enrollment_privacyPolicy')]")
    WebElementFacade privacyPolicy;
    @FindBy(xpath = "//li[@id='ES']")
    WebElementFacade btnSpanish;
    @FindBy(xpath = "//li[@id='EN']")
    WebElementFacade btnEnglish;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_welcomeHeading')]")
    WebElementFacade homePageTitle;
    @FindBy(xpath = "//label[@for='component-outlined']")
    WebElementFacade labelUserId;
    @FindBy(xpath = "(//label[@for='component-outlined'])[2]")
    WebElementFacade labelPassword;
    @FindBy(xpath = "//input[@id='userid']")
    WebElementFacade inputUserId;
    @FindBy(xpath = "//*[contains(@class,'inlineAlert')]")
    WebElementFacade inlineErrorMessage;
    @FindBy(xpath = "//input[@id='userpassword']")
    WebElementFacade inputPassword;
    @FindBy(xpath = "//input[@id='securitycode']")
    WebElementFacade inputSecurityCode;
    @FindBy(xpath = "//button[@data-testid='showHidePasswordHandler']")
    WebElementFacade btnPasswordHide;
    @FindBy(xpath = "//label[@for='rememberme']")
    WebElementFacade rememberMeText;
    @FindBy(xpath = "//input[@id='rememberme']")
    WebElementFacade btnRememberMe;
    @FindBy(xpath = "//button[contains(@class,'Enrollment_login')]")
    WebElementFacade btnLogin;
    @FindBy(xpath = "//button[@id='loginNew']")
    WebElementFacade btnDifferentUserTSI;
    @FindBy(xpath = "//button[@id='loginBtn']")
    WebElementFacade btnDifferentUserTSI_2;
    @FindBy(xpath = "//button[@id='loginLink']")
    WebElementFacade btnDifferentUser;

    //****  TROUBLE SIGN IN

    @FindBy(xpath = "//*[@id='useridpage']/div[3]//button")
    WebElementFacade btnTroubleSignIn;
    @FindBy(xpath = "//*[@data-testid='backBtnTSI']")
    WebElementFacade btnBackInTroubleSignIn;
    @FindBy(xpath = "//*[@data-testid='backButtonOTPChoice']")
    WebElementFacade btnBackInDeviceList;
    @FindBy(xpath = "//*[@data-testid='backButtonOTP']")
    WebElementFacade btnBackInOTPPage;
    @FindBy(xpath = "//h4[contains(@class,'Enrollment_middle_heading')]")
    WebElementFacade lblTroubleSignInTitle;
    @FindBy(xpath = "//label[@data-testid='forgotusername']")
    WebElementFacade lblForgotUserId;
    @FindBy(xpath = "//label[@data-testid='forgotpassword']")
    WebElementFacade lblIForgotMyPassword;
    @FindBy(xpath = "//label[@data-testid='accountlocked']")
    WebElementFacade lblMyAccountIsLocked;
    @FindBy(xpath = "(//div[contains(@class,'MuiBox-root')])[2]")
    WebElementFacade lbleMailIDisRequired;
    @FindBy(xpath = "//label[@aria-label='userid']")
    WebElementFacade userEmailIdTitle;
    @FindBy(xpath = "//label[@for='reenterPassword']/following-sibling::*[@role='alert']")
    WebElementFacade lblPasswordMustBeSame;
    @FindBy(xpath = "//input[@id='userid']")
    WebElementFacade inputEmailAddress;
    @FindBy(xpath = "//button[@type='submit']/span[1]")
    WebElementFacade btnContinueTroubleSignin;

    @FindBy(xpath = "//input[@name='userid']")
    WebElementFacade placeholderUserId;
    @FindBy(xpath = "//input[@name='userpassword']")
    WebElementFacade placeholderPassword;
    @FindBy(xpath = "//input[@id='userid']")
    WebElementFacade placeholderForgotUserId;
    @FindBy(id = "stylesHeading")
    WebElementFacade additionalVerificationTitle;
    @FindBy(id = "stylesSubHeading")
    WebElementFacade additionalVerificationSubTitle;
    @FindBy(xpath = "//*[@id='boxMarginTop']/div")
    WebElementFacade additionalVerificationDropDown;
    @FindBy(xpath = "//button[@type='button']")
    WebElementFacade sendCodeToEmailInAdditionalVerification;
    @FindBy(xpath = "(//div[contains(@class,'MuiBox-root')])[4]")
    WebElementFacade enterThePinTitle;
    @FindBy(xpath = "//input[@id='field1']")
    WebElementFacade inputOTP;
    @FindBy(xpath = "//button[@id='otpContinue']")
    WebElementFacade btnContinueInOtpPage;
    @FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
    WebElementFacade enterResendSecurityCode;
    @FindBy(xpath = "(//div[contains(@class,'MuiBox-root')])[8]/p")
    WebElementFacade resendCodeSubTitle;
    @FindBy(xpath = "//button[@id='loginNew']")
    WebElementFacade btnLoginWithDifferentUserID;
    @FindBy(xpath = "//button[@id='enrollment']")
    WebElementFacade btnEnrollInVerificationPage;
    @FindBy(xpath = "//div[@id='otpchoice']")
    WebElementFacade btnDropEmail;
    @FindBy(xpath = "//*[contains(@class,'Enrollment')]//form/div[1]")
    WebElementFacade lblResetPasswordMessage;
    @FindBy(xpath = "//*[@id='otpchoice']")
    WebElementFacade verificationPageDropDown;


    //****Auto Dealer Dashboard*****//
    @FindBy(xpath = "//*[contains(@class,'dummyHome')]//h4")
    WebElementFacade lblWelcome;
    @FindBy(xpath = "//*[@data-testid='profileMenu']/..//*[@data-testid='KeyboardArrowDownIcon']")
    WebElementFacade btnSelectLogout;
    @FindBy(xpath = "//ul[@role='menu']//li[2]")
    WebElementFacade btnLogout;

    //     OTP Enter Page
    @FindBy(xpath = "//*[contains(@class,'verification')]")
    WebElementFacade titleAdditonalVerificationRequired;
    @FindBy(xpath = "(//*[contains(@class,'MuiBox-root')])[4]")
    WebElementFacade subTxtInAdditionalVerificationRequired;
    @FindBy(xpath = "//button[contains(@class,'resend')]")
    WebElementFacade btnResendSecurityCode;
    @FindBy(xpath = "//button[contains(text(),'Reenviar') or  contains(text(),'Resend')]")
    WebElementFacade btnBatchResendSecurityCode;
    @FindBy(xpath = "//p[contains(@class,'MuiTypography')]")
    WebElementFacade txtResendSecurityCode;

    //wrong otp entered page
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]")
    WebElementFacade errorMsgForOtp;
    @FindBy(xpath = "(//*[contains(@class,'Enrollment_heading')])[2]")
    WebElementFacade lblWrongOTPErrorMSGHeader;
    @FindBy(xpath = "(//button[contains(@class,'fismodal_button')])[1]")
    WebElementFacade btnTryAgainOTP;
    @FindBy(xpath = "(//button[contains(@class,'fismodal_button')])[2]")
    WebElementFacade btnCloseOTPError;
    @FindBy(xpath = "(//*[contains(@class,'Enrollment_invalidOtp')])[1]")
    WebElementFacade lblProvideOTPErrorMessage;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_invalidOtp')]")
    WebElementFacade lblErrorMesagePopup;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_accountUnlockedMessage')]")
    WebElementFacade lblAccountLockmessge;

    //My account is locked 2nd page
    @FindBy(xpath = "//*[contains(@class,'Enrollment_successAlert')]")
    WebElementFacade txtErrorMsgInMyAccountIsLocked;
    @FindBy(xpath = "(//*[contains(@class,'MuiSvgIcon-root')])[2]")
    WebElementFacade btnHideInMyAccountIsLocked;
    @FindBy(xpath = "(//*[contains(@class,'MuiButton')])[3]")
    WebElementFacade btnNextInMyAccountIsLockedPage;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_heading')]")
    WebElementFacade titleLoginToDigitalBanking;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_successAlert')]")
    WebElementFacade errorMsgInLockedPage;

    //Agreement page
    @FindBy(xpath = "(//*[contains(@class,'MuiButtonBase-root')])[1]")
    WebElementFacade btnContinueInAgreementPage;
    @FindBy(xpath = "(//*[contains(@class,'MuiButtonBase-root')])[2]")
    WebElementFacade btnCancelInAgreementPage;
    @FindBy(xpath = "//input[@id='policy']")
    WebElementFacade btnCheckBox;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_container')]/div[3]")
    WebElementFacade lblAgreementText;
    @FindBy(xpath = "//*[contains(@class,'MuiBox-root')]")
    List<WebElementFacade> differPage;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_box')]")
    List<WebElementFacade> inputCount;

    /*Change Password Page*/
    @FindBy(xpath = "//button[contains(@class,'login')]")
    WebElementFacade btnNextInChangePwd;
    @FindBy(xpath = "//input[@id='oldPassword']")
    WebElementFacade inputOldPassword;
    @FindBy(xpath = "//button[@data-testid='oldPasswordIcon']")
    WebElementFacade btnOldPasswordHide;
    @FindBy(xpath = "//input[@id='reenterPassword']")
    WebElementFacade inputConfirmPassword;
    @FindBy(xpath = "//button[@data-testid='reenterPasswordIcon']")
    WebElementFacade btnReEnterPasswordHide;
    @FindBy(xpath = "//input[@id='newPassword']")
    WebElementFacade inputNewPassword;
    @FindBy(xpath = "//button[@data-testid='hidePasswordIcon']")
    WebElementFacade btnNewPasswordHide;
    @FindBy(xpath = "//*[contains(@class,'invalidOtp')]")
    WebElementFacade lblInvalidOtp;
    @FindBy(xpath = "//*[contains(@class,'Enrollment_successAlert')]")
    WebElementFacade lblAlertMessage;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElementFacade valuePasswordHide;
    @FindBy(xpath = "//input[@type='password']")
    WebElementFacade valueForHidePassword;
    @FindBy(xpath = "//input[@type='text']")
    WebElementFacade valueOfUserId;
    @FindBy(xpath = "//input[@id='userid']")
    WebElementFacade valueUserIdHide;
    @FindBy(xpath = "(//*[contains(@class,'MuiBox-root')])[3]")
    WebElementFacade lblAdditionalVerificationRequired;
    @FindBy(xpath = "//input[@value='forgotusername_troublesigninforgotuser']")
    WebElementFacade btnRadioForgotMyUserId;
    @FindBy(xpath = "(//*[contains(@class,'MuiBox-root')])[3]")
    WebElementFacade msgPassword;

    //**Change Password Screen**//
    @FindBy(xpath = "//h4[contains(@class,'MigrationWeb')]")
    WebElementFacade changePassword;
    @FindBy(xpath = "//*[contains(@class,'MuiBox-root')]")
    WebElementFacade plzChangePswdToContinue;
    @FindBy(xpath = "//label[@for='oldPassword']")
    WebElementFacade lblOldPassword;
    @FindBy(xpath = "//label[@for='newPassword']")
    WebElementFacade lblNewPassword;
    @FindBy(xpath = "//label[@for='reenterPassword']")
    WebElementFacade lblConfirmPwd;

    public void clicksOnUnHidePasswordAndValidate(String strPassword) {
        btnPasswordHide.click();
        LOGGER.info("Unhide password value : " + valuePasswordHide.getValue());
        Assert.assertEquals("Unhide password value is wrong", strPassword, valuePasswordHide.getValue());
    }

    public void clickHideButtonPassword() {
        btnPasswordHide.click();
        LOGGER.info(valueForHidePassword.getValue());
        commonMethods.validateTextMessage(valueHidePassword, valueForHidePassword.getValue());
    }

    public void validatePasswordMustSameMessage() {
        waitForSometime(1);
        lblPasswordMustBeSame.waitUntilVisible();
        commonMethods.validateTextMessage(PASSWORDMUSTMESSAGE, lblPasswordMustBeSame.getText());
    }

    public void OtherThanPwdField() {
        homePageTitle.click();
        commonMethods.validateTextMessage(valueHidePassword, valueForHidePassword.getValue());
    }

    public void verifyMessageHomepage() {
        lblDealerPortalLogo.isVisible();
//        homePageTitle.isVisible();
        privacyPolicy.isVisible();
        labelUserId.isVisible();
        langDropdown.isVisible();
        btnTroubleSignIn.isVisible();

        commonMethods.validateTextMessage(HOMEPAGETITLE, homePageTitle.getText());
        commonMethods.validateTextMessage(passwordMessage, msgPassword.getText());
        commonMethods.validateTextMessage(UserIdPlaceholder, placeholderUserId.getAttribute("Placeholder"));
        commonMethods.validateTextMessage(RememberTxt, rememberMeText.getText());

    }

    public void verifyNewPassword() {
        changePassword.isVisible();
        plzChangePswdToContinue.isVisible();
        lblOldPassword.isVisible();
        lblNewPassword.isVisible();
        lblConfirmPwd.isVisible();
        commonMethods.validateTextMessage(changePasswordTxt, changePassword.getText());
        commonMethods.validateTextMessage(pleaseChangePasswordTxt, plzChangePswdToContinue.getText());
        commonMethods.validateTextMessage(oldPasswordTxt, lblOldPassword.getText());
        commonMethods.validateTextMessage(newPasswordTxt, lblNewPassword.getText());
        commonMethods.validateTextMessage(confirmPasswordTxt, lblConfirmPwd.getText());
    }

    public void validateChangepasswordPage() {
        changePassword.waitUntilVisible();
        commonMethods.validateTextMessage(changePasswordTxt, changePassword.getText());
    }

    public void validateHomePage() {
        lblDealerPortalLogo.isVisible();
        privacyPolicy.isVisible();
        langDropdown.isVisible();
        btnTroubleSignIn.isVisible();
        commonMethods.validateTextMessage(HOMEPAGETITLE, homePageTitle.getText());
        commonMethods.validateTextMessage(UserIdPlaceholder, placeholderUserId.getAttribute("Placeholder"));
        commonMethods.validateTextMessage(RememberTxt, rememberMeText.getText());
        LOGGER.info("Validated IDM Home page");
    }

    public void validatePasswordHomePage() {
        lblDealerPortalLogo.isVisible();
        privacyPolicy.isVisible();
        langDropdown.isVisible();
        labelUserId.isVisible();
        labelPassword.isVisible();
        commonMethods.validateTextMessage(HOMEPAGETITLE, homePageTitle.getText());
        commonMethods.validateTextMessage(RememberTxt, rememberMeText.getText());
        commonMethods.validateTextMessage(LabelTroubleSignIn, btnTroubleSignIn.getText());

        commonMethods.validateTextMessage(PasswordPlaceholder, placeholderPassword.getAttribute("Placeholder"));
        LOGGER.info("Validated Password page");
    }

    public void confirmTSIPage() {
        try {
            lblTroubleSignInTitle.waitUntilVisible();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    public void confirmAdditionalVerificationPage() {
        try {
            LOGGER.info("Additional Verification Page Title: " + getDriver().getTitle());
            titleAdditonalVerificationRequired.waitUntilVisible();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    public void validateTroubleSignInHomepage() {
        btnBackInTroubleSignIn.isVisible();
        commonMethods.validateTextMessage(TROUBLESIGNINLABEL, lblTroubleSignInTitle.getText());
        commonMethods.validateTextMessage(ForgotUserIdTxt, lblForgotUserId.getText());
        commonMethods.validateTextMessage(ForgotPasswordTxt, lblIForgotMyPassword.getText());
        commonMethods.validateTextMessage(MyAccountIsLockedTxt, lblMyAccountIsLocked.getText());
        commonMethods.validateTextMessage(UserIdAddressTitle, lbleMailIDisRequired.getText());
        commonMethods.validateTextMessage(UserIdAddressLabel, userEmailIdTitle.getText());
        commonMethods.validateTextMessage(UserIdAddressPlaceholder, placeholderForgotUserId.getAttribute("Placeholder"));
        LOGGER.info("Validated Trouble Sign In title and options");
    }

    public void verifyTroubleSignInVerificationHomePage() {
        additionalVerificationTitle.isVisible();
        additionalVerificationSubTitle.isVisible();
        btnLoginWithDifferentUserID.isVisible();
        btnEnrollInVerificationPage.isVisible();
    }

    public void verifyTroubleSignInTitlesInVerifyPage() {
        additionalVerificationSubTitle.waitUntilVisible();
        commonMethods.validateTextMessage(TroubleSignInVerificationTitle, additionalVerificationTitle.getText());
        commonMethods.validateTextMessage(TroubleSignInVerificationSubTitle, additionalVerificationSubTitle.getText());
    }

    public void selectAdditionalVerificationDropdown(String strAdditionalVerificationDropdown) {
        Select additionalVerificationdrop = new Select(additionalVerificationDropDown);
        additionalVerificationdrop.selectByIndex(0);
    }

    public void enterUserId() {
        inputUserId.waitUntilClickable();
        inputUserId.sendKeys(USERCREDENTAILS.get("User_ID"));
        LOGGER.info("User entered User ID");
    }

    public void waitUntilUserIDClickable() {
        inputUserId.waitUntilVisible();
    }

    public void enterEmptyUserId() {
        inputUserId.sendKeys("ABC");
        inputUserId.clear();
    }

    public void enterEmptyPassword() {
        inputPassword.sendKeys("ABC");
        inputPassword.clear();
    }

    public void enterUserIDAndClickOnContinue() {
        inputEmailAddress.clear();
        inputEmailAddress.sendKeys(USERCREDENTAILS.get("User_ID"));
        btnContinueTroubleSignin.click();
    }

    public void enterEmailAndClickOnContinue() {
        inputEmailAddress.clear();
        inputEmailAddress.sendKeys(USERCREDENTAILS.get("Email_ID"));
        btnContinueTroubleSignin.click();
    }

    public void validateUserIdErrorMsg() {
        inlineErrorMessage.waitUntilVisible();
        commonMethods.validateTextMessage(UserIdEmptyErrorMsg, inlineErrorMessage.getText());
    }

    public void validatePasswordErrorMsg() {
        inlineErrorMessage.waitUntilVisible();
        commonMethods.validateTextMessage(PasswordErrorMsg, inlineErrorMessage.getText());
    }

    public void enterLoginBtn() {
        waitForSometime(4);
        btnLogin.waitUntilClickable();
        btnLogin.click();
        LOGGER.info("User clicked on Next/Submit button");
    }

    public void clickOnDifferentUserID() {
        btnDifferentUser.waitUntilClickable();
        btnDifferentUser.click();
        LOGGER.info("Clicked on Log in with a different User ID link");
    }

    public void clickOnDifferentUserIDTSI() {
        btnDifferentUserTSI.waitUntilClickable();
        btnDifferentUserTSI.click();
        LOGGER.info("Clicked on Log in with a different User ID link");
    }

    public void clickOnDifferentUserIDTSI_2() {
        btnDifferentUserTSI_2.waitUntilClickable();
        btnDifferentUserTSI_2.click();
        LOGGER.info("Clicked on Log in with a different User ID link");
    }

    public void clickOnTroubleSignIn() throws Exception {
        try {
            btnTroubleSignIn.click();
            LOGGER.info("User clicked on Trouble Sign IN button");
        } catch (NoSuchElementException e) {
            throw new Exception("Trouble Signing In web element is not found");
        }
    }

    public void validateTroubleSignInTitle(String strTroubleSignInTitle) {
        commonMethods.validateTextMessage(strTroubleSignInTitle, lblTroubleSignInTitle.getText());
    }

    public void validateForgotUserId(String strEmailAddressTitle, String strEmailTextLabel, String strplaceholderForgotUserId) {
        lblForgotUserId.waitUntilVisible();
        commonMethods.validateTextMessage(strEmailAddressTitle, lbleMailIDisRequired.getText());
        commonMethods.validateTextMessage(strEmailTextLabel, userEmailIdTitle.getText());
        commonMethods.validateTextMessage(strplaceholderForgotUserId, placeholderForgotUserId.getAttribute("placeholder"));
    }

    public void validateForgotPassword(String strUseridEmailAddressTitle, String struserIdEmailTextLabel, String strplaceholderForgotUserIdEmail) {
        lblIForgotMyPassword.click();
        commonMethods.validateTextMessage(strUseridEmailAddressTitle, lbleMailIDisRequired.getText());
        commonMethods.validateTextMessage(struserIdEmailTextLabel, userEmailIdTitle.getText());
        commonMethods.validateTextMessage(strplaceholderForgotUserIdEmail, placeholderForgotUserId.getAttribute("placeholder"));
    }

    public void validateTroubleSignInTitles(String strForgotUserIdTitle, String strIForgotMyPass, String strMyAccountIsLocked) {
        commonMethods.validateTextMessage(strForgotUserIdTitle, lblForgotUserId.getText());
        commonMethods.validateTextMessage(strIForgotMyPass, lblIForgotMyPassword.getText());
        commonMethods.validateTextMessage(strMyAccountIsLocked, lblMyAccountIsLocked.getText());
    }

    public void selectLanguage(String strLanguage) {
//        scrollDown(100);
        langDropdown.waitUntilEnabled();
        langDropdown.waitUntilClickable();
        if (strLanguage.equalsIgnoreCase("English") && langDropdown.getText().equalsIgnoreCase("EN")) {
            langDropdown.click();
            btnEnglish.click();
            flagLanguage = "English";
            LOGGER.info(strLanguage + "  language is selected");
        } else if (strLanguage.equalsIgnoreCase("Spanish") && langDropdown.getText().equalsIgnoreCase("ES")) {
            Actions actions = new Actions(getDriver());
            actions.moveToElement(langDropdown);
            langDropdown.click();
            btnSpanish.click();
            flagLanguage = "Spanish";
            LOGGER.info(strLanguage + "  language is selected");
        }
    }

    private void readTranslationData() {
        //if (!englisData.isEmpty())
        englisData = excelDriver.getSheetDataBasedOnColumn("Translation_Data", "Translation", "English");
        //if (!spanishData.isEmpty())
        spanishData = excelDriver.getSheetDataBasedOnColumn("Translation_Data", "Translation", "Spanish");
        LOGGER.info("Translation data is loaded.");
    }

    public String getTransalationData(String requestedData) {
        try {
            if (flagLanguage.equalsIgnoreCase("spanish"))
                return spanishData.get(requestedData);
            else
                return englisData.get(requestedData);
        } catch (Exception e) {
            LOGGER.warn(requestedData + " -- " + "  is not found transalation data sheet");
        }
        return null;
    }

    public void validateTroubleSignInTexts() {
        commonMethods.validateTextMessage(TROUBLESIGNINLABEL, lblTroubleSignInTitle.getText());
        commonMethods.validateTextMessage(ForgotUserIdTxt, lblForgotUserId.getText());
        commonMethods.validateTextMessage(ForgotPasswordTxt, lblIForgotMyPassword.getText());
        commonMethods.validateTextMessage(MyAccountIsLockedTxt, lblMyAccountIsLocked.getText());
        commonMethods.validateTextMessage(UserIdAddressTitle, lbleMailIDisRequired.getText());
        commonMethods.validateTextMessage(UserIdAddressLabel, userEmailIdTitle.getText());
        commonMethods.validateTextMessage(UserIdAddressPlaceholder, placeholderForgotUserId.getAttribute("Placeholder"));
    }

    public void verifyLabelsForIForgotMYUserID() {
        lblForgotUserId.click();
        commonMethods.validateTextMessage(UserIdAddressTitle, lbleMailIDisRequired.getText());
        commonMethods.validateTextMessage(UserIdAddressLabel, userEmailIdTitle.getText());
        commonMethods.validateTextMessage(UserIdAddressPlaceholder, placeholderForgotUserId.getAttribute("Placeholder"));
    }

    public void verifyLabelsForIForgotMyPassword() {
        lblIForgotMyPassword.click();
        commonMethods.validateTextMessage(UserIdOrEmailAddressTitle, lbleMailIDisRequired.getText());
        commonMethods.validateTextMessage(UserIdOrEmailAddressLabel, userEmailIdTitle.getText());
        commonMethods.validateTextMessage(UserIdOrEmailAddressPlaceholder, placeholderForgotUserId.getAttribute("Placeholder"));
    }

    public void verifyLabelsForMyAccountIsLocked() {
        lblMyAccountIsLocked.click();
        commonMethods.validateTextMessage(UserIdOrEmailAddressTitle, lbleMailIDisRequired.getText());
        commonMethods.validateTextMessage(UserIdOrEmailAddressLabel, userEmailIdTitle.getText());
        commonMethods.validateTextMessage(UserIdOrEmailAddressPlaceholder, placeholderForgotUserId.getAttribute("Placeholder"));
    }

//    public void validateInvalidPasswordErrorMessage() {
//        errorMsgForInvalidPass.waitUntilVisible();
//        commonMethods.validateTextMessage(Wrong_Password_Account_Locked_Message, errorMsgForInvalidPass.getText());
//    }

    public void WrongPasswordAccountLockedMsg() throws Exception {
        try {
            lblAccountLockmessge.waitUntilVisible();
            commonMethods.validateTextMessage(Wrong_Password_Account_Locked_Message, lblErrorMesagePopup.getText());
            LOGGER.info("Validated " + WRONGUSERNAMEPASSWORD + " message.");
        } catch (NoSuchElementException e) {
            throw new Exception("Account Lock Message is not visible");
        }
    }

    public void enterInputThrice(String pwd) {
        for (int i = 0; i <= 2; i++) {
            inputPassword.sendKeys(pwd);
            inputPassword.clear();
            btnLogin.click();
        }
    }

    public void entersEmptyEmail() {
        inputUserId.sendKeys("ABC");
        validateInlineErrorMessage(UserIdOrEmailAddressErrorMsg);
        inputUserId.clear();
        inputUserId.sendKeys("test@test.com");
        inputUserId.clear();
        inputUserId.sendKeys("test@test");
        validateInlineErrorMessage(UserIdOrEmailAddressErrorMsg);
        inputUserId.clear();
    }

    public void validateTSIForgotUserIDErrorMessages() {
        clickOnTSIContinue();
        inputUserId.sendKeys("ABC");
        validateInlineErrorMessage(UserIdAddressErrorMsg);
        inputUserId.clear();
        inputUserId.sendKeys("test@test.com");
        inputUserId.clear();
        inputUserId.sendKeys("test@test");
        validateInlineErrorMessage(UserIdAddressErrorMsg);
        inputUserId.clear();
        inputUserId.sendKeys("test1234@test.com");
        clickOnTSIContinue();
        waitForSometime(3);
        commonMethods.validateTextMessage(TSI_CONTACT_US_MESSAGE, lblErrorMesagePopup.getText());
    }

    public void validateTSIForgotPasswordErrorMessages() {
        clickOnTSIContinue();
        validateInlineErrorMessage(UserIdOrEmailAddressErrorMsg);
        inputUserId.sendKeys("ABC");
        inputUserId.clear();
        validateInlineErrorMessage(UserIdOrEmailAddressErrorMsg);
        inputUserId.clear();
        inputUserId.sendKeys("ABC@ABC.com");
        clickOnTSIContinue();
        waitForSometime(3);
        commonMethods.validateTextMessage(TSI_CONTACT_US_MESSAGE, lblErrorMesagePopup.getText());
    }

    public void testExecutionLanguage() {
        selectLanguage(TESTEXECUTIONLANGUAGE);
        readTranslationData();
    }

    public void enterPassword() {
        inputPassword.waitUntilEnabled();
        inputPassword.sendKeys(USERCREDENTAILS.get("Password"));
        LOGGER.info("User entered Password");
    }

    public void enterPasswordAsNewPassword() {
        inputPassword.waitUntilEnabled();
        inputPassword.sendKeys(USERCREDENTAILS.get("New_Password"));
        LOGGER.info("User entered Password as new password ");
    }

    public void enterTemporaryPassword() {
        System.out.println(TEMPORARYPASSWORD);
        btnPasswordHide.click();
        inputPassword.sendKeys(TEMPORARYPASSWORD);
        LOGGER.info("User entered temporary password as : " + TEMPORARYPASSWORD);
    }

    public void enterWrongPassword() {
        btnPasswordHide.click();
        inputPassword.sendKeys("WRONGPASSWORD");
        LOGGER.info("User entered wrong password");
    }

    public void clickBtnLogin() throws Exception {
        try {
            btnLogin.waitUntilClickable();
            btnLogin.click();
            LOGGER.info("Clicked on Login Button");
            System.out.println("Login time : " + java.time.LocalDateTime.now());
        } catch (NoSuchElementException e) {
            throw new Exception("Login Button is not visible or clicked");
        }
    }

    public void clickBtnSendCodeToEmail() {
        if (!flagSkipOTP) {
            sendCodeToEmailInAdditionalVerification.click();
            LOGGER.info("Clicked on Send code to eMail");
        } else
            LOGGER.info("OTP is skipped hence send OTP code step skipped");
    }

    public void getOTPFromGMail() {
        if (!flagSkipOTP) {
            commonMethods.waitforSometimeInSeconds(30);
            gMail.getotpauthmail();
            LOGGER.info("Captured OTP from GMail");
        } else
            LOGGER.info("OTP is skipped hence capture OTP code step skipped");
    }

    public void clickOnNextInOtpPage() {
        btnContinueInOtpPage.click();
    }

    public void clickOnNextInOtpPageForAgree() {
        btnContinueInOtpPage.click();
    }

    public void clickDropdownOnVerificationPage() {
        try {
            LOGGER.info("OTP Skip status in Verification method: "+ flagSkipOTP);
            if (!flagSkipOTP) {
                verificationPageDropDown.click();
                LOGGER.info("Clicked on Verification page dropdown");
            } else
                LOGGER.info("OTP Verification step is skipped");
        } catch (Exception e) {
            flagSkipOTP = true;
        }
    }

    public void selectEmailFromDropDown() {
        if (!flagSkipOTP) {
            $("//li[contains(text(),'" + USERCREDENTAILS.get("Masked_eMail_ID") + "')]").waitUntilVisible();
            $("//li[contains(text(),'" + USERCREDENTAILS.get("Masked_eMail_ID") + "')]").click();
            LOGGER.info(USERCREDENTAILS.get("Masked_eMail_ID") + " -- Email selected from dropdown.");
        } else
            LOGGER.info("OTP skipped true and Email step is skipped");
    }

    public void verifyOtpEnterPage() {
        titleAdditonalVerificationRequired.isVisible();
        subTxtInAdditionalVerificationRequired.isVisible();
        btnResendSecurityCode.isVisible();
        txtResendSecurityCode.isVisible();
        btnBackInOTPPage.isVisible();
        btnContinueInOtpPage.isVisible();
    }

    public void validateOtpPageTitles() {
        commonMethods.validateTextMessage(TroubleSignInVerificationTitle, titleAdditonalVerificationRequired.getText());
        commonMethods.validateTextMessage(SubTextInOtpPage, subTxtInAdditionalVerificationRequired.getText());
        commonMethods.validateTextMessage(ResendCodeLinkText, txtResendSecurityCode.getText());
        commonMethods.validateTextMessage(ResendCodeText, btnResendSecurityCode.getText());
    }

    public void validateMyAccountIsLockedPage() {
        titleLoginToDigitalBanking.isVisible();
        txtErrorMsgInMyAccountIsLocked.isVisible();
        btnHideInMyAccountIsLocked.isVisible();
        btnNextInMyAccountIsLockedPage.isVisible();
        btnRememberMe.isVisible();
        btnTroubleSignIn.isVisible();

    }

    public void verifyMyAccountIsLockedTitles() {
        commonMethods.validateTextMessage(HOMEPAGETITLE, titleLoginToDigitalBanking.getText());
        commonMethods.validateTextMessage(MyAccountIsLockedSubTxt, txtErrorMsgInMyAccountIsLocked.getText());
//        commonMethods.validateTextMessage(UserIdPlaceholder,placeholderUserId.getText());
        commonMethods.validateTextMessage(RememberTxt, rememberMeText.getText());
    }

    public void verifyOtpErrorPage() {
        errorMsgForOtp.isVisible();
        lblWrongOTPErrorMSGHeader.isVisible();
    }

    public void validateErrorMsgInLockedPage() {
        errorMsgInLockedPage.waitUntilVisible();
        commonMethods.validateTextMessage(ErrorMsgInLockedPage, errorMsgInLockedPage.getText());
    }

    public void clickOnCancelPrivacyPolicy() throws Exception {
        btnContinueInAgreementPage.waitUntilVisible();
        LOGGER.info("Navigated to policy agreement page");
        waitForSometime(5);
        btnCancelInAgreementPage.click();
        LOGGER.info("Clicked on Cancel button");
    }

    public void clickOnAgreePolicyButton() {
        try {
            waitForSometime(10);
            btnCheckBox.click();
            btnContinueInAgreementPage.click();
            LOGGER.info(" Policy Agreement accepted");
        } catch (Exception e) {
            LOGGER.info(" Policy Agreement Agree button Not Visible and not accepted.");
        }
    }

    private void confirm_UID_Or_PWD_Page() {
        inputCount.get(0).waitUntilVisible();
        if (inputCount.size() == 2)
            USER_ID_PAGE = true;
        LOGGER.info("Validated User ID Page");
    }

    public void validateUserIDPage() {
        confirm_UID_Or_PWD_Page();
        Assert.assertTrue("User is not in Login page", USER_ID_PAGE);
        LOGGER.info("User in Login page");
    }

    public void verifyLoginPage() {
        lblDealerPortalLogo.waitUntilVisible();
        System.out.println("IDM Logo display time : " + java.time.LocalDateTime.now());
        lblDealerPortalLogo.isVisible();
        System.out.println("IDM Logo display time : " + java.time.LocalDateTime.now());
        homePageTitle.isVisible();
        privacyPolicy.isVisible();
        labelUserId.isVisible();
        LOGGER.info("Auto IDM URL: " + getDriver().getCurrentUrl());
        LOGGER.info("User redirected to Auto IDM Login Page");
    }

    public void enterOtpAndClicksOnNextButton() {
        if (!flagSkipOTP) {
            enterOTP();
        } else
            LOGGER.info("OTP is skipped hence Enter OTP step is skipped");
        flagSkipOTP = false;
    }

    public void enterOTP() {
        try {
            LOGGER.info("In Enter OTP step: " + OTP);
            inputOTP.typeAndEnter(OTP);
            LOGGER.info(OTP + " OTP entered successfully.");
        } catch (Exception e) {
            LOGGER.info("Either OTP is null or not generated or Account got locked.");
        }
    }

    public void enterWrongOTPAndClickOnNext() {
        try {
            inputOTP.typeAndEnter("123456");
            LOGGER.info("Wrong OTP entered successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearOTPField() {
        WebElementFacade eleOTP = null;
        try {
            for (int i = OTPSIZE; i >= 1; i--) {
                String xpathOTP = "//input[contains(@id,'field" + i + "')]";
                eleOTP = findBy(xpathOTP);
                eleOTP.clear();
            }
        } catch (Exception e) {
            LOGGER.warn("Either OTP is null or not generated or Account got locked.");
        }
    }

    public void clicksOnIForgotMyPassword() {
        try {
            lblIForgotMyPassword.click();
        } catch (Exception e) {
            LOGGER.warn("I Forgot My Password button is not Visible.");
        }
    }

    public void clicksOnMyAccountIsLocked() {
        try {
            lblMyAccountIsLocked.waitUntilClickable();
            lblMyAccountIsLocked.click();
        } catch (Exception e) {
            LOGGER.warn("My account is locked is not Visible.");
        }
    }

    public void validatesPageAndMessageDisplayed() throws Exception {
        try {
            lblAlertMessage.waitUntilVisible();
            commonMethods.validateTextMessage(IForgotMyUserIdMessage, lblAlertMessage.getText());
        } catch (NoSuchElementException e) {
            throw new Exception("Alert Message not Visible");
        }
    }

    public void validateResetPasswordMessage() {
        waitForSometime(20);
        lblResetPasswordMessage.waitUntilVisible();
        String message = getTransalationData(RESETPASSWORDMESSAGE) + " " + USERCREDENTAILS.get("Masked_eMail_ID") + ".";
        Assert.assertEquals(message, lblResetPasswordMessage.getText());
    }

    public void validateTemporaryPasswordMessage() throws Exception {
        try {
            lblAlertMessage.waitUntilVisible();
            commonMethods.validateTextMessage(IForgotMyPasswordMessage, lblAlertMessage.getText());
        } catch (NoSuchElementException e) {
            throw new Exception("Temporary Password sent to emailAlert Message not visible");
        }
    }

    public void validateWrongOldPasswordErrorMessage() {
        lblInvalidOtp.waitUntilVisible();
        commonMethods.validateTextMessage(OLDPASSWORDWRONGMSG, lblInvalidOtp.getText());
    }

    public void validatePreviousNewPasswordErrorMessage() {
        lblInvalidOtp.waitUntilVisible();
        commonMethods.validateTextMessage(PASSWORDSHOULDMATCHMSG, lblInvalidOtp.getText());
    }

    public void validateChangePasswordMessages(String strMessage) {
        lblInvalidOtp.waitUntilVisible();
        if (strMessage.equalsIgnoreCase("Old_Password_Wrong"))
            commonMethods.validateTextMessage(OLDPASSWORDWRONGMSG, lblInvalidOtp.getText());
        else if (strMessage.equalsIgnoreCase("New_Password_Wrong"))
            commonMethods.validateTextMessage(PASSWORDSHOULDMATCHMSG, lblInvalidOtp.getText());
        LOGGER.info(lblInvalidOtp.getText() + " message validated");
    }

    public void validatesThePageAndMsgForMyAccountIsLocked() {
        try {
            lblAlertMessage.waitUntilVisible();
            LOGGER.info(lblAlertMessage.getText());
            commonMethods.validateTextMessage(MyAccountIsLockedMessage, lblAlertMessage.getText());
        } catch (NoSuchElementException e) {
            LOGGER.info("Account unlock Link sent alert message is not displayed");
        }
    }

    public void entersNewPassword(String strpwd) {
        inputNewPassword.clear();
        btnNewPasswordHide.click();
        inputNewPassword.sendKeys(strpwd);
    }

    public void enterNewPassword() {
        inputNewPassword.clear();
        btnNewPasswordHide.click();
        inputNewPassword.sendKeys(USERCREDENTAILS.get("New_Password"));
        LOGGER.info("Entered new password" + USERCREDENTAILS.get("New_Password"));
    }

    public void validateAccountBlockedMessage() {
        lblInvalidOtp.waitUntilVisible();
        validateUserIDPage();
        commonMethods.validateTextMessage(ADMINSUSPENDMESSAGE, lblInvalidOtp.getText());
        LOGGER.info("Account blocked message validated");
    }

    public void enterOldPWDForNewPasswordConfirmPassword() {
        inputNewPassword.clear();
        btnNewPasswordHide.click();
        while (!inputNewPassword.getAttribute("value").equals("")) {
            inputNewPassword.sendKeys(Keys.BACK_SPACE);
        }
        inputNewPassword.sendKeys(USERCREDENTAILS.get("Password"));
        inputConfirmPassword.clear();
        inputConfirmPassword.click();
        while (!inputConfirmPassword.getAttribute("value").equals("")) {
            inputConfirmPassword.sendKeys(Keys.BACK_SPACE);
        }
        inputConfirmPassword.sendKeys(USERCREDENTAILS.get("Password"));
        LOGGER.info("Entered old password for New password and Confirm password");
    }

    public void enterNewPWDForNewPasswordConfirmPassword() {
        inputNewPassword.clear();
        btnNewPasswordHide.click();
        inputNewPassword.sendKeys(USERCREDENTAILS.get("New_Password"));
        inputConfirmPassword.clear();
        inputConfirmPassword.click();
        inputConfirmPassword.sendKeys(USERCREDENTAILS.get("New_Password"));
        LOGGER.info("Entered new password for New password and Confirm password " + USERCREDENTAILS.get("New_Password"));
    }

    public void enterConfirmPassword() {
        inputConfirmPassword.clear();
        btnNewPasswordHide.click();
        inputConfirmPassword.sendKeys(USERCREDENTAILS.get("New_Password"));
        LOGGER.info("Entered Confirmed password  " + USERCREDENTAILS.get("New_Password"));
    }

    public void enterOldPasswordAsTempPassword() {
        inputOldPassword.waitUntilClickable();
        inputOldPassword.clear();
        btnOldPasswordHide.click();
        while (!inputOldPassword.getAttribute("value").equals("")) {
            inputOldPassword.sendKeys(Keys.BACK_SPACE);
        }
        inputOldPassword.sendKeys(TEMPORARYPASSWORD);
        LOGGER.info("User enters old password as Temporary password");
    }

    public void enterWrongPasswordForOldPassword() {
        inputOldPassword.waitUntilClickable();
        inputOldPassword.clear();
        btnOldPasswordHide.click();
        inputOldPassword.sendKeys("WrongPassword@1");
        LOGGER.info("User enters old password as wrong password");
    }

    public void clicksOnNextBtnInChangePwd() throws Exception {
        try {
            btnNextInChangePwd.waitUntilVisible();
            btnNextInChangePwd.click();
        } catch (Exception e) {
            throw new Exception("Change password button is not visible");
        }
    }

    public void clickOnTSIContinue() {
        btnContinueTroubleSignin.click();
    }

    public void validateRememberMeButton() {
        btnRememberMe.click();
        commonMethods.validateTextMessage(RememberTxt, rememberMeText.getText());
    }

    public void isRememberMeSelected(String strChecked) {
        if (strChecked.equalsIgnoreCase("checked"))
            Assert.assertEquals(btnRememberMe.getAttribute("class"), "checked");
        else if (strChecked.equalsIgnoreCase("unchecked"))
            Assert.assertEquals(btnRememberMe.getAttribute("class"), "unchecked");
        LOGGER.info("Remember ME button " + strChecked + " validated");
    }

    public void validateRememberMe(String user_ID) {
        Assert.assertEquals("User ID is not matched for Remember ID", inputUserId.getAttribute("value"), USERCREDENTAILS.get("User_ID"));
        LOGGER.info("User ID is saved after Remember button is selected");
    }

    public void validateEmptyUserIDValue() {
        Assert.assertTrue("User ID is not matched for Remember ID", inputUserId.getAttribute("value").isEmpty());
        LOGGER.info("User ID is not saved after Remember button is deselected");
    }

    public void waitForSometime(int sec) {
        try {
            Thread.sleep(sec * 1000L);
            LOGGER.info(" Waited for " + sec + " seconds.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void validateForgotUserID() {
        try {
            Assert.assertEquals(USERCREDENTAILS.get("User_ID"), FORGOTUSERID);
            LOGGER.info("User ID: " + FORGOTUSERID + " is matched");
        } catch (Exception e) {
            LOGGER.warn(USERCREDENTAILS.get("User_ID") + " -- " + FORGOTUSERID + " are not matched.");
        }
    }

    public void navigateToAccountLockURL() {
        try {
            if (!(UNLOCKACCOUNTURL == null))
                getDriver().get(UNLOCKACCOUNTURL);
        } catch (Exception e) {
            LOGGER.warn("Unlock URL is blank");
        }
    }

    public void navigateToPasswordResetLink() {
        if (!(RESETPASSWORDLINK == null)) {
            LOGGER.info("Reset Password link :" + RESETPASSWORDLINK);
            getDriver().get(RESETPASSWORDLINK);
            waitForSometime(15);
            LOGGER.info("Navigated password reset link");
        } else
            LOGGER.warn("Password Reset link is blank");
    }

    public void validateAccountResetMessage() {
        try {
            lblAlertMessage.waitUntilVisible();
            LOGGER.info(lblAlertMessage.getText());
            commonMethods.validateTextMessage(UNLOCKACCOUNTRESETMESSAGE, lblAlertMessage.getText());
            LOGGER.info(lblAlertMessage.getText() + " message validated");
        } catch (Exception e) {
            LOGGER.info("Account Reset Alert is not  visible");
        }
    }

    public void additionalVerifcationPage() {
        try {
            additionalVerificationTitle.waitUntilVisible();
            LOGGER.info("Additional Verification Required page is displayed.");
        } catch (Exception e) {
            LOGGER.warn("Additional Verification Required - Page is not displayed");
        }
    }

    public void validateEmptyUserIDErrorMessage() throws Exception {
        try {
            commonMethods.validateTextMessage(UserIdEmptyErrorMsg, inlineErrorMessage.getText());
            LOGGER.info("Validated Empty user id error message");
        } catch (NoSuchElementException e) {
            throw new Exception("User ID Inline error message is not displayed");
        }
    }

    public void validateEmptyPasswordErrorMessage() throws Exception {
        try {
            commonMethods.validateTextMessage(PasswordErrorMsg, inlineErrorMessage.getText());
            LOGGER.info("Validated Empty password error message");
        } catch (NoSuchElementException e) {
            throw new Exception("Password Inline error message is not displayed");
        }
    }

    public void validateInlineErrorMessage(String msg) {
        commonMethods.validateTextMessage(msg, inlineErrorMessage.getText());
        LOGGER.info("Validated " + msg + "  message.");
    }

    public void clickOnTryAgainOTPButton() {
        btnTryAgainOTP.click();
    }

    public void clickOnCloseButton() {
        btnCloseOTPError.click();
    }

    public void validateOTPErrorMessage() {
//        waitForSometime(5);
        lblErrorMesagePopup.waitUntilVisible();
        commonMethods.validateTextMessage(OTPERRORMESSAGE, lblErrorMesagePopup.getText());
        LOGGER.info("Validated OTP error message");
    }

    public void validateProvideOTPErrorMessage() {
        lblProvideOTPErrorMessage.waitUntilVisible();
        commonMethods.validateTextMessage(PROVIDEOTPERRORMESSAGE, lblProvideOTPErrorMessage.getText());
    }

    public void validateOTPErrorMessageInUserIDPage() {
        lblAlertMessage.waitUntilVisible();
        commonMethods.validateTextMessage(OTPERRORMESSAGE, lblAlertMessage.getText());
    }

    public void validateThirdOTPWrongMessage() {
        validateOTPErrorMessageInUserIDPage();
    }

    public void validateOTPLockedMessage() {
        lblProvideOTPErrorMessage.waitUntilVisible();
        commonMethods.validateTextMessage(OTPACCOUNTLOCKMESSAGE, lblProvideOTPErrorMessage.getText());
    }

    public void validateTempOTPLockedMessageTSI() {
        waitForSometime(3);
        lblErrorMesagePopup.waitUntilClickable();
        commonMethods.validateTextMessage(RESENDOTPTEMPORARYMESSAGETSI, lblErrorMesagePopup.getText());
        LOGGER.info("Validated temporary OTP locked message in TSI page");
    }

    public void validateTempOTPLockedMessageUserID() {
        waitForSometime(5);
        lblErrorMesagePopup.waitUntilVisible();
        commonMethods.validateTextMessage(RESENDOTPTEMPORARYMESSAGEUSERID, lblErrorMesagePopup.getText());
        LOGGER.info("Validated temporary OTP locked message in User ID page");
    }

    public void validateOTP24HoursLockedMessageUserID() {
        waitForSometime(3);
        commonMethods.validateTextMessage(RESENDOTP24HOURSLOCKMESSAGEUSERID, lblErrorMesagePopup.getText());
        LOGGER.info("Validated 24 hours OTP locked message in User ID page");
    }

    public void validateTempOTPRetryLockedMessageUserID() {
        waitForSometime(5);
        commonMethods.validateTextMessage(OTPRETRYTEMPORARYMESSAGEUSERID, lblErrorMesagePopup.getText());
        LOGGER.info("Validated temporary OTP retry locked message in User ID page");
    }

    public void validateOTPRetry24HoursLockedMessageUserID() {
        waitForSometime(3);
        commonMethods.validateTextMessage(OTPRETRY24HOURSMESSAGEUSERID, lblErrorMesagePopup.getText());
        LOGGER.info("Validated 24 hours OTP retry locked message in User ID page");
    }

    public void clickOnResendOTP() {
        waitForSometime(10);
        btnResendSecurityCode.waitUntilVisible();
        btnResendSecurityCode.waitUntilClickable();
        btnResendSecurityCode.click();
        LOGGER.info("Resend OTP count : " + RESENDOTPCOUNT + 1);
        RESENDOTPCOUNT++;
    }

    public void validateResendOTPMessage() {
        lblAlertMessage.waitUntilVisible();
        commonMethods.validateTextMessage(RESENDOTPMESSAGE, lblAlertMessage.getText());
    }

    public void validateWrongPasswordMessage() {
        lblErrorMesagePopup.waitUntilVisible();
        commonMethods.validateTextMessage(WRONGUSERNAMEPASSWORD, lblErrorMesagePopup.getText());
        LOGGER.info("Validated " + WRONGUSERNAMEPASSWORD + " message.");
    }

    public void loadCredentails() {
        if (CREDENTAILSDATA.isEmpty()) {
            CREDENTAILSDATA = excelDriver.getSheetData("UserData", "Credentails");
            LOGGER.info("User credentials data loaded from excel");
        } else
            LOGGER.info("User credentials data already loaded from excel");
    }

    public void readCredentailsData(String key) {
        try {
            loadCredentails();
            USERCREDENTAILS = CREDENTAILSDATA.get(key);
            LOGGER.info(key + " Credentials loaded from excel");
        } catch (NullPointerException e) {
            LOGGER.info("Given " + key + " user key details are not found in Excel data sheet.");
        }
    }

    public void navigateTodashboard() {
        try {
            waitForSometime(2);
            lblWelcome.waitUntilVisible();
            LOGGER.info("Welcome message is displaying in Homepage");
        } catch (NoSuchElementException e) {
            LOGGER.info("Auto Dealer Page not loaded");
        }
    }

    public void clickOnlogout() throws Exception {
        try {
            btnSelectLogout.waitUntilVisible();
            btnSelectLogout.click();
            waitForSometime(2);
            btnLogout.click();
            LOGGER.info("Clicked on Logout from right side");
        } catch (Exception e) {
            throw new Exception("Logout button is not Visible or Not Clicked");
        }
    }

    public String getUserIDFromExcel(String key) {
        try {
            loadCredentails();
            USERCREDENTAILS = CREDENTAILSDATA.get(key);
            LOGGER.info(key + " Credentails loaded from excel");
            return USERCREDENTAILS.get("User_ID");
        } catch (NullPointerException e) {
            LOGGER.info("Given " + key + " user key details are not found in Excel data sheet.");
        }
        return null;
    }

    private void waitForVisible(WebElementFacade element) throws Exception {
        try {
            element.withTimeoutOf(Duration.ofSeconds(30)).isVisible();
        } catch (Exception e) {
            LOGGER.info(element + " is not visible");
            throw new Exception(element + " is not visible");
        }
    }

    public void validateInValideMailForgotUID() {
        lblErrorMesagePopup.waitUntilVisible();
        commonMethods.validateTextMessage(TSI_USER_NOTFOUND_MESSAGE, lblErrorMesagePopup.getText());
    }


    //  Use mvn clean verify -DMobileDevice="iphone12"
    public void selectDevice() {
        MOBILEEXECUTION = false;
        if (System.getProperty("MobileDevice") != null) {
            MOBILEDEVICE = System.getProperty("MobileDevice");
            LOGGER.info(System.getProperty("MobileDevice") + " : device selected from command line");
        }

        int width = 0;
        int height = 0;

        switch (MOBILEDEVICE) {
            case "iphone12":
                width = 390;
                height = 844;
                MOBILEEXECUTION = true;
                LOGGER.info("iPhone 12 device selected");
                break;
            case "pixel5":
                width = 393;
                height = 851;
                MOBILEEXECUTION = true;
                LOGGER.info("Pixel 5 device selected");
                break;
            case "samsunggalaxys8":
                width = 360;
                height = 740;
                MOBILEEXECUTION = true;
                LOGGER.info("Samsung Galaxy 8 device selected");
                break;
            case "ipadair":
                width = 820;
                height = 1180;
                MOBILEEXECUTION = true;
                LOGGER.info("iPad Air device selected");
                break;
        }

        if (MOBILEEXECUTION) {
            DevTools devTools = ((HasDevTools) getDriver()).getDevTools();
            devTools.createSession();
            devTools.send(Emulation.setDeviceMetricsOverride(width, height, 100, true,
                    Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
                    Optional.empty(), Optional.empty(), Optional.empty()
            ));
        }
        Serenity.recordReportData().withTitle("Automation scripts are executing in ").andContents(MOBILEDEVICE);
    }


}
