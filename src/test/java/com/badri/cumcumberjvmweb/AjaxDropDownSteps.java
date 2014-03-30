/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badri.cumcumberjvmweb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * A Example Illustrating the handling on Ajax drop downs using Webdriver
 * @author badris
 */
public class AjaxDropDownSteps {

    String actualText;
    FirefoxDriver driver = new FirefoxDriver();

    @Given("^http://dhtmlx.com/docs/products/dhtmlxCombo/ , Austra$")
    public void http_dhtmlx_com_docs_products_dhtmlxCombo_Austra() throws Throwable {
        driver.get("http://dhtmlx.com/docs/products/dhtmlxCombo/");
        Thread.sleep(10000);
        driver.findElementByXPath("html/body/div[6]/div[1]/div[3]/div[1]/div[4]/span/div/input[1]").sendKeys("Austra");
        Thread.sleep(3000);
        actualText = driver.findElementByXPath("html/body/div[2]/div").getText();



    }

    @Then("^Australia should be highligted and shown$")
    public void Australia_should_be_highligted_and_shown() throws Throwable {
        Assert.assertEquals(actualText, "Australia");
        driver.close();
        driver.quit();
    }
}
