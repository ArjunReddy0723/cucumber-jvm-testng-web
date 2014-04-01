/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * A Mock illustration of Webdriverevent listener
 * @author badris
 */
public class EventDriverSteps {

    

    @Given("^Exception thrown$")
    public void Exception_thrown() throws Throwable {
        FirefoxDriver driver = new FirefoxDriver();
        
        ScreenshortReporter scr = new ScreenshortReporter(driver);
        EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
        efwd.register(scr);
        efwd.get("http://google.com");
        // There is no such element so just using it to throw the exception
        efwd.findElement(By.className("String")).click();
     
    }

    @Then("^Event is fired and screenshot captured$")
    public void Event_is_fired_and_screenshot_captured() throws Throwable {
        // Express the Regexp above with the code you wish you had
    }
}
