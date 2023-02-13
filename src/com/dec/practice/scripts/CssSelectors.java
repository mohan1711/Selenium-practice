package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//By Tag and id combination
		//driver.findElement(By.cssSelector("input#email")).sendKeys("MohanBabu");
		//driver.findElement(By.cssSelector("#email")).sendKeys("MohanBabu");
		
		//By Tag and class combination
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("MohanBabu");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("MohanBabu");
				
		//By Tag and Attribute
		//driver.findElement(By.cssSelector("[aria-label=Password]")).sendKeys("mohan@amail.com");
		//driver.findElement(By.cssSelector("[name=pass]")).sendKeys("mohan@amail.com");
		
		//By using tag and class and attribute
		//driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("mohan");
		driver.findElement(By.cssSelector("input.inputtext[aria-label=Password]")).sendKeys("mohan");
		//driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("123**");
	}

}
