package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocation 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");

		WebElement logo = driver.findElement(By.xpath("//img[@src='application/view/image/home/shop-showcase.png']"));

		System.out.println("The location of the logo is"+logo.getLocation());
		System.out.println("The x axis of the logo is"+logo.getLocation().getX());
		System.out.println("The y axis of the logo is"+logo.getLocation().getY());
		System.out.println("The size of the logo is"+logo.getSize());
		System.out.println("The height of the logo is"+logo.getSize().getHeight());
		System.out.println("The width of the logo is"+logo.getSize().getWidth());

		/*The location of the logo is(655, 1586)
		The x axis of the logo is655
		The y axis of the logo is1586
		The size of the logo is(538, 571)
		The height of the logo is571
		The width of the logo is538*/
	}

}
