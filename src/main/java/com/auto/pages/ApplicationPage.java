package com.auto.pages;

public class ApplicationPage extends PageObject{

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationPage.class);

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "//*[contains(@class,'header_portalHeading')]")
    WebElementFacade lblDealerPortal;
    @FindBy(xpath = "//button[@data-testid='notificationIcon']")
    WebElementFacade btnNotifications;
    @FindBy(xpath = "//h2[@data-testid='notificationClose']/../h2[1]")
    WebElementFacade lblNotifications;
    @FindBy(xpath = "//h2[@data-testid='notificationClose']")
    WebElementFacade btnNotificationsClose;
    @FindBy(xpath = "//*[contains(@class,'infoRequest')]//h3")
    WebElementFacade lbl_Applications;
    @FindBy(xpath = "//button[@id='simple-tab-0']")
    WebElementFacade btnAutoLoan;
    @FindBy(xpath = "//button[@id='simple-tab-1']")
    WebElementFacade btnUserRequest;
    @FindBy(xpath = "//*[@id='Home-menu']")
    WebElementFacade btnHomeMenu;
    @FindBy(xpath = "//*[@id='Applications-menu']")
    WebElementFacade btnApplicationsMenu;
    @FindBy(xpath = "//button[@id='simple-tab-0']")
    WebElementFacade btnMyLoanApplications;
    @FindBy(xpath = "//p[@data-testid='advancedSearch']")
    WebElementFacade btnAdvancedSearch;
    @FindBy(xpath = "//input[@id='appId']")
    WebElementFacade inputAppID;
    @FindBy(xpath = "//button[@data-testid='search']")
    WebElementFacade btnSearch;
    @FindBy(xpath = "//table[@aria-label='applications-table']//tr[1]/td[2]")
    WebElementFacade lblMyLoanApplicationStatus;
    @FindBy(xpath = "//button[@data-testid='drafts']")
    WebElementFacade btnMyLoanDrafts;
    @FindBy(xpath = "//button[@data-testid='applications']")
    WebElementFacade btnAllLoanApplications;
    //    @FindBy(xpath = "//button[@data-testid='userRequest']")
//    WebElementFacade btnUserRequest;
    @FindBy(xpath = "//table[@aria-label='applications-table']//tbody/tr[1]/th[1]/p")
    WebElementFacade lblMyDraftsLoanRefID;
    @FindBy(xpath = "//input[@data-testid='refID']")
    WebElementFacade inputRefID;
    @FindBy(xpath = "//button[@data-testid='apply']")
    WebElementFacade btnApply;
    @FindBy(xpath = "//table[@aria-label='applications-table']//tr")
    List<WebElementFacade> listRecordCount;
    @FindBy(xpath = "//table[@aria-label='applications-table']//tr[1]//td[7]/p/a[1]")
    WebElementFacade btnDeleteDraftLoan;
    @FindBy(xpath = "//table[@aria-label='applications-table']//tr[1]//td[7]/p/a[2]")
    WebElementFacade btnEditDraftLoan;
    @FindBy(xpath = "//img[contains(@src,'draftLanding')]/..//h6")
    WebElementFacade lblDraftPageMessageinPopup;
    @FindBy(xpath = "//button[@id='resume']")
    WebElementFacade btnPickUpWhereYouLeft;
    @FindBy(xpath = "//button[@id='fresh-start']")
    WebElementFacade btnStartFromBegining;
    @FindBy(xpath = "//button[text()='Yes, proceed']")
    WebElementFacade btnYesProceed;
    @FindBy(xpath = "//button[@id='delete-btn']")
    WebElementFacade btnYesDelete;
    @FindBy(xpath = "//button[@id='cancel-delete-btn']")
    WebElementFacade btnNo;
    @FindBy(xpath = "//button[@data-testid='manage-btn']")
    WebElementFacade btnCreate;
    @FindBy(xpath = "//li[@data-testid='new-user-request']")
    WebElementFacade btnNewAppliation;
    @FindBy(xpath = "//button[@data-testid='close_testid']")
    WebElementFacade btnCloseCreateApplication;
    @FindBy(xpath = "//input[@id='Oriental A+']/..")
    WebElementFacade btnProgramOriental;
    @FindBy(xpath = "//input[@id='Conventional']/..")
    WebElementFacade btnProgramConventional;
    @FindBy(xpath = "//label[@for='program']/following-sibling::p")
    WebElementFacade lblProgramErrorMsg;
    @FindBy(xpath = "//input[@data-testid='dealer']/..")
    WebElementFacade drpDealer;
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container css-1bf3jgo']//div[3]//p[1]")
    WebElementFacade lblDealerErrorMsg;
    @FindBy(xpath = "//input[@data-testid='manager']/..")
    WebElementFacade drpManager;
    @FindBy(xpath = "//div[@role='presentation']//div[4]//p[1]")
    WebElementFacade lblManagerErrorMsg;
    @FindBy(xpath = "//input[@data-testid='dealerSalesReference']/..")
    WebElementFacade drpDealerSalesReference;
    @FindBy(xpath = "(//p[@gap='2'])[4]")
    WebElementFacade lblDealerSalesReferenceErrorMsg;
    @FindBy(xpath = "//button[@id='cancel-btn']")
    WebElementFacade btnCancel;
    //    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    @FindBy(xpath = "//button[@id='continue-btn']")
    WebElementFacade btnContinue;
    @FindBy(xpath = "//img[@data-testid='back-btn']/..")
    WebElementFacade btnBack;
    @FindBy(xpath = "//button[@data-testid='back-btn']")
    WebElementFacade btnCreateApplicationBack;
    @FindBy(xpath = "//h4[contains(text(),'application you want to create')]")
    WebElementFacade lblTypeOfApplication;
    @FindBy(xpath = "//button[@id='personal-button']")
    WebElementFacade btnPersonalApplication;
    //    @FindBy(xpath = "//p[text()='Primary Applicant']")
    @FindBy(xpath = "//span[contains(text(),'Create application')]")
    WebElementFacade lblCreateApplication;
    @FindBy(xpath = "(//p[text()='Applicant'])[2]")
    WebElementFacade lblPrimaryApplicant;
    @FindBy(xpath = "//input[@id='primaryAppFirstName']")
    WebElementFacade inputPrimaryAppFirstName;
    @FindBy(xpath = "//label[@for='primaryAppFirstName']/..//p")
    WebElementFacade lblPrimaryAppFirstNameErrorMsg;
    @FindBy(xpath = "//input[@id='primaryAppLastName']")
    WebElementFacade inputPrimaryAppLatName;
    @FindBy(xpath = "//label[@for='primaryAppLastName']/..//p")
    WebElementFacade lblPrimaryAppLastNameErrorMsg;
    @FindBy(xpath = "//img[@data-testid='coAppdet-back']")
    WebElementFacade btnCoApplicantBackButton;
    @FindBy(xpath = "//button[@id='coApplicant-button']")
    WebElementFacade btnCoApplicant;
    @FindBy(xpath = "//button[@id='coSigner-button']")
    WebElementFacade btnCoSigner;
    @FindBy(xpath = "//h4[contains(text(),'Add your co-applicant')]")
    WebElementFacade lblAddCoApplicant;
    @FindBy(xpath = "//h3[text()='Co-applicant']")
    WebElementFacade lblCoApplicant;
    @FindBy(xpath = "//input[@id='CoAppFirstName']")
    WebElementFacade inputCoApplicantFirstName;
    @FindBy(xpath = "//label[@for='CoAppFirstName']/../..//p")
    WebElementFacade lblCoApplicantFirstNameErrMessage;
    @FindBy(xpath = "//input[@id='CoAppLastName']") //PASS
    WebElementFacade inputCoApplicantLastName;
    @FindBy(xpath = "//label[@for='CoAppLastName']/../..//p")
    WebElementFacade lblCoApplicantLastNameErrMessage;
    @FindBy(xpath = "//button[@data-testid='addRemoveBtn_testid']")
    WebElementFacade btnAddRemoveCoSigner;
    @FindBy(xpath = "//h3[text()='Co-signer(s)']")
    WebElementFacade lblCoSigner;
    @FindBy(xpath = "//h3[text()='Co-signer(s)']/../../..//input")
    List<WebElementFacade> listCoSignersSize;
    @FindBy(xpath = "//h4[contains(text(),'Add your co-applicant')]/..//h3")
    List<WebElementFacade> listCoApplicantCoSignerSize;
    @FindBy(xpath = "//input[@id='CoSigner[0].CoSignerName.CoSignerFirstName']")
    WebElementFacade inputCoSignerFirstName;
    @FindBy(xpath = "(//div[@class='MuiBox-root css-1wo9trv'])[3]//p")
    WebElementFacade lblCoSignerFirstNameErrorMessage;
    @FindBy(xpath = "//input[@id='CoSigner[0].CoSignerName.CoSignerLastName']")
    WebElementFacade inputCoSignerLastName;
    @FindBy(xpath = "(//div[@class='MuiBox-root css-1wo9trv'])[4]//p")
    WebElementFacade lblCoSignerLastNameErrorMessage;
    @FindBy(xpath = "//button[@data-testid='coSignerAddBtn']")
    WebElementFacade btnAddCoSigner;
    @FindBy(xpath = "//input[@id='CoSigner[1].CoSignerName.CoSignerFirstName']")
    WebElementFacade inputSecondCoSignerFirstName;
    @FindBy(xpath = "(//div[@class='MuiBox-root css-1wo9trv'])[5]//p")
    WebElementFacade lblSecondCoSignerFirstNameErrorMessage;
    @FindBy(xpath = "//input[@id='CoSigner[1].CoSignerName.CoSignerLastName']")
    WebElementFacade inputSecondCoSignerLastName;
    @FindBy(xpath = "(//div[@class='MuiBox-root css-1wo9trv'])[6]//p")
    WebElementFacade lblSecondCoSignerLastNameErrorMessage;
    //  @FindBy(xpath = "//button[@data-testid='coSigner-button']")
//   WebElementFacade btnCoSigner;
    @FindBy(xpath = "//button[@id='invitation-button']")
    WebElementFacade btnSendInvite;
    @FindBy(xpath = "//button[@id='manual-button']")
    WebElementFacade btnEnterManual;
    @FindBy(xpath = "//input[@id='primaryApplicantEmail']")
    WebElementFacade inputApplicantEMailID;
    @FindBy(xpath = "//h2[@id='customized-dialog-title']/h3")
    WebElementFacade lblInvitationSentMessage;
    @FindBy(xpath = "//h2[@id='customized-dialog-title']/..//h6/span")
    WebElementFacade lblInvitationApplicationID;
    @FindBy(xpath = "//h4[contains(text(),'go with your preference')]")
    WebElementFacade lblGoWithYourPreference;
    @FindBy(xpath = "//p[contains(text(),'Alright')]")
    WebElementFacade lblCreateApllication;

    //**** Basic Information Page

    @FindBy(xpath = "//button[@role='tab' and @tabindex='0']")
    WebElementFacade btnSelectedApplicationTab;
    @FindBy(xpath = "//*[@role='tablist']/button")
    List<WebElementFacade> listApplicationTabs;
    @FindBy(xpath = "//button[@id='users-tab-0']")
    WebElementFacade btnApplicantTab;
    @FindBy(xpath = "//button[text()='Co-applicant']")
    WebElementFacade btnCoApplicantTab;
    @FindBy(xpath = "//button[text()='Co-signer 1']")
    WebElementFacade btnCoApplicantCoSignerTab1;
    @FindBy(xpath = "//button[text()='Co-signer 2']")
    WebElementFacade btnCoApplicantCoSignerTab2;
    @FindBy(xpath = "//p[text()='Information on Request']")
    WebElementFacade lblInformationOnRequest;
    @FindBy(xpath = "//p[@id='Basic information']")
    WebElementFacade lblBasicInformation;

    @FindBy(xpath = "//p[text()='Verify your identity']")
    WebElementFacade lblVerifyYourIdetity;
    @FindBy(xpath = "//p[text()='ID verification status:']/../div/p")
    WebElementFacade lblIDVerificationStatus;
    @FindBy(xpath = "//button[@id='upload-manually']")
    WebElementFacade btnUploadManually;
    @FindBy(xpath = "//button[@id='start-verification']")
    WebElementFacade btnStartIDVerifiction;
    @FindBy(xpath = "//button[@id='Basic Information-collapse-btn']/../../../..//h3")
    List<WebElementFacade> listNoOfInformationOnRequestSections;
    @FindBy(xpath = "//h3[@id='Relationship with applicant']")
    WebElementFacade lblRelationshipWithOwner;
    //    @FindBy(xpath = "//h3[text()='Basic Information']")
//    WebElementFacade lblBasicInformation;
    @FindBy(xpath = "//input[@id='cousers[0].firstName']")
    WebElementFacade inputFirstName;
    @FindBy(xpath = "//input[@id='cousers[0].lastName']")
    WebElementFacade inputLastName;

    @FindBy(xpath = "//input[@data-testid='toggle-btn']/..")
    WebElementFacade btnToggle;
    @FindBy(xpath = "//h3[@id='Demographic information']")
    WebElementFacade lblDemographicInformation;
    @FindBy(xpath = "//h3[@id='Residential address']")
    WebElementFacade lblResidentailAddress;
    //    @FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']/../input/..")
    @FindBy(xpath = "//label[@data-testid='resAddress1']/../../../../div[1]//input")
    WebElementFacade inputCopyAddress;
    @FindBy(xpath = "//input[@id='cousers[0].resAddress1']")
    WebElementFacade inputAddress1;
    @FindBy(xpath = "//h3[@id='Mailing address']")
    WebElementFacade lblMailingAddress;
    @FindBy(xpath = "//button[@id='Mailing address-collapse-btn']/img")
    WebElementFacade btnMailingAddress;
    @FindBy(xpath = "//input[@id='perAddress1']")
    WebElementFacade inputMailingAddress1;
    @FindBy(xpath = "//label[@for='perAddress1']/../..//p")
    WebElementFacade lblMailingAddress1ErrorMsg;
    @FindBy(xpath = "//input[@id='cousers[0].perAddress2']")
    WebElementFacade inputMailingAddress2;
    @FindBy(xpath = "(//*[@id='custom-select-Country-id'])[2]")
    WebElementFacade drpMailingCountry;
    @FindBy(xpath = "(//*[@id='custom-select-State-id'])[2]")
    WebElementFacade drpMailingState;
    @FindBy(xpath = "//*[@id='cousers[0].perCity']")
    WebElementFacade drpMailingCity;
    @FindBy(xpath = "//label[@for='cousers[0].perCity']/../..//p")
    WebElementFacade lblMailingCityErrorMsg;
    @FindBy(xpath = "//input[@id='cousers[0].perZipcode']")
    WebElementFacade inputMailingZipCode;
    @FindBy(xpath = "//label[@for='cousers[0].perZipcode']/../..//p")
    WebElementFacade lblMailingZipCodeErrorMsg;
    @FindBy(xpath = "//label[@id='custom-select-Utility bill']")
    WebElementFacade lblUtilityBill;
    @FindBy(xpath = "//*[@id='custom-select-Utility bill-id']")
    WebElementFacade drpUtilityBill;
    @FindBy(xpath = "//h6[text()='Upload proof of address']")
    WebElementFacade lblUploadProofOfAddress;
    @FindBy(xpath = "//img[contains(@src,'upload')]/..")
    WebElementFacade btnUploadProofOfAddress;
    @FindBy(xpath = "//h3[@id='Resident status']")
    WebElementFacade lblResidentStatus;
    @FindBy(xpath = "//input[@id='Homeowner']/..")
    WebElementFacade btnHomeOwner;
    @FindBy(xpath = "//input[@id='Parents']/..")
    WebElementFacade btnParents;
    @FindBy(xpath = "//input[@id='Rent']/..")
    WebElementFacade btnRent;
    @FindBy(xpath = "//div[@class='MuiBox-root css-aj2tu1']//p")
    WebElementFacade lblResidentailStatusErrorMessage;
    @FindBy(xpath = "//label[text()='Time at residence']")
    WebElementFacade lblTimeAtResidence;
    @FindBy(xpath = "//label[text()='Monthly payment']")
    WebElementFacade lblMonthlyPayment;
    @FindBy(xpath = "//input[@id='cousers[0].monthlyPayment']")
    WebElementFacade inputMonthlyPayment;
    @FindBy(xpath = "//input[@id='cousers[0].monthlyPayment']/../../../../p")
    WebElementFacade lblMonthlyPaymentErrorMessage;
    @FindBy(xpath = "//input[@data-testid='residentYears']")
    WebElementFacade inputResidentYears;
    @FindBy(xpath = "//label[text()='Time at residence']/../label[2]")
    WebElementFacade lblResidentYearsGreaterThanAgeErrorMessage;
    @FindBy(xpath = "//input[@data-testid='residentMonths']")
    WebElementFacade inputResidentMonths;
    @FindBy(xpath = "//button[text()='Add Co-applicant']")
    WebElementFacade btnAddCoApplicant;
    @FindBy(xpath = "//button[text()='Add Co-signer']")
    WebElementFacade btnAddCoSigner1;
    @FindBy(xpath = "//h3[text()='Co-signer']")
    WebElementFacade lblCoSigner1;
    @FindBy(xpath = "//button[text()='Remove']")
    WebElementFacade btnRemove;
    @FindBy(xpath = "//button[text()='Add']")
    WebElementFacade btnAdd;
    @FindBy(xpath = "//button[text()='Discard application']")
    WebElementFacade btnDiscardApplication;
    @FindBy(xpath = "//button[text()='Yes, Discard application']")
    WebElementFacade btnYesDiscardApplication;
    @FindBy(xpath = "//button[text()='No, continue application']")
    WebElementFacade btnNoContinueApplication;
    @FindBy(xpath = "//button[text()='Yes, Delete']")
    WebElementFacade btnYesDeleteApplication;
    @FindBy(xpath = "//button[text()='No']")
    WebElementFacade btnNoDeleteApplication;


    @FindBy(xpath = "//button[@id='save-as-draft-btn']")
    WebElementFacade btnSaveAsDraft;
    @FindBy(xpath = "//h3[text()='Application saved as draft successfully']")
    WebElementFacade lblSavedDraftSuccessfully;
    @FindBy(xpath = "//button[text()='Exit, go to dashboard']")
    WebElementFacade btnExitSaveDraft;
    @FindBy(xpath = "//button[text()='Ok, continue with Application']")
    WebElementFacade btnOkContinueWithApplication;


    //**** Employment Information
    @FindBy(xpath = "//p[@id='Employment information']")
    WebElementFacade lblEmploymentInformation;
    @FindBy(xpath = "//h3[@id='Employment information']")
    WebElementFacade lblSubEmploymentInformation;
    @FindBy(xpath = "//img[@alt='Remove Button']/..")
    WebElementFacade btnAdditionalIncomeRemove;
    @FindBy(xpath = "//h3[@id='Additional income']")
    WebElementFacade lblAdditionalIncome;
    @FindBy(xpath = "//img[@alt='Add Button']/..")
    WebElementFacade btnAdditionalIncomeAdd;
    @FindBy(xpath = "//p[text()='Collateral Information']")
    WebElementFacade lblCollateralInformation;
    @FindBy(xpath = "//h3[text()='Value Lookup Utility']")
    WebElementFacade lblValueLookupUtility;
    @FindBy(xpath = "//button[@id='value-lookup-btn']")
    WebElementFacade btnValueLookUp;
    @FindBy(xpath = "//h2[@id='customized-dialog-title']")
    WebElementFacade lblValueGuideLookup;
    @FindBy(xpath = "//button[@id='value-guide-lookup-btn']")
    WebElementFacade btnValueGuideLookup;
    @FindBy(xpath = "//button[@id='new-button']")
    WebElementFacade btnCollateralTypeNew;
    @FindBy(xpath = "//button[@id='used-button']")
    WebElementFacade btnCollateralTypeUsed;
    @FindBy(xpath = "//button[@id='Blackbook-button']")
    WebElementFacade btnCollateralTypeBlackbook;
    @FindBy(xpath = "//button[@id='Distributor data-button']")
    WebElementFacade btnCollateralTypeDistributedData;
    @FindBy(xpath = "//button[@id='lookup-continue-btn']")
    WebElementFacade btnLookupOkContinue;
    @FindBy(xpath = "//button[@id='lookup-cancel-btn']")
    WebElementFacade btnLookupCancel;

    //****  Collateral Information
    @FindBy(xpath = "//button[@id='save-val-btn']")
    WebElementFacade btnSaveValue;
    @FindBy(xpath = "//p[text()='Collateral information']")
    WebElementFacade lblCollateralInfomarionHeader;
    @FindBy(xpath = "//h3[@id='Collateral information']")
    WebElementFacade lblCollateralInfomarionSub;
    @FindBy(xpath = "//h3[@id='Vehicle values']")
    WebElementFacade lblVehicleValues;

    //**** Financing Terms
    @FindBy(xpath = "//p[text()='Financing terms']")
    WebElementFacade lblFinancingTerms;
    @FindBy(xpath = "//p[contains(text(),'5 steps')]/../div[1]/div[1]/div[4]/span//div")
    WebElementFacade lblFinancingTermsBar;

    @FindBy(xpath = "//p[text()='Payment calculator tool']")
    WebElementFacade lblPaymentCalculatorUtility;
    @FindBy(xpath = "//button[text()='Calculate']")
    WebElementFacade btnPaymentCalculator;
    @FindBy(xpath = "//h3[@id='Estimated monthly payment']")
    WebElementFacade lblEstimatedMonthlyPayment;
    @FindBy(xpath = "//h6[text()='Payment schedule']")
    WebElementFacade lblPaymentSchedule;
    @FindBy(xpath = "//h6[text()='Payment calculator details']")
    WebElementFacade lblPaymentCalculatorDetails;
    @FindBy(xpath = "//h3[text()='Itemization of amount financed']")
    WebElementFacade lblItemizationofAmountFinanced;
    @FindBy(xpath = "//h3[text()='Insurance']")
    WebElementFacade lblInsurance;
    @FindBy(xpath = "//h3[text()='Fees']")
    WebElementFacade lblFees;
    @FindBy(xpath = "//h3[text()='Deferred payment']")
    WebElementFacade lblDeferredPayment;

    //**** Review and Submit
    @FindBy(xpath = "//p[@id='Review & submit']")
    WebElementFacade lblReviewSubmit;
    @FindBy(xpath = "//h3[contains(@id,'Information on Request')]")
    WebElementFacade lblReviewInformationOnRequest;
    @FindBy(xpath = "//h6[text()='Residential Address']")
    WebElementFacade lblReviewResidentailsAddress;
    @FindBy(xpath = "//h6[text()='Mailing Address']")
    WebElementFacade lblReviewMailingAddress;
    @FindBy(xpath = "//h6[text()='Residential Status']")
    WebElementFacade lblReviewResidentialStatus;
    @FindBy(xpath = "//h3[contains(@id,'Employment Information')]")
    WebElementFacade lblReviewEmploymentInformation;
    @FindBy(xpath = "//button[contains(@id,'Employment Information')]/img")
    WebElementFacade btnReviewEmploymentInformation;
    @FindBy(xpath = "//h3[@id='Collateral Information']")
    WebElementFacade lblReviewCollateralInfomation;
    @FindBy(xpath = "//h6[text()='Vehicle values']")
    WebElementFacade lblReviewVehicleValues;
    @FindBy(xpath = "//h3[@id='Financial Terms']")
    WebElementFacade lblReviewFinancialTerms;
    @FindBy(xpath = "//button[contains(@id,'Financial Terms-collapse-btn')]/img")
    WebElementFacade btnReviewFinancialTerms;
    @FindBy(xpath = "//h6[text()='Payment schedule']")
    WebElementFacade lblReviewPaymentSchedule;
    @FindBy(xpath = "//h6[text()='Payment Calculator Details']")
    WebElementFacade lblReviewPaymentCalculatorDetails;
    @FindBy(xpath = "//h3[text()='Itemization of Amount Financed']")
    WebElementFacade lblReviewItemizedOfAmountFinanced;
    @FindBy(xpath = "//h3[text()='Insurance']")
    WebElementFacade lblReviewInsurance;
    @FindBy(xpath = "//h3[text()='Fees']")
    WebElementFacade lblReviewFees;
    @FindBy(xpath = "//h3[text()='Deferred Payment']")
    WebElementFacade lblReviewDeferredPayment;
    @FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']/..")
    WebElementFacade inputConsentCheckbox;
    @FindBy(xpath = "//h1[text()='Thank You! Your application has been submitted successfully']")
    WebElementFacade lblApplicationSubmitted;
    @FindBy(xpath = "//p[text()='Application under review!']")
    WebElementFacade lblApplicationUnderReview;
    @FindBy(xpath = "//h6[contains(text(),'Thank you for submitting')]/button")
    WebElementFacade lnkApplicationID;
    @FindBy(xpath = "//button[text()='View Application']")
    WebElementFacade btnViewApplication;


    public void validatePortalHomePage() {
        commonMethods.validateTextMessage(LBL_DEALER_PORTAL, lblDealerPortal.getText().trim());
        btnNotifications.click();
        commonMethods.waitforSometimeInSeconds(2);
        commonMethods.validateTextMessage(LBL_NOTIFICATIONS, lblNotifications.getText().trim());
        commonMethods.waitforSometimeInSeconds(2);
        btnNotificationsClose.click();
        commonMethods.waitforSometimeInSeconds(2);
        commonMethods.validateTextMessage(LBL_TOTAL_APPLICATIONS, $("//*[contains(@class,'customCard')]/div[1]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_APPROVED, $("//*[contains(@class,'customCard')]/div[2]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_DECLINED, $("//*[contains(@class,'customCard')]/div[3]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_DECISION_PENDING_HEADER, $("//*[contains(@class,'customCard')]/div[4]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_WITHDRAWN, $("//*[contains(@class,'customCard')]/div[5]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_CONTRACT_VERIFICATION, $("//*[contains(@class,'customCard')]/div[6]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_BOOKED_APPLICATIONS, $("//*[contains(@class,'customCard')]/div[7]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_AMOUNT_BOOKED, $("//*[contains(@class,'customCard')]/div[8]//h6").getText().trim());
        commonMethods.validateTextMessage(LBL_APPLICATIONS, lbl_Applications.getText().trim());
        commonMethods.validateTextMessage(LBL_AUTO_LOAN, btnAutoLoan.getText());
        commonMethods.validateTextMessage(LBL_USER_REQUEST, btnUserRequest.getText());
        LOGGER.info("Validated all labels in Dashboard page");
    }

    public void clickOnNewApplication() throws Exception {
        try {
            btnCreate.click();
            btnNewAppliation.click();
            LOGGER.info("Clicked on Create/New Application button");
        } catch (Exception e) {
            throw new Exception("Unable to click on Create/New Application button");
        }
        commonMethods.waitforSometimeInSeconds(5);
    }

    public void validateCreateApplicationMandatoryMessages() {
        btnContinue.click();
        commonMethods.waitforSometimeInSeconds(2);
        lblProgramErrorMsg.isDisplayed();
        LOGGER.info(lblProgramErrorMsg.getText());
//        lblDealerErrorMsg.isDisplayed();
        lblManagerErrorMsg.isDisplayed();
        lblDealerSalesReferenceErrorMsg.isDisplayed();
        LOGGER.info("Mandatory error messages in create application page are validated");
    }

    public void enterCreationApplicationDetails(String strDataType) throws Exception {
        ExcelDriver excelDriver = new ExcelDriver();
        LOGGER.info("strDataType : " + strDataType);
        LOOKUPDATA = excelDriver.getRowData(strDataType, "UserData", "CreateApplication");
        LOGGER.info(LOOKUPDATA.toString());
        if ((!LOOKUPDATA.get("Program").isEmpty() || LOOKUPDATA.get("Program") == null) && LOOKUPDATA.get("Program").equalsIgnoreCase("Oriental A+")) {
            btnProgramOriental.click();
            LOGGER.info("Program selected as Oriental A+");
        } else if ((!LOOKUPDATA.get("Program").isEmpty() || LOOKUPDATA.get("Program") == null) && LOOKUPDATA.get("Program").equalsIgnoreCase("Conventional")) {
            btnProgramConventional.click();
            LOGGER.info("Program selected as Conventional");
        }
        if ((!LOOKUPDATA.get("Dealer").isEmpty() || LOOKUPDATA.get("Dealer") == null)) {
            commonMethods.selectDropdown(drpDealer, LOOKUPDATA.get("Dealer"));
        }
        commonMethods.waitforSometimeInSeconds(20);
        if ((!LOOKUPDATA.get("Manager").isEmpty() || LOOKUPDATA.get("Manager") == null)) {
            commonMethods.selectDropdown(drpManager, LOOKUPDATA.get("Manager"));
        }
        if ((!LOOKUPDATA.get("Dealer Sales Reference").isEmpty() || LOOKUPDATA.get("Dealer Sales Reference") == null)) {
            commonMethods.selectDropdown(drpDealerSalesReference, LOOKUPDATA.get("Dealer Sales Reference"));
        }
        LOGGER.info("Entered create application details");
        btnContinue.click();
    }

    public void clickOnApplicationType() {
//        lblTypeOfApplication.isDisplayed();
        LOGGER.info("Navigated to Application type page");
//        if ((!LOOKUPDATA.get("Application Type").isEmpty() || LOOKUPDATA.get("Application Type") == null) && LOOKUPDATA.get("Application Type").equalsIgnoreCase("Personal")) {
//            btnPersonalApplication.click();
//            LOGGER.info("Clicked on Personal Application");
//        }
        commonMethods.waitforSometimeInSeconds(5);
        btnContinue.click();
        LOGGER.info("Clicked on continue button in Application type page");
        commonMethods.waitforSometimeInSeconds(10);
    }

    public void enterPrimaryApplicantDetails(String strApplicationKey) {
        ExcelDriver excelDriver = new ExcelDriver();
        CREATEAPPLICATIONDATA = excelDriver.getRowData(strApplicationKey, "UserData", "CreateApplication");
        if ((!CREATEAPPLICATIONDATA.get("Primary_Applicant_FN").isEmpty() || CREATEAPPLICATIONDATA.get("Primary_Applicant_FN") == null))
            inputPrimaryAppFirstName.sendKeys(CREATEAPPLICATIONDATA.get("Primary_Applicant_FN"));
        if ((!CREATEAPPLICATIONDATA.get("Primary_Applicant_LN").isEmpty() || CREATEAPPLICATIONDATA.get("Primary_Applicant_LN") == null))
            inputPrimaryAppLatName.sendKeys(CREATEAPPLICATIONDATA.get("Primary_Applicant_LN"));
        if ((!CREATEAPPLICATIONDATA.get("Co-Applicant").isEmpty() || CREATEAPPLICATIONDATA.get("Co-Applicant") == null) && CREATEAPPLICATIONDATA.get("Co-Applicant").equalsIgnoreCase("yes")) {
            btnCoApplicant.click();
            FLAG_CO_APPLICANT = true;
            LOGGER.info("Clicked on Co-Applicant");
        }
        if ((!CREATEAPPLICATIONDATA.get("Co-Signer1").isEmpty() || CREATEAPPLICATIONDATA.get("Co-Signer1") == null) && CREATEAPPLICATIONDATA.get("Co-Signer1").equalsIgnoreCase("yes")) {
            btnCoSigner.click();
            FLAG_CO_SIGNER_1 = true;
            LOGGER.info("Clicked on Co-Signer1");
        }
        LOGGER.info("Entered Primary Application details");
        btnContinue.click();
    }

    public void validatePrimaryApplicantMandatoryFields() {
        commonMethods.validateTextMessage(LBL_CREATE_APPLICATION, lblCreateApplication.getText().trim());
        lblPrimaryApplicant.isDisplayed();
        LOGGER.info("Navigated to Primary Application team");
        btnContinue.click();
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblPrimaryAppFirstNameErrorMsg.getText());
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblPrimaryAppLastNameErrorMsg.getText());
        LOGGER.info("Mandatory error messages in Primary application page are validated");
    }

    public void selectPreference(String strApplication) {
        boolean flagInvite = false;

        ExcelDriver excelDriver = new ExcelDriver();
        CREATEAPPLICATIONDATA = excelDriver.getRowData(strApplication, "UserData", "CreateApplication");

        if ((!CREATEAPPLICATIONDATA.get("Preference").isEmpty() || CREATEAPPLICATIONDATA.get("Preference") == null) && CREATEAPPLICATIONDATA.get("Preference").equalsIgnoreCase("Manual")) {
            btnEnterManual.click();
            LOGGER.info("Clicked on Manual preference");
        } else if ((!CREATEAPPLICATIONDATA.get("Preference").isEmpty() || CREATEAPPLICATIONDATA.get("Preference") == null) && CREATEAPPLICATIONDATA.get("Preference").equalsIgnoreCase("Invite")) {
            btnSendInvite.click();
            LOGGER.info("Clicked on invite preference");
            flagInvite = true;
        }

        if (flagInvite) {
            btnContinue.click();
            commonMethods.validateTextMessage(LBL_INVITATION_EMAIL_MANDATORY, $("//*[@role='alert']").getText());
            inputApplicantEMailID.sendKeys("Test.com");
            commonMethods.validateTextMessage(INVALID_EMAIL_FORMAT_ERROR_MESSAGE, $("//p[contains(@class,'customSelectError')]").getText());
            inputApplicantEMailID.clear();
            LOGGER.info("Validated email field in Invitation pop up");
            if ((!CREATEAPPLICATIONDATA.get("Invite_eMail").isEmpty() || CREATEAPPLICATIONDATA.get("Invite_eMail") == null)) {
                inputApplicantEMailID.sendKeys(CREATEAPPLICATIONDATA.get("Invite_eMail"));
                LOGGER.info("Entered invitation eMail");
            }
            commonMethods.waitforSometimeInSeconds(5);
        }
        btnContinue.click();
        LOGGER.info("Clicked continue on preferences page");
    }

    public void validateInvitationSuccesMessage() {
        commonMethods.waitforSometimeInSeconds(5);
        commonMethods.validateTextMessage(LBL_INVITATION_SENT_SUCCESSFUL, lblInvitationSentMessage.getText());
        LOGGER.info("Navigated to Invitation sent success pop up");
        APPLICATIONID_REFERENCE = lblInvitationApplicationID.getText().trim();
        LOGGER.info("Captured Application Refrence ID." + APPLICATIONID_REFERENCE);
        $("//button[text()='Ok']").click();
        LOGGER.info("Clicked on OK button");
    }

    public void navigateToInvitationURL() {
        if (!(INVITATION_URL == null)) {
            LOGGER.info("Invitation URL :" + INVITATION_URL);
            ((JavascriptExecutor) getDriver()).executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
            getDriver().switchTo().window(tabs.get(1));
            getDriver().get(INVITATION_URL);
            commonMethods.waitforSometimeInSeconds(5);
            LOGGER.info("Navigated Inviation URL link");
        } else
            LOGGER.warn("Invitation link is blank");
    }

    public void enterCoApplicantCoSigner(String strApplication) {
        if (isNullOrEmptyMap(COAPPLICANTDATA)) {
            ExcelDriver excelDriver = new ExcelDriver();
            COAPPLICANTDATA = excelDriver.getRowData(strApplication, "UserData", "CoApplicant");
            LOGGER.info("Co Applicant data is loaded into map");
        }
        if ((!COAPPLICANTDATA.get("Co_Applicant_FN").isEmpty() || COAPPLICANTDATA.get("Co_Applicant_FN") == null) && FLAG_CO_APPLICANT)
            inputCoApplicantFirstName.sendKeys(COAPPLICANTDATA.get("Co_Applicant_FN"));
        if ((!COAPPLICANTDATA.get("Co_Applicant_LN").isEmpty() || COAPPLICANTDATA.get("Co_Applicant_LN") == null) && FLAG_CO_APPLICANT)
            inputCoApplicantLastName.sendKeys(COAPPLICANTDATA.get("Co_Applicant_LN"));
        LOGGER.info("Entered Co applicant details");
        if ((!COAPPLICANTDATA.get("Co_Signer1_FN").isEmpty() || COAPPLICANTDATA.get("Co_Signer1_FN") == null) && FLAG_CO_SIGNER_1)
            inputCoSignerFirstName.sendKeys(COAPPLICANTDATA.get("Co_Signer1_FN"));
        if ((!COAPPLICANTDATA.get("Co_Signer1_LN").isEmpty() || COAPPLICANTDATA.get("Co_Signer1_LN") == null) && FLAG_CO_SIGNER_1)
            inputCoSignerLastName.sendKeys(COAPPLICANTDATA.get("Co_Signer1_LN"));
        LOGGER.info("Entered Co Signer1 details");
        if ((!COAPPLICANTDATA.get("Co_Signer2_FN").isEmpty() || COAPPLICANTDATA.get("Co_Signer2_FN") == null) && FLAG_CO_SIGNER_2)
            inputSecondCoSignerFirstName.sendKeys(COAPPLICANTDATA.get("Co_Signer2_FN"));
        if ((!COAPPLICANTDATA.get("Co_Signer2_LN").isEmpty() || COAPPLICANTDATA.get("Co_Signer2_LN") == null) && FLAG_CO_SIGNER_2)
            inputSecondCoSignerLastName.sendKeys(COAPPLICANTDATA.get("Co_Signer2_LN"));
        LOGGER.info("Entered Co Signer2 details");
        btnContinue.click();
    }

    public void validateCoApplicantCoSigner() {
        commonMethods.validateTextMessage(LBL_CREATE_APPLICATION, lblCreateApplication.getText().trim());
        if (FLAG_CO_APPLICANT && FLAG_CO_SIGNER_1) {
            lblCoApplicant.isDisplayed();
            lblCoSigner.isDisplayed();
            Assert.assertEquals("Co-Applicant, co-Signer fields are mismatched", 2, listCoApplicantCoSignerSize.size());
            Assert.assertEquals("Co-Signer fields are mismatched", 2, listCoSignersSize.size());
            LOGGER.info("Co-applicant and Co-signer sections are displayed");
        } else if (FLAG_CO_APPLICANT) {
            lblCoApplicant.isDisplayed();
            Assert.assertEquals("Co-Applicant, co-Signer fields are mismatched", 1, listCoApplicantCoSignerSize.size());
            LOGGER.info("Co-applicant sections are displayed");
        }
        if ((!CREATEAPPLICATIONDATA.get("Co-Signer2").isEmpty() || CREATEAPPLICATIONDATA.get("Co-Signer2") == null) && CREATEAPPLICATIONDATA.get("Co-Signer2").equalsIgnoreCase("yes")) {
            {
//                btnAddRemoveCoSigner.click();
                btnAddCoSigner.click();
                Assert.assertEquals("Co-Applicant, co-Signer fields are mismatched", 2, listCoApplicantCoSignerSize.size());
                Assert.assertEquals("Co-Signer fields are mismatched", 4, listCoSignersSize.size());
                FLAG_CO_SIGNER_2 = true;
                LOGGER.info("Co-applicant, Co-signer1 and Co-signer2 sections are displayed");
            }
            btnContinue.click();
            if (FLAG_CO_APPLICANT && FLAG_CO_SIGNER_1) {
                commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblCoApplicantFirstNameErrMessage.getText());
                commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblCoApplicantLastNameErrMessage.getText());
                LOGGER.info("Co-applicant text fields mandatory messages are validated");
            }
            if (FLAG_CO_SIGNER_1) {
//                commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblCoSignerFirstNameErrorMessage.getText());
//                commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblCoSignerLastNameErrorMessage.getText());
                LOGGER.info("First Co-signer text fields mandatory messages are validated");
            }
            if (FLAG_CO_SIGNER_2) {
//                commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblSecondCoSignerFirstNameErrorMessage.getText());
//                commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblSecondCoSignerLastNameErrorMessage.getText());
                LOGGER.info("Second Co-signer text fields mandatory messages are validated");
            }
