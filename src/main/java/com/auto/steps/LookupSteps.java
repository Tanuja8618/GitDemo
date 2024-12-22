package com.auto.steps;

public class LookupSteps {

    LookUpPage lookUpPage;

    @Step("user click on Lookup from Menu")
    public void clickOnLookup() throws Exception {
        lookUpPage.clickOnLookupButton();
        lookUpPage.navigateToLookupPage();
    }

    @Step("user click on Lets lookup button")
    public void clickOnLetsLookup() throws Exception {
        lookUpPage.clickOnLetsLookup();
    }

    @Step("Enter Lookup data")
    public void enterLookupData(String key) throws Exception {
        lookUpPage.selectLookUp(key);
        lookUpPage.enterUsedLookUpType();
        lookUpPage.selectDistributorData();
        lookUpPage.enterOptionEquipment();
    }

    @Step("Validate General Info data")
    public void validateGeneralInfo() {
        lookUpPage.validateGeneralInfo();
    }

    @Step("Validate Vehicle values data")
    public void validateVehicleValues() {
        lookUpPage.validateVehicleValue();
    }
}
