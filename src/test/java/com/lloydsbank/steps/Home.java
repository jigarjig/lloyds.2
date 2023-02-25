package com.lloydsbank.steps;

import com.lloydsbank.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.lloydsbank.browserfactory.ManageBrowser.driver;

public class Home {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on click on Accept all$")
    public void iClickOnClickOnAcceptAll() {
        new HomePage().clickOnAccept();
        driver.switchTo().defaultContent();
    }
}
