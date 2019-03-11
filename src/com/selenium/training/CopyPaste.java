package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/advanced_search");
		driver.findElement(By.id("xX4UFf")).sendKeys("JavaSelenium");
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.TAB);
		

	}

}
