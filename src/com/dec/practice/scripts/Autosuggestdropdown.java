package com.dec.practice.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdropdown 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.bing.com/");

		Thread.sleep(10000);

		driver.findElement(By.id("sb_form_q")).sendKeys("testing");

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));

		Thread.sleep(5000);

		System.out.println("The options displayed are"+options.size());

		for ( WebElement list : options)
		{
			if(list.getText().equals("testing tools"))
			{
				list.click();
				break;
			}
		}

	}

}
