package com.actitime.test.login;

import org.testng.annotations.Test;

import com.actitime.pages.login.LoginPage;
import com.actitime.testBase.TestBase;

public class LoginTest extends TestBase {
	@Test(enabled = true)
	public void tc_07()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApplication(properties.getProperty("userName"),properties.getProperty("password"));
		loginPage.verifyHomePage("actiTIME - Enter Time-Track");
	}
	@Test(enabled = true)
	public void tc_01()
	{
		LoginPage loginPage = new LoginPage(driver);
		driver.navigate().refresh();
		loginPage.loginToApplication("123", properties.getProperty("password"));
		loginPage.verifyErrorMessage("Username or Password is invalid. Please try again.");
	}
	@Test(enabled = true)
	public void tc_02()
	{
		LoginPage loginPage = new LoginPage(driver);
		driver.navigate().refresh();
		loginPage.loginToApplication(properties.getProperty("userName"), "abc");
		loginPage.verifyErrorMessage("Username or Password is invalid. Please try again.");
	}
	@Test(enabled = true)
	public void tc_03()
	{
		LoginPage loginPage = new LoginPage(driver);
		driver.navigate().refresh();
		loginPage.loginToApplication(" ", " 123");
		loginPage.verifyErrorMessage("Username or Password is invalid. Please try again.");
	}
	@Test(enabled = true)
	public void tc_04()
	{
		LoginPage loginPage = new LoginPage(driver);
		driver.navigate().refresh();
		loginPage.loginToApplication(" ", properties.getProperty("password"));
		loginPage.verifyErrorMessage("Username or Password is invalid. Please try again.");
	}
	@Test(enabled = true)
	public void tc_05()
	{
		LoginPage loginPage = new LoginPage(driver);
		driver.navigate().refresh();
		loginPage.loginToApplication(properties.getProperty("userName") , "");
		loginPage.verifyErrorMessage("Username or Password is invalid. Please try again.");
	}
	@Test(enabled = true)
	public void tc_06()
	{
		LoginPage loginPage = new LoginPage(driver);
		driver.navigate().refresh();
		loginPage.loginToApplication("", "");
		loginPage.verifyErrorMessage("Username or Password is invalid. Please try again.");
	}
	
	
	

}