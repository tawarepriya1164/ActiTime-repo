package com.actitime.utility.autoHelper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	WebDriver driver;
	public WaitHelper(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setImplicitWait(long timeout , TimeUnit unit)
	{
		driver.manage().timeouts().implicitlyWait(timeout, unit);
	}
	public void pause(int timeout )
	{
		try {
			Thread.sleep(timeout*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void waitForElementToBeVisible(WebElement locator , long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	public void waitForElementToBeInVisible(WebElement locator , long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.invisibilityOf(locator));
	}
	public void waitForElementToBeClickable(WebElement locator , long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void waitForElementToBeSelected(WebElement locator , long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeSelected(locator));
	}
	/*public void waitForElementToBeDisplayed(WebElement locator , long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.);
	}
	*/
} 







