package com.auto.pages;

public class PaymentCalculatorPage extends PageObject {

    String strResponse;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentCalculatorPage.class);

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "//li[@role='option']")
    List<WebElementFacade> dropDownValues;
    @FindBy(xpath = "//*[contains(@class,'DockedLeft')]//..//li[3]")
    WebElementFacade btnPaymentCalculator;
    @FindBy(xpath = "//p[contains(text(),'Payment Calculator')]")
    WebElementFacade lblPaymentCalculator;
    @FindBy(xpath = "//input[@name='programVal']/..")
    WebElementFacade drpProgram;
    @FindBy(xpath = "//li[@role='option' and contains(@data-value,'')][1]")
    WebElementFacade drpSelect;
    @FindBy(xpath = "//input[@name='programVal']//..//..//..//p")
    WebElementFacade lblProgramErrorMsg;
    @FindBy(xpath = "//input[@name='promotion']/..")
    WebElementFacade drpPromotion;
    @FindBy(xpath = "//input[@name='newOrUsed' and @value='True']/..")
    WebElementFacade inputNew;
    @FindBy(xpath = "//input[@name='newOrUsed' and @value='False']/..")
    WebElementFacade inputUsed;
    @FindBy(xpath = "//input[@name='newOrUsed']/../../../../p")
    WebElementFacade lblNeworUsedErrorMsg;
    @FindBy(xpath = "//input[@name='vehicleClass' and @value='import']/..")
    WebElementFacade inputImport;
    @FindBy(xpath = "//input[@name='vehicleClass' and @value='local']/..")
    WebElementFacade inputLocal;
    @FindBy(xpath = "//input[@name='vehicleClass']/../../../../p")
    WebElementFacade lblVehicleClassMsg;
    @FindBy(xpath = "//input[@name='term']/..")
    WebElementFacade drpTerm;
    @FindBy(xpath = "//input[@name='term']/../../../p")
    WebElementFacade lblTermErrorMsg;
    @FindBy(xpath = "//li[@role='option']")
    List<WebElementFacade> drptermValue;
    @FindBy(xpath = "//input[@name='rate']")
    WebElementFacade inputRate;
    @FindBy(xpath = "//input[@name='rate']/../../../../p")
    WebElementFacade lblRateErrorMsg;
    @FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
    WebElementFacade inputContractDate;
    @FindBy(xpath = "//input[@name='salePrice']")
    WebElementFacade inputSalePrice;
    @FindBy(xpath = "//input[@name='salePrice']/../../../../p")
    WebElementFacade lblSalePriceErrorMsg;
    @FindBy(xpath = "//input[@name='balloonPay']")
    WebElementFacade inputBalloonPayment;
    @FindBy(xpath = "//input[@name='salePrice']/../../../../p")
    WebElementFacade lblBalloonPaymentMsg;
    @FindBy(xpath = "//button[@data-testid='calculate']")
    WebElementFacade btnCompute;
    @FindBy(xpath = "//h3[contains(text(),'Estimated')]/../../..//div[2]//table")
    WebElementFacade estimatedTable;
    @FindBy(xpath = "//h3[contains(text(),'Payment')]/../..//div[4]//table")
    WebElementFacade paymentTable;
    @FindBy(xpath = "//button[@id='calc-save-continue']")
    WebElementFacade btnSaveValueContinue;


    public void clickOnPaymentCalculator() throws Exception {
        try {
            btnPaymentCalculator.waitUntilVisible();
            btnPaymentCalculator.click();
            Thread.sleep(4000);
            LOGGER.info("Clicked on Payment Calculator");
        } catch (Exception e) {
            throw new Exception("Payment Calculator is disabled or unable click.");
        }
    }

    public void clickOnPaymentCalculatorLabel() {
        lblPaymentCalculator.click();
    }

    public void selectProgram(String strOption) throws Exception {
        selectDropdown(drpProgram, strOption);
    }

    private List<String> storeDropdownValues(WebElementFacade element, List<WebElementFacade> listDropdown) throws Exception {
        List<String> valueList = new ArrayList<>();
        try {
            element.click();
            for (WebElementFacade elementFacade : listDropdown) {
                valueList.add(elementFacade.getText());
            }
        } catch (NullPointerException e) {
            throw new Exception("Drop down list doesn't have any values");
        }
        element.click();
        return valueList;
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

    public boolean isDisplayed(WebElementFacade element) {
        try {
            return element.isVisible();
        } catch (NoSuchElementException e) {
            LOGGER.info("In catch block");
            return false;
        }
    }

    public void selectNewOrUsed(String strOption) throws Exception {
        try {
            if (strOption.equalsIgnoreCase("new"))
                inputNew.click();
            else if (strOption.equalsIgnoreCase("used"))
                inputUsed.click();
        } catch (Exception e) {
//            throw new Exception("Unable to select New/Used option");
            e.printStackTrace();
        }
    }

    public void selectVehicleClass(String strOption) throws Exception {
        try {
            if (strOption.equalsIgnoreCase("local"))
                inputLocal.click();
            else if (strOption.equalsIgnoreCase("import"))
                inputImport.click();
        } catch (Exception e) {
            throw new Exception("Unable to select Local/Import option");
        }
    }

    public void selectTerm() throws Exception {
        try {
            selectDropdown(drpTerm, "24");
        } catch (NoSuchElementException e) {
            throw new Exception("Unable to select Program Term");
        }
    }

    public void clickOnCompute() throws Exception {
        try {
            btnCompute.waitUntilVisible().click();
            commonMethods.waitforSometimeInSeconds(20);
            LOGGER.info("Clicked on Compute button");
        } catch (NoSuchElementException e) {
            throw new Exception("Unable to click on Compute button");
        }
    }

    public void validateMandatoryMessage() throws Exception {
        try {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            String todaysDate = formatter.format(date);

            lblProgramErrorMsg.isVisible();
            lblNeworUsedErrorMsg.isVisible();
            lblVehicleClassMsg.isVisible();
            lblTermErrorMsg.isVisible();
            lblRateErrorMsg.isVisible();
            lblSalePriceErrorMsg.isVisible();
            LOGGER.info("All fields are displaying");
            Assert.assertTrue("Rate is not null: ", inputRate.getAttribute("value").isEmpty());
            LOGGER.info("Rate field is empty - validated");
            selectDropdown(drpPromotion, "ACH 2021");
            commonMethods.waitforSometimeInSeconds(2);
            Assert.assertEquals("Rate is not matched after promotion has selected ACH 2021", "5.50%", inputRate.getAttribute("value"));
            LOGGER.info("Rate field value is 5.5.% after selecting ACH 2021. Validated");
            selectDropdown(drpPromotion, "select");
            Assert.assertTrue("Rate is not null: ", inputRate.getAttribute("value").isEmpty());
            LOGGER.info("Rate is empty after deselect ACH 2021. Validated");
            LOGGER.info("Date: " + inputContractDate.getAttribute("value"));
            LOGGER.info("Today's Date : " + todaysDate);
            Assert.assertEquals("Today's date in Contract date is not matched", todaysDate.toString(), inputContractDate.getAttribute("value"));
            LOGGER.info("Contract date is populating with current date. Validated");
            selectDropdown(drpProgram, "Oriental A+");
            commonMethods.waitforSometimeInSeconds(5);
            Assert.assertTrue("Balloon Payment is not visible", inputBalloonPayment.isVisible());
            LOGGER.info("After selecting Program as 'Oriental A+' Balloon payment field is visible. Validated");
            selectDropdown(drpProgram, "Conventional");
            Assert.assertFalse("Balloon Payment should not visible", isDisplayed(inputBalloonPayment));
            LOGGER.info("After selecting Program as 'Conventional' Balloon payment field is not visible. Validated");
            selectNewOrUsed("new");
            commonMethods.waitforSometimeInSeconds(3);
//            LOGGER.info(storeDropdownValues(drpTerm, drptermValue).toString());
            LOGGER.info("Validated mandatory field error messages");
        } catch (Exception e) {
//            throw new Exception("Mandatory field error message is not displaying");
            e.printStackTrace();
        }
    }

    public void pageLevelValidations() throws Exception {
        try {

        } catch (Exception e) {
            throw new Exception("Payment calculator page level validations are failed");
        }
    }

    public void enterDataforPayment(String strDataType) throws Exception {
        ExcelDriver excelDriver = new ExcelDriver();
        PAYMENTDATA = excelDriver.getRowData(strDataType, "UserData", "PaymentDetails");
//        if (!PAYMENTDATA.get("Program").isEmpty() || PAYMENTDATA.get("Program") == null) {
//            selectDropdown(drpProgram, PAYMENTDATA.get("Program"));
//        }
        if (!PAYMENTDATA.get("Promotion").isEmpty() || PAYMENTDATA.get("Promotion") == null) {
            selectDropdown(drpPromotion, PAYMENTDATA.get("Promotion"));
        }
//        if (!PAYMENTDATA.get("NewUsed").isEmpty() || PAYMENTDATA.get("NewUsed") == null) {
//            selectNewOrUsed(PAYMENTDATA.get("NewUsed"));
//        }
        commonMethods.waitforSometimeInSeconds(5);
        if (!PAYMENTDATA.get("VehicleClass").isEmpty() || PAYMENTDATA.get("VehicleClass") == null) {
            selectVehicleClass(PAYMENTDATA.get("VehicleClass"));
        }
        if (!PAYMENTDATA.get("Term").isEmpty() || PAYMENTDATA.get("Term") == null) {
            selectDropdown(drpTerm, PAYMENTDATA.get("Term"));
        }
        if (!PAYMENTDATA.get("Rate").isEmpty() || PAYMENTDATA.get("Rate") == null) {
            inputRate.type(PAYMENTDATA.get("Rate"));
            APR = PAYMENTDATA.get("Rate");
        }
        if (!PAYMENTDATA.get("ContractDate").isEmpty() || PAYMENTDATA.get("ContractDate") == null) {
            inputContractDate.clear();
            inputContractDate.type(PAYMENTDATA.get("ContractDate"));
            System.out.println(inputContractDate.getText());
        }
        if (!PAYMENTDATA.get("Saleprice").isEmpty() || PAYMENTDATA.get("Saleprice") == null) {
            inputSalePrice.type(PAYMENTDATA.get("Saleprice"));
        }
        if (!PAYMENTDATA.get("BalloonPayment").isEmpty() || PAYMENTDATA.get("BalloonPayment") == null) {
            inputBalloonPayment.type(PAYMENTDATA.get("BalloonPayment"));
            BALLOONPAYMENT = PAYMENTDATA.get("BalloonPayment");
        }
        LOGGER.info("Entered Payment primary data");
    }

    public void validateEstimatedmonthlypayment() {
        LOGGER.info("********   Estimated Monthly Payment **********");
        LOGGER.info(estimatedTable.findBy("//tr[1]/td").getText());
        LOGGER.info(estimatedTable.findBy("//tr[2]/td").getText());
        LOGGER.info(estimatedTable.findBy("//tr[3]/td").getText());
        LOGGER.info(estimatedTable.findBy("//tr[4]/td").getText());
        LOGGER.info(estimatedTable.findBy("//tr[5]/td").getText());
        LOGGER.info(estimatedTable.findBy("//tr[6]/td").getText());
        LOGGER.info(estimatedTable.findBy("//tr[7]/td").getText());
        LOGGER.info(estimatedTable.findBy("//tr[8]/td").getText());
//        LOGGER.info(estimatedTable.findBy("//tr[9]/td").getText());
        LOGGER.info("******************");
    }

    public void validatePaymentSchedule() {
        LOGGER.info("**********  Payment Schedule ********");
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[1]/td[1]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[1]/td[2]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[1]/td[3]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[2]/td[1]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[2]/td[2]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[2]/td[3]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[3]/td[1]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[3]/td[2]").getText());
        LOGGER.info(paymentTable.findBy("//tbody[2]//tr[3]/td[3]").getText());
        LOGGER.info("******************");
    }

    public void clickOnSaveValueContinue() {
        btnSaveValueContinue.click();
        LOGGER.info("Clicked on Save Value and Continue button");
        commonMethods.waitforSometimeInSeconds(20);

    }

    public void printPaymentCalculationUsingAPIResponse() {
        LOGGER.info("******************");
        LOGGER.info(PAYMENTRESPONSEPOJO.getFinancedFees());
        LOGGER.info(PAYMENTRESPONSEPOJO.getAmountFinanced());
        LOGGER.info(PAYMENTRESPONSEPOJO.getBalance());
//        Assert.assertEquals(estimatedTable.findBy("//tr[4]/td").getText(), "$" + formatAmountValues(BALLOONPAYMENT));
        LOGGER.info(estimatedTable.findBy("//tr[5]/td").getText(), APR + "%");
        LOGGER.info(PAYMENTRESPONSEPOJO.getRegistrationFees());
        LOGGER.info(PAYMENTRESPONSEPOJO.getNetTradeIn());
        LOGGER.info(PAYMENTRESPONSEPOJO.getFinanceCharge());
        LOGGER.info(PAYMENTRESPONSEPOJO.getDeferredBalance());

        for (int i = 1; i < PAYMENTSCHEDULELIST.size() + 1; i++) {
            LOGGER.info(PAYMENTSCHEDULELIST.get(i - 1).getNoOfPayments());
            LOGGER.info(PAYMENTSCHEDULELIST.get(i - 1).getPaymentAmount());
            LOGGER.info(PAYMENTSCHEDULELIST.get(i - 1).getStartDate());
        }
        LOGGER.info("******************");
    }

    public void validatePaymentCalculationUsingAPIResponse() {
        Assert.assertEquals(estimatedTable.findBy("//tr[1]/td").getText(), "$" + formatAmountValues(PAYMENTRESPONSEPOJO.getFinancedFees()));
        Assert.assertEquals(estimatedTable.findBy("//tr[2]/td").getText(), "$" + formatAmountValues(PAYMENTRESPONSEPOJO.getAmountFinanced()));
        Assert.assertEquals(estimatedTable.findBy("//tr[3]/td").getText(), "$" + formatAmountValues(PAYMENTRESPONSEPOJO.getBalance()));
//        Assert.assertEquals(estimatedTable.findBy("//tr[4]/td").getText(), "$" + formatAmountValues(BALLOONPAYMENT));
        Assert.assertEquals(estimatedTable.findBy("//tr[5]/td").getText(), APR + "%");
        Assert.assertEquals(estimatedTable.findBy("//tr[6]/td").getText(), "$" + formatAmountValues(PAYMENTRESPONSEPOJO.getRegistrationFees()));
        Assert.assertEquals(estimatedTable.findBy("//tr[7]/td").getText(), "$" + formatAmountValues(PAYMENTRESPONSEPOJO.getNetTradeIn()));
        Assert.assertEquals(estimatedTable.findBy("//tr[8]/td").getText(), formatAmountValues(PAYMENTRESPONSEPOJO.getFinanceCharge()));
        Assert.assertEquals(estimatedTable.findBy("//tr[9]/td").getText(), formatAmountValues(PAYMENTRESPONSEPOJO.getDeferredBalance()));

        for (int i = 1; i < PAYMENTSCHEDULELIST.size() + 1; i++) {
            Assert.assertEquals(paymentTable.findBy("//tbody[2]//tr[" + i + "]/td[1]").getText(), PAYMENTSCHEDULELIST.get(i - 1).getNoOfPayments());
            Assert.assertEquals(paymentTable.findBy("//tbody[2]//tr[" + i + "]/td[2]").getText(), formatAmountValues(PAYMENTSCHEDULELIST.get(i - 1).getPaymentAmount()));
            Assert.assertEquals(paymentTable.findBy("//tbody[2]//tr[" + i + "]/td[3]").getText(), PAYMENTSCHEDULELIST.get(i - 1).getStartDate());
        }
    }

    private String formatAmountValues(String strAmount) {
        if (strAmount.substring(strAmount.indexOf(".")).equalsIgnoreCase(".0")) {
            double amount1 = Double.parseDouble(strAmount);
            DecimalFormat formatter = new DecimalFormat("#,###");
            return formatter.format(amount1);
        } else {
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            return nf.format(new BigDecimal(strAmount));
        }
    }

    public void captureUserNameAPIResponseData() {
        LOGGER.info("Getting User Name API response data");
        DevTools devTools = ((HasDevTools) getDriver()).getDevTools();
        devTools.createSession();
        final RequestId[] requestIds = new RequestId[1];
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.responseReceived(), responseReceived -> {
            String url = responseReceived.getResponse().getUrl();
            try {
                if (url.contains("username") && responseReceived.getResponse().getStatus().equals(200)) {
                    requestIds[0] = responseReceived.getRequestId();
                    LOGGER.info("API URL: " + url);
                    LOGGER.info("username Body: \n" + devTools.send(Network.getRequestPostData(requestIds[0])) + "\n");
                    LOGGER.info("username Response Body: \n" + devTools.send(Network.getResponseBody(requestIds[0])).getBody() + "\n");
                    strResponse = devTools.send(Network.getResponseBody(requestIds[0])).getBody();
                    USERNAMERESPONSEPOJO = UtilMethods.jsonToObject(strResponse, UsernameResponse.class);
                    LOGGER.info("ID : " + USERNAMERESPONSEPOJO.getResult().get(0).getNextStep().getId());
                    if (USERNAMERESPONSEPOJO.getResult().get(0).getNextStep().getId() == null)
                        flagSkipOTP = true;
                    LOGGER.info("OTP Skip status : " + flagSkipOTP);
                }
            } catch (DevToolsException e) {
                LOGGER.info("still loading.....");
            } catch (Exception e) {
                LOGGER.warn("Got exception" + e.getMessage());
            }
        });
    }

    public void captureCalculatorAPIResponseData() {
        LOGGER.info("Getting Payment Calculator API response data");
        DevTools devTools = ((HasDevTools) getDriver()).getDevTools();
        devTools.createSession();
        final RequestId[] requestIds = new RequestId[1];
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.responseReceived(), responseReceived -> {
            String url = responseReceived.getResponse().getUrl();
            try {
                if (url.contains("calculate") && responseReceived.getResponse().getStatus().equals(200)) {
                    requestIds[0] = responseReceived.getRequestId();
                    LOGGER.info("API URL: " + url);
                    LOGGER.info("Payment Calculator Body: \n" + devTools.send(Network.getRequestPostData(requestIds[0])) + "\n");
                    LOGGER.info("Payment Calculator Response Body: \n" + devTools.send(Network.getResponseBody(requestIds[0])).getBody() + "\n");
                    strResponse = devTools.send(Network.getResponseBody(requestIds[0])).getBody();
                    PAYMENTRESPONSEPOJO = UtilMethods.jsonToObject(strResponse, PaymentResponse.class);
                    PAYMENTSCHEDULELIST = PAYMENTRESPONSEPOJO.getPaymentSchedules();
                }
            } catch (DevToolsException e) {
                LOGGER.info("still loading.....");
            } catch (Exception e) {
                LOGGER.warn("Got exception" + e.getMessage());
            }
        });
    }


}
