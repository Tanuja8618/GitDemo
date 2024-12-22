package com.auto.stepdefinitions;

public class Hooks {

    CommonSteps commonSteps;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    @After
    public void afterScenario() {
        flagUsed = false;
        flagVIN = false;
        flagBlackBook = false;
        if (!CREDENTAILSDATA.isEmpty()) {
            CREDENTAILSDATA.clear();
            USERCREDENTAILS.clear();
            LOGGER.info("Credentials data cleared.");
        }
    }
}
