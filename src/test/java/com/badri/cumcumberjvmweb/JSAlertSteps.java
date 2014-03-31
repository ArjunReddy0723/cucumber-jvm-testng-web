package com.badri.cumcumberjvmweb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.firefox.FirefoxDriver;

/***
 *  A Sample to illustrate the use of the Alert class of the Selenium package
 * @author badris
 */
public class JSAlertSteps {

    // driver.quit should be used only as the last statement since after that no statements will work
    FirefoxDriver driver = new FirefoxDriver();
    
    @Given("^Url is \"([^\"]*)\" and \"([^\"]*)\" button is pressed$")
    public void Url_is_and_button_is_pressed(String arg1, String arg2) throws Throwable {
        driver.get(arg1);
    }
    
    @Then("^The alert boxes should be closed successfully$")
    public void The_alert_boxes_should_be_closed_successfully() throws Throwable {
        driver.switchTo().alert().accept();
        
        driver.close();
        
    }

    @Then("^The Cancel button is pressed successfully$")
    public void The_cancel() throws Throwable {
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        driver.quit();
        
        
    }
}