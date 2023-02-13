package com.dec.practice.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title 
{
	public static void main(String[] args)
	{
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		/*String title = driver.getTitle();
		
		System.out.println("The title of the page is"+title);
		
		driver.close();*/
		
		List<WebElement> footer = driver.findElements(By.xpath("//div[@class='_95ke _8opy']//a"));
		
		System.out.println(footer.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
