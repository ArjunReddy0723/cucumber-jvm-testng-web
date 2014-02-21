/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 *
 * @author badrisugavanam
 */
public class SearchSteps {

    FirefoxDriver driver = new FirefoxDriver();

    @When("^User searches for \"([^\"]*)\"$")
    public void User_searches_for(String arg1) throws Throwable {
        driver.get("http://www.google.co.in/?q=" + arg1);
    }

    @Then("^The result should have \"([^\"]*)\"$")
    public void The_result_should_have(String arg1) throws Throwable {
        driver.findElementByCssSelector("BUTTON#gbqfba.gbqfba").click();
        Thread.sleep(4000);
        
        String title = driver.getTitle();
        Assert.assertTrue(title.contentEquals(arg1));

    }

    @After
    public void afterScenarioRun() {
        driver.quit();
    }
}
