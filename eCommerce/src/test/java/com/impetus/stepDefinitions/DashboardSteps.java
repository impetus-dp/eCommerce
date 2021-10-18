package com.impetus.stepDefinitions;

import com.impetus.cucumber.TestContext;
import com.impetus.pageObjects.DashboardPage;
import io.cucumber.java.en.*;

public class DashboardSteps {

	TestContext testContext;

	DashboardPage dp;

	public DashboardSteps(TestContext context) {
		testContext = context;
		dp = testContext.getPageObjectManager().getDashboardPage();
	}

	@Then("^User click on Logout link$")
	public void user_clock_on_logout_link() throws InterruptedException {

		dp.clickLogout();
	}

	@Then("close chrome browser")
	public void close_chrome_browser() {

		testContext.getWebDriverManager().closeDriver();

	}

}
