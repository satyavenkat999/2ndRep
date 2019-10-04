package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement txtUserName;
	
	@FindBy(name = "password")
	WebElement txtPassWord;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement btnSubmit;
	
	public String validateTitle() {
		return driver.getTitle();  
	}
	
	public void login() 
	{
		
		txtUserName.sendKeys(prop.getProperty("username"));
		txtPassWord.sendKeys(prop.getProperty("password"));
	}
	
}
