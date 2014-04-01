/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

/**
 *
 * @author badris
 */
public class DragandDropSteps {

    FirefoxDriver driver = new FirefoxDriver();
    EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
    ScreenshortReporter rep = new ScreenshortReporter(driver);

    @Given("^the url$")
    public void the_url() throws Throwable {
        efwd.register(rep);
        efwd.get("http://yuilibrary.com/yui/docs/dd/portal-example.html");
        WebElement draggable = efwd.findElement(By.xpath(".//*[@id='slashdot']"));
        new Actions(efwd).dragAndDropBy(draggable, 300, 300).build().perform();
    }

    @Then("^A DnD operation is successfull$")
    public void A_DnD_operation_is_successfull() throws Throwable {
        int x = efwd.findElement(By.xpath(".//*[@class='item yui3-dd-drop yui3-dd-draggable']/div/h2")).getLocation().x;
        int y = efwd.findElement(By.xpath(".//*[@class='item yui3-dd-drop yui3-dd-draggable']/div/h2")).getLocation().y;
        Assert.assertTrue(x == 219 && y == 86);
    }
}
