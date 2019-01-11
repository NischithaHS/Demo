package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='input-group-btn']/*")
	WebElement loginbtn;
	
	//initializing the page objects
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public HomePage login(String un, String pswrd) throws InterruptedException
	{
		username.sendKeys(un);
		password.sendKeys(pswrd);
		loginbtn.click();
		Thread.sleep(2000);
		return new HomePage();
		
	}
	
	
	
	
	
	
	
	
	
}
