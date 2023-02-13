package com.dec.practice.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		Thread.sleep(5000);
		driver.findElement(By.id("departon")).click();;
		
		Thread.sleep(5000);
		Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Nov");
		
		Thread.sleep(5000);
		Select year = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		year.selectByVisibleText("2024");
		
		String mydate = "09";

		List<WebElement> dt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		Thread.sleep(5000);
		for (WebElement ele:dt)
		{
			String date = ele.getText();
			
			if(date.equals(mydate))
			{
				ele.click();
				break;
			}
		}
	}
}
