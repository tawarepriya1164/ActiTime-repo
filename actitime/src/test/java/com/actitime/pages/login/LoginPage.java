package com.actitime.pages.login;

import org.openqa.selenium.WebDriver;

import com.actitime.pageObject.login.LoginPageObject;
import com.actitime.utility.autoHelper.CommonActions;
import com.actitime.utility.autoHelper.SoftAsserts;
import com.actitime.utility.autoHelper.WaitHelper;

public class LoginPage {
	WebDriver driver;
	LoginPageObject loginPageObj;
	CommonActions commonAction;
	public LoginPage(WebDriver driver)
	{
		loginPageObj = new LoginPageObject(driver);
		commonAction = new CommonActions(driver);
		this.driver = driver;
	}

	public void loginToApplication(String userName,String password)
	{
		commonAction.enterText(loginPageObj.getUserName, userName);
		commonAction.enterText(loginPageObj.getPassword(), password);
		commonAction.click(loginPageObj.getLoginButton());

	}
	public void verifyHomePage(String expectedPageTitle)
	{
		new WaitHelper(driver).pause(2);
		String actualPageTitle = driver.getTitle();
		new SoftAsserts().performSoftAssert(actualPageTitle, expectedPageTitle);
	}
	public void verifyErrorMessage(String message)
	{
		//new WaitHelper(driver).waitForElementToBeClickable(loginPageObj.getErrormessage(),10);
		new WaitHelper(driver).pause(2);
		 String actualMessage = loginPageObj.getErrormessage().getText();
		new SoftAsserts().performSoftAssert(actualMessage, message);
	}

}
