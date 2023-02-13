package com.dec.practice.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ksrtc.in/");

		WebElement search = driver.findElement(By.name("toPlaceName"));

		search.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();
		
		Thread.sleep(3000);

		WebElement leave = driver.findElement(By.name("fromPlaceName"));

		leave.click();

		leave.sendKeys("Bengaluru");
		
		driver.close();

	}
}



