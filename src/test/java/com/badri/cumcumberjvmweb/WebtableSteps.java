/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author badris
 */
public class WebtableSteps {

    FirefoxDriver driver = new FirefoxDriver();
    SalesForceUtilities sf = new SalesForceUtilities(driver);

    @Given("^A link to the webpage$")
    public void readtable() throws Throwable {
        //A Sample to read the rows of data from the Webtable
        //// driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.get("http://webdesign.about.com/od/examples/l/bltables.htm");
        // Get the Row as TD 
        List<WebElement> row = driver.findElements(By.xpath(".//*[@id='articlebody']/table[1]/tbody/tr"));

        int nOfRows = row.size();
        for (WebElement r : row) {

            //There will be number of TDS 
            List<WebElement> cols = driver.findElements(By.xpath(".//*[@id='articlebody']/table[1]/tbody/tr/td"));
            for (WebElement c : cols) {
                System.out.println(c.getText());
            }
        }
    }

    @Then("^The contents of the first table are read$")
    public void tableread() throws Throwable {
        // Express the Regexp above with the code you wish you had
    }
}
