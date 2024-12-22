package com.auto.stepdefinitions;

public class ApplicationPageDefinitions {

    @Steps
    CreateApplicationSteps applicationSteps;

    @Then("user validate dashboard page")
    public void validateDashbiardPage() {
        applicationSteps.validatePortalHomePage();
    }

    @Then("user click on create new application")
    public void clickOnCreateNewAplication() throws Exception {
        applicationSteps.clickOnNewApplication();
    }

    @Then("user validates mandatory fields in create application page")
    public void validateApplicationPage() {
        applicationSteps.validateCreateApplicationPage();
    }

    @Then("user enters create application details with application {}")
    public void enterCreateApplicationDetails(String strApplicationKey) throws Exception {
        applicationSteps.enterCreateApplicationData(strApplicationKey);
    }

    @Then("user selects application type")
    public void selectApplicationType() {
        applicationSteps.selectApplicationType();
    }

    @Then("user validates mandatory fields in primary applicant page")
    public void validatePrimaryApplication() {
        applicationSteps.validatePrimaryApplicantPage();
    }

    @Then("user enters primary applicant details with application {}")
    public void enterPrimaryApplicantDetails(String strApplicationKey) {
        applicationSteps.enterApplicantDetails(strApplicationKey);
    }

    @Then("user validates co-applicant and co-signer page")
    public void validateCoApplivantCoSignerPage() {
        applicationSteps.validateCoApplicantCoSignerPage();
    }

    @Then("user enter co-applicant and co-signer details with application {}")
    public void enterCoApplivantCoSignerDetails(String strApplication) {
        applicationSteps.enterCoApplicantCoSignerDetails(strApplication);
    }

    @Then("user selects preference for application {}")
    public void selectPreference(String strApplication) {
        applicationSteps.selectPreference(strApplication);
    }

    @Then("user validate invitation sent success message and captured application reference ID")
    public void validateInvitationSuccessMessage() {
        applicationSteps.validateInvitationSuccessMessage();
    }

    @Then("user captures invitation url from mail")
    public void captureInvitationURL() {
        applicationSteps.captureInvitationURL();
    }

    @Then("user navigates to invitation URL")
    public void navigateToInvitationURL() {
        applicationSteps.navigateToInvitationURL();
    }

    @Then("user validates Information on Request page for applicant type as {string} and application {}")
    public void validateInformationOnRequestPageForApplicant(String strApplicantType, String strKey) throws Exception {
        applicationSteps.validateInformationOnRequestPage(strApplicantType, strKey);
    }

    @Then("user validates Employment Information for applicant type as {string}")
    public void validateEmploymentInformationPageForApplicant(String strApplicantType) throws Exception {
        applicationSteps.validateEmploymentInformationpage(strApplicantType);
    }

    @Then("user enters {string} applicant type data in Information on Request for {}")
    public void enterApplicantData(String strApplicantType, String strKey) throws Exception {
        applicationSteps.enterInformationOnRequestPage(strApplicantType, strKey);
    }

    @Then("user enters {string} co-applicant data in Information on Request for {}")
    public void enterCoApplicantData(String strApplicantType, String strKey) throws Exception {
        applicationSteps.enterCoApplicantData(strApplicantType, strKey);
    }

    @Then("user enters {string} applicant type data in Employment Information page on Request for {}")
    public void enterEmploymentInfomationData(String strApplicantType, String strKey) throws Exception {
        applicationSteps.enterEmploymentInfomationPage(strApplicantType, strKey);
    }

    @Then("user click on discard application")
    public void clickOnDiscardApplication() {
        applicationSteps.clickOnDiscardApplication();
    }

    @Then("user click on save as draft application with the option {string}")
    public void clickOnSaveAsDraftApplication(String strExitConinue) {
        applicationSteps.clickOnSaveAsDraftApplication(strExitConinue);
    }

    @Then("user click on cancel button from create application popup")
    public void clickOnCancelButton() {
        applicationSteps.clickOnCancelButton();
    }

    @Then("user click on close button from create application popup")
    public void clickOnCloseButton() {
        applicationSteps.clickOnCloseButton();
    }

    @Then("user click on continue button")
    public void clickOnContinueButton() {
        applicationSteps.clickOnContinueButton();
    }


    @Then("user captures Application ID from create API response")
    public void getApplicationIDFromRresponse() {
        applicationSteps.getApplicationIDResponse();
    }

    @Then("user deletes application id {} from draft applications")
    public void deleteApplicationIFfromDrafts(String strApplicationID) throws Exception {
        applicationSteps.deleteApplicationFromDrafts(strApplicationID);
    }

    @Then("user click on edit button on application id {} from draft applications")
    public void clickOnEditApplicationfromDrafts(String strApplicationID) throws Exception {
        applicationSteps.clickEditFromDraftApplications(strApplicationID);
    }

