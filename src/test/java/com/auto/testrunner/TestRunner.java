package com.auto.testrunner;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.ofg.auto.stepdefinitions",
        tags = "@CreateApplication"
)
public class TestRunner {

}
