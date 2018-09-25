package com.actitime.utility.autoHelper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {
	/*WebDriver driver;
	
	public DropDownHelper(WebDriver driver)
	{
		this.driver=driver;
	}
*/	public void selectByValue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void selectByIndex(WebElement element,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectByValue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void deselectByIndex(WebElement element,int index)
	{
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void deselectByVisibleTex(WebElement element,String text)
	{
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	public void deselectAll(WebElement element)
	{
		Select select = new Select(element);
		select.deselectAll();
	}
	public void isMutiple(WebElement element)
	{
		Select select = new Select(element);
		select.isMultiple();
	}


}
