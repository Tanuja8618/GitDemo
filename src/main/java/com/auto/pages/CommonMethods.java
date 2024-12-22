package com.auto.pages;

public class CommonMethods extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonMethods.class);

    public void validateErrorMessage(String requestedData, String strMessage) {
        ExcelDriver excelDriver = new ExcelDriver();
        if (!englisData.isEmpty())
            englisData = excelDriver.getSheetDataBasedOnColumn("Transalation_Data", "Translation", "English");
        if (!spanishData.isEmpty())
            spanishData = excelDriver.getSheetDataBasedOnColumn("Transalation_Data", "Translation", "Spanish");
        if (englisData.get(requestedData).equalsIgnoreCase(strMessage) || spanishData.get(requestedData).equalsIgnoreCase(strMessage))
            Serenity.recordReportData().withTitle("Message Validation for " + strMessage).andContents(" Message is as expected");
        else return;
        Serenity.recordReportData().withTitle("Message Validation for " + strMessage).andContents(" Message is not matched");

    }

    public void waitForSometime(int min) {
        try {
            Thread.sleep((long) min * 60 * 1000);
            LOGGER.info("Waited for " + min + " minutes.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitforSometimeInSeconds(int sec) {
        try {
            Thread.sleep(sec * 1000L);
            LOGGER.info("Waited for " + sec + " seconds.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void moveToElement(WebElementFacade element) {
        Actions action = new Actions(getDriver());
        action.moveToElement(element).click().perform();
    }

    public void cliskUsingJavaScriptExecutor(WebElementFacade element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", element);
//        btnTransactions.click();
    }

    public void selectDropdown(WebElementFacade dropElement, String strValue) throws Exception {
        try {
            dropElement.waitUntilVisible().click();
                $("//li[contains(@data-value,'" + strValue + "')]").waitUntilVisible();
                $("//li[contains(@data-value,'" + strValue + "')]").click();
        } catch (NullPointerException e) {
            throw new Exception("Unable to select the value from dropdown");
        }
        LOGGER.info(strValue + " option selected from dropdown");
    }

    public void validateTextMessage(String requestedData, String strMessage) {
        try {
            if (flagLanguage.equalsIgnoreCase("spanish"))
                Assert.assertEquals(spanishData.get(requestedData), strMessage);
            else
                Assert.assertEquals(englisData.get(requestedData), strMessage);
            LOGGER.info(strMessage + "  is Validated...");
        } catch (Exception e) {
            LOGGER.warn(requestedData + " -- " + strMessage + "  are not matched");
        }
    }

    public static boolean isNullOrEmptyMap(final Map < ? , ? > map) {
        return (map == null || map.isEmpty());
    }
}
