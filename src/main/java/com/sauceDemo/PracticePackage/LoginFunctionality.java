package com.sauceDemo.PracticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(com.sauceDemo.UtilityClasses.Listener.class)
public class LoginFunctionality 
{
//	@Test
//	public void verifyURL()
//	{
//		System.out.println("Verifying URL");
//		Assert.assertTrue(true);
//	}
//	
//	@Test
//	public void verifyTitle()
//	{
//		System.out.println("Verifying Title");
//		Assert.assertTrue(false);
//	}
	
	
	
	@Test
	public void verifyGoogleTitle()
	{
		System.setProperty("webdriver.chrome.driver", 
 				"./drivers//chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		
		String expectedURL = "://www.saucedemo.com/";
		
		String actaulURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actaulURL, expectedURL, "title ot matched");
		
	}
	
	

}
