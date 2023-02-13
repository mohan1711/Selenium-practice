package com.dec.practice.scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenicatedPopups 
{
	public static void main(String[] args) 
	{
		//Permission based pop ups
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifictions");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();

		//driver.get("https://the-internet.herokuapp.com/basic_auth");

		// when opened the link you are asked to login first,
		// SYNTAX = https://user:admin@url
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
