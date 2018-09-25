package com.actitime.testBase;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

public class TestBase {
	public static Properties properties=new Properties();
	public WebDriver driver;
	@BeforeClass
	public void intialization() throws IOException, InterruptedException
	{
		loadPropertiesFile();    
		browserSelection(properties.getProperty("browser"));
		driver.get(properties.getProperty("url"));
	}
	public void browserSelection(String browser)
	{
		if(browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\com\\actiTime\\webDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Open chrome browser");
		}
		else if(browser.contains("mozilla"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\com\\actiTime\\webDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Open Mozilla browser");
		}
		else if(browser.contains("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\java\\com\\actiTime\\webDrivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			System.out.println("Open InternetExploere browser");
		}
	}
	public void loadPropertiesFile() throws IOException
	{
		File file=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\actitime\\resources\\configuration.properties");
		FileInputStream fis=new FileInputStream(file);
		properties.load(fis);
	}

	/*@AfterClass
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
	 */
}
