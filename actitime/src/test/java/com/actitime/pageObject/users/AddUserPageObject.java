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
	@FindBy(xpath = "//a[@class = 'content users']") public WebElement getUserTab;

	@FindBy(xpath = "//div[@class = 'addUserButton beigeButton useNativeActive']") public WebElement getAddUserBtn; 

	@FindBy(name = "firstName") public WebElement getFirstName; 

	@FindBy(name = "middleName") public WebElement getMiddleName;

	@FindBy(name = "lastName") public WebElement getLastName;

	@FindBy(name = "email") public WebElement getEmail;

	@FindBy(name = "username") public WebElement getUserName;

	@FindBy(name = "password") public WebElement getPassword;

	@FindBy(name = "passwordCopy") public WebElement getRetypePassword;

	@FindBy(id = "userDataLightBox_commitBtn") public WebElement getCreateUser;

	@FindBy(xpath = "//span[@class = 'errormsg']") public WebElement getErrorMsg;

	@FindBy(id = "userDataLightBox_timeZoneGroupValueCell") public WebElement getTimeZonegroupdropdown;

}
