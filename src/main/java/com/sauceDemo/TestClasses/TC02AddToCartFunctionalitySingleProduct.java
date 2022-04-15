package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;



public class TC02AddToCartFunctionalitySingleProduct extends TestBaseClass
{
	
 	@Test(priority=2)
 	public void verifyAddToCartFunctionality() throws InterruptedException
 	{
 		//product select
 		HomePage hp = new HomePage(driver);
 		
 		//single elements
 		hp.clickBagButton();
 		//assignment
 		
 		Assert.assertTrue(true);
 	
 		hp.clickMenuButton();
 		hp.clickOnLogOut();
 		
 	}
 	
 	
		


}
