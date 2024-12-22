package com.auto.pages;

public class LookUpPage extends PageObject{

    String strResponse;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    private static final Logger LOGGER = LoggerFactory.getLogger(LookUpPage.class);

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "//*[contains(@class,'DockedLeft')]//..//li[4]")
    WebElementFacade btnLookUp;
    @FindBy(xpath = "//h1[contains(text(),'Lookup')]")
    WebElementFacade lblLookupHeader;
    @FindBy(xpath = "//img[@src='/static/media/lookup-main.b7e429ab9885c0e075ce.png']")
    WebElementFacade imgLookup;
    @FindBy(xpath = "//button[contains(text(),'Look')]")
    WebElementFacade btnLetsLookUp;
    @FindBy(xpath = "//button[@data-testid='new-button']")
    WebElementFacade btnCollateralTypeNew;
    @FindBy(xpath = "//button[@data-testid='used-button']")
    WebElementFacade btnCollateralTypeUsed;
    @FindBy(xpath = "//button[@data-testid='Blackbook-button']")
    WebElementFacade btnBlackbook;
    @FindBy(xpath = "//button[@data-testid='Distributor data-button']")
    WebElementFacade btnDistributordata;
    @FindBy(xpath = "//button[@id='lookup-cancel-btn']")
    WebElementFacade btnCancel;
    @FindBy(xpath = "//button[@id='lookup-continue-btn']")
    WebElementFacade btnContinue;
    @FindBy(xpath = "//h5[text()='Distributor data - New']")
    WebElementFacade lblDistributorDataNew;
    @FindBy(xpath = "//h5[text()='Black book - New']")
    WebElementFacade lblBlckBookNew;
    @FindBy(xpath = "//h5[text()='Black book - Used']")
    WebElementFacade lblBlckBookUsed;
    @FindBy(xpath = "//h5[text()='Black book - New' or text()='Black book - Used']")
    WebElementFacade lblBlckBookNewUsed;
    @FindBy(xpath = "//button[@data-testid='vin-button']")
    WebElementFacade btnVIN;
    @FindBy(xpath = "//button[@data-testid='manual-button']")
    WebElementFacade btnManual;
    @FindBy(xpath = "//input[@id='vin']")
    WebElementFacade inputVIN;
    @FindBy(xpath = "//button[text()='Find Vehicle']")
    WebElementFacade btnFindVehicle;
    @FindBy(xpath = "//input[@id='vin']/../../../following-sibling::p")
    WebElementFacade lblVINErrorMessage;

    @FindBy(xpath = "//*[@id='year']")
    WebElementFacade drpYear;
    @FindBy(xpath = "//*[@id='make']")
    WebElementFacade drpBrand;
    @FindBy(xpath = "//*[@id='model']")
    WebElementFacade drpModel;
    @FindBy(xpath = "//*[@id='subModel']")
    WebElementFacade drpSubModel;
    @FindBy(xpath = "//*[@id='style']")
    WebElementFacade drpStyle;
    @FindBy(xpath = "//input[@name='mileage']")
    WebElementFacade inputMileage;
    @FindBy(xpath = "//input[@id='state']")
    WebElementFacade inputState;
    @FindBy(xpath = "//button[text()='Get Vehicle Value']")
    WebElementFacade btnGetVehicleValue;
    @FindBy(xpath = "//button[text()='Residuals']")
    WebElementFacade btnResiduals;
    @FindBy(xpath = "//button[text()='Standard Options']")
    WebElementFacade btnStandardOptions;
    @FindBy(xpath = "//button[text()='Back']")
    WebElementFacade btnBack;
    @FindBy(xpath = "//button[text()='View Standard Equipment']")
    WebElementFacade btnViewStandardEquipment;
    @FindBy(xpath = "//li[@role='option']")
    List<WebElementFacade> dropDownValues;
    @FindBy(xpath = "//li[@role='option' and contains(@data-value,'')][1]")
    WebElementFacade drpSelect;


    //*** Vehicle Values

    @FindBy(xpath = "//h6[text()='Vehicle Values']")
    WebElementFacade lblVehicleValues;
    @FindBy(xpath = "//h6[text()='General Info']")
    WebElementFacade lblGeneralInfo;
    @FindBy(xpath = "//h6[text()='Base Vehicle value']/..//h6[1]")
    WebElementFacade lblBaseVehicleValue;
    @FindBy(xpath = "//h6[text()='Base Vehicle value']/..//h6[2]")
    WebElementFacade lblDealerCostValue;
    @FindBy(xpath = "//h6[text()='Base Vehicle value']/..//h6[3]")
    WebElementFacade lblMSRPValue;
    @FindBy(xpath = "//h6[text()='Collateral Type']//following-sibling::h6")
    WebElementFacade lblCollateralTypeValue;
    @FindBy(xpath = "//h6[text()='Value Guide Selection']//following-sibling::h6")
    WebElementFacade lblValueGuideSelectionValue;
    @FindBy(xpath = "//h6[text()='Year']//following-sibling::h6")
    WebElementFacade lblGeneralInfoYearValue;
    @FindBy(xpath = "//h6[text()='Brand']//following-sibling::h6")
    WebElementFacade lblGeneralInfoBrandValue;
    @FindBy(xpath = "//h6[text()='Model']//following-sibling::h6")
    WebElementFacade lblGeneralInfoModelValue;
    @FindBy(xpath = "//h6[text()='Sub Model']//following-sibling::h6")
    WebElementFacade lblGeneralInfoSubModelValue;
    @FindBy(xpath = "//h6[text()='Style']//following-sibling::h6")
    WebElementFacade lblGeneralInfoStyleValue;
    @FindBy(xpath = "//h6[text()='Mileage']//following-sibling::h6")
    WebElementFacade lblGeneralInfoMileageValue;

    @FindBy(xpath = "//button[text()='Lookup Again']")
    WebElementFacade btnLookUpAgain;


    //**** Optional Equipment

    @FindBy(xpath = "//h6[text()='Optional Equipment']")
    WebElementFacade lblOptionalEquipment;
    @FindBy(xpath = "//h6[contains(text(),'Select options for')]")
    WebElementFacade lblSelectOptionaFor;

    public void clickOnLookupButton() throws Exception {
        try {
            btnLookUp.waitUntilVisible();
            btnLookUp.click();
            Thread.sleep(4000);
            LOGGER.info("Clicked on Lookup");
        } catch (Exception e) {
            throw new Exception("Lookup is disabled or unable click.");
        }
    }

    public void navigateToLookupPage() {
        lblLookupHeader.waitUntilVisible();
        imgLookup.waitUntilVisible();
    }

    public void clickOnLetsLookup() throws Exception {
        try {
            btnLetsLookUp.click();
        } catch (Exception e) {
            throw new Exception("Unable to click on Lookup button");
        }
    }

    public void selectLookUp(String strDataType, String strSheet) throws Exception {
        ExcelDriver excelDriver = new ExcelDriver();
        LOOKUPDATA = excelDriver.getRowData(strDataType, "UserData", strSheet);
        btnCollateralTypeUsed.click();
        Assert.assertTrue("Distributor data button is not disabled", Boolean.parseBoolean(btnDistributordata.getAttribute("disabled")));
        LOGGER.info("Distributor data disabled : " + btnDistributordata.getAttribute("disabled"));
        if ((!LOOKUPDATA.get("CollateralType").isEmpty() || LOOKUPDATA.get("CollateralType") == null) && LOOKUPDATA.get("CollateralType").equalsIgnoreCase("New")) {
            btnCollateralTypeNew.click();
            LOGGER.info("Clicked on collateral type as New");
        } else if ((!LOOKUPDATA.get("CollateralType").isEmpty() || LOOKUPDATA.get("CollateralType") == null) && LOOKUPDATA.get("CollateralType").equalsIgnoreCase("Used")) {
            btnCollateralTypeUsed.click();
            flagUsed = true;
            flagBlackBook = true;
            LOGGER.info("Clicked on collateral type as Used");
        }
        LOGGER.info("Entered CollateralType and ValueGuideSource details");
        btnContinue.click();
    }

    public void selectLookUp(String strDataType) throws Exception {
        ExcelDriver excelDriver = new ExcelDriver();
        LOOKUPDATA = excelDriver.getRowData(strDataType, "UserData", "Lookup");
//        btnCollateralTypeUsed.click();
//        Assert.assertTrue("Distributor data button is not disabled", Boolean.parseBoolean(btnDistributordata.getAttribute("disabled")));
//        LOGGER.info("Distributor data disabled : " + btnDistributordata.getAttribute("disabled"));
        if ((!LOOKUPDATA.get("CollateralType").isEmpty() || LOOKUPDATA.get("CollateralType") == null) && LOOKUPDATA.get("CollateralType").equalsIgnoreCase("New")) {
            btnCollateralTypeNew.click();
            LOGGER.info("Clicked on collateral type as New");
        } else if ((!LOOKUPDATA.get("CollateralType").isEmpty() || LOOKUPDATA.get("CollateralType") == null) && LOOKUPDATA.get("CollateralType").equalsIgnoreCase("Used")) {
            btnCollateralTypeUsed.click();
            flagUsed = true;
            flagBlackBook = true;
            LOGGER.info("Clicked on collateral type as Used");
        }
        LOGGER.info("Entered CollateralType and ValueGuideSource details");
        btnContinue.click();
    }

    public void selectDistributorData() throws Exception {
        commonMethods.waitforSometimeInSeconds(10);
        if (!flagVIN) {
            if (flagBlackBook)
                lblBlckBookNewUsed.waitUntilVisible();
            else
                lblDistributorDataNew.waitUntilVisible();
            if (!LOOKUPDATA.get("Year").isEmpty() || LOOKUPDATA.get("Year") == null) {
                selectDropdown(drpYear, LOOKUPDATA.get("Year"));
            }
            if (!LOOKUPDATA.get("Brand").isEmpty() || LOOKUPDATA.get("Brand") == null) {
                selectDropdown(drpBrand, LOOKUPDATA.get("Brand"));
            }
            if (!LOOKUPDATA.get("Model").isEmpty() || LOOKUPDATA.get("Model") == null) {
                selectDropdown(drpModel, LOOKUPDATA.get("Model"));
            }
            if (!LOOKUPDATA.get("SubModel").isEmpty() || LOOKUPDATA.get("SubModel") == null) {
                selectDropdown(drpSubModel, LOOKUPDATA.get("SubModel"));
            }
            if (!LOOKUPDATA.get("Style").isEmpty() || LOOKUPDATA.get("Style") == null) {
                selectDropdown(drpStyle, LOOKUPDATA.get("Style"));
            }
            if (!LOOKUPDATA.get("Mileage").isEmpty() || LOOKUPDATA.get("Mileage") == null) {
                inputMileage.clear();
                inputMileage.sendKeys(LOOKUPDATA.get("Mileage"));
            }
            LOGGER.info("Entered Distributor data");
            btnContinue.click();
        }
    }

    public void enterOptionEquipment() {
        if (flagBlackBook) {
            lblOptionalEquipment.waitUntilVisible();
            LOGGER.info(lblSelectOptionaFor.getText());
            validateGeneralInfo();
            if (!LOOKUPDATA.get("Option Packages").isEmpty() || LOOKUPDATA.get("Option Packages") == null) {
                $("//h6[contains(text(),'" + LOOKUPDATA.get("Option Packages") + "')]/..//input").click();
            }
            if (!LOOKUPDATA.get("Exterior Colors").isEmpty() || LOOKUPDATA.get("Exterior Colors") == null) {
                $("//h6[contains(text(),'" + LOOKUPDATA.get("Exterior Colors") + "')]/..//input").click();
            }
            if (!LOOKUPDATA.get("Interior Colors").isEmpty() || LOOKUPDATA.get("Interior Colors") == null) {
                $("//h6[contains(text(),'" + LOOKUPDATA.get("Interior Colors") + "')]/..//input").click();
            }
            commonMethods.waitforSometimeInSeconds(5);
            btnGetVehicleValue.click();

        }
    }

    public void enterUsedLookUpType() {
        LOGGER.info("Flag Used : "+ flagUsed);
        if (flagUsed) {
            if ((!LOOKUPDATA.get("Used Lookup Type").isEmpty() || LOOKUPDATA.get("Used Lookup Type") == null) && LOOKUPDATA.get("Used Lookup Type").equalsIgnoreCase("Manual")) {
                btnManual.click();
                LOGGER.info("Black Book - Used Lookup Type selected as Manual");
            }
            if ((!LOOKUPDATA.get("Used Lookup Type").isEmpty() || LOOKUPDATA.get("Used Lookup Type") == null) && LOOKUPDATA.get("Used Lookup Type").equalsIgnoreCase("VIN")) {
                btnVIN.click();
                flagVIN = true;
                inputVIN.sendKeys(LOOKUPDATA.get("VIN"));
                LOGGER.info("Black Book - Used Lookup Type selected as VIN");
                btnFindVehicle.click();
                inputMileage.sendKeys(LOOKUPDATA.get("Mileage"));
            }
            btnContinue.click();
        }
    }

    public void validateGeneralInfo() {
        lblGeneralInfo.waitUntilVisible();
        if (!LOOKUPDATA.get("CollateralType").isEmpty() || LOOKUPDATA.get("CollateralType") == null) {
            Assert.assertEquals("Collateral Type is not matched: ", LOOKUPDATA.get("CollateralType"), lblCollateralTypeValue.getText());
        }
        if (!LOOKUPDATA.get("ValueGuideSource").isEmpty() || LOOKUPDATA.get("ValueGuideSource") == null) {
            Assert.assertEquals("Value Guide Selection", LOOKUPDATA.get("ValueGuideSource"), lblValueGuideSelectionValue.getText());
        }
        if (!LOOKUPDATA.get("Year").isEmpty() || LOOKUPDATA.get("Year") == null) {
            Assert.assertEquals("Year is not matching", LOOKUPDATA.get("Year"), lblGeneralInfoYearValue.getText());
        }
        if (!LOOKUPDATA.get("Brand").isEmpty() || LOOKUPDATA.get("Brand") == null) {
            Assert.assertEquals("Brand value is not matching", LOOKUPDATA.get("Brand"), lblGeneralInfoBrandValue.getText());
        }
        if (!LOOKUPDATA.get("Model").isEmpty() || LOOKUPDATA.get("Model") == null) {
            Assert.assertEquals("Model value is not matching", LOOKUPDATA.get("Model"), lblGeneralInfoModelValue.getText());
        }
        if (!LOOKUPDATA.get("SubModel").isEmpty() || LOOKUPDATA.get("SubModel") == null) {
            Assert.assertEquals("SubModel value is not matching", LOOKUPDATA.get("SubModel"), lblGeneralInfoSubModelValue.getText());
        }
        if (!LOOKUPDATA.get("Style").isEmpty() || LOOKUPDATA.get("Style") == null) {
            Assert.assertEquals("Style value is not matching", LOOKUPDATA.get("Style"), lblGeneralInfoStyleValue.getText());
        }
        if (!LOOKUPDATA.get("Mileage").isEmpty() || LOOKUPDATA.get("Mileage") == null) {
            Assert.assertEquals("Mileage value is not matching", LOOKUPDATA.get("Mileage"), lblGeneralInfoMileageValue.getText());
        }
        LOGGER.info("Validated General Info details in look up results page");
    }

    public void validateVehicleValue() {
        lblVehicleValues.waitUntilVisible();
        lblBaseVehicleValue.isVisible();
        lblDealerCostValue.isVisible();
        lblMSRPValue.isVisible();
        LOGGER.info("Verified vehicle values are displaying");
    }

    public void validateErrorMessages(String strDataType) {

        ExcelDriver excelDriver = new ExcelDriver();
        LOOKUPDATA = excelDriver.getRowData(strDataType, "UserData", "Lookup");
        btnCollateralTypeUsed.click();
        Assert.assertTrue("Distributor data button is not disabled", Boolean.parseBoolean(btnDistributordata.getAttribute("disabled")));
        LOGGER.info("Distributor data disabled : " + btnDistributordata.getAttribute("disabled"));
        btnCollateralTypeUsed.click();

        btnCollateralTypeUsed.click();
        LOGGER.info("Distributor data disabled : " + btnDistributordata.getAttribute("disabled"));
        if ((!LOOKUPDATA.get("CollateralType").isEmpty() || LOOKUPDATA.get("CollateralType") == null) && LOOKUPDATA.get("CollateralType").equalsIgnoreCase("New")) {
            btnCollateralTypeNew.click();
            LOGGER.info("Clicked on collateral type as New");
        } else if ((!LOOKUPDATA.get("CollateralType").isEmpty() || LOOKUPDATA.get("CollateralType") == null) && LOOKUPDATA.get("CollateralType").equalsIgnoreCase("Used")) {
            btnCollateralTypeUsed.click();
            flagUsed = true;
            LOGGER.info("Clicked on collateral type as Used");
        }
        if ((!LOOKUPDATA.get("ValueGuideSource").isEmpty() || LOOKUPDATA.get("ValueGuideSource") == null) && LOOKUPDATA.get("ValueGuideSource").equals("Black Book")) {
            btnBlackbook.click();
            flagBlackBook = true;
            LOGGER.info("Clicked on Value Guide Source as Black Book");
        } else if ((!LOOKUPDATA.get("ValueGuideSource").isEmpty() || LOOKUPDATA.get("ValueGuideSource") == null) && LOOKUPDATA.get("ValueGuideSource").equalsIgnoreCase("Distributor Data")) {
            btnDistributordata.click();
            LOGGER.info("Clicked on Value Guide Source as Distributor data");
        }
        LOGGER.info("Entered CollateralType and ValueGuideSource details");
        btnContinue.click();


    }

    public void selectDropdown(WebElementFacade dropElement, String strValue) throws Exception {
        try {
            dropElement.waitUntilVisible().click();
            if (strValue.equalsIgnoreCase("select")) {
                drpSelect.click();
            } else {
                $("//li[contains(@data-value,'" + strValue + "')]").waitUntilVisible();
                $("//li[contains(@data-value,'" + strValue + "')]").click();
            }
        } catch (NullPointerException e) {
            throw new Exception("Unable to select the value from dropdown");
        }
        LOGGER.info(strValue + " option selected from dropdown");
    }

}
