package com.dec.practice.scripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/com/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		Set<Cookie> cookie= driver.manage().getCookies();
		//Get size and name and value of cookie
		System.out.println("The size of Cookies"+cookie.size());

		for(Cookie cookies:cookie)
		{
			System.out.println(cookies.getName());
			System.out.println(cookies.getValue());
		}

		// Add cookie to browser
		Cookie object = new Cookie("MyCookie","1234");
		driver.manage().addCookie(object);

		//check cookie now after adding
		cookie = driver.manage().getCookies();
		System.out.println("The size of Cookies after adding mycookie"+cookie.size());

		//Delete object cookie method 1
		//driver.manage().deleteCookie(object);

		//check cookie after deleting 
		//cookie = driver.manage().getCookies();
		//System.out.println("The size of Cookies after deleting mycookie"+cookie.size());

		//delete by named method (method 2)
		//driver.manage().deleteCookieNamed("MyCookie");

		//check cookie after deleting
		//cookie = driver.manage().getCookies();
		//System.out.println("The size of Cookies after deleting mycookie"+cookie.size());

		//Delete all cookies
		driver.manage().deleteAllCookies();

		//check cookie after deleting
		cookie = driver.manage().getCookies();
		System.out.println("The size of Cookies after deleting all cookie"+cookie.size());


	}
}
