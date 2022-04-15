package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
//	WebDriver driver;
	
	public void onTestStart( ITestResult result)
	{
		System.out.println("Execution is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("TestCase is successfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("TestCase is failed and hence taking screenshot");	
		
	}

}
