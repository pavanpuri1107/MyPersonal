package com.sauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNG5 
{
	@Test
	public void verifyLogin()
	{
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
	    String actualUrl   = "https://www.saucedemo.com/inventory.html";
	
	    Assert.assertEquals(actualUrl, expectedUrl);
	}

}