//            btnAddCoSigner.click();
//            Assert.assertEquals("Co-Signer fields are mismatched", 2, listCoSignersSize.size());
//            btnAddRemoveCoSigner.click();
//            Assert.assertEquals("Co-Applicant, co-Signer fields are mismatched", 1, listCoApplicantCoSignerSize.size());
//            btnCreateApplicationBack.click();
//            btnCoSigner.click();
//            btnContinue.click();
//            Assert.assertEquals("Co-Applicant, co-Signer fields are mismatched", 2, listCoApplicantCoSignerSize.size());
//            Assert.assertEquals("Co-Signer fields are mismatched", 2, listCoSignersSize.size());
//            lblCoApplicant.isDisplayed();
//            lblCoSigner.isDisplayed();
//            LOGGER.info("Validated Co Applicant, Co Signer applicant field level error mesages");
//            commonMethods.waitforSometimeInSeconds(5);
        }
    }

    public void validateInformationOnRequestPage(String strApplicantType, String strKey) throws Exception {
        commonMethods.waitforSometimeInSeconds(10);
        commonMethods.validateTextMessage(LBL_BASIC_INFORMATION, lblBasicInformation.getText());
        Assert.assertEquals(strApplicantType, btnSelectedApplicationTab.getText());
        commonMethods.validateTextMessage(LBL_VERIFY_YOUR_IDENTITY, lblVerifyYourIdetity.getText());
        btnUploadManually.isDisplayed();
        btnStartIDVerifiction.isDisplayed();
        commonMethods.validateTextMessage(LBL_NOT_VERIFIED, lblIDVerificationStatus.getText());
        commonMethods.validateTextMessage(LBL_DEMOGRAPHIC_INFORMATION, lblDemographicInformation.getText().trim());
        commonMethods.validateTextMessage(LBL_RESIDENTIAL_ADDRESS, lblResidentailAddress.getText().trim());
        commonMethods.validateTextMessage(LBL_RESIDENT_STATUS, lblResidentStatus.getText().trim());
//        commonMethods.validateTextMessage(LBL_BASIC_INFORMATION, lblBasicInformation.getText().trim());
        lblTimeAtResidence.isDisplayed();
        LOGGER.info("All buttons are displaying in Information on Request page");
        btnContinue.click();
        validateBasicInformationFields(strApplicantType, strKey);
        validateResidentialAddressSection(strApplicantType, strKey);
        validateResidentailStatusSection(strApplicantType);
    }

    public void validateEmploymentInformation(String strApplicantType) throws Exception {
        commonMethods.waitforSometimeInSeconds(5);
        Assert.assertEquals(strApplicantType, btnSelectedApplicationTab.getText());
        commonMethods.validateTextMessage(LBL_EMPLOYMENT_INFORMATION, lblEmploymentInformation.getText());
        commonMethods.validateTextMessage(LBL_EMPLOYMENT_INFORMATION, lblSubEmploymentInformation.getText().trim());
        btnContinue.click();
        commonMethods.waitforSometimeInSeconds(10);
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "DropDown", "empStatus"));
//        copyToClip("!@#$%");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "empName"));
//        doActions(strApplicantType, "id", "cousersEmpinfo", "empName", "", "Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "empName"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "name", "cousersEmpinfo", "Input", "empAddressLine1"));
//        doActions(strApplicantType, "name", "cousersEmpinfo","empAddressLine1", "","Paste", "");
//        doActionOnWebElement(strApplicantType,"Input","empAddressLine1","Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "name", "cousersEmpinfo", "Input", "empAddressLine1"));
//        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "DropDown", "empCity"));
//        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "empZipcode"));
//        doActions(strApplicantType, "id", "cousersEmpinfo", "empZipcode", "", "Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "empZipcode"));
        doActions(strApplicantType, "id", "cousersEmpinfo", "empZipcode", "", "ClearData", "");
        doActions(strApplicantType, "id", "cousersEmpinfo", "empZipcode", "", "EnterData", "123");
        commonMethods.validateTextMessage(ZIPCODE_LENTH_ERROR_MESSAGE1, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "empZipcode"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "jobTitle"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "DropDown", "occupation"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "DropDown", "industry"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "name", "cousersEmpinfo", "Input1", "empYears"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "name", "cousersEmpinfo", "Input1", "empMonths"));
        doActions(strApplicantType, "id", "cousersEmpinfo", "empMonths", "", "EnterData", "12");
        commonMethods.validateTextMessage(INVALID_MONTH_ERROR_MESSAGE, getWebElementText(strApplicantType, "name", "cousersEmpinfo", "Input1", "empMonths"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "name", "cousersEmpinfo", "Input", "monthlyIncome"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "mobile"));
        doActions(strApplicantType, "id", "cousersEmpinfo", "mobile", "", "EnterData", "998877665");
        commonMethods.validateTextMessage(WORK_PHONE_NUMBER_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "mobile"));
        commonMethods.waitforSometimeInSeconds(5);
        btnAdditionalIncomeAdd.click();
        btnContinue.click();
        commonMethods.validateTextMessage(LBL_ADDITIONAL_INCOME, lblAdditionalIncome.getText().trim());
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "addEmpName"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "addJobTitle"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "DropDown", "addOccupation"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "mobile2"));
        doActions(strApplicantType, "id", "cousersEmpinfo", "mobile2", "", "EnterData", "998877665");
        commonMethods.validateTextMessage(WORK_PHONE_NUMBER_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "cousersEmpinfo", "Input", "mobile2"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "name", "cousersEmpinfo", "Input", "addMonthlyIncome"));
        btnAdditionalIncomeRemove.click();
        LOGGER.info("Validated field level validations on Employment Information page for " + strApplicantType);
    }

    private void validateNamesInBasicInfomation(String strApplicantType, String strKey) {
        ExcelDriver excelDriver = new ExcelDriver();
        String strFN = null, strLN = null;
        if (strApplicantType.equalsIgnoreCase("Co-Applicant")) {
            strFN = "Co_Applicant_FN";
            strLN = "Co_Applicant_LN";
        } else if (strApplicantType.equalsIgnoreCase("Co-Signer 1")) {
            strFN = "Co_Signer1_FN";
            strLN = "Co_Signer1_LN";
        } else if (strApplicantType.equalsIgnoreCase("Co-Signer 2")) {
            strFN = "Co_Signer2_FN";
            strLN = "Co_Signer2_LN";
        }

        if (strApplicantType.equalsIgnoreCase("Applicant")) {
            if (isNullOrEmptyMap(CREATEAPPLICATIONDATA)) {
                CREATEAPPLICATIONDATA = excelDriver.getRowData(strKey, "UserData", "CreateApplication");
                LOGGER.info("Create Application data is loaded into map.");
            }
            doActionOnWebElement(strApplicantType, "Input", "firstName", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, CREATEAPPLICATIONDATA.get("Primary_Applicant_FN"));
            doActionOnWebElement(strApplicantType, "Input", "lastName", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, CREATEAPPLICATIONDATA.get("Primary_Applicant_LN"));
            LOGGER.info("Validate pre populated Firstname and Lastname for " + strApplicantType);
        } else {
            if (isNullOrEmptyMap(COAPPLICANTDATA)) {
                COAPPLICANTDATA = excelDriver.getRowData(strKey, "UserData", "CoApplicant");
                LOGGER.info("Co-Applicant/Co-Signer Application data is loaded into map.");
            }
            doActionOnWebElement(strApplicantType, "Input", "firstName", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, COAPPLICANTDATA.get(strFN));
            commonMethods.waitforSometimeInSeconds(1);
            doActionOnWebElement(strApplicantType, "Input", "lastName", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, COAPPLICANTDATA.get(strLN));
            LOGGER.info("Validate pre populated Firstname and Lastname for " + strApplicantType);
        }
    }

    /**
     * @param : strApplicantType - Type of applicant. Ex: Primary, Co-Applicant, Co-Signer1, Co-Signer2
     * @Description : This function used to validate error messages for common webelements in Basic Information section
     * in Information on Request page.
     * @Author :  Ravindra
     */
    private void validateBasicInformationFields(String strApplicantType, String strKey) {
        validateNamesInBasicInfomation(strApplicantType, strKey);
        doActionOnWebElement(strApplicantType, "Input", "firstName", "ClearData", "null");
        doActionOnWebElement(strApplicantType, "Input", "lastName", "ClearData", "null");
        btnContinue.click();
        if (strApplicantType.equalsIgnoreCase("Co-Applicant") || strApplicantType.equalsIgnoreCase("Co-Signer 1") || strApplicantType.equalsIgnoreCase("Co-Signer 2"))
            commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "DropDown", "relationship"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "firstName"));
//        copyToClip("!@#$%");
//        doActions(strApplicantType, "id", "cousers", "firstName", "", "Paste", "");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "lastName"));
//        doActions(strApplicantType, "id", "cousers", "lastName", "", "Paste", "");
//        commonMethods.validateTextMessage(LASTNAME_ALPHA_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "lastName"));
        doActions(strApplicantType, "id", "cousers", "firstName", "", "ClearData", "null");
        doActions(strApplicantType, "id", "cousers", "lastName", "", "ClearData", "null");
        doActions(strApplicantType, "id", "cousers", "lastName", "", "EnterData", "a");
        commonMethods.validateTextMessage(LASTNAME_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "lastName"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "dob"));
        doActions(strApplicantType, "id", "cousers", "dob", "", "EnterData", "01/01");
        commonMethods.validateTextMessage(DATE_FORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "dob"));
        doActions(strApplicantType, "id", "cousers", "dob", "ClearData", "null", "");
        doActions(strApplicantType, "id", "cousers", "dob", "", "EnterData", "01011800");
        commonMethods.validateTextMessage(MORETHAN_150_YEARS_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "dob"));
        doActions(strApplicantType, "id", "cousers", "dob", "", "ClearData", "null");
        doActions(strApplicantType, "id", "cousers", "dob", "", "EnterData", "01012023");
        commonMethods.validateTextMessage(MINOR_DOB_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "dob"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "DropDown", "ssn"));
        doActions(strApplicantType, "id", "cousers", "ssn", "", "EnterData", "123");
        btnContinue.click();
        commonMethods.validateTextMessage(SSN_LENGTH_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "DropDown", "ssn"));
        doActions(strApplicantType, "id", "cousers", "ssn", "", "ClearData", "null");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "email"));
        doActions(strApplicantType, "id", "cousers", "email", "", "EnterData", "asd");
        commonMethods.validateTextMessage(INVALID_EMAIL_FORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "email"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "mobile"));
        doActions(strApplicantType, "id", "cousers", "mobile", "", "EnterData", "123");
        commonMethods.validateTextMessage(MOBILE_NUMBER_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "mobile"));
        doActions(strApplicantType, "id", "cousers", "mobile", "", "ClearData", "");
