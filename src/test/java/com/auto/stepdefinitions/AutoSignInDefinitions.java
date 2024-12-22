package com.auto.stepdefinitions;

public class AutoSignInDefinitions {

    @Steps
    AutoSignInSteps autoSignInSteps;

    @Steps
    CommonSteps commonSteps;

    @Then("user launches Auto home page in browser")
    public void userLaunchesAutoHomePageInBrowser() {
        autoSignInSteps.launchHomePage();
    }

    @Then("user selects device")
    public void selectDevice() {
        autoSignInSteps.selectDevice();
    }


    @Then("user selects language")
    public void userSelectsLanguage() {
        autoSignInSteps.selectTestExecutionLanguage();
    }

    @Then("user reads credentials data with {} from excel")
    public void userReadsCredentialsDataWithUser_IDFromExcel(String userKey) {
        autoSignInSteps.getUserCredentails(userKey);
    }

    @Then("user enters userID")
    public void userEntersUserID() {
        autoSignInSteps.enterUserID();
    }

    @Then("user enters password")
    public void userEntersPassword() {
        autoSignInSteps.enterPassword();
    }

    @Then("user clicks on login Button")
    public void userClicksOnLoginButton() throws Exception {
        autoSignInSteps.clicksOnLogin();
    }

    @Then("user enter username, password and click on login")
    public void userenterusernampasswordandclickonlogin() throws Exception {
        autoSignInSteps.enterUserNamePwdandclickonLogin();
    }

    @Then("user selects eMail from dropdown in verification page")
    public void userSelectseMailFromDropdownInVerificationPage() throws Exception {
        autoSignInSteps.selectEmailFromDropdown();
    }

    @Then("user clicks on send code to email Button")
    public void userClicksOnSendCodeToEmailButton() {
        autoSignInSteps.clicksOnSendCodeToEmail();
    }

    @Then("user captures OTP from eMail")
    public void userCapturesOTPFromEMail() {
        commonSteps.getOTPMailMessage();
    }

    @Then("user captures OTP from eMail1")
    public void userCapturesOTPFromEMail1() {
        commonSteps.getOTPMailMessageAuth();
    }

    @Then("user enters OTP and clicks next button")
    public void userEntersOtpAndClicksNextButton() {
        autoSignInSteps.entersOtpAndCliksNextBtn();
    }

    @Then("user select, read and enter eMail OTP")
    public void selectReadEnterOTP() throws Exception {
        autoSignInSteps.selectReadandEnterOTP();
    }

    @Then("User logs into Dashboard and click on Logout")
    public void userLogsIntoDashboardAndClickOnLogout() throws Exception {
        autoSignInSteps.clicklogoutindashboard();
    }

    @Then("user navigates to Dashboard")
    public void navigatesToDashboard() throws Exception {
        autoSignInSteps.navigatesToDashboard();
    }

    @Then("user click on Logout")
    public void userclickonlogout() throws Exception {
        autoSignInSteps.clicklogout();
    }

    @Then("user validates Auto Idm Login Page for verification")
    public void userValidatesAutoIdmLoginPageForVerification() {
        autoSignInSteps.validateLoginPage();
    }

    @Then("user deletes {} from PolicyAgreement table from DynamoDB")
    public void userDeletesUser_IDFromPolicyAgreementTableFromDynamoDB(String user_id) {
        autoSignInSteps.deletePolicyfromPolicyAgreement(user_id);
    }

    @Then("user clicks on check box and agrees policy")
    public void userClicksOnCheckBoxAndAgreesPolicy() throws Exception {
        autoSignInSteps.clickAgreePolicy();
    }

    @Then("user click on Trouble sign in link")
    public void userClickOnTroubleSignInLink() throws Exception {
        autoSignInSteps.clickOnTroubleSignIn();
    }

    @Then("user navigates to Trouble Signing In page")
    public void userNavigatesToTroubleSigningInPage() {
        autoSignInSteps.confirmTSIPage();
    }

    @Then("user enters email and click on continue")
    public void userEntersEmailAndClickOnContinue() {
        autoSignInSteps.enterEmailAndContinue();
    }

    @Then("user clicks on send code to email")
    public void userClicksOnSendCodeToEmail() {
        autoSignInSteps.clicksOnSendCodeToEmail();
    }

    @Then("user validates page and message displayed")
    public void userValidatesPageAndMessageDisplayed() throws Exception {
        autoSignInSteps.validatePageAndMessageDisplayed();
    }

    @Then("user captures User ID from eMail")
    public void userCapturesUserIDFromEMail() throws Exception {
        commonSteps.getUsetId();
    }

    @Then("user validates User_ID")
    public void userValidatesUser_IDW() {
        autoSignInSteps.validateForgotUserID();
    }

