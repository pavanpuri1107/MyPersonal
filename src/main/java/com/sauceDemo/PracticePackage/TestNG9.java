package com.sauceDemo.PracticePackage;

import org.testng.annotations.Test;

public class TestNG9 
{
	@Test(invocationCount =5, priority=1)
	public void testA()
	{
		System.out.println("TestA");
	}

	@Test(invocationCount =2)
	public void testB()
	{
		System.out.println("TestB");
	}
	
	@Test(invocationCount=0)
	public void testC()
	{
		System.out.println("TestC");
	}
	
	@Test
	public void testD()
	{
		System.out.println("TestD");
	}
	
	@Test
	public void testE()
	{
		System.out.println("TestE");
	}

}
