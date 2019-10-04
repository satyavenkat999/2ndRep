package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\POMPractice\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(fs);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() 
	{
		if ((prop.getProperty("browser")).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chrome76\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTime, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.implicitWaitTime, TimeUnit.SECONDS);
		
	}
	
}
