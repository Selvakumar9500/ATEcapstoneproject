package com.qa.sportyShoes.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.qa.sportyShoes.Pages.HomePage;
import com.qa.sportyShoes.base.TestBase;
public class HomepageTest extends TestBase {
	
	HomePage hp;
	
	@Test(priority='1')
	public void start_browser()
	{
		openBrowser();
		hp = new HomePage(driver);
	}
	
	
	
	@Test(priority='2')
	public void test_getURL_method()
	{
		hp.getURL_page();
	}
	
	
	@Test(priority='3')
	public void test_registerlink_method()
	{
		hp.Click_registerlink();
		String expectedURL = "http://localhost:9010/register";
		String RegisterPageURL = driver.getCurrentUrl();
		Assert.assertEquals(RegisterPageURL, expectedURL);
	}
	
	@AfterClass
	public void closebroser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}
	
	
	
}

