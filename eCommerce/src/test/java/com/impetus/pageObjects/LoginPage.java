package com.impetus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.impetus.managers.FileReaderManager;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void toLoginPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Log in']")
	@CacheLookup
	WebElement btnLogin;

	
	public void clearUserName()
	{
		txtEmail.clear();

	}
	public void clearPassword()
	{
		txtPassword.clear();

	}
	public void setUserName(String uname) {
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

}