//        doActions(strApplicantType, "id", "cousers", "mobile", "", "Paste", "!@#$%");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "mobile"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "DropDown", "maritalStatus"));
        doActions(strApplicantType, "id", "cousers", "mobile2", "", "EnterData", "123");
        commonMethods.validateTextMessage(ALTERNATE_PHONE_NUMBER_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "mobile2"));
        doActions(strApplicantType, "id", "cousers", "mobile2", "", "ClearData", "");
        LOGGER.info("Validated field error messages in Basic Information section" + strApplicantType + " page.");

    }

    /**
     * @param : strApplicantType - Type of applicant. Ex: Primary, Co-Applicant, Co-Signer1, Co-Signer2
     * @Description : This function used to validate error messages for common webelements in Residential Address section
     * in Information on Request page.
     * @Author :  Ravindra
     */
    private void validateResidentialAddressSection(String strApplicantType, String strKey) {
        btnContinue.click();
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "resAddress1"));
//        copyToClip("!@#$%");
//        doActionOnWebElement(strApplicantType, "Input", "resAddress1", "Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "resAddress1"));
//        doActionOnWebElement(strApplicantType, "Input", "resAddress2", "Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "resAddress2"));
        doActionOnWebElement(strApplicantType, "Input", "resAddress2", "ClearData", "");
        doActionOnWebElement(strApplicantType, "Input", "resCountry", "GetAttribute", "aria-disabled");
        Assert.assertEquals("true", GETATTRIBUTEVALUE);
        Assert.assertEquals("United States", getWebElementText(strApplicantType, "id", "", "resCountry"));

//        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "DropDown", "resState"));

        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "DropDown", "resCity"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "resZipcode"));
//        doActionOnWebElement(strApplicantType, "Input", "resZipcode", "Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "resZipcode"));
        doActionOnWebElement(strApplicantType, "Input", "resZipcode", "ClearData", "");
        doActionOnWebElement(strApplicantType, "Input", "resZipcode", "EnterData", "123");
        commonMethods.validateTextMessage(ZIPCODE_LENTH_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "resZipcode"));
