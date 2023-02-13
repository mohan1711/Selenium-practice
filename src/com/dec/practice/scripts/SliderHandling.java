package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("Before Location"+" "+min_slider.getLocation()); //Location (59, 250)
		System.out.println("Before Size"+" "+min_slider.getSize()); //Size (21, 21)
		
		Actions act1 = new Actions(driver);
		act1.dragAndDropBy(min_slider, 140, 250).perform();
		
		System.out.println("After Location"+" "+min_slider.getLocation()); 
		System.out.println("After Size"+" "+min_slider.getSize());
		
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("Before Location"+" "+max_slider.getLocation()); //Location (510, 250)
		System.out.println("Before Size"+" "+max_slider.getSize()); //Size (21, 21)
		
		Actions act2 = new Actions(driver);
		act2.dragAndDropBy(max_slider, -100, 250).perform();
		
		System.out.println("After Location"+" "+max_slider.getLocation()); 
		System.out.println("After Size"+" "+max_slider.getSize());

	}
}
