package com.impetus.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { ".//Features/" }, 
					 glue = { "com.impetus.stepDefinitions", "com.impetus.hooks" }, 
			   monochrome = true, 
			       plugin = { "pretty",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunner extends AbstractTestNGCucumberTests {

}
