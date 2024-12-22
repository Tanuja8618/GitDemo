package com.auto.steps;

public class AutoSignInSteps {

    LoginPage loginPage;
    PaymentCalculatorPage paymentCalculatorPage;
    AWSOperations awsOperations = new AWSOperations();


    ExcelDriver excelDriver = new ExcelDriver();

    private static final Logger LOGGER = LoggerFactory.getLogger(AutoSignInSteps.class);

    @Step("user validates home page")
    public void validateHomepage() {
        loginPage.validateHomePage();
    }

    @Step("Validate User ID Errormessage")
    public void validateUserIDErrorMessage() throws Exception {
        loginPage.validateEmptyUserIDErrorMessage();
    }

    @Step("Validate password Errormessage")
    public void validatePasswordErrorMessage() throws Exception {
        loginPage.validateEmptyPasswordErrorMessage();
    }

    @Step("user launches Home page")
    public void launchHomePage() {
        loginPage.open();
        loginPage.waitForSometime(10);
        loginPage.waitUntilUserIDClickable();
        LOGGER.info("Browser launched");
    }

    @Step("select device")
    public void selectDevice() {
        loginPage.selectDevice();

    }


    @Step("user selects language")
    public void selectTestExecutionLanguage() {
        loginPage.testExecutionLanguage();
    }

    @Step("User reads userCredentails from Excel")
    public void getUserCredentails(String userKey) {
        loginPage.readCredentailsData(userKey);
    }

    @Step("User entered User ID")
    public void enterUserID() {
        loginPage.enterUserId();
    }

    @Step("User enter password")
    public void enterPassword() {
        loginPage.enterPassword();
    }

    @Step("User clicked Login button")
    public void clicksOnLogin() throws Exception {
        loginPage.clickBtnLogin();
    }

    @Step("user enter username, password and click on on login")
    public void enterUserNamePwdandclickonLogin() throws Exception {
        loginPage.enterUserId();
        loginPage.enterPassword();
        loginPage.clickBtnLogin();
    }

    @Step("User selected email for OTP")
    public void selectEmailFromDropdown() throws Exception {
        loginPage.clickDropdownOnVerificationPage();
        loginPage.selectEmailFromDropDown();
    }

    @Step("User clicked on send code to Email")
    public void clicksOnSendCodeToEmail() {
        loginPage.clickBtnSendCodeToEmail();
    }

    @Step("user enters OTP and click on next button")
    public void entersOtpAndCliksNextBtn() {
        loginPage.enterOtpAndClicksOnNextButton();
    }

    @Step("user select email, read OTP and click on next")
    public void selectReadandEnterOTP() {
        loginPage.clickDropdownOnVerificationPage();
        loginPage.selectEmailFromDropDown();
        loginPage.clickBtnSendCodeToEmail();
        loginPage.getOTPFromGMail();
        loginPage.enterOtpAndClicksOnNextButton();
    }

    @Step("User navigates to  Dashboard Page and logout")
    public void clicklogoutindashboard() throws Exception {
        loginPage.navigateTodashboard();
//        loginPage.clickOnlogout();
    }

    @Step("user navigates to  Dashboard Page")
    public void navigatesToDashboard() throws Exception {
        loginPage.navigateTodashboard();
    }

    @Step("User clicked on logout")
    public void clicklogout() throws Exception {
        loginPage.clickOnlogout();
    }

    @Step("User verifies Login page")
    public void validateLoginPage() {
        loginPage.verifyLoginPage();
    }

    @Step("Delete Policy data from PolicyAgreement table in Dynamo DB")
    public void deletePolicyfromPolicyAgreement(String user_ID) {
        String strUserID = loginPage.getUserIDFromExcel(user_ID);
        System.out.println(strUserID);
        awsOperations.deleteRecordsFromPolicyAgreement(strUserID);
    }

    @Step("user click on Policy agreement")
    public void clickAgreePolicy() throws Exception {
        loginPage.clickOnAgreePolicyButton();
    }

    //TSI
    @Step("User clicks on Trouble Sign in")
    public void clickOnTroubleSignIn() throws Exception {
        loginPage.clickOnTroubleSignIn();
    }

    @Step("User navigates to  Trouble Sign In page")
    public void confirmTSIPage() {
        loginPage.confirmTSIPage();
    }

    @Step("user enters email id and click on continue button")
    public void enterEmailAndContinue() {
        loginPage.enterEmailAndClickOnContinue();
    }

    @Step("User vaidates pop up message in User ID page")
    public void validatePageAndMessageDisplayed() throws Exception {
        loginPage.validatesPageAndMessageDisplayed();
    }

    @Step("Validate Forgot User ID")
    public void validateForgotUserID() {
        loginPage.validateForgotUserID();
    }

    public void clicksOnIForgotMyPasswordButton() {
        loginPage.clicksOnIForgotMyPassword();
    }

    @Step("user enters UserID and click on continue button")
    public void enterUserIDAndContinue() {
        loginPage.enterUserIDAndClickOnContinue();
    }

    @Step("user Validates temporary password alert message")
    public void validateTemporaryPasswordMessage() throws Exception {
        loginPage.validateTemporaryPasswordMessage();
    }

    @Step("User enters temporary password")
    public void userEntersTemporaryPassword() {
        loginPage.enterTemporaryPassword();
    }

    @Step("User navigates to Change Password page")
    public void navigateToChangePasswordPage() {
        loginPage.validateChangepasswordPage();
    }

    @Step("User enters new password")
    public void userEntersNewPassword(String strpwd) {
        loginPage.entersNewPassword(strpwd);
    }

    @Step("User enters new password")
    public void userEntersNewPassword() {
        loginPage.enterNewPassword();
    }

    @Step("User enters confirm password")
    public void userEntersConfirmPassword() {
        loginPage.enterConfirmPassword();
    }

    @Step("User enters old password as temporary password")
    public void enterOldPasswordAsTempPassword() {
        loginPage.enterOldPasswordAsTempPassword();
    }

    @Step("user click on next button in change password page")
    public void userClicksOnNextInChangepwd() throws Exception {
        loginPage.clicksOnNextBtnInChangePwd();
    }

    @Step("Validate User ID page")
    public void validateUserIDPage() {
        loginPage.validateUserIDPage();
    }

    @Step("User navigates to Additional Verification Required page")
    public void confirmAdditionalVerificationPage() {
        loginPage.confirmAdditionalVerificationPage();
    }

    @Step("User clicks on Log in with a different User ID link in TSI Page")
    public void clickOnDifferentUserTSI() {
        loginPage.clickOnDifferentUserIDTSI();
    }

    @Step("User clicks on Log in with a different User ID link in TSI Page")
    public void clickOnDifferentUserTSI_2() {
        loginPage.clickOnDifferentUserIDTSI_2();
    }

    public void clicksOnMyAccountIsLocked() {
        loginPage.clicksOnMyAccountIsLocked();
    }

    public void verifiesThePageAndMessageDisplayedForMyAccountIsLocked() {
        loginPage.validatesThePageAndMsgForMyAccountIsLocked();
    }

    @Step("Navigate to Account Lock URL")
    public void naviageToAccountLockURL() {
        loginPage.navigateToAccountLockURL();
    }

    @Step("Validate Unlock Account Successful message")
    public void validateAccountResetMessage() {
        loginPage.validateAccountResetMessage();
    }

    @Step("User enters wrong password")
    public void enterWrongPassword() {
        loginPage.enterWrongPassword();
    }

    @Step("Validates wrong password error message")
    public void validateWrongPasswordMessage() {
        loginPage.validateWrongPasswordMessage();
    }

    @Step("Validate wrong password account locked message")
    public void validateWrongPasswordAccountLockedMsg() throws Exception {
        loginPage.WrongPasswordAccountLockedMsg();
    }

    @Step("User clicks on Log in with a different User ID link")
    public void clickOnDifferentUser() {
        loginPage.clickOnDifferentUserID();
    }


}
