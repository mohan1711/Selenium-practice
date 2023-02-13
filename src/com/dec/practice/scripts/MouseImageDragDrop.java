package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseImageDragDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement item1 = driver.findElement(By.xpath("//li[1]"));
		WebElement item2 = driver.findElement(By.xpath("//li[2]"));
		WebElement target = driver.findElement(By.id("trash"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(item1, target).perform();
		act.dragAndDrop(item2, target).perform();
	
	}
}
