package com.qa.sportyShoes.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.qa.sportyShoes.Pages.LoginPage;
import com.qa.sportyShoes.base.TestBase;
public class LoginPageTest extends TestBase {
	
	
	
	LoginPage lp;
	
	@Test(priority='1')
	public void start_browser()
	{
		openBrowser();
		lp = new LoginPage(driver);
	}
	
	public void test_user_login() throws InterruptedException
	{
		Thread.sleep(1000);
		lp.user_login();
	}
	
	public void test_validate_loginPage_url()
	{
		lp.validate_loginPage_url();
	
	}
	@AfterClass
	public void closebroser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}

}
