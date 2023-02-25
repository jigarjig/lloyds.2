package com.lloydsbank.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/lloydsbank",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        tags = {"@smoke", "@sanity"}
)
public class TestRunnerSanity {

}
