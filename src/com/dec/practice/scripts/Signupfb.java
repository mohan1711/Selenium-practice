package com.dec.practice.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signupfb 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement signup= driver.findElement(By.linkText("Create New Account"));

		signup.click();

		Thread.sleep(10000);

		WebElement f_name = driver.findElement(By.name("firstname"));

		f_name.sendKeys("Mohan Babu");

		WebElement l_name = driver.findElement(By.name("lastname"));

		l_name.sendKeys("Sathish");

		WebElement mail = driver.findElement(By.name("reg_email__"));

		mail.sendKeys("mohan@gmail.com");

		WebElement pwd = driver.findElement(By.name("reg_passwd__"));

		pwd.sendKeys("abcde12345");

		WebElement day = driver.findElement(By.id("day"));
		Select drop = new Select(day);
		drop.selectByValue("17");

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("11");

		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1995");
		
		WebElement sex = driver.findElement(By.xpath("//input[@id='u_e_5_xX']"));
		
		sex.click();

		Thread.sleep(5000);

		driver.close();
	}
}
