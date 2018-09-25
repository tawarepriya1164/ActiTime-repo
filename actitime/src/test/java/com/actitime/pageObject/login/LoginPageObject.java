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

  
  @FindBy(name = "pwd") 
  private WebElement password;
  
  @FindBy(id = "keepLoggedInCheckBox")
  private WebElement keepMeChkBox;
  
  @FindBy(id = "loginButton")
  private WebElement loginButton;
  
  @FindBy(xpath = "//span[@class = 'errormsg']")
  private WebElement errormessage;

/*public WebElement getUserName() {
	return userName;*/


public WebElement getPassword() {
	return password;
}

public WebElement getKeepMeChkBox() {
	return keepMeChkBox;
}

public WebElement getLoginButton() {
	return loginButton;
}

public WebElement getErrormessage() {
	return errormessage;
}
	


	
}




