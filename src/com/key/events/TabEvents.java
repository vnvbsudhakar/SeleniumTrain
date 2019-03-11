package com.key.events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/SeleniumDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://en-gb.facebook.com/login/";
		driver.get(baseURL);
		driver.findElement(By.name("email")).sendKeys("javaselenium");
		String enteredValue = driver.findElement(By.name("email")).getAttribute("value");
		System.out.println("entered value is:::   " + enteredValue);
		int len = enteredValue.length();
		System.out.println(len);
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+ "a");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+ "c");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+ "v");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+ "v");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL, "v");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL, "v");
		
		Thread.sleep(3000);
		
		
		

	}

}
