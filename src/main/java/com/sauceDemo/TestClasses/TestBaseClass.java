package com.sauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.LoginPage;

public class TestBaseClass 
{
	WebDriver driver;      //declare only -gloabally
	Logger log;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUpMethod(String browserName)
	{
		log = Logger.getLogger("SauceDemo08JanV1");
		PropertyConfigurator.configure("log4j.properties");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
	 				"D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver =  new ChromeDriver();        //initialize
			log.info("Chrome browser is opened");
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
	 				"D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material\\Downloads\\chromedriver_win32\\geckodriver.exe");
			driver =  new FirefoxDriver();        //initialize	
			log.info("Firefox browser is opened");
		}
		
		else
		{
			System.out.println("show the eror");
		}
		
			
		driver.manage().window().maximize();
 		driver.get("https://www.saucedemo.com/");
 		log.info("URL is opened");
 	
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		
 		//login to page
 		LoginPage lp = new LoginPage(driver);
 		lp.sendUserName();
 		log.info("Username Entered");
 		
 		lp.sendPassword();
 		log.info("Password Entered");
 		
 		lp.clickLoginButton();
 		log.info("Login button is clicked ");
       }
	
	
	
	@AfterMethod
 	public void tearDownMethod() throws Throwable
 	{
 		driver.quit();
 		log.info("Browser is closed");
 		finalize();
 	}
	

}
