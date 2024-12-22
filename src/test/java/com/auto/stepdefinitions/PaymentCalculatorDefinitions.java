package com.auto.stepdefinitions;

public class PaymentCalculatorDefinitions {

    @Steps
    PaymentCalculatorSteps paymentCalculatorSteps;

    @Then("user click on payment calculator")
    public void userClickOnPaymentCalculator() throws Exception {
        paymentCalculatorSteps.clickOnPaymentCalculator();
    }

    @Then("user click on compute button")
    public void userclickoncomputebutton() throws Exception {
        paymentCalculatorSteps.clickOnCompute();
    }

    @Then("user validates error messages in payment calculator page")
    public void uservalidateserrormessagesinpaymentcalculatorpage() throws Exception {
        paymentCalculatorSteps.validateMandatoryFields();
    }

    @Then("user enter payment primary data for {} and validate Estimated monthly payment, Payment Schedule")
    public void validatePayments(String strKey) throws Exception {
        paymentCalculatorSteps.enterPaymentsPrimaryData(strKey);
        paymentCalculatorSteps.clickOnCompute();
        paymentCalculatorSteps.validateEstimatedmonthlypayment();
        paymentCalculatorSteps.validatePaymentSchedule();
        paymentCalculatorSteps.validateAPIResponse();
    }

    @Then("user click on save value and continue")
    public void clickOnSaveValueContinue() {
        paymentCalculatorSteps.clickOnSaveValueContinue();
    }

    @Then("user captures calculator API response")
    public void captureCalculateAPIResponse() {
        paymentCalculatorSteps.captureCalculateAPIResponse();
    }

    @Then("user captures username API response")
    public void captureUserNameAPIResponse() {
        paymentCalculatorSteps.captureUserNameAPIResponse();
    }
}