    @Then("user select edit option {} from draft applications")
    public void userSelectEditOption(String strAction) throws Exception {
        applicationSteps.resumeEditApplicationFromDrafts(strAction);
    }

    @Then("user edit application id {}, {} from draft applications")
    public void editApplicationIFfromDrafts(String strApplicationID, String strAction) throws Exception {
        applicationSteps.editApplicationFromDrafts(strApplicationID, strAction);
    }

    @Then("user edit application id {}, {} from draft applications for invitation flow")
    public void editApplicationIFfromDraftsForInvitationFlow(String strApplicationID, String strAction) throws Exception {
        applicationSteps.editApplicationFromDraftsForInvitationFlow(strApplicationID, strAction);
    }

    @Then("user validates draft application status {string} in draft popup")
    public void validateDraftApplicationStatusMessage(String strAppStatus) {
        System.out.println("Status : "+ strAppStatus);
        applicationSteps.validateDraftApplicationStatus(strAppStatus);
    }

//    @Then("User validates application id {string} with status {string} from My Loan Applications")
//    public void validateApplicationStatus(String strApplicationID, String strStatus) throws Exception {
//        applicationSteps.validateApplicationStatus(strApplicationID, strStatus);
//    }

    @Then("User validates application id {string} with status {} from My Loan Applications")
    public void validateApplicationStatus(String strApplicationID, String strStatus) throws Exception {
        applicationSteps.validateApplicationStatus(strApplicationID, strStatus);
    }

    //***** Collateral Information
    @Then("user click on Value lookup")
    public void clickOnValuelookup() {
        applicationSteps.clickOnValueLookup();
    }

    @Then("user click on Value Guide lookup")
    public void clickOnValueGuideLookup() {
        applicationSteps.clickOnValueGuideLookup();
    }

    @Then("user click on save value")
    public void clickOnValueSave() {
        applicationSteps.clickOnSaveValue();
    }

    @Then("user captures json response for API {}")
    public void captureJSonResponse(String strAPI) {
        applicationSteps.captureResponseUsngDevttols(strAPI);
    }

    @Then("user validates collateral information page")
    public void validateCollateralInformationPage() {
        applicationSteps.validateCollateralInformation();
    }

    @Then("user validates Financing terms page")
    public void validateFinancingTermsPage() {
        applicationSteps.validateFinancingTermsPage();
    }

    @Then("user click on Payment calculator button")
    public void clickOnPaymentCalculator() {
        applicationSteps.clickOnPaymentCalculator();
    }

    @Then("user validates Financing page fields post payment calculation")
    public void validateFinancingTerms() {
        applicationSteps.validateFinancingTermsFields();
    }

    //*** Review and SUbmit

    @Then("user validate fields in review and submit page for applicant type as {string}, {string}, {string}, {string}")
    public void validateReviewPage(String strApplicant, String strCoApplicant, String strCoSigner1, String strCoSigner2) {
        applicationSteps.validateReviewSubmitPage(strApplicant, strCoApplicant, strCoSigner1, strCoSigner2);
    }

    @Then("user selects consent in review and submit page")
    public void clickOnConsent() {
        applicationSteps.clickOnConsentCheckbox();
    }

    @Then("user validate Application under review page")
    public void validateApplicationUnderReviewPage() {
        applicationSteps.validateApplicationReviewPage();
    }

    @Then("user click on View Application button")
    public void clickOnViewApplicationButton() {
        applicationSteps.clickOnViewApplication();
    }

    //**** Invitation flow

    @Then("user validates invitation flow Information on Request page for applicant type as {string} and application {}")
    public void validateInvitationInformationOnRequestPageForApplicant(String strApplicantType, String strKey) throws Exception {
        applicationSteps.validateInvitationInformationOnRequestPage(strApplicantType, strKey);
    }

    @Then("user enters invitation flow {string} data in basic information page for {}")
    public void enterInvitationInformationRequestPage(String strApplicationType, String strKey) {
        applicationSteps.enterInvitationBasicInformationData(strApplicationType, strKey);
    }

    @Then("user validates invitation employment information page")
    public void validateInvitationEmploymentInformationPage() {
        applicationSteps.validateInvitationEmploymentInformation();
    }

    @Then("user enters {string} applicant type data in invitation flow Employment Information page for {}")
    public void enterInvitationEmploymentInformationdata(String strApplicationType, String strKey) throws Exception {
        applicationSteps.EnterInvitationEmploymentInformation(strApplicationType, strKey);
    }

    @Then("user validates invitation flow your concert page")
    public void validateYourConcertpage() {
        applicationSteps.validateInvitationYourConcert();
    }

    @Then("user submit invitation flow your concert")
    public void submitYourConcert() {
        applicationSteps.submitInvitationYourConcert();
    }

    @Then("user validates invitation submitted page")
    public void validateSInvitationSubmitePage() {
        applicationSteps.validateInvitationSubmittedPage();
    }
}
