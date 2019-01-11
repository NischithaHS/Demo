package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class LoginTest extends TestBase{

	 LoginPage loginPage;
	
	public LoginTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		initialization();
		 loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
	String title=loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public HomePage loginTest() throws InterruptedException {
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		return new HomePage();
	    
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
