package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://www.hackerrank.com/";
		driver.get(baseURL);
		
		
		driver.findElement(By.linkText("Sign Up")).click(); //linktext
		driver.findElement(By.xpath("//span[text()='Sign Up & Code']")).click();
		driver.findElement(By.id("input-1")).sendKeys("seleniumjava"); //First and last name
		driver.findElement(By.name("email")).sendKeys("vnvbsudhakar@gmail.com");
		driver.findElement(By.xpath("//input[@type='password' and @placeholder='Your password']")).sendKeys("123456789");
		driver.findElement(By.partialLinkText("Log ")).click();
		
		
		//xpath for sign up and code
		//id for input and password
		//name email
		//partial link in "Log "
		
		
		
		

	}

}
