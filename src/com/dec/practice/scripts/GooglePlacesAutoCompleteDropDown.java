package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePlacesAutoCompleteDropDown 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.twoplugs.com/");

		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

		WebElement search = driver.findElement(By.id("autocomplete"));

		search.clear();
		Thread.sleep(3000);

		search.sendKeys("India");
		Thread.sleep(3000);

		String text;

		do
		{
			search.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text = search.getAttribute("value");

			if(text.equals("India Gate, New Delhi, Delhi, India"))
			{
				search.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}
		while(!text.isEmpty());

		driver.findElement(By.xpath("//button[@class='btn btn-filter']")).click();
	}
}






