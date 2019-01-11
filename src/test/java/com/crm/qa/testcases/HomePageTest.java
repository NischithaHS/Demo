package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	//create constructor of Home Page Test
	public HomePageTest() {
		super();
	}
	
	//test cases should be separate
	//before each test case, launch the browser and login
	//@Test:execute the test cases 
	//close the browser
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		//call initialization method from Test Base class
		initialization();
		testUtil=new TestUtil();
		//create an object to Login into Application
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
    @Test(priority=1)
    public void verifyHomePageTitleTest() {
    	String HomePagetitle=homePage.verifyHomePageTitle();
    	Assert.assertEquals(HomePagetitle,"CRMPRO","HomePage doesnt matches");
    }
    @Test(priority=2)
    public void verifyUsernameTest() {
    	testUtil.switchToFrame();
    	Assert.assertTrue(homePage.verifyCorrectUserName());
    }
    
    @Test(priority=3)
    public void verifyContactsLinkTest() {
    	testUtil.switchToFrame();
    	homePage.clickOnContactsLink();
    }
	 
    @AfterMethod
    public void TearDown() {
    	driver.close();
    }
    
}
