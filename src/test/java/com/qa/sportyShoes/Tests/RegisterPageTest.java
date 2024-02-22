package com.qa.sportyShoes.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.sportyShoes.Pages.HomePage;
import com.qa.sportyShoes.Pages.RegisterPage;
import com.qa.sportyShoes.base.TestBase;

public class RegisterPageTest extends TestBase{
	
	HomePage hp;
	RegisterPage rp;
	
	
	@BeforeClass
	public void OpenBrowser()
	{
		openBrowser();

		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		
	}
	
	@Test(priority='1')
	public void test_click_registerLink() throws InterruptedException
	{
		Thread.sleep(1500);
		hp.Click_registerlink();
	}
	
	@Test(priority='2')
	public void test_register_user()
	{
		rp.register_user();
	}
	
	@Test(priority='3')
	public void test_newUser_url()
	{
		rp.validate_url();
	}
	
	@AfterClass
	public void closebroser() throws InterruptedException
	
	{
		Thread.sleep(1000);
		driver.close();
	}

}

