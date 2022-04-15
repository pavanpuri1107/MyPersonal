package com.sauceDemo.PracticePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 
{
	@BeforeMethod
	public void setUpMethod()
	{
		System.out.println("set up done");
	}
	
	
	//1
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	
	//2
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	//3
	
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	//4
	
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
	
	@AfterMethod
	public void tearDownMethod()
	{
		System.out.println("tearr down is done");
	}
	
	
	
	
	

}
