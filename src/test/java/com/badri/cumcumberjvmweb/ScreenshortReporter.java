/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * A Mock Demo to illustrate the use of the WebDriverEvent Listener 
 * Below will take a screenshot when a exeception occured on beforefindby event
 * @author badris
 */
public class ScreenshortReporter implements WebDriverEventListener {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public ScreenshortReporter(WebDriver driver) {
        this.driver = driver;
    }

    public void beforeNavigateTo(String string, WebDriver wd) {
     
    }

    public void afterNavigateTo(String string, WebDriver wd) {
      //To change body of generated methods, choose Tools | Templates.
    }

    public void beforeNavigateBack(WebDriver wd) {
     //To change body of generated methods, choose Tools | Templates.
    }

    public void afterNavigateBack(WebDriver wd) {
      //To change body of generated methods, choose Tools | Templates.
    }

    public void beforeNavigateForward(WebDriver wd) {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void afterNavigateForward(WebDriver wd) {
       //To change body of generated methods, choose Tools | Templates.
    }

    public void beforeFindBy(By by, WebElement we, WebDriver wd) {
        System.out.println("Could not find the element BEFORE FIND BY FAILED: so taking the ScreenShot");
        File scrFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("C:\\seleniumSource\\Error.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ScreenshortReporter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void afterFindBy(By by, WebElement we, WebDriver wd) {
        
    }

    public void beforeClickOn(WebElement we, WebDriver wd) {
         //To change body of generated methods, choose Tools | Templates.
    }

    public void afterClickOn(WebElement we, WebDriver wd) {
         //To change body of generated methods, choose Tools | Templates.
    }

    public void beforeChangeValueOf(WebElement we, WebDriver wd) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void afterChangeValueOf(WebElement we, WebDriver wd) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void beforeScript(String string, WebDriver wd) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void afterScript(String string, WebDriver wd) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void onException(Throwable thrwbl, WebDriver wd) {
    }
}
