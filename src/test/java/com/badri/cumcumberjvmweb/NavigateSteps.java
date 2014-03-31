/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author badris
 */
public class NavigateSteps {
     FirefoxDriver driver = new FirefoxDriver();
    @Given("^Launch the browser$")
    public void Launch_the_browser() throws Throwable {
        // Express the Regexp above with the code you wish you had
        driver.get("http://www.google.com/");
        driver.navigate().to("http://www.yahoo.com");
        

    }
    
    
    @Then("^Backward button is simulated$")
    public void Backward_button_is_simulated() throws Throwable {
        driver.navigate().back();
        String backUrl=driver.getTitle();
        Assert.assertTrue(backUrl.contentEquals("Google"));
       driver.close();
    }

    @Then("^Forward button is simulated$")
    public void Forward_button_is_simulated() throws Throwable {
        driver.navigate().forward();
        String forwardURL=driver.getTitle();
        Assert.assertTrue(forwardURL.contentEquals("Yahoo!7"));
        driver.quit();
        // Express the Regexp above with the code you wish you had

    }

    
}
