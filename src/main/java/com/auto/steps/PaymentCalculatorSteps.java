package com.auto.steps;

public class PaymentCalculatorSteps {

    PaymentCalculatorPage paymentCalculatorPage;

    @Step("user click on Payment calculator")
    public void clickOnPaymentCalculator() throws Exception {
        paymentCalculatorPage.clickOnPaymentCalculator();
    }

    @Step("user click on compute button")
    public void clickOnCompute() throws Exception {
        paymentCalculatorPage.clickOnCompute();
    }

    @Step("Validate mandatory fields in Payment calculator page")
    public void validateMandatoryFields() throws Exception {
        paymentCalculatorPage.validateMandatoryMessage();
    }

    @Step("Enter Payment primary data")
    public void enterPaymentsPrimaryData(String key) throws Exception {
        paymentCalculatorPage.enterDataforPayment(key);
    }

    @Step("Validate Estimated monthly payment data")
    public void validateEstimatedmonthlypayment() {
        paymentCalculatorPage.validateEstimatedmonthlypayment();
    }

    @Step("Validate Payment Schedule")
    public void validatePaymentSchedule() {
        paymentCalculatorPage.validatePaymentSchedule();
    }

    @Step("click on Save Value and Continue")
    public void clickOnSaveValueContinue() {
        paymentCalculatorPage.clickOnSaveValueContinue();
    }

    @Step("capture calculate API response")
    public void captureCalculateAPIResponse() {
        paymentCalculatorPage.captureCalculatorAPIResponseData();
    }

    @Step("capture username API response")
    public void captureUserNameAPIResponse() {
        paymentCalculatorPage.captureUserNameAPIResponseData();
    }

    @Step("validate Estimated Monthly Payment and Payment Schedule")
    public void validateAPIResponse(){
        paymentCalculatorPage.printPaymentCalculationUsingAPIResponse();
//        paymentCalculatorPage.validatePaymentCalculationUsingAPIResponse();
    }
}
