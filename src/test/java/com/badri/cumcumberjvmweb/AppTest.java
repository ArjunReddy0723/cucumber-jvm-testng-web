package com.badri.cumcumberjvmweb;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format="pretty",features = "src/test/resources/Webtable.feature")
public class AppTest extends AbstractTestNGCucumberTests{
}