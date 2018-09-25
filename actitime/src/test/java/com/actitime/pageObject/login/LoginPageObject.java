package com.actitime.pageObject.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username") public WebElement getUserName;


	@FindBy(name = "pwd") public WebElement getPassword;

	@FindBy(id = "keepLoggedInCheckBox") public WebElement getKeepMeChkBox;

	@FindBy(id = "loginButton") public WebElement getLoginButton;

	@FindBy(xpath = "//span[@class = 'errormsg']") public WebElement getErrormessage;

}






