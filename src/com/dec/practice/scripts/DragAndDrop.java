package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement rome_source = driver.findElement(By.id("box6"));
		WebElement italy_target = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(rome_source, italy_target).perform(); // Drag and drop
	}
}
