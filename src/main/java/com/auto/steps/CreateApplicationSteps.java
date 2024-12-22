package com.auto.steps;

public class CreateApplicationSteps {

    ApplicationPage applicationPage;
    InvitationFlowPage invitationFlowPage;
    GMail gMail;

    @Step("Validate dashboard page")
    public void validatePortalHomePage() {
        applicationPage.validatePortalHomePage();
    }

    @Step("Click on New Application creation")
    public void clickOnNewApplication() throws Exception {
        applicationPage.clickOnNewApplication();
    }

    @Step("Validate mandatory field error messages in create application page")
    public void validateCreateApplicationPage() {
        applicationPage.validateCreateApplicationMandatoryMessages();
    }

    @Step("Enter create application data")
    public void enterCreateApplicationData(String strKey) throws Exception {
        applicationPage.enterCreationApplicationDetails(strKey);
    }

    @Step("Select type of application")
    public void selectApplicationType() {
        applicationPage.clickOnApplicationType();
    }

    @Step("Validate primary applicant mandatory fields error messages")
    public void validatePrimaryApplicantPage() {
        applicationPage.validatePrimaryApplicantMandatoryFields();
    }

    @Step("Enter primary applicant details")
    public void enterApplicantDetails(String strApplicationKey) {
        applicationPage.enterPrimaryApplicantDetails(strApplicationKey);
    }

    @Step("Validate Co Applicant and Co Signer fields")
    public void validateCoApplicantCoSignerPage() {
        applicationPage.validateCoApplicantCoSigner();
    }

    @Step("Enter Co-Applicant and Co-Signer fields")
    public void enterCoApplicantCoSignerDetails(String strApplication) {
        applicationPage.enterCoApplicantCoSigner(strApplication);
    }

    @Step("Select preference")
    public void selectPreference(String strApplication) {
        applicationPage.selectPreference(strApplication);
    }

    @Step("Validate invitation success message")
    public void validateInvitationSuccessMessage() {
        applicationPage.validateInvitationSuccesMessage();
    }

    @Step("Capture inviation URL from mial")
    public void captureInvitationURL() {
        gMail.getInvitationLinkFromMessage();
    }

    @Step("User navigates to Invitation URL")
    public void navigateToInvitationURL() {
        applicationPage.navigateToInvitationURL();
    }

    @Step("Validating Information on Request page")
    public void validateInformationOnRequestPage(String strApplicationType, String strKey) throws Exception {
        applicationPage.validateInformationOnRequestPage(strApplicationType, strKey);
    }

    @Step("Validate Employment Information page for Co-Applicant/Co-Signer page")
    public void validateEmploymentInformationpage(String strApplicationType) throws Exception {
        applicationPage.validateEmploymentInformation(strApplicationType);
    }

    @Step("Enter data into Information on Request page")
    public void enterInformationOnRequestPage(String strApplicantType, String strKey) throws Exception {
        applicationPage.enterInformationonRequestData(strApplicantType, strKey);
    }

    @Step("Enter co-Applicant data into Information on Request page")
    public void enterCoApplicantData(String strApplicantType, String strKey) throws Exception {
        applicationPage.enterCoAppliantData(strApplicantType, strKey);
    }

    @Step("Enter data into Employment Information page")
    public void enterEmploymentInfomationPage(String strApplicantType, String strKey) throws Exception {
        applicationPage.enterEmploymentInformationData(strApplicantType, strKey);
    }

    @Step("Select discard the application")
    public void clickOnDiscardApplication() {
        applicationPage.clickOnDiscardApplication();
    }

    @Step("Select save as draft the application")
    public void clickOnSaveAsDraftApplication(String strExitContinue) {
        applicationPage.clickOnSaveAsDraft(strExitContinue);
    }

    @Step("click on Cancel button")
    public void clickOnCancelButton() {
        applicationPage.clickOnCancelButton();
    }

    @Step("click on close button from create application")
    public void clickOnCloseButton() {
        applicationPage.clickOnCloseButtonInCreateApplication();
    }

    @Step("click on continue button")
    public void clickOnContinueButton() {
        applicationPage.clickOnContinue();
    }

    @Step("Get Application ID from create API response")
    public void getApplicationIDResponse() {
        applicationPage.getApplicationIDFromResponse();
    }

    @Step("Delete application from draft applications")
    public void deleteApplicationFromDrafts(String strApplicationID) throws Exception {
        applicationPage.deleteDraftApplication(strApplicationID);
    }

    @Step("Click on edit application from draft applications")
    public void clickEditFromDraftApplications(String strApplicationID) throws Exception {
        applicationPage.clickOnEditFromDraftApplication(strApplicationID);
    }

    @Step("Edit application from draft applications")
    public void editApplicationFromDrafts(String strApplicationID, String strAction) throws Exception {
        applicationPage.editDraftApplication(strApplicationID, strAction);
//        applicationPage.getResponseUsingDevTools("getSpecificDetails");
    }

    @Step("Resume edit application from draft applications")
    public void resumeEditApplicationFromDrafts( String strAction) throws Exception {
        applicationPage.resumeEditDraftApplication(strAction);
    }

    @Step("Edit application from draft applications for Invitation flow")
    public void editApplicationFromDraftsForInvitationFlow(String strApplicationID, String strAction) throws Exception {
        applicationPage.editDraftApplicationForInvitationFlow(strApplicationID, strAction);
    }

    @Step("Validate Draft application status in pop up")
    public void validateDraftApplicationStatus(String strStatus) {
        applicationPage.validateDraftApplicationStausMessage(strStatus);
    }

    @Step("validate application status")
    public void validateApplicationStatus(String strApplicationID, String strStatus) throws Exception {
        applicationPage.searchApplication(strApplicationID);
        applicationPage.validateApplicationStatus(strStatus);
    }

    //**** Collateral Information

    @Step("click on Value Lookup")
    public void clickOnValueLookup() {
        applicationPage.clickOnValueLookup();
    }

    @Step("click on Value Guide Lookup ")
    public void clickOnValueGuideLookup() {
        applicationPage.clickOnValueGuideLookup();
    }

    @Step("click on Vehicle Value save")
    public void clickOnSaveValue() {
        applicationPage.clickOnSaveVehicleValue();
    }

    @Step("validate Financing terms page")
    public void validateFinancingTermsPage() {
        applicationPage.validateFinancingTermsPage();
    }

    @Step("Click on Payment Calculator")
    public void clickOnPaymentCalculator() {
        applicationPage.clickOnPaymentCalculator();
    }

    @Step("validate Financing Terms fields")
    public void validateFinancingTermsFields() {
        applicationPage.validateFinancingTerms();
    }

    @Step("Validate Collateral Information")
    public void validateCollateralInformation() {
        applicationPage.validate_Collateral_InformationPage();
    }

    @Step("capture response Json using Devtools")
    public void captureResponseUsngDevttols(String strAPI) {
        applicationPage.getResponseUsingDevTools(strAPI);
    }

    //*** Review and Submit

    @Step("validate review and submit page fields")
    public void validateReviewSubmitPage(String strApplicant, String strCoApplicant, String strCoSigner1, String strCoSigner2) {
        applicationPage.validateReviewSubmitPage(strApplicant, strCoApplicant, strCoSigner1, strCoSigner2);
    }

    @Step("Click on consent check box")
    public void clickOnConsentCheckbox() {
        applicationPage.clickOnConsentCheckbox();
    }

    @Step("Validate Application submitted and Review page")
    public void validateApplicationReviewPage() {
        applicationPage.validateApplicationReviewPage();
    }

    @Step("user click on view application")
    public void clickOnViewApplication() {
        applicationPage.clickOnViewApplication();
    }

    /// Invitation flow

    @Step("Validating invitation Information on Request page")
    public void validateInvitationInformationOnRequestPage(String strApplicationType, String strKey) throws Exception {
        invitationFlowPage.validateInviteFlowPages(strApplicationType, strKey);
    }

    @Step("Enter Invitation flow data into basic Information page")
    public void enterInvitationBasicInformationData(String strApplicationType, String strKey) {
        invitationFlowPage.enterInvitationBasicInformationData(strApplicationType, strKey);
    }

    @Step("validating invitation Employment Information page")
    public void validateInvitationEmploymentInformation() {
        invitationFlowPage.validateInvitationEmploymentInformation();
    }

    @Step("Enter invitation Employment Information data")
    public void EnterInvitationEmploymentInformation(String strApplicationType, String strKey ) throws Exception {
        invitationFlowPage.enterEmploymentInformationData(strApplicationType, strKey);
    }

    @Step("Validating invitation Your Concert page")
    public void validateInvitationYourConcert() {
        invitationFlowPage.validateInvitationYourConcertPage();
    }

    @Step("Submitting invitation Your Concert page")
    public void submitInvitationYourConcert() {
        invitationFlowPage.submitYourConcert();
    }

    @Step("Validate Invitation submitted page")
    public void validateInvitationSubmittedPage() {
        invitationFlowPage.validateSubmittedInvitation();
    }
}
