package com.dec.practice.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsJS 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// [1] Handling single ok button alert on the Click on JS Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();;
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		// [2] Alert window with ok and cancel button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();;
		Thread.sleep(3000);
		//driver.switchTo().alert().accept(); //OK
		driver.switchTo().alert().dismiss(); //CANCEL */
		
		//Alert window with text and text box with ok or cancel
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();;
		Alert alert_box = driver.switchTo().alert();
		System.out.println("The text in the alert box"+" "+alert_box.getText());
		Thread.sleep(3000);
		alert_box.sendKeys("Welcome");
		Thread.sleep(3000);
		alert_box.accept();
			
	}

}
