package com.sauceDemo.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{ 
	//1. WebDriver declared
	private WebDriver driver;
	
	//2. find the webelements
	//usrname
	@FindBy(xpath="(//input [@class = 'input_error form_input'])[1]")
	private WebElement userName;
	
	//password
	@FindBy(xpath="(//input [@class = 'input_error form_input'])[2]")
	private WebElement password;
	
	//loginButton
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	//create constructor
	public LoginPage(WebDriver driver)
	{
		//global        local
		 this.driver = driver; 
		 
		 //selenium class --> initElemets
		 PageFactory.initElements(driver, this);	
	}
	

	//action perform on elements
	public void sendUserName()
	{
	  userName.sendKeys("standard_user");
	}
	
	public void sendPassword()
	{
	  password.sendKeys("secret_sauce");
	}
	
	public void clickLoginButton()
	{
	   loginButton.click();
	}
	

	
	

}
