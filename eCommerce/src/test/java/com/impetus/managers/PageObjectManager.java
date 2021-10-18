package com.impetus.managers;

import org.openqa.selenium.WebDriver;
import com.impetus.pageObjects.DashboardPage;
import com.impetus.pageObjects.LoginPage;

public class PageObjectManager {

	private WebDriver driver;

	private LoginPage lp;

	private DashboardPage dp;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public LoginPage getLoginPage() {

		return (lp == null) ? lp = new LoginPage(driver) : lp;

	}

	public DashboardPage getDashboardPage() {

		return (dp == null) ? dp = new DashboardPage(driver) : dp;

	}

}
