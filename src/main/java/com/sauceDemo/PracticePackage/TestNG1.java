package com.sauceDemo.PracticePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 
{
	//pre conditions
	
	@BeforeMethod
	public void setUpMethod()
	{
		System.out.println("1. broswer open-url open-login done");
	}

	
	
	//test scenario
	
	@Test
	public void verifyLoginFunctionality()
	{
		System.out.println("2. test case is passed");
	}
	
	
	
		//post conditions
		
			@AfterMethod
			public void tearDownMethod()
			{
				System.out.println("3. logout done- url and browser close");
			}
	

}
