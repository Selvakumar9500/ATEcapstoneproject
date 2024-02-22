package com.qa.sportyShoes.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBase {
	
	
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:9010/");
	}
	
	public void closebrowser()
	{
		driver.close();
	}
}
