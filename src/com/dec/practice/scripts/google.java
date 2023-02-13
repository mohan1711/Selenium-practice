package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google 
{
	public static void main(String[] args) throws Exception 
	{
		//Launching the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing chrome browser
		driver.manage().window().maximize();
		
		//Launch facebook
		driver.get("https://www.facebook.com/");
		
		//search for email or phone text box
		WebElement enter_mail = driver.findElement(By.name("email"));
		
		enter_mail.click();
		
		Thread.sleep(3000);
		
		enter_mail.sendKeys("mohan1711blue@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.click();
		
		Thread.sleep(3000);
		
		password.sendKeys("abcde123**");
		
		WebElement log = driver.findElement(By.name("login"));
		
		log.click();
	}
}
