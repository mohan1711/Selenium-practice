package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://getbootstrap.com/docs/5.3/components/dropdowns/");
		
		Thread.sleep(10000);
		
		WebElement drop = driver.findElement(By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		
		drop.click();
		
		/*List<WebElement> drop = driver.findElements(By.xpath("//div[@class='dropdown open']//ul[@role='menu']/li"));
		
		System.out.println("No of elements in dropdown"+drop);
		
		for(WebElement dropdown:drop)
		{
			if(dropdown.getText().equals("CSS"))
			{
				dropdown.click();
				break;
			}
		}*/

	}

}
