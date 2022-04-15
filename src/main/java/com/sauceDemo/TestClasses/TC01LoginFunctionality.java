package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePage;



public class TC01LoginFunctionality extends TestBaseClass
{
	
 	@Test(priority=1)
 	public void verifyLoginFunctionality() 
 	{
        String expectedHomePageUrl = "://www.saucedemo.com/inventory.html";
 		
 		String actualHomePageUrl = driver.getCurrentUrl();
 	    
 		log.info("Apply the assertions");
 		Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl);
 		log.info("Checking the results");
 		
 		HomePage hp = new HomePage(driver);
 		hp.clickMenuButton();
 		log.info("Clicked on menu button");
 		
 		hp.clickOnLogOut();
 		log.info("Clicked on logout button");
 		
 		
 	}
 	
 	
 		
		
}


