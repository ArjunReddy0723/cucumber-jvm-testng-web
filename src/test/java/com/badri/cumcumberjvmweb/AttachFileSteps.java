/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import junit.framework.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * A Simple BDD driven Webdriver class to show the OS window popup handle
 *
 * @author badris
 */
public class AttachFileSteps {

    FirefoxDriver driver = new FirefoxDriver();

    @Given("^The url is given$")
    public void The_url_http_www_pdfunlock_com_the_file_location_c_() throws Throwable {
        //Robot class from the AWT package will help to fire event on the file attach box
        Robot robot = new Robot();
        driver.get("http://www.pdfunlock.com/");
        driver.findElementByXPath(".//*[@id='fromComputer']").click();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_DECIMAL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @Then("^The file is uploaded successfully$")
    public void The_file_is_uploaded_successfully() throws Throwable {
        //This page once the file is ready to upload successfully will have 
        //the textbox data entered successfully
        String filenameText = driver.findElementByXPath(".//*[@id='fileChooser']").getText();
        Assert.assertEquals("a.txt", filenameText);
        driver.close();
        driver.quit();

    }
}
