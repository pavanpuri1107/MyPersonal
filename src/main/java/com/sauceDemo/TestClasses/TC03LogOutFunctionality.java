package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;



public class TC03LogOutFunctionality extends TestBaseClass
{
	
 	@Test(priority=3)
 	public void verifyLogOutFunctionality()
 	{	
 		//homepage object
 		HomePage hp = new HomePage(driver);
 		hp.clickMenuButton();
 		hp.clickOnLogOut();
 		
 		String expectedTitle = "Swag Labs";
 		String actualTitle = driver.getTitle();
 		
 		Assert.assertEquals(actualTitle, expectedTitle);
 	}
 	
 		
 		
	

}
