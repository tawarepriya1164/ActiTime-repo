package com.actitime.test.users;

import org.testng.annotations.Test;

import com.actitime.pages.login.LoginPage;
import com.actitime.pages.users.AddUserPage;
import com.actitime.testBase.TestBase;

public class AddUserTest extends TestBase{
	@Test
	public void TC_01()
	{
		new LoginPage(driver).loginToApplication(properties.getProperty("userName"), properties.getProperty("password"));
		new AddUserPage(driver).clickOnUserTab();
	}
	@Test
	public void TC_02()
	{
		new AddUserPage(driver).addUserBtn();
		new AddUserPage(driver).blankField();
		new AddUserPage(driver).verifyErrorMessage("Please correct all errors in the fields highlighted in red");
	}
	@Test
	public void TC_03()
	{
		new AddUserPage(driver).addAccountINformation("Meera", "D", "Sharma", "meera@gmail.com", "Meera", "meera@123", "meera@123");
	}
	@Test
	public void TC_04()
	{
		new AddUserPage(driver).selectTimeZonegroup("Default Time Zone Group");
	}
   /*@Test
   public void TC_05()
   {
	   new AddUserPage(driver).handleCalender();
   }*/
}
