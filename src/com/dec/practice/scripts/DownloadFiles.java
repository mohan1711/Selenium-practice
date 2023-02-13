package com.dec.practice.scripts;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFiles 
{
	public static void main(String[] args) 
	{
		String location = System.getProperty("user.dir")+"\\downloads";
		
		//storage of downloads in preferred location in same project
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", preferences);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");

		
		//default location storage
		//driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
	}
}
