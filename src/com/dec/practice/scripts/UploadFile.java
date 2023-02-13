package com.dec.practice.scripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();;
		Thread.sleep(3000);
		
		//Using Send Keys
		//driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\com\\Downloads\\Resumes dump\\Mohan_Kodnest_Resume.pdf");

		//Using Robot Class Methods
		WebElement button = driver.findElement(By.id("file-upload"));
		JavascriptExecutor js =driver;
		js.executeScript("arguments[0].click();", button);
		
		//Copy the path > CTRL+V > Enter
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//Put path to file in clipboard
		StringSelection ss = new StringSelection("C:\\Users\\com\\Downloads\\Resumes dump\\Mohan_Kodnest_Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTRL + V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);	
	}
}
