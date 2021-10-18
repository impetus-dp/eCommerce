package com.impetus.stepDefinitions;


import org.testng.Assert;
import com.impetus.cucumber.TestContext;
import com.impetus.pageObjects.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
	TestContext testContext;
	LoginPage lp;
    String title = "Dashboard / nopCommerce administration";

	
	

	public LoginSteps(TestContext context) {
		testContext = context;
	}

	@Given("User launch Chrome Browser$")
	public void user_launch_chrome_browser() {
		lp = testContext.getPageObjectManager().getLoginPage();

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		lp.toLoginPage();

	}

	@When("User enters username: {string}")
	public void user_enters_username(String username) {
		lp.clearUserName();
		lp.setUserName(username);
	}

	@When("User enters Password: {string}")
	public void user_enters_password(String pwd) {
		lp.clearPassword();
		lp.setPassword(pwd);
	}

	@Then("^Click on login$")
	public void click_on_login() {
		lp.clickLogin();
		String pageContains = "Login was unsuccessful. No customer account found.";

		if (testContext.getWebDriverManager().getDriver().getPageSource().contains("Login was unsuccessful.")) {
			Assert.assertEquals(pageContains, title, pageContains);
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
		}
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		String expectedTitle = title;
		String actualTitle = testContext.getWebDriverManager().getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

}