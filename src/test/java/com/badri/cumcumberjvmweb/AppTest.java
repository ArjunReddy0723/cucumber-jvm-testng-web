package com.badri.cumcumberjvmweb;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//Tags are useful to group the Gherkhin feature files together for execution 
//Make the Test Executer , way cleaner!
@CucumberOptions(format="pretty",features = "src/test/resources/",tags={"@set1"})
public class AppTest extends AbstractTestNGCucumberTests{
}