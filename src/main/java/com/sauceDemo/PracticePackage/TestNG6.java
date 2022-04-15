package com.sauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNG6 
{
	@Test
	public void verifyLogin()
	{
		//example for Hard assertion
		//s1
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
	    String actaulUrl = "ABC";
	    Assert.assertEquals(actaulUrl, expectedUrl);  //fail
	    
	    //s2
	    String expectedTitle = "SauceDemo";
	    String actualTitle = "SauceDemo";
	    Assert.assertEquals(actualTitle, expectedTitle);  //pass  
	}
	
	@Test
	public void verifyProduct()
	{
		String expectedTitle = "BagPack";
		String actualTitle = "BagPack";
		
		Assert.assertEquals(actualTitle, expectedTitle);  
		
	}
	
	
	
	
	

}