//        if (strApplicantType.equalsIgnoreCase("Co-Applicant") || strApplicantType.equalsIgnoreCase("Co-Signer 1") || strApplicantType.equalsIgnoreCase("Co-Signer 2")) {
//            inputCopyAddress.click();
//        }
//        validateNamesInBasicInfomation(strApplicantType, strKey);
        commonMethods.validateTextMessage(LBL_UTILITYBILL, getWebElementText(strApplicantType, "for", "", "resUtilityBill"));
        commonMethods.validateTextMessage(LBL_UPLOADAD_PROOF_OF_ADDRESS, lblUploadProofOfAddress.getText());
        LOGGER.info("Validated field level error messages in Residential Address in " + strApplicantType + " page.");
    }

    /**
     * @param : strApplicantType - Type of applicant. Ex: Primary, Co-Applicant, Co-Signer1, Co-Signer2
     *          in Information on Request page.
     * @Description : This function used to validate error messages for common webelements in Mailing Address section
     * @Author :  Ravindra
     */
    private void validateMailingAddressSection(String strApplicantType) {

//        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblMailingAddress1ErrorMsg.getText());
//        doActionOnWebElement(strApplicantType, "Input", "resAddress1", "Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "Input", "resAddress1"));

        doActionOnWebElement(strApplicantType, "Input", "perCountry", "GetAttribute", "aria-disabled");
        Assert.assertEquals("true", GETATTRIBUTEVALUE);
        Assert.assertEquals("United States", getWebElementText(strApplicantType, "id", "", "perCountry"));
        doActionOnWebElement(strApplicantType, "Input", "perState", "GetAttribute", "aria-disabled");
        Assert.assertEquals("true", GETATTRIBUTEVALUE);
        Assert.assertEquals("PUERTO RICO", getWebElementText(strApplicantType, "id", "", "perState"));
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "DropDown", "perCity"));
        commonMethods.validateTextMessage(ZIPCODE_LENTH_ERROR_MESSAGE1, getWebElementText(strApplicantType, "id", "Input", "perZipcode"));
        doActionOnWebElement(strApplicantType, "Input", "perZipcode", "ClearData", "");
        commonMethods.waitforSometimeInSeconds(5);
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "perZipcode"));
//        doActionOnWebElement(strApplicantType, "Input", "perZipcode", "Paste", "");
//        commonMethods.validateTextMessage(INVALIDFORMAT_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "perZipcode"));
        doActionOnWebElement(strApplicantType, "Input", "perZipcode", "ClearData", "");
        doActionOnWebElement(strApplicantType, "Input", "perZipcode", "EnterData", "123");
        commonMethods.validateTextMessage(ZIPCODE_LENTH_ERROR_MESSAGE1, getWebElementText(strApplicantType, "id", "Input", "perZipcode"));
        commonMethods.validateTextMessage(LBL_UTILITYBILL, lblUtilityBill.getText());
        LOGGER.info("Validated field error messages in Mailing status in " + strApplicantType + " page.");
    }

    /**
     * @param : strApplicantType - Type of applicant. Ex: Primary, Co-Applicant, Co-Signer1, Co-Signer2
     *          in Information on Request page.
     * @Description : This function used to validate error messages for common webelements in Mailing Address section
     * @Author :  Ravindra
     */
    private void validateResidentailStatusSection(String strApplicantType) {
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, lblResidentailStatusErrorMessage.getText());
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input1", "residentYears"));
        doActionOnWebElement(strApplicantType, "Input", "residentYears", "EnterData", "99");
        commonMethods.validateTextMessage(GREATERTHAN_AGE_ERROR_MESSAGE, lblResidentYearsGreaterThanAgeErrorMessage.getText());
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input1", "residentMonths"));
        doActionOnWebElement(strApplicantType, "Input", "residentMonths", "EnterData", "12");
        commonMethods.validateTextMessage(INVALID_MONTH_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input1", "residentMonths"));
        btnHomeOwner.click();
        lblMonthlyPayment.isDisplayed();
        btnContinue.click();
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "monthlyPayment"));
        btnParents.click();
        btnRent.click();
        lblMonthlyPayment.isDisplayed();
        btnContinue.click();
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, getWebElementText(strApplicantType, "id", "Input", "monthlyPayment"));
        LOGGER.info("Validated field level error messages in Residential status in " + strApplicantType + " page.");
    }

    public void clickOnDiscardApplication() {
        commonMethods.waitforSometimeInSeconds(10);
        inputResidentYears.sendKeys("6");
        btnDiscardApplication.click();
        LOGGER.info("clicked on discard application button");
        btnYesDiscardApplication.click();
        LOGGER.info("clicked on Yes, Discard application button from pop up");
        commonMethods.waitforSometimeInSeconds(30);
        btnHomeMenu.click();
    }

    public void clickOnSaveAsDraft(String strExitContinue) {
        commonMethods.waitforSometimeInSeconds(2);
        btnSaveAsDraft.click();
        LOGGER.info("clicked on save as draft button");
        commonMethods.waitforSometimeInSeconds(10);
        lblSavedDraftSuccessfully.isDisplayed();
        if (strExitContinue.equalsIgnoreCase("exit")) {
            btnExitSaveDraft.click();
            LOGGER.info("clicked on Exit, Go to dashboard otption");
        } else if (strExitContinue.equalsIgnoreCase("continue")) {
            btnOkContinueWithApplication.click();
            LOGGER.info("clicked on Exit, Ok to dashboard otption");
        }
        commonMethods.waitforSometimeInSeconds(20);
    }

    public void clickOnCancelButton() {
        String currentWindow = getDriver().getWindowHandle();
        LOGGER.info("Window: "+ currentWindow);
        btnCancel.click();
        getDriver().switchTo().window(currentWindow);
        LOGGER.info("Window : "+ getDriver().getWindowHandle());
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("window.scrollBy(0,50)");
        LOGGER.info("Clicked on cancel button from create application window");
    }

    public void clickOnCloseButtonInCreateApplication() {
        btnCloseCreateApplication.click();
        LOGGER.info("Clicked on close button from create application window");
    }

    public void clickOnContinue() {
        btnContinue.click();
        LOGGER.info("Clicked on continue button");
    }

    /**
     * @Description : This function used to capture the Application ID from create API response
     * @Author :  Ravindra
     */
    public void getApplicationIDFromResponse() {
        DevTools devTools = ((HasDevTools) getDriver()).getDevTools();
        devTools.createSession();
        final RequestId[] requestIds = new RequestId[1];
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.responseReceived(), responseReceived -> {
            String url = responseReceived.getResponse().getUrl();
            try {
                if (url.contains("create")) {
                    requestIds[0] = responseReceived.getRequestId();
                    LOGGER.info("API URL: " + url);
                    LOGGER.info("Request Body: \n" + devTools.send(Network.getRequestPostData(requestIds[0])) + "\n");
                    LOGGER.info("Response Body: \n" + devTools.send(Network.getResponseBody(requestIds[0])).getBody() + "\n");
                    String jsonResponse = devTools.send(Network.getResponseBody(requestIds[0])).getBody();
                    Object obj = JSONValue.parse(jsonResponse);
                    JSONObject jsonObject = (JSONObject) obj;
                    APPLICATIONID_REFERENCE = (String) jsonObject.get("applicationId");
                    LOGGER.info("Application ID: " + APPLICATIONID_REFERENCE);
                }
            } catch (DevToolsException e) {
                LOGGER.info("still loading.....");
            } catch (Exception e) {
                LOGGER.warn("Got exception" + e.getMessage());
            }

        });
    }

    public void getResponseUsingDevTools(String strApiName) {
        DevTools devTools = ((HasDevTools) getDriver()).getDevTools();
        devTools.createSession();
        LOGGER.info("String :" + strApiName);
        final RequestId[] requestIds = new RequestId[1];
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.responseReceived(), responseReceived -> {
            String url = responseReceived.getResponse().getUrl();

            try {
                if (url.contains("getSpecificDetails")) {
                    requestIds[0] = responseReceived.getRequestId();
                    LOGGER.info("API URL: " + url);
                    LOGGER.info("Request Body: \n" + devTools.send(Network.getRequestPostData(requestIds[0])) + "\n");
                    LOGGER.info("Response Body: \n" + devTools.send(Network.getResponseBody(requestIds[0])).getBody() + "\n");
                    String jsonResponse = devTools.send(Network.getResponseBody(requestIds[0])).getBody();
                    Object obj = JSONValue.parse(jsonResponse);
                    DEVTOOLSRESPONSEJSON = (JSONObject) obj;
                }
            } catch (DevToolsException e) {
                LOGGER.info("still loading.....");

            } catch (Exception e) {
                LOGGER.warn("Got exception" + e.getMessage());
            }

        });
    }

    public void deleteDraftApplication(String strApplicationID) throws Exception {
        btnApplicationsMenu.click();
        btnMyLoanDrafts.click();
        for (int i = 1; i <= 10; i++) {
            try {
                if ($("//table[@aria-label='applications-table']//tbody/tr[" + i + "]/th[1]/h6").getText().equalsIgnoreCase(strApplicationID)) {
                    $("//table[@aria-label='applications-table']//tr[" + i + "]//td[7]/h6/a[1]").click();
                    LOGGER.info("draft application " + strApplicationID + " selected and clicked on delete button");
                    commonMethods.waitforSometimeInSeconds(2);
                    btnYesDelete.click();
                    LOGGER.info("Clicked on confirm delete button");
                    commonMethods.waitforSometimeInSeconds(10);
                    inputRefID.sendKeys(strApplicationID);
                    btnApply.click();
                    commonMethods.waitforSometimeInSeconds(2);
                    Assert.assertEquals("After delete record, record count is not matching", 1, listRecordCount.size());
                    LOGGER.info("Validated " + strApplicationID + " is deleted and not displaying in draft applications table records");
                    break;
                }
            } catch (Exception e) {
                throw new Exception("Application ID - " + strApplicationID + " is not found in draft applications list");
            }
        }
    }

    public void editDraftApplication(String strApplicationID) throws Exception {
        btnApplicationsMenu.click();
        btnMyLoanDrafts.click();
        inputRefID.sendKeys(strApplicationID);
        btnApply.click();
        commonMethods.waitforSometimeInSeconds(2);
        try {
            btnEditDraftLoan.click();
            LOGGER.info("draft application " + strApplicationID + " selected and clicked on edit button");
        } catch (Exception e) {
            throw new Exception(strApplicationID + " application is not found.");
        }
        commonMethods.waitforSometimeInSeconds(5);
    }

    public void validateDraftApplicationStausMessage(String strStatusMessage) {
        LOGGER.info("Draft Application Status : " + lblDraftPageMessageinPopup.getText());
        String strUIMsg = lblDraftPageMessageinPopup.getText().substring(23, lblDraftPageMessageinPopup.getText().lastIndexOf("."));
//        commonMethods.validateTextMessage(strStatusMessage, strUIMsg);
        Assert.assertEquals(strStatusMessage.trim(), strUIMsg.trim());
    }

    public void selectDraftAction(String strAction) {
        try {
            if (strAction.equalsIgnoreCase("WhereYouLeft"))
                btnPickUpWhereYouLeft.click();
            else if (strAction.equalsIgnoreCase("StartFromBegin"))
                btnStartFromBegining.click();
            LOGGER.info(" clicked on " + strAction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param : strApplicationID - Application ID to fetch the data from Drafts
     * @param : strAction - Name of WebElement. Ex: fisrtName, lastName, dob, ssn, mobile etc
     * @param : strElementType - Type of WebElement. Ex: dob
     * @param : strOperation - Type of Action. Ex: Clear data, EnterData, Paste etc
     * @param : strOperation - Type of WebElement. Ex: dob
     * @Description : This is a common function for editing the applications from drafts.
     * @Author :  Ravindra
     */
    public void editDraftApplication(String strApplicationID, String strAction) throws Exception {
        btnApplicationsMenu.click();
        btnMyLoanDrafts.click();
        if (strApplicationID.isEmpty() || strApplicationID.isBlank())
            inputRefID.sendKeys(APPLICATIONID);
        else
            inputRefID.sendKeys(strApplicationID);
        btnApply.click();
        commonMethods.waitforSometimeInSeconds(2);
        try {
            btnEditDraftLoan.click();
            LOGGER.info("Draft application " + strApplicationID + " selected and clicked on edit button");
        } catch (Exception e) {
            throw new Exception(strApplicationID + " application is not found.");
        }
        commonMethods.waitforSometimeInSeconds(5);
        try {
            if (strAction.equalsIgnoreCase("WhereYouLeft"))
                btnPickUpWhereYouLeft.click();
            else if (strAction.equalsIgnoreCase("StartFromBegin"))
                btnStartFromBegining.click();
            else if (strAction.equalsIgnoreCase("proceed"))
                btnYesProceed.click();
            LOGGER.info(" clicked on " + strAction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editDraftApplicationForInvitationFlow(String strApplicationID, String strAction) throws Exception {
        btnApplicationsMenu.click();
        btnMyLoanDrafts.click();
        if (strApplicationID.isEmpty() || strApplicationID.isBlank())
            inputRefID.sendKeys(APPLICATIONID);
        else
            inputRefID.sendKeys(strApplicationID);
        btnApply.click();
        commonMethods.waitforSometimeInSeconds(2);
        try {
            btnEditDraftLoan.click();
            LOGGER.info("Draft application " + strApplicationID + " selected and clicked on edit button");
        } catch (Exception e) {
            throw new Exception(strApplicationID + " application is not found.");
        }
        commonMethods.waitforSometimeInSeconds(5);
        $("//button[@data-testid='continue-btn']").click();
//        commonMethods.waitforSometimeInSeconds(5);
//        $("//h6[contains(text(),'The pending invitations')]").click();
//        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
//        executor.executeScript("arguments[0].click();", btnYesProceed);
        btnYesProceed.click();
        commonMethods.waitforSometimeInSeconds(10);
//        try {
//            if (strAction.equalsIgnoreCase("WhereYouLeft"))
//                btnPickUpWhereYouLeft.click();
//            else if (strAction.equalsIgnoreCase("StartFromBegin"))
//                btnStartFromBegining.click();
//            else if (strAction.equalsIgnoreCase("proceed"))
//                btnYesProceed.click();
//            LOGGER.info(" clicked on " + strAction);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public void clickOnEditFromDraftApplication(String strApplicationID) throws Exception {

////        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
////        executor.executeScript("arguments[0].click();", btnApplicationsMenu);
//Actions actions = new Actions(getDriver());
//                actions.moveToElement(btnApplicationsMenu).build().perform();

        btnApplicationsMenu.click();
        btnMyLoanDrafts.click();
        if (strApplicationID.isEmpty() || strApplicationID.isBlank())
            inputRefID.sendKeys(APPLICATIONID);
        else
            inputRefID.sendKeys(strApplicationID);
        btnApply.click();
        commonMethods.waitforSometimeInSeconds(2);
        try {
            btnEditDraftLoan.click();
            LOGGER.info("Draft application " + strApplicationID + " selected and clicked on edit button");
        } catch (Exception e) {
            throw new Exception(strApplicationID + " application is not found.");
        }
        commonMethods.waitforSometimeInSeconds(5);
    }

    public void resumeEditDraftApplication( String strAction) throws Exception {
        try {
            if (strAction.equalsIgnoreCase("WhereYouLeft"))
                btnPickUpWhereYouLeft.click();
            else if (strAction.equalsIgnoreCase("StartFromBegin"))
                btnStartFromBegining.click();
            else if (strAction.equalsIgnoreCase("proceed"))
                btnYesProceed.click();
            LOGGER.info(" clicked on " + strAction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void searchApplication(String strApplicationID) throws Exception {
        String strAppID;
        if (strApplicationID.equalsIgnoreCase("new"))
            strAppID = APPLICATIONID.trim();
        else
            strAppID = strApplicationID;
        LOGGER.info("Application ID: " + strAppID);
        btnApplicationsMenu.click();
        LOGGER.info("Clicked on Application menu");
        commonMethods.waitforSometimeInSeconds(5);
        try {
            $("//table[@aria-label='applications-table']//button[text()='" + strAppID + "']").isDisplayed();
            LOGGER.info(strAppID + " is displayed in My Loan Applications list");
        } catch (NoSuchElementException e) {
            throw new Exception("Application ID " + strAppID + " is not found in My Loan Applications results");
        }
        btnAdvancedSearch.click();
        LOGGER.info("Clicked on Advanced search button");
        inputAppID.sendKeys(strAppID);
        LOGGER.info("Application ID : " + inputAppID.getAttribute("value"));
        btnSearch.click();
        LOGGER.info("Clicked on Search button");
        commonMethods.waitforSometimeInSeconds(10);
        APPLICATION_STATUS = lblMyLoanApplicationStatus.getText().trim();
        LOGGER.info("Application Status : " + APPLICATION_STATUS);
    }

    public void validateApplicationStatus(String strStatus) throws Exception {
        LOGGER.info(strStatus);
        if (strStatus.equalsIgnoreCase("Pending"))
            commonMethods.validateTextMessage(LBL_DECISION_PENDING, APPLICATION_STATUS);
        else if (strStatus.equalsIgnoreCase("Declined"))
            commonMethods.validateTextMessage(LBL_Declined, APPLICATION_STATUS);
        LOGGER.info("Application status validated as " + APPLICATION_STATUS);
    }

    /**
     * @param : strApplicantType - Type of applicant. Ex: Primary, Co-Applicant, Co-Signer1, Co-Signer2
     * @param : strElement - Name of WebElement. Ex: fisrtName, lastName, dob, ssn, mobile etc
     * @param : strElementType - Type of WebElement. Ex: Input, DropDown
     * @Description : This is a common function for creating dynamic webelement and get label text to validate error messages.
     * @reurn : Webelement label text
     * @Author :  Ravindra
     */
    public void doActions(String strApplicantType, String strStrategy, String strScreen, String strElement, String strElementType, String strOperation, String strValue) {
        String str = null;
        switch (strApplicantType) {
            case "Applicant":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 0 + "]." + strElement + "']";
                break;
            case "Co-applicant":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 1 + "]." + strElement + "']";
                break;
            case "Co-signer 1":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 2 + "]." + strElement + "']";
                break;
            case "Co-signer 2":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 3 + "]." + strElement + "']";
                break;
            default:
        }
        if (strElementType.equalsIgnoreCase("dob") && strOperation.equalsIgnoreCase("ClearData")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        } else if (strOperation.equalsIgnoreCase("ClearData")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            $(str).clear();
        } else if (strOperation.equalsIgnoreCase("EnterData")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            $(str).sendKeys(strValue);
        } else if (strOperation.equalsIgnoreCase("Paste")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "V"));
        } else if (strOperation.equalsIgnoreCase("GetAttribute")) {
            GETATTRIBUTEVALUE = $(str).getAttribute(strValue);
        } else if (strOperation.equalsIgnoreCase("Click")) {
            $(str).click();
        } else if (strOperation.equalsIgnoreCase("SelectDropDown")) {
            $(str).click();
            commonMethods.waitforSometimeInSeconds(2);
            $("//li[contains(@data-value,'" + strValue + "')]").waitUntilVisible();
            $("//li[contains(@data-value,'" + strValue + "')]").click();
        }

    }

    /**
     * @param : strApplicantType - Type of applicant. Ex: Primary, Co-Applicant, Co-Signer1, Co-Signer2
     * @param : strElement - Name of WebElement. Ex: fisrtName, lastName, dob, ssn, mobile etc
     * @param : strElementType - Type of WebElement. Ex: dob
     * @param : strOperation - Type of Action. Ex: Clear data, EnterData, Paste etc
     * @param : strOperation - Type of WebElement. Ex: dob
     * @Description : This is a common function for creating dynamic webelement and perform action.
     * @Author :  Ravindra
     */
    public void doActionOnWebElement(String strApplicantType, String strElementType, String strElement, String strOperation, String strValue) {
        String str = null;
        switch (strApplicantType) {
            case "Applicant":
                str = "//*[@id='cousers[" + 0 + "]." + strElement + "']";
                break;
            case "Co-applicant":
                str = "//*[@id='cousers[" + 1 + "]." + strElement + "']";
                break;
            case "Co-signer 1":
                str = "//*[@id='cousers[" + 2 + "]." + strElement + "']";
                break;
            case "Co-signer 2":
                str = "//*[@id='cousers[" + 3 + "]." + strElement + "']";
                break;
            case "None":
                str = "//*[@id='" + strElement + "']";
                break;
            default:
        }

        if (strElementType.equalsIgnoreCase("dob") && strOperation.equalsIgnoreCase("ClearData")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        } else if (strOperation.equalsIgnoreCase("ClearData")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        } else if (strOperation.equalsIgnoreCase("EnterData")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            $(str).sendKeys(strValue);
        } else if (strOperation.equalsIgnoreCase("Paste")) {
            $(str).sendKeys(Keys.chord(Keys.CONTROL, "V"));
        } else if (strOperation.equalsIgnoreCase("GetAttribute")) {
            LOGGER.info("GEt Attribute : " + str);
            GETATTRIBUTEVALUE = $(str).getAttribute(strValue);
        } else if (strOperation.equalsIgnoreCase("Click")) {
            $(str).click();
        } else if (strOperation.equalsIgnoreCase("SelectDropDown")) {
            $(str).click();
            $("//li[contains(@data-value,'" + strValue + "')]").waitUntilVisible();
            $("//li[contains(@data-value,'" + strValue + "')]").click();
        }
    }

    /**
     * @param : strApplicantType - Type of applicant. Ex: Primary, Co-Applicant, Co-Signer1, Co-Signer2
     * @param : strElement - Name of WebElement. Ex: fisrtName, lastName, dob, ssn, mobile etc
     * @param : strElementType - Type of WebElement. Ex: Input, DropDown
     * @Description : This is a common function for creating dynamic webelement and get label text to validate error messages.
     * @reurn : Webelement label text
     * @Author :  Ravindra
     */
    private String getWebElementText(String strApplicantType, String strStrategy, String strElementType, String strElement) {
        String elementGetText;
        String str = null;
        switch (strApplicantType) {
            case "Applicant":
                str = "//*[@" + strStrategy + "='cousers[" + 0 + "]." + strElement + "']";
                break;
            case "Co-applicant":
                str = "//*[@" + strStrategy + "='cousers[" + 1 + "]." + strElement + "']";
                break;
            case "Co-signer 1":
                str = "//*[@" + strStrategy + "='cousers[" + 2 + "]." + strElement + "']";
                break;
            case "Co-signer 2":
                str = "//*[@" + strStrategy + "='cousers[" + 3 + "]." + strElement + "']";
                break;
            default:
        }
        if (strElementType.equalsIgnoreCase("Input")) {
            str = str + "/../../../..//p";
        } else if (strElementType.equalsIgnoreCase("DropDown")) {
            str = str + "/../../..//p";
        } else if (strElementType.equalsIgnoreCase("Input1")) {
            str = str + "/../../../../../p";
        }
        elementGetText = $(str).getText();
        return elementGetText;
    }

    private String getWebElementText(String strApplicantType, String strStrategy, String strScreen, String strElementType, String strElement) {
        String elementGetText;
        String str = null;
        switch (strApplicantType) {
            case "Applicant":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 0 + "]." + strElement + "']";
                break;
            case "Co-applicant":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 1 + "]." + strElement + "']";
                break;
            case "Co-signer 1":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 2 + "]." + strElement + "']";
                break;
            case "Co-signer 2":
                str = "//*[@" + strStrategy + "='" + strScreen + "[" + 3 + "]." + strElement + "']";
                break;
            default:
        }

        if (strElementType.equalsIgnoreCase("Input")) {
            str = str + "/../../../..//p";
        } else if (strElementType.equalsIgnoreCase("DropDown")) {
            str = str + "/../../../p";
        } else if (strElementType.equalsIgnoreCase("Input1")) {
            str = str + "/../../../../../p";
        }
        elementGetText = $(str).getText();
        return elementGetText;
    }

    /**
     * @param : strKey - Read data from excel using key
     * @Description : This is function used to read the data from excel and enter application data.
     * @Author :  Ravindra
     */
    public void enterInformationonRequestData(String strApplicantType, String strKey) throws Exception {
        LOGGER.info("Entering " + strApplicantType + " data into Information on Request page");
        if (isNullOrEmptyMap(CREATEAPPLICATIONDATA)) {
            ExcelDriver excelDriver = new ExcelDriver();
            CREATEAPPLICATIONDATA = excelDriver.getRowData(strKey, "UserData", "CreateApplication");
        }
        doActionOnWebElement(strApplicantType, "Input", "firstName", "EnterData", CREATEAPPLICATIONDATA.get("Primary_Applicant_FN"));
        doActionOnWebElement(strApplicantType, "Input", "lastName", "EnterData", CREATEAPPLICATIONDATA.get("Primary_Applicant_LN"));
        doActionOnWebElement(strApplicantType, "Input", "secondLastName", "EnterData", CREATEAPPLICATIONDATA.get("Primary_Applicant_SLN"));
        if (!CREATEAPPLICATIONDATA.get("Date of Birth").isEmpty() || CREATEAPPLICATIONDATA.get("Date of Birth") == null) {
            doActionOnWebElement(strApplicantType, "dob", "dob", "ClearData", "null");
            doActionOnWebElement(strApplicantType, "Input", "dob", "EnterData", CREATEAPPLICATIONDATA.get("Date of Birth"));
        }

        if (!CREATEAPPLICATIONDATA.get("Social Security Number").isEmpty() || CREATEAPPLICATIONDATA.get("Social Security Number") == null) {
            doActionOnWebElement(strApplicantType, "Input", "ssn", "EnterData", CREATEAPPLICATIONDATA.get("Social Security Number"));
        }

        if (!CREATEAPPLICATIONDATA.get("Email").isEmpty() || CREATEAPPLICATIONDATA.get("Email") == null) {
            doActionOnWebElement(strApplicantType, "Input", "email", "EnterData", CREATEAPPLICATIONDATA.get("Email"));
        }
        if (!CREATEAPPLICATIONDATA.get("Mobile").isEmpty() || CREATEAPPLICATIONDATA.get("Mobile") == null) {
            doActionOnWebElement(strApplicantType, "Input", "mobile", "ClearData", "");
            doActionOnWebElement(strApplicantType, "Input", "mobile", "EnterData", CREATEAPPLICATIONDATA.get("Mobile"));
        }
        if (!CREATEAPPLICATIONDATA.get("Marital Status").isEmpty() || CREATEAPPLICATIONDATA.get("Marital Status") == null) {
            doActionOnWebElement(strApplicantType, "", "maritalStatus", "SelectDropDown", CREATEAPPLICATIONDATA.get("Marital Status"));
        }
        if (!CREATEAPPLICATIONDATA.get("Address line 1").isEmpty() || CREATEAPPLICATIONDATA.get("Address line 1") == null) {
            doActionOnWebElement(strApplicantType, "Input", "resAddress1", "EnterData", CREATEAPPLICATIONDATA.get("Address line 1"));
        }
        LOGGER.info("State : " + CREATEAPPLICATIONDATA.get("State"));
        if (!CREATEAPPLICATIONDATA.get("State").isEmpty() || CREATEAPPLICATIONDATA.get("State") == null) {
            doActionOnWebElement(strApplicantType, "", "resState", "SelectDropDown", CREATEAPPLICATIONDATA.get("State"));
        }

        if (!CREATEAPPLICATIONDATA.get("City").isEmpty() || CREATEAPPLICATIONDATA.get("City") == null) {
            doActionOnWebElement(strApplicantType, "", "resCity", "SelectDropDown", CREATEAPPLICATIONDATA.get("City"));
        }
        if (!CREATEAPPLICATIONDATA.get("Zip Code").isEmpty() || CREATEAPPLICATIONDATA.get("Zip Code") == null) {
            doActionOnWebElement(strApplicantType, "Input", "resZipcode", "EnterData", CREATEAPPLICATIONDATA.get("Zip Code"));
        }
        if (!CREATEAPPLICATIONDATA.get("Resident Status").isEmpty() || CREATEAPPLICATIONDATA.get("Resident Status") == null) {
            doActionOnWebElement("None", "Input", CREATEAPPLICATIONDATA.get("Resident Status"), "Click", "");
        }
        if (!CREATEAPPLICATIONDATA.get("Years").isEmpty() || CREATEAPPLICATIONDATA.get("Years") == null) {

            doActionOnWebElement(strApplicantType, "Input", "residentYears", "EnterData", CREATEAPPLICATIONDATA.get("Years"));
        }
        if (!CREATEAPPLICATIONDATA.get("Months").isEmpty() || CREATEAPPLICATIONDATA.get("Months") == null) {
            doActionOnWebElement(strApplicantType, "Input", "residentMonths", "EnterData", CREATEAPPLICATIONDATA.get("Months"));
        }
        LOGGER.info("Entering " + strApplicantType + " data into Information on Request page");
        btnContinue.click();
        LOGGER.info("Clicked on continue button");
    }

    /**
     * @param : strKey - Read data from excel using key
     * @Description : This is function used to read the data from excel and enter application data.
     * @Author :  Ravindra
     */
    public void enterCoAppliantData(String strApplicantType, String strKey) throws Exception {
        LOGGER.info("Entering " + strApplicantType + " data into Information on Request page");
        if (isNullOrEmptyMap(COAPPLICANTDATA)) {
            ExcelDriver excelDriver = new ExcelDriver();
            COAPPLICANTDATA = excelDriver.getRowData(strKey, "UserData", "CoApplicant");
        }
        String strApplicant = null;
        if (strApplicantType.equalsIgnoreCase("Co-Applicant")) {
            strApplicant = "Co_Applicant_";
        } else if (strApplicantType.equalsIgnoreCase("Co-Signer 1")) {
            strApplicant = "Co_Signer1_";
        } else if (strApplicantType.equalsIgnoreCase("Co-Signer 2")) {
            strApplicant = "Co_Signer2_";
        }


        doActionOnWebElement(strApplicantType, "Input", "firstName", "EnterData", COAPPLICANTDATA.get(strApplicant + "FN"));
        doActionOnWebElement(strApplicantType, "Input", "lastName", "EnterData", COAPPLICANTDATA.get(strApplicant + "LN"));
        if (!COAPPLICANTDATA.get(strApplicant + "Relationship").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Relationship") == null) {
            doActionOnWebElement(strApplicantType, "", "relationship", "SelectDropDown", COAPPLICANTDATA.get(strApplicant + "Relationship"));
        }

        if (!COAPPLICANTDATA.get(strApplicant + "DOB").isEmpty() || COAPPLICANTDATA.get(strApplicant + "DOB") == null) {
            doActionOnWebElement(strApplicantType, "dob", "dob", "ClearData", "null");
            doActionOnWebElement(strApplicantType, "Input", "dob", "EnterData", COAPPLICANTDATA.get(strApplicant + "DOB"));
        }

        if (!COAPPLICANTDATA.get(strApplicant + "SSN").isEmpty() || COAPPLICANTDATA.get(strApplicant + "SSN") == null) {
            doActionOnWebElement(strApplicantType, "Input", "ssn", "EnterData", COAPPLICANTDATA.get(strApplicant + "SSN"));
        }

        if (!COAPPLICANTDATA.get(strApplicant + "Email").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Email") == null) {
            doActionOnWebElement(strApplicantType, "Input", "email", "EnterData", COAPPLICANTDATA.get(strApplicant + "Email"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Mobile").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Mobile") == null) {
            doActionOnWebElement(strApplicantType, "Input", "mobile", "ClearData", "");
            doActionOnWebElement(strApplicantType, "Input", "mobile", "EnterData", COAPPLICANTDATA.get(strApplicant + "Mobile"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Marital").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Marital") == null) {
            doActionOnWebElement(strApplicantType, "", "maritalStatus", "SelectDropDown", COAPPLICANTDATA.get(strApplicant + "Marital"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Address1").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Address1") == null) {
            doActionOnWebElement(strApplicantType, "Input", "resAddress1", "EnterData", COAPPLICANTDATA.get(strApplicant + "Address1"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "State").isEmpty() || COAPPLICANTDATA.get(strApplicant + "State") == null) {
            doActionOnWebElement(strApplicantType, "", "resState", "SelectDropDown", COAPPLICANTDATA.get(strApplicant + "State"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "City").isEmpty() || COAPPLICANTDATA.get(strApplicant + "City") == null) {
            doActionOnWebElement(strApplicantType, "", "resCity", "SelectDropDown", COAPPLICANTDATA.get(strApplicant + "City"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Zipcode").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Zipcode") == null) {
            doActionOnWebElement(strApplicantType, "Input", "resZipcode", "EnterData", COAPPLICANTDATA.get(strApplicant + "Zipcode"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Residentail_Status").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Residentail_Status") == null) {
            doActionOnWebElement("None", "Input", COAPPLICANTDATA.get(strApplicant + "Residentail_Status"), "Click", "");
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Monthly_Payment").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Monthly_Payment") == null) {
            doActionOnWebElement(strApplicantType, "Input", "monthlyPayment", "EnterData", COAPPLICANTDATA.get(strApplicant + "Monthly_Payment"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Years").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Years") == null) {
            doActionOnWebElement(strApplicantType, "Input", "residentYears", "EnterData", COAPPLICANTDATA.get(strApplicant + "Years"));
        }
        if (!COAPPLICANTDATA.get(strApplicant + "Months").isEmpty() || COAPPLICANTDATA.get(strApplicant + "Months") == null) {
            doActionOnWebElement(strApplicantType, "Input", "residentMonths", "EnterData", COAPPLICANTDATA.get(strApplicant + "Months"));
        }
        LOGGER.info("Entered " + strApplicantType + " data into Information on Request page");
        btnContinue.click();
        LOGGER.info("Clicked on continue button");
        commonMethods.waitforSometimeInSeconds(20);
    }

    /**
     * @param : strKey - Read data from excel using key
     * @param : strApplicantType - Application type. Ex: Primary, Co Applicant, Co Signer etc
     * @Description : This is function used to read the data from excel and enter Employment Information data.
     * @Author :  Ravindra
     */
    public void enterEmploymentInformationData(String strApplicantType, String strKey) throws Exception {
        LOGGER.info("Entering " + strApplicantType + " data into Employment page");
        commonMethods.waitforSometimeInSeconds(4);
        if (isNullOrEmptyMap(EMPLOYMENTDATA)) {
            ExcelDriver excelDriver = new ExcelDriver();
            EMPLOYMENTDATA = excelDriver.getRowData(strKey, "UserData", "Employment");
            LOGGER.info("Employment data loaded into map");
        }
        int i = 0;
        String strApplicant = null;
        if (strApplicantType.equalsIgnoreCase("Applicant")) {
            strApplicant = "Primary_";
            i = 0;
        } else if (strApplicantType.equalsIgnoreCase("Co-applicant")) {
            strApplicant = "Co_Applicant_";
            i = 1;
        } else if (strApplicantType.equalsIgnoreCase("Co-signer 1")) {
            strApplicant = "Co_Signer1_";
            i = 2;
        } else if (strApplicantType.equalsIgnoreCase("Co-signer 2")) {
            strApplicant = "Co_Signer2_";
            i = 3;
        }
        LOGGER.info("String : " + strApplicant);
        LOGGER.info(strApplicant + "Status");

        if (!EMPLOYMENTDATA.get(strApplicant + "Status").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Status") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "empStatus", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "Status"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Name").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Name") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "empName", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Name"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Address1").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Address1") == null) {
//            doActions(strApplicantType, "name", "cousersEmpinfo", "empAddressLine1", "", "EnterData", EMPLOYMENTDATA.get("Employer Address Line 1"));
            $("//input[@name='cousersEmpinfo[" + i + "].empAddressLine1']").sendKeys(EMPLOYMENTDATA.get(strApplicant + "Address1"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "State").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "State") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "empState", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "State"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "City").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "City") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "empCity", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "City"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Zipcode").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Zipcode") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "empZipcode", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Zipcode"));
        }
        LOGGER.info(strApplicant + "Job_Title");
        if (!EMPLOYMENTDATA.get(strApplicant + "Job_Title").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Job_Title") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "jobTitle", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Job_Title"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Occupation").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Occupation") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "occupation", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "Occupation"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Industry").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Industry") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "industry", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "Industry"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Years").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Years") == null) {
            doActions(strApplicantType, "name", "cousersEmpinfo", "empYears", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Years"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Months").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Months") == null) {
            doActions(strApplicantType, "name", "cousersEmpinfo", "empMonths", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Months"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Monthly_Income").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Monthly_Income") == null) {
            doActions(strApplicantType, "name", "cousersEmpinfo", "monthlyIncome", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Monthly_Income"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Work_Phone").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Work_Phone") == null) {
            doActions(strApplicantType, "id", "cousersEmpinfo", "mobile", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Work_Phone"));
        }
        LOGGER.info("Entered " + strApplicantType + " data into Employment page");
        btnContinue.click();
        LOGGER.info("Clicked on continue button");
        commonMethods.waitforSometimeInSeconds(30);
    }

    //*** Collateral Information
    public void clickOnValueLookup() {
        btnValueLookUp.click();
        LOGGER.info("Clicked on Lookup button");
    }

    public void clickOnValueGuideLookup() {
        btnValueGuideLookup.click();
        LOGGER.info("Clicked on value guide Lookup button");
    }

    public void clickOnSaveVehicleValue() {
        btnSaveValue.click();
        LOGGER.info("Clicked on value guide Lookup button");
    }

    public void validate_Collateral_InformationPage() {
        commonMethods.waitforSometimeInSeconds(20);
        commonMethods.validateTextMessage(LBL_COLLATERAL_INFOMRATION, lblCollateralInfomarionHeader.getText().trim());
        lblCollateralInfomarionHeader.isDisplayed();
        commonMethods.validateTextMessage(LBL_COLLATERAL_INFOMRATION, lblCollateralInfomarionSub.getText().trim());
        lblCollateralInfomarionSub.isDisplayed();
        commonMethods.validateTextMessage(LBL_VEHICLE_VALUES, lblVehicleValues.getText().trim());
        lblVehicleValues.isDisplayed();
        LOGGER.info("Validated Collateral information");
    }

    //*****   Financing Terms
    public void validateFinancingTermsPage() {
        commonMethods.waitforSometimeInSeconds(5);
        commonMethods.validateTextMessage(LBL_FINANCING_TERMS, lblFinancingTerms.getText().trim());
        lblFinancingTerms.isDisplayed();
        lblPaymentCalculatorUtility.isDisplayed();
        LOGGER.info("Background colour : " + lblFinancingTermsBar.getCssValue("background-color"));
        LOGGER.info("Validated Financing terms page");
    }

    public void clickOnPaymentCalculator() {
        btnPaymentCalculator.click();
        LOGGER.info("Clicked on Payment Calculator");
    }

    public void validateFinancingTerms() {
        commonMethods.validateTextMessage(LBL_ESTIMATED_MONTHLY_PAYMENT, lblEstimatedMonthlyPayment.getText().trim());
        lblEstimatedMonthlyPayment.isDisplayed();
        commonMethods.validateTextMessage(LBL_PAYMENT_SCHEDULE, lblPaymentSchedule.getText().trim());
        lblPaymentSchedule.isDisplayed();
        commonMethods.validateTextMessage(LBL_PAYMENT_CALCULATOR_DETAILS, lblPaymentCalculatorDetails.getText().trim());
        lblPaymentCalculatorDetails.isDisplayed();
        commonMethods.validateTextMessage(LBL_ITEMIZED_AMOUNT_FINANED, lblItemizationofAmountFinanced.getText());
        lblItemizationofAmountFinanced.isDisplayed();
        commonMethods.validateTextMessage(LBL_INSURANCE, lblInsurance.getText());
        lblInsurance.isDisplayed();
        commonMethods.validateTextMessage(LBL_FEES, lblFees.getText().trim());
        lblFees.isDisplayed();
        commonMethods.validateTextMessage(LBL_DEFERRED_PAYMENT, lblDeferredPayment.getText().trim());
        lblDeferredPayment.isDisplayed();
        LOGGER.info("Validated Financing Terms fields post Payment calculation");
    }

    //*** Review & Submit

    public void validateReviewSubmitPage(String strApplicant, String strCoApplicant, String strCoSigner1, String strCoSigner2) {
        lblReviewSubmit.isDisplayed();
        if (strApplicant.equalsIgnoreCase("Applicant")) {
            commonMethods.validateTextMessage(LBL_DI_APPLICANT, $("//*[@id='printForm']/div[1]/div//h3").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_ADDRESS, $("//*[@id='printForm']/div[1]/div[2]/div/div/h6[1]").getText().trim());
            commonMethods.validateTextMessage(LBL_MAILING_ADDRESS, $("//*[@id='printForm']/div[1]/div[2]/div/div/h6[2]").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_STATUS, $("//*[@id='printForm']/div[1]/div[2]/div/div/h6[3]").getText().trim());
            $("//*[@id='printForm']/div[1]/div//button[1]").click();
        }
        if (strCoApplicant.equalsIgnoreCase("Co-applicant")) {
            commonMethods.validateTextMessage(LBL_DI_CO_APPLICANT, $("//*[@id='printForm']/div[2]/div//h3").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_ADDRESS, $("//*[@id='printForm']/div[2]/div[2]/div/div/h6[1]").getText().trim());
            commonMethods.validateTextMessage(LBL_MAILING_ADDRESS, $("//*[@id='printForm']/div[2]/div[2]/div/div/h6[2]").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_STATUS, $("//*[@id='printForm']/div[2]/div[2]/div/div/h6[3]").getText().trim());
            $("//*[@id='printForm']/div[2]/div//button[1]").click();
            commonMethods.validateTextMessage(LBL_EMP_CO_APPLICANT, $("//*[@id='printForm']/div[6]/div//h3").getText().trim());
        }
        if (strCoSigner1.equalsIgnoreCase("Co-signer 1")) {
            commonMethods.validateTextMessage(LBL_DI_CO_SIGNER1, $("//*[@id='printForm']/div[3]/div//h3").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_ADDRESS, $("//*[@id='printForm']/div[3]/div[2]/div/div/h6[1]").getText().trim());
            commonMethods.validateTextMessage(LBL_MAILING_ADDRESS, $("//*[@id='printForm']/div[3]/div[2]/div/div/h6[2]").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_STATUS, $("//*[@id='printForm']/div[3]/div[2]/div/div/h6[3]").getText().trim());
            $("//*[@id='printForm']/div[3]/div//button[1]").click();
            commonMethods.validateTextMessage(LBL_EMP_CO_SIGNER1, $("//*[@id='printForm']/div[7]/div//h3").getText().trim());
        }
        if (strCoSigner2.equalsIgnoreCase("Co-signer 2")) {
            commonMethods.validateTextMessage(LBL_DI_CO_SIGNER2, $("//*[@id='printForm']/div[4]/div//h3").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_ADDRESS, $("//*[@id='printForm']/div[4]/div[2]/div/div/h6[1]").getText().trim());
            commonMethods.validateTextMessage(LBL_MAILING_ADDRESS, $("//*[@id='printForm']/div[4]/div[2]/div/div/h6[2]").getText().trim());
            commonMethods.validateTextMessage(LBL_RESIDENTIAL_STATUS, $("//*[@id='printForm']/div[4]/div[2]/div/div/h6[3]").getText().trim());
            $("//*[@id='printForm']/div[3]/div//button[1]").click();
            commonMethods.validateTextMessage(LBL_EMP_CO_SIGNER2, $("//*[@id='printForm']/div[8]/div//h3").getText().trim());
        }
        commonMethods.validateTextMessage(LBL_EMP_PRIMARY_APPLICANT, $("//h3[@id='Employment information : Applicant']").getText().trim());
        commonMethods.validateTextMessage(LBL_COLLATERAL_INFOMRATION, $("//h3[@id='Collateral information']").getText().trim());
        commonMethods.validateTextMessage(LBL_FINANCIAL_TERMS, $("//h3[@id='Financial terms']").getText().trim());
        LOGGER.info("Validated field visibility in Review and Submit page");
    }

    public void clickOnConsentCheckbox() {
        inputConsentCheckbox.click();
        LOGGER.info("Clicked on consent check box in Review and Submit page");
        btnContinue.click();
        LOGGER.info("Clicked on Submit button");
    }

    public void validateApplicationReviewPage() {
        commonMethods.waitforSometimeInSeconds(20);
        commonMethods.validateTextMessage(LBL_APPLICATION_SUBMITTED, lblApplicationSubmitted.getText().trim());
        commonMethods.waitforSometimeInSeconds(20);
        commonMethods.validateTextMessage(LBL_APPLICATION_UNDER_REVIEW, lblApplicationUnderReview.getText().trim());
        APPLICATIONID = lnkApplicationID.getText();
        LOGGER.info("Application ID : " + APPLICATIONID);
        LOGGER.info("Validated Application under review page");
    }

    public void clickOnViewApplication() {
        btnViewApplication.click();
        LOGGER.info("Clicked on View application button");
    }
    //*******Common

    /**
     * @param : strCopyText - Text that needs to copy into clipboard
     * @Description : This function used to copy text into clipboard
     * @Author :  Ravindra
     */
    private void copyToClip(String strCopyText) {
        StringSelection stringSelection = new StringSelection(strCopyText);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }



}
