package com.sauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG7 
{
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void verifyLogin()
	{
		//example for soft assertion
		//s1
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
	    String actaulUrl = "ABC";
	    soft.assertEquals(actaulUrl, expectedUrl, "url not matched");  //fail
	    
	    //s2
	    String expectedTitle = "SauceDemo";
	    String actualTitle = "SauceDemo";
	    soft.assertEquals(actualTitle, expectedTitle, "title not matched");  //pass
	   
	    soft.assertAll();
	}
	
	@Test
	public void verifyProduct()
	{
		String expectedTitle = "BagPack";
		String actualTitle = "Pack";
		soft.assertEquals(actualTitle, expectedTitle, "product title not matched");  //pass
		
		soft.assertAll();
	}
	
	@Test
	public void sampleTest()
	{
		int a = 50;
		int b = 60;
		
		Assert.assertTrue(a<=b);
	}
	
	
	

}
