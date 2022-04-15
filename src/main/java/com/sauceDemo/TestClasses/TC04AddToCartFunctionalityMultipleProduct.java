package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;



public class TC04AddToCartFunctionalityMultipleProduct extends TestBaseClass
{
    
 	@Test
 	public void verifyAddToCartFunctionalityMultipleProduct() throws InterruptedException 
 	{	
 		
 		//product select
 		HomePage hp = new HomePage(driver);
 		
 		//all products
 		hp.addToCart();
 		
 		Assert.assertTrue(false);
	}
 	
 	

}
