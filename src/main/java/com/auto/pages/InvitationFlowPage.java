package com.auto.pages;

public class InvitationFlowPage extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvitationFlowPage.class);
    CommonMethods commonMethods = new CommonMethods();
    String elementGetText;

    @FindBy(xpath = "//*[contains(@class,'invitationHeading')]//h3")
    WebElementFacade lblInvitationFlowHeading;
    @FindBy(xpath = "//h3[text()='Information on request']")
    WebElementFacade lblInviationInformationOnRequest;
    @FindBy(xpath = "//h3[text()='Basic information']")
    WebElementFacade lblBasicInformation;
    @FindBy(xpath = "//h3[@id='Basic information']")
    WebElementFacade lblBasicInformationSubHeading;
    @FindBy(xpath = "//h3[@id='Demographic information']")
    WebElementFacade lblDemographicinformation;
    @FindBy(xpath = "//h3[@id='Residential address']")
    WebElementFacade lblResidentailAddress;
    @FindBy(xpath = "//h3[@id='Resident status']")
    WebElementFacade lblResidentStatus;
    @FindBy(xpath = "//input[@id='firstName']")
    WebElementFacade inputFirstName;
    @FindBy(xpath = "//input[@id='middleName']")
    WebElementFacade inputMiddleName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElementFacade inputlastName;
    @FindBy(xpath = "//input[@id='secondLastName']")
    WebElementFacade inputSecondLastName;
    @FindBy(xpath = "//input[@name='ssn']")
    WebElementFacade inputSSN;
    @FindBy(xpath = "//input[@id='dob']")
    WebElementFacade inputDOB;
    @FindBy(xpath = "//input[@id='mobile']")
    WebElementFacade inputMobile;
    @FindBy(xpath = "//input[@id='mobile2']")
    WebElementFacade inputAlternativeMobile;
    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade inputeMail;
    @FindBy(xpath = "//input[@data-testid='maritalStatus']")
    WebElementFacade inputMaritalStatus;
    @FindBy(xpath = "//input[@data-testid='toggle-btn']")
    WebElementFacade btnToggle;
    @FindBy(xpath = "//input[@id='resAddress1']")
    WebElementFacade inputAddress1;
    @FindBy(xpath = "//input[@id='resAddress2']")
    WebElementFacade inputAddress2;
    @FindBy(xpath = "//*[@id='resCity']")
    WebElementFacade drpCity;
    @FindBy(xpath = "//input[@id='resZipcode']")
    WebElementFacade inputZipcode;
    @FindBy(xpath = "//input[@id='HomeOwner Free and Clear']")
    WebElementFacade inputHomeOwnerFreeClear;
    @FindBy(xpath = "//input[@id='Homeowner']")
    WebElementFacade inputHomeOwner;
    @FindBy(xpath = "//input[@id='Parents']")
    WebElementFacade inputParents;
    @FindBy(xpath = "//input[@id='Rent']")
    WebElementFacade inputRent;
    @FindBy(xpath = "//input[@id='monthlyPayment']")
    WebElementFacade inputMonthlyPayment;
    @FindBy(xpath = "//input[@id='residentYears']")
    WebElementFacade inputResidentYears;
    @FindBy(xpath = "//input[@id='residentMonths']")
    WebElementFacade inputResidentMonths;
    @FindBy(xpath = "//button[@data-testid='continue-btn']")
    WebElementFacade btnContinue;

    //**** Employment Information Page
    @FindBy(xpath = "//h3[text()='Employment information']")
    WebElementFacade lblEmploymentInformation;
    @FindBy(xpath = "//button[@data-testid='add-income']")
    WebElementFacade btnAddIncome;
    @FindBy(xpath = "//img[@alt='Remove Button']/..")
    WebElementFacade btnAddIncomeRemove;

    //*** Consent Page

    @FindBy(xpath = "//h3[text()='Your consent']")
    WebElementFacade lblYourConsent;
    @FindBy(xpath = "//input[@data-testid='consent']/..")
    WebElementFacade inputConsent;
    @FindBy(xpath = "//a[@id='E-Sign Disclosure']")
    WebElementFacade lnkESignDisclosure;
    @FindBy(xpath = "//a[@id='Privacy Policy']")
    WebElementFacade lnkPrivacyPolicy;
    @FindBy(xpath = "//p[text()='Download all']")
    WebElementFacade btnDownloadAll;
    @FindBy(xpath = "//button[text()='Submit']")
    WebElementFacade btnSubmit;
    @FindBy(xpath = "//img[contains(@class,'thankScreenIcon')]/../h3[1]")
    WebElementFacade lblThankYou;
    @FindBy(xpath = "//img[contains(@class,'thankScreenIcon')]/../h3[2]")
    WebElementFacade lblInvitationCompleted;
    @FindBy(xpath = "//button[@data-testid='visit_bank_url']")
    WebElementFacade btnVisitOriental;
    @FindBy(xpath = "//img[contains(@class,'expiryImage')]/../div/div/p[1]")
    WebElementFacade lblInvitationSubmitted;
    @FindBy(xpath = "//img[contains(@class,'expiryImage')]/../div/div/p[2]")
    WebElementFacade lblInvitationAlreadySubmitted;


    public void doActionOnWebelements(String strWebElement, String strLocator, String strFiledName, String strElementType, String strOperation, String strValue) {
        String str = null;

        if (strWebElement.equalsIgnoreCase("input"))
            str = "//input[@" + strLocator + "='" + strFiledName + "']";
        else
            str = "//*[@" + strLocator + "='" + strFiledName + "']";


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
            GETATTRIBUTEVALUE = $(str).getAttribute(strValue);
        } else if (strOperation.equalsIgnoreCase("Click")) {
            $(str).click();
        } else if (strOperation.equalsIgnoreCase("SelectDropDown")) {
            LOGGER.info(str);
            $(str).click();
            $("//li[contains(@data-value,'" + strValue + "')]").waitUntilVisible();
            $("//li[contains(@data-value,'" + strValue + "')]").click();
        } else if (strOperation.equalsIgnoreCase("GetText") && strElementType.equalsIgnoreCase("Input")) {
            str = str + "/../../../..//p";
            LOGGER.info("xPath : " + str);
            elementGetText = $(str).getText();
        } else if (strOperation.equalsIgnoreCase("GetText") && strElementType.equalsIgnoreCase("DropDown")) {
            str = str + "/../../..//p";
            LOGGER.info("xPath : " + str);
            elementGetText = $(str).getText();
        } else if (strOperation.equalsIgnoreCase("GetText") && strElementType.equalsIgnoreCase("Input1")) {
            str = str + "/../../../../../p";
            LOGGER.info("xPath : " + str);
            elementGetText = $(str).getText();
        } else if (strOperation.equalsIgnoreCase("GetText") && strElementType.equalsIgnoreCase("Input2")) {
            str = str + "/../../../p";
            LOGGER.info("xPath : " + str);
            elementGetText = $(str).getText();
        }
    }


    public void validateInviteFlowPages(String strApplicantType, String strKey) {
        commonMethods.validateTextMessage(LBL_AUTO_LOAN_INVITATION_HEADING, lblInvitationFlowHeading.getText().trim());
        commonMethods.validateTextMessage(LBL_BASIC_INFORMATION, lblBasicInformation.getText().trim());
        commonMethods.validateTextMessage(LBL_DEMOGRAPHIC_INFORMATION, lblDemographicinformation.getText().trim());
        commonMethods.validateTextMessage(LBL_RESIDENTIAL_ADDRESS, lblResidentailAddress.getText().trim());
        commonMethods.validateTextMessage(LBL_RESIDENT_STATUS.trim(), lblResidentStatus.getText().trim());
        validateInvitationBasicInformation(strApplicantType, strKey);
        commonMethods.waitforSometimeInSeconds(30);
    }

    public void validateInvitationBasicInformation(String strApplicantType, String strKey) {
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
            doActionOnWebelements("input", "id", "firstName", "input", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, CREATEAPPLICATIONDATA.get("Primary_Applicant_FN"));
            doActionOnWebelements("input", "id", "lastName", "input", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, CREATEAPPLICATIONDATA.get("Primary_Applicant_LN"));
            LOGGER.info("Validate pre populated Firstname and Lastname for " + strApplicantType);
        } else {
            if (isNullOrEmptyMap(COAPPLICANTDATA)) {
                COAPPLICANTDATA = excelDriver.getRowData(strKey, "UserData", "CoApplicant");
                LOGGER.info("Co-Applicant/Co-Signer Application data is loaded into map.");
            }
            doActionOnWebelements("input", "id", "firstName", "input", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, COAPPLICANTDATA.get(strFN));
            commonMethods.waitforSometimeInSeconds(1);
            doActionOnWebelements("input", "id", "lastName", "input", "GetAttribute", "value");
            Assert.assertEquals(GETATTRIBUTEVALUE, COAPPLICANTDATA.get(strLN));
            LOGGER.info("Validate pre populated Firstname and Lastname for " + strApplicantType);
        }

        doActionOnWebelements("input", "id", "firstName", "input", "ClearData", "value");
        doActionOnWebelements("input", "id", "lastName", "input", "ClearData", "value");
        $("//button[@data-testid='continue-btn']").click();
        doActionOnWebelements("input", "id", "firstName", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "lastName", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "firstName", "input", "ClearData", "value");
        commonMethods.waitforSometimeInSeconds(2);
        doActionOnWebelements("input", "id", "lastName", "input", "EnterData", "a");
        doActionOnWebelements("input", "id", "lastName", "input", "GetText", "a");
        commonMethods.validateTextMessage(LASTNAME_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "name", "ssn", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "name", "ssn", "input", "EnterData", "12334");
        doActionOnWebelements("input", "name", "ssn", "input2", "GetText", "value");
        commonMethods.validateTextMessage(SSN_LENGTH_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "dob", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "dob", "input", "EnterData", "01/01");
        doActionOnWebelements("input", "id", "dob", "input", "GetText", "value");
        commonMethods.validateTextMessage(DATE_FORMAT_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "dob", "input", "EnterData", "01/01/1800");
        doActionOnWebelements("input", "id", "dob", "input", "GetText", "01/01/1800");
        commonMethods.validateTextMessage(MORETHAN_150_YEARS_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "dob", "input", "EnterData", "01/01/2010");
        doActionOnWebelements("input", "id", "dob", "input", "GetText", "01/01/2010");
        commonMethods.validateTextMessage(MINOR_DOB_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "mobile", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "mobile", "input", "EnterData", "123");
        doActionOnWebelements("input", "id", "mobile", "input", "GetText", "123");
        commonMethods.validateTextMessage(MOBILE_NUMBER_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "email", "input", "ClearData", "value");
        doActionOnWebelements("input", "id", "email", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "email", "input", "EnterData", "abc@.com");
        doActionOnWebelements("input", "id", "email", "input", "GetText", "value");
        commonMethods.validateTextMessage(INVALID_EMAIL_FORMAT_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("", "id", "maritalStatus", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "resAddress1", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("", "id", "resCity", "DropDown", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "resZipcode", "input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "resZipcode", "input", "EnterData", "123");
        doActionOnWebelements("input", "id", "resZipcode", "input", "GetText", "value");
        commonMethods.validateTextMessage(ZIPCODE_LENTH_ERROR_MESSAGE1, elementGetText);
//        doActionOnWebelements("input", "id", "resUtilityBill", "Drop", "SelectDropDown", "LUMA");
//        commonMethods.validateTextMessage(PLEASE_UPLOAD_ADDRESS_PROOF, $("//p[contains(text(),'Please upload the address proof')]").getText());
//        doActionOnWebelements("input", "id", "resUtilityBill", "Drop", "SelectDropDown", "");
//        doActionOnWebelements("input", "id", "residentStatus", "Drop", "SelectDropDown", "");

        doActionOnWebelements("input", "id", "residentYears", "input1", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "residentYears", "input", "EnterData", "99");
//        doActionOnWebelements("input", "id", "residentYears", "input1", "GetText", "value");
        commonMethods.validateTextMessage(GREATERTHAN_AGE_ERROR_MESSAGE, $("//label[@for='time_at_residence']/../label[2]/span").getText());
        doActionOnWebelements("input", "id", "residentYears", "input1", "ClearData", "value");
        doActionOnWebelements("input", "id", "residentMonths", "input1", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "residentMonths", "input1", "EnterData", "12");
        doActionOnWebelements("input", "id", "residentMonths", "input1", "GetText", "value");
        commonMethods.validateTextMessage(INVALID_MONTH_ERROR_MESSAGE, elementGetText);
        LOGGER.info("Validated invitation Information on request page");
    }

    public void enterInvitationBasicInformationData(String strApplicantType, String strKey) {
        LOGGER.info("Entering " + strApplicantType + " data into Information on Request page");
        if (isNullOrEmptyMap(CREATEAPPLICATIONDATA)) {
            ExcelDriver excelDriver = new ExcelDriver();
            CREATEAPPLICATIONDATA = excelDriver.getRowData(strKey, "UserData", "CreateApplication");
        }
        doActionOnWebelements("input", "id", "firstName", "input", "EnterData", CREATEAPPLICATIONDATA.get("Primary_Applicant_FN"));
        doActionOnWebelements("input", "id", "lastName", "input", "EnterData", CREATEAPPLICATIONDATA.get("Primary_Applicant_LN"));
        doActionOnWebelements("input", "id", "secondLastName", "input", "EnterData", CREATEAPPLICATIONDATA.get("Primary_Applicant_SLN"));
        if (!CREATEAPPLICATIONDATA.get("Social Security Number").isEmpty() || CREATEAPPLICATIONDATA.get("Social Security Number") == null) {
            doActionOnWebelements("input", "name", "ssn", "input", "EnterData", CREATEAPPLICATIONDATA.get("Social Security Number"));
        }

        if (!CREATEAPPLICATIONDATA.get("Date of Birth").isEmpty() || CREATEAPPLICATIONDATA.get("Date of Birth") == null) {
            doActionOnWebelements("input", "id", "dob", "input", "ClearData", "null");
            doActionOnWebelements("input", "id", "dob", "input", "EnterData", CREATEAPPLICATIONDATA.get("Date of Birth"));
        }

        if (!CREATEAPPLICATIONDATA.get("Email").isEmpty() || CREATEAPPLICATIONDATA.get("Email") == null) {
            doActionOnWebelements("input", "id", "email", "input", "EnterData", CREATEAPPLICATIONDATA.get("Email"));
        }
        if (!CREATEAPPLICATIONDATA.get("Mobile").isEmpty() || CREATEAPPLICATIONDATA.get("Mobile") == null) {
            doActionOnWebelements("input", "id", "mobile", "input", "EnterData", CREATEAPPLICATIONDATA.get("Mobile"));
        }
        if (!CREATEAPPLICATIONDATA.get("Marital Status").isEmpty() || CREATEAPPLICATIONDATA.get("Marital Status") == null) {
            doActionOnWebelements("", "id", "maritalStatus", "input", "SelectDropDown", CREATEAPPLICATIONDATA.get("Marital Status"));
        }
        if (!CREATEAPPLICATIONDATA.get("Address line 1").isEmpty() || CREATEAPPLICATIONDATA.get("Address line 1") == null) {
            doActionOnWebelements("input", "id", "resAddress1", "input", "EnterData", CREATEAPPLICATIONDATA.get("Address line 1"));
        }
        if (!CREATEAPPLICATIONDATA.get("State").isEmpty() || CREATEAPPLICATIONDATA.get("State") == null) {
            doActionOnWebelements("", "id", "resState", "input", "SelectDropDown", CREATEAPPLICATIONDATA.get("State"));
        }

        if (!CREATEAPPLICATIONDATA.get("City").isEmpty() || CREATEAPPLICATIONDATA.get("City") == null) {
            doActionOnWebelements("", "id", "resCity", "input", "SelectDropDown", CREATEAPPLICATIONDATA.get("City"));
        }
        if (!CREATEAPPLICATIONDATA.get("Zip Code").isEmpty() || CREATEAPPLICATIONDATA.get("Zip Code") == null) {
            doActionOnWebelements("input", "id", "resZipcode", "input", "EnterData", CREATEAPPLICATIONDATA.get("Zip Code"));
        }
        if (!CREATEAPPLICATIONDATA.get("Resident Status").isEmpty() || CREATEAPPLICATIONDATA.get("Resident Status") == null) {
            doActionOnWebelements("input", "id", CREATEAPPLICATIONDATA.get("Resident Status"), "input", "Click", "");
        }
        if (!CREATEAPPLICATIONDATA.get("Years").isEmpty() || CREATEAPPLICATIONDATA.get("Years") == null) {
            doActionOnWebelements("input", "id", "residentYears", "input", "EnterData", CREATEAPPLICATIONDATA.get("Years"));
        }
        if (!CREATEAPPLICATIONDATA.get("Months").isEmpty() || CREATEAPPLICATIONDATA.get("Months") == null) {
            doActionOnWebelements("input", "id", "residentMonths", "input", "EnterData", CREATEAPPLICATIONDATA.get("Months"));
        }
        LOGGER.info("Entering " + strApplicantType + " data into Information on Request page");
        btnContinue.click();
        LOGGER.info("Clicked on continue button");
    }

    public void validateInvitationEmploymentInformation() {
        commonMethods.validateTextMessage(LBL_AUTO_LOAN_INVITATION_HEADING, lblInvitationFlowHeading.getText().trim());
        commonMethods.validateTextMessage(LBL_EMPLOYMENT_INFORMATION, lblEmploymentInformation.getText().trim());
        validateEmploymentInformation();
//        commonMethods.waitforSometimeInSeconds(30);
    }

    public void validateEmploymentInformation() {
        $("//button[text()='Continue']").click();
        doActionOnWebelements("", "id", "empStatus", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "empName", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);

        doActionOnWebelements("input", "id", "jobTitle", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "name", "occupation", "DropDown", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "name", "empYears", "Input1", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "empMonths", "input", "ClearData", "13");
        doActionOnWebelements("input", "name", "empMonths", "Input1", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "empMonths", "input", "EnterData", "13");
        doActionOnWebelements("input", "id", "empMonths", "Input1", "GetText", "value");
        commonMethods.validateTextMessage(INVALID_MONTH_ERROR_MESSAGE, elementGetText);

        doActionOnWebelements("input", "name", "monthlyIncome", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "name", "mobile", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);

        btnAddIncome.click();
        LOGGER.info("Expanded Additional Income section");
        $("//button[text()='Continue']").click();
        doActionOnWebelements("input", "id", "addEmpName", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "addJobTitle", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "name", "addOccupation", "DropDown", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "mobile2", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "mobile2", "input", "EnterData", "1767");
        doActionOnWebelements("input", "id", "mobile2", "Input", "GetText", "value");
        commonMethods.validateTextMessage(WORK_PHONE_NUMBER_ERROR_MESSAGE, elementGetText);
        doActionOnWebelements("input", "id", "addMonthlyIncome", "Input", "GetText", "value");
        commonMethods.validateTextMessage(MANDATORYFIELD_ERROR_MESSAGE, elementGetText);
        btnAddIncomeRemove.click();
        LOGGER.info("Closed Additional Income section");
        commonMethods.waitforSometimeInSeconds(20);

    }

    public void enterEmploymentInformationData(String strApplicantType, String strKey) throws Exception {
        LOGGER.info("Entering " + strApplicantType + " data into Employment page for Invitation flow");
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
            doActionOnWebelements("", "id", "empStatus", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "Status"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Name").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Name") == null) {
            doActionOnWebelements("input", "id", "empName", "input", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Name"));

        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Address1").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Address1") == null) {
            LOGGER.info(EMPLOYMENTDATA.get("Employer Address Line 1"));
            doActionOnWebelements("input", "id", "empAddressLine1", "input", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Address1"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "State").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "State") == null) {
            doActionOnWebelements("", "id", "empState", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "State"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "City").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "City") == null) {
            doActionOnWebelements("", "id", "empCity", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "City"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Zipcode").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Zipcode") == null) {
            doActionOnWebelements("input", "id", "empZipcode", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Zipcode"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Job_Title").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Job_Title") == null) {
            doActionOnWebelements("input", "id", "jobTitle", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Job_Title"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Occupation").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Occupation") == null) {
            doActionOnWebelements("", "id", "occupation", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "Occupation"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Industry").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Industry") == null) {
            doActionOnWebelements("", "id", "industry", "", "SelectDropDown", EMPLOYMENTDATA.get(strApplicant + "Industry"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Years").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Years") == null) {
            doActionOnWebelements("input", "id", "empYears", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Years"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Months").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Months") == null) {
            doActionOnWebelements("input", "id", "empMonths", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Months"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Monthly_Income").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Monthly_Income") == null) {
            doActionOnWebelements("input", "id", "monthlyIncome", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Monthly_Income"));
        }
        if (!EMPLOYMENTDATA.get(strApplicant + "Work_Phone").isEmpty() || EMPLOYMENTDATA.get(strApplicant + "Work_Phone") == null) {
            doActionOnWebelements("input", "id", "mobile", "", "EnterData", EMPLOYMENTDATA.get(strApplicant + "Work_Phone"));
        }
        LOGGER.info("Entered " + strApplicantType + " data into Employment page");
        $("//button[text()='Continue']").click();
        LOGGER.info("Clicked on continue button");
        commonMethods.waitforSometimeInSeconds(10);
    }

    public void validateInvitationYourConcertPage() {
        LOGGER.info("Validating Your Concert page");
        commonMethods.validateTextMessage(LBL_YOUR_CONCERT, lblYourConsent.getText());
        Assert.assertTrue(lnkESignDisclosure.getAttribute("href").contains(LINK_ESIGN_DISCLOSURE));
        Assert.assertTrue(lnkPrivacyPolicy.getAttribute("href").contains(LINK_PRIVACY_POLICY));
        btnDownloadAll.isDisplayed();
        btnSubmit.isDisabled();
        LOGGER.info("Validated Your Concert page");
    }

    public void submitYourConcert() {
        inputConsent.click();
        btnSubmit.click();
        LOGGER.info("Clicked on Submit in concert page");
        commonMethods.waitforSometimeInSeconds(20);
        lblThankYou.isDisplayed();
        commonMethods.validateTextMessage(LBL_INVITATION_COMPLETED, lblInvitationCompleted.getText());
        btnVisitOriental.isDisplayed();
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1)).close();
        getDriver().switchTo().window(tabs.get(0));
        LOGGER.info("Validated Thank You message after submitted concert");
    }

    public void validateSubmittedInvitation() {
        commonMethods.validateTextMessage(LBL_INVITATION_SUBMITTED, lblInvitationSubmitted.getText());
        commonMethods.validateTextMessage(LBL_INVITATION_ALREDY_SUBMITTED, lblInvitationAlreadySubmitted.getText());
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1)).close();
        getDriver().switchTo().window(tabs.get(0));
        LOGGER.info("Validated Invitation already submitted mail");
    }

}
