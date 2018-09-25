package com.actitime.pages.users;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.actitime.pageObject.users.AddUserPageObject;
import com.actitime.utility.autoHelper.CommonActions;
import com.actitime.utility.autoHelper.DropDownHelper;
import com.actitime.utility.autoHelper.SoftAsserts;
import com.actitime.utility.autoHelper.WaitHelper;

public class AddUserPage {
	WebDriver driver;
	CommonActions commonAction;
	AddUserPageObject addUserPageObject;
	JavascriptExecutor js; 
	DropDownHelper dropdownHelper;
	public AddUserPage(WebDriver driver)
	{
		addUserPageObject = new AddUserPageObject(driver);
		commonAction = new CommonActions(driver);
		js = (JavascriptExecutor) driver; 
		//dropdownHelper = new DropDownHelper(null, driver);
		this.driver = driver;
	}
	public void clickOnUserTab()
	{  
		new WaitHelper(driver).pause(2);	
		commonAction.click(addUserPageObject.getUserTab());
	}
	public void addUserBtn()
	{
		new WaitHelper(driver).pause(2);
		commonAction.click(addUserPageObject.getAddUserBtn());
	}
	public void blankField()
	{
		new WaitHelper(driver).pause(2);
		js.executeScript("scrollBy(0,1000)");
		commonAction.click(addUserPageObject.getCreateUser());
	}
	public void verifyErrorMessage(String message)
	{
		//new WaitHelper(driver).waitForElementToBeClickable(loginPageObj.getErrormessage(),10);
		new WaitHelper(driver).pause(2);
		String actualMessage = addUserPageObject.getErrorMsg().getText();
		new SoftAsserts().performSoftAssert(actualMessage, message);
	}
	public void addAccountINformation(String firstName,String middleName,String lastName,String email,String userName,String password,String retypePassword)
	{
		commonAction.enterText(addUserPageObject.getFirstName(), firstName);
		commonAction.enterText(addUserPageObject.getMiddleName(), middleName);
		commonAction.enterText(addUserPageObject.getLastName(), lastName);
		commonAction.enterText(addUserPageObject.getEmail(), email);
		commonAction.enterText(addUserPageObject.getUserName(), userName);
		commonAction.enterText(addUserPageObject.getPassword(), password);
		commonAction.enterText(addUserPageObject.getRetypePassword(), retypePassword);
	}
	public void selectTimeZonegroup(String text)
	{
		new WaitHelper(driver).pause(2);
		driver.findElement(By.id("userDataLightBox_timeZoneGroupValueCell")).click();
		                         
		driver.findElement(By.xpath("//li//div[@title='"+text+"']")).click();
		new WaitHelper(driver).pause(2);
	}

	public void handleCalender()
	{
		commonAction.click(addUserPageObject.getCalender());
	}

}