    @Then("user clicks on I forgot my password")
    public void userClicksOnIForgotMyPassword() {
        autoSignInSteps.clicksOnIForgotMyPasswordButton();
    }

    @Then("user enters UserID and click on continue")
    public void userEntersUserIDAndClickOnContinue() {
        autoSignInSteps.enterUserIDAndContinue();
    }

    @Then("user validates temporary password alert message")
    public void uservalidatestemporarypasswordalertmessage() throws Exception {
        autoSignInSteps.validateTemporaryPasswordMessage();
    }

    @Then("user captures temporary password from eMail")
    public void userCapturesTempPasswordFromEMail() throws Exception {
        commonSteps.getTempPassword();
    }

    @Then("user enters temporary password")
    public void userEntersTemporaryPassword() {
        autoSignInSteps.userEntersTemporaryPassword();
    }

    @Then("user navigates to Change Password page")
    public void usernavigatestoChangePasswordpage() {
        autoSignInSteps.navigateToChangePasswordPage();
    }

    @Then("user enters old password as temporary password")
    public void userEntersOldpasswordAsTemporaryPassword() {
        autoSignInSteps.enterOldPasswordAsTempPassword();
    }

    @Then("user enters confirm password")
    public void enterConfirmpassword() {
        autoSignInSteps.userEntersConfirmPassword();
    }

    @Then("user enters new password")
    public void enterNewpassword() {
        autoSignInSteps.userEntersNewPassword();
    }

    @Then("user click on next Button in Change password screen")
    public void userClickOnNextButtonInChangePasswordScreen() throws Exception {
        autoSignInSteps.userClicksOnNextInChangepwd();
    }

    @Then("user navigates to user id page")
    public void usernavigatestouseridpage() {
        autoSignInSteps.validateUserIDPage();
    }

    @Given("user clicks on my account is locked.")
    public void userClicksOnMyAccountIsLocked() {
        autoSignInSteps.clicksOnMyAccountIsLocked();
    }

    @Then("user verifies the page and message displayed for my account is locked")
    public void userVerifiesThePageAndMessageDisplayedForMyAccountIsLocked() {
        autoSignInSteps.verifiesThePageAndMessageDisplayedForMyAccountIsLocked();
    }

    @Then("user captures Accountlock URL from mail")
    public void userCapturesAccountlockURLFromMail() {
        commonSteps.getUnlockaccountlink();
    }

    @Then("user navigates to unlock account URL")
    public void userNavigatesToUnlockAccountURL() {
        autoSignInSteps.naviageToAccountLockURL();
    }

    @Then("user validates Account Reset message in homepage")
    public void userValidatesAccountResetMessageInHomepage() {
        autoSignInSteps.validateAccountResetMessage();
    }

    @Then("user enters wrong password")
    public void userEntersWrongPassword() {
        autoSignInSteps.enterWrongPassword();
    }

    @Then("user validates invalid password error message from User ID page")
    public void userValidatesInvalidPasswordErrorMessageFromUserIsPage() {
        autoSignInSteps.validateWrongPasswordMessage();
    }

    @Then("user validates wrong password account locked message")
    public void userValidatesPasswordAccountLockedMessage() throws Exception {
        autoSignInSteps.validateWrongPasswordAccountLockedMsg();
    }

    //***Homepage Validations**//
    @Given("Auto Home Page is Launched in browser")
    public void AutoHomePageIsLaunchedInBrowser() {
        autoSignInSteps.launchHomePage();
    }

    @Then("user click on Login in with a different user link")
    public void userClickOnLoginInWithADifferentUserLink() {
        autoSignInSteps.clickOnDifferentUser();

    }

    @Then("user navigates to Additional Verification Required page")
    public void usernavigatestoAdditionalVerificationRequiredpage() {
        autoSignInSteps.confirmAdditionalVerificationPage();
    }

    @Then("user click on Login in with a different user link in TSI page")
    public void userClickOnLoginInWithADifferentUserLinkinTSIpage() {
        autoSignInSteps.clickOnDifferentUserTSI();
    }

    @Then("user click on Login in with a different user link in OTP page")
    public void userClickOnLoginInWithADifferentUserLinkinOTPpage() {
        autoSignInSteps.clickOnDifferentUserTSI_2();
    }

    @Then("user validates Auto Home Page")
    public void userValidatesAutoHomePage() {
        autoSignInSteps.validateHomepage();
    }

    @Then("user validates user id error message")
    public void userValidatesUserIdErrorMessage() throws Exception {
        autoSignInSteps.validateUserIDErrorMessage();
    }

    @Then("user validates password error message")
    public void userValidatesPasswordErrorMessage() throws Exception {
        autoSignInSteps.validatePasswordErrorMessage();
    }


}
