package com.sauceDemo.PracticePackage;

import org.testng.annotations.Test;

public class TestNG10 
{
	@Test(enabled=false)
	public void testA()
	{
		System.out.println("TestA");
	}

	@Test()
	public void testB()
	{
		System.out.println("TestB");
	}

}
