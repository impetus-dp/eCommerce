package com.impetus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/a")
	@CacheLookup
	WebElement lnkLogout;

	public void clickLogout() {
		lnkLogout.click();
	}

}
