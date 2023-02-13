package com.dec.practice.scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo-opencart.com");	

		//Full page screenshot
		/*TakesScreenshot take =driver;
		File src= take.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\home.png");
		FileHandler.copy(src, trg);
		driver.close();*/

		//Section of the page
		/*WebElement section = driver.findElement(By.xpath("//div[@id='content']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\Features.png");
		FileHandler.copy(src, trg);
		driver.close();*/

		//Section of the page
		WebElement element = driver.findElement(By.xpath("//img[@title='Your Store']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\element.png");
		FileHandler.copy(src, trg);
		driver.close();
		
	}
}
