package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// To find no of rows in table
		int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("The number of rows are"+rows);

		// To find no of columns in table
		int columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("The number of columns are"+columns);

		// Select Value in second row and first column i.e, Centro comercial Moctezuma
		//String value = driver.findElement(By.xpath("//td[text()='Centro comercial Moctezuma']")).getText();
		String value = driver.findElement(By.xpath("//table[@id='customers']//tr[3]/td[1]")).getText();
		System.out.println("Value in second row and first column"+value);

		// Get all the values from the table

		/*for (int r=2;r<rows;r++)
		{
			for (int c=1;c<columns;c++)
			{
				String allvalue = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(allvalue+"    ");
			}
			System.out.println();
		}*/

		//Extract specific value from table
		
		for (int r=2;r<rows;r++)
		{
			String allvalue = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[1]")).getText();
			
			if(allvalue.equals("Island Trading"))
			{
				String ans1 = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[2]")).getText();
				String ans2 = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[3]")).getText();
				System.out.println(allvalue + ans1 + ans2);
			}
		}
		
		
		
		
		
	}
}
