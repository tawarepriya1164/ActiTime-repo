package com.actitime.pageObject.users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPageObject {
	public AddUserPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath = "//a[@class = 'content users']")
	 private WebElement user;
	 
	 @FindBy(xpath = "//div[@class = 'addUserButton beigeButton useNativeActive']")
	 private WebElement addUserBtn;
	 
	 @FindBy(name = "firstName")
	 private WebElement firstName; 
	 
	 @FindBy(name = "middleName")
     private WebElement middleName;
	 
	@FindBy(name = "lastName")
	private WebElement lastName;
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(name = "username")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "passwordCopy")
	private WebElement retypePassword;
	
	@FindBy(id = "userDataLightBox_commitBtn")
	private WebElement createUser;
	
	@FindBy(xpath = "//span[@class = 'errormsg']")
	private WebElement errorMsg;
	
	@FindBy(id = "userDataLightBox_timeZoneGroupValueCell")
	private WebElement timeZonegroupdropdown;
	
	@FindBy(id = "ext-gen110")
	private WebElement calender;
	
	public WebElement getUserTab() {
		return user;
	}

	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRetypePassword() {
		return retypePassword;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getTimeZonegroupdropdown() {
		return timeZonegroupdropdown;
	}

}
