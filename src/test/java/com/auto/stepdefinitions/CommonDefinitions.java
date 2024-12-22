package com.auto.stepdefinitions;

public class CommonDefinitions {

    @Steps
    CommonSteps commonSteps;

    @Then("user needs to wait for {int} mins")
    public void userNeedsToWaitForMins(int time) {
        commonSteps.waitforSometime(time);
    }

    @Then("user needs to wait for {int} seconds")
    public void userNeedsToWaitForSeconds(int secs) {
        commonSteps.waitforSometimeInSeconds(secs);
    }


}
