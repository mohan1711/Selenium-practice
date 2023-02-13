package com.dec.practice.scripts;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoURLinTwoTabs 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.TAB); //New Tab 
		driver.switchTo().newWindow(WindowType.WINDOW); //New Window
		driver.get("https://www.opencart.com/");
	}
}
