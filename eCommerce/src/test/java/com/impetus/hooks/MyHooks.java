package com.impetus.hooks;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.impetus.cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	TestContext testContext;

	public MyHooks(TestContext context) {
		testContext = context;

	}

	public static Logger logger;

	@Before
	public void setup(Scenario scenario) {

		logger = Logger.getLogger("NopCommerce Ecommerce App");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("@Before Hook executed");

	}

	@After
	public void tearDown(Scenario scenario) {

		testContext.getWebDriverManager().quitDriver();
		logger.info("@Ater Hook executed");


	}

	@AfterStep() 
	public void takeScreenShotOnFailure(Scenario scenario) 
	{
		 
		 if(scenario.isFailed()) {
     
			 final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(screenshot, "image/png", "image"); 
				logger.info("@AfterStep Hook - 'Scenario Failed' -executed");
   
		 }
		 
	}
}