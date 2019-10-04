package com.crm.qa.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void LoginPageTitleTest() {
		String actTitle = loginPage.validateTitle();
		Assert.assertEquals(actTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
