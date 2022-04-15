package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

	public static void takeScreenshot1(WebDriver driver) throws IOException 
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourceFile = t.getScreenshotAs(OutputType.FILE);
	    File destFile =  new File("D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material"
	    		         + "\\JANBatch\\AutoNotesJanBatch\\LoginPage.jpg");
		FileHandler.copy(sourceFile, destFile);
		
	}

}
