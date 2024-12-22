package com.auto.stepdefinitions;

public class LookUpDefinitions {

    @Steps
    LookupSteps lookupSteps;

    @Then("user click on Lookup")
    public void userClickOnLookup() throws Exception {
        lookupSteps.clickOnLookup();
    }

    @Then("user click on lets Lookup")
    public void userClickOnLetsLookup() throws Exception {
        lookupSteps.clickOnLetsLookup();
    }

    @Then("user enter lookup data for {} and validate vehicle details")
    public void enterLookupData(String strKey) throws Exception {
        lookupSteps.enterLookupData(strKey);
    }

    @Then("user validate vehicle general info details")
    public void validateGeneralInfoData() throws Exception {
        lookupSteps.validateGeneralInfo();
    }

    @Then("user validate vehicle values details")
    public void validateVehicleValues() throws Exception {
        lookupSteps.validateVehicleValues();
    }

//    @Then("user captures calculator API response")
//    public void captureCalculateAPIResponse() {
//        paymentCalculatorSteps.captureCalculateAPIResponse();
//    }
//
//    @Then("user captures username API response")
//    public void captureUserNameAPIResponse() {
//        paymentCalculatorSteps.captureUserNameAPIResponse();
//    }
}
