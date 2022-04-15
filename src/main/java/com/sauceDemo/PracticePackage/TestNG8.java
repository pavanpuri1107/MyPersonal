package com.sauceDemo.PracticePackage;

import org.testng.annotations.Test;

public class TestNG8 
{
	@Test(priority=-1)
	public void testA()
	{
		System.out.println("TestA");
	}

	@Test(priority=0)
	public void testB()
	{
		System.out.println("TestB");
	}
	
	@Test(priority=1)
	public void testC()
	{
		System.out.println("TestC");
	}
	
	@Test(priority=1)
	public void testD()
	{
		System.out.println("TestD");
	}
	
	@Test(priority=3)
	public void testE()
	{
		System.out.println("TestE");
	}
}
