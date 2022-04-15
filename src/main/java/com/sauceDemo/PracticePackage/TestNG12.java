package com.sauceDemo.PracticePackage;

import org.testng.annotations.Test;


public class TestNG12 
{
	@Test(timeOut =2000)
	public void blogin() throws InterruptedException
	{
		System.out.println("login");
		Thread.sleep(5000);
	}

}
