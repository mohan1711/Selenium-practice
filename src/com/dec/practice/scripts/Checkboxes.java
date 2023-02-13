package com.dec.practice.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		// [1] Select specific check box
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

		System.out.println("The total checkboxes are"+" "+checkbox.size());
		
		/* [2] Select all check box
		
		for (int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
			Thread.sleep(2000);
		}*/

		
		/* [3] Using for each loop

		for(WebElement check:checkbox)
		{
			check.click();
			Thread.sleep(2000);
		}	*/

		
		// [4] By choice select the check box

		/* for(WebElement box:checkbox)
		{
			String choiceday = box.getAttribute("id");
			
			if(choiceday.equals("Monday"))
			{
				box.click();
			}
		} */
		
		// [5] Select last two check box  // 0  1  2  3  4  5  6
		
		int totalbox = checkbox.size();
		
		/*for ( int i=totalbox-2;i<totalbox;i++)
		{
			checkbox.get(i).click();
		}*/	
		
		for ( int i=0;i<totalbox;i++)
		{
			if(i<2)
			{
				checkbox.get(i).click();
			}
		}
	}
}
