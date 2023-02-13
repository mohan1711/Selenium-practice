package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));

		Actions act = new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
	}
}
