package com.actitime.utility.autoHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
	WebDriver driver;
	public CommonActions(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterText(WebElement element,String value)
	{
		new WaitHelper(driver).waitForElementToBeVisible(element, 10);
		element.sendKeys(value);
		//driver.findElement(By.id("userName")).sendKeys("admin");
	}
	public void click(WebElement element)
	{
		new WaitHelper(driver).waitForElementToBeClickable(element,10);
		element.click();
	}
	public boolean elementIsDisplayed(WebElement element)
	{ 
		try {
			element.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	/*public String getPageTitle(WebElement element)
	{
	return element
	*/}


