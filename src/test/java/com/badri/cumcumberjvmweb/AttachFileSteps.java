/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author badris
 */
public class AttachFileSteps {
    FirefoxDriver driver = new FirefoxDriver();
    
@Given("^The url is given$")
public void The_url_http_www_pdfunlock_com_the_file_location_c_() throws Throwable {
    // Express the Regexp above with the code you wish you had
    Robot robot = new Robot();
    driver.get("http://www.pdfunlock.com/");
    driver.findElementByXPath(".//*[@id='fromComputer']").click();
   // if(driver.getTitle().contentEquals("Open")){
        robot.keyPress(KeyEvent.VK_A);
robot.keyRelease(KeyEvent.VK_A);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);


  //  driver.switchTo().window(driver.getWindowHandle()).findElement(By.cssSelector(null))
          //  }
    //driver.findElementByCssSelector(".//*[@id='fileChooserContainer']/div[1]").sendKeys("C:\\Users\\badri\\Desktop\\AttachFile.txt");
    
    // throw new PendingException();
}
    
//@Given("^The url http://www.pdfunlock.com/ , the file location c:\\$")
//public void The_url_http_www_pdfunlock_com_the_file_location_c_() throws Throwable {
//   
//   
//}

@Then("^The file is uploaded successfully$")
public void The_file_is_uploaded_successfully() throws Throwable {
    // Express the Regexp above with the code you wish you had
   
}

}
