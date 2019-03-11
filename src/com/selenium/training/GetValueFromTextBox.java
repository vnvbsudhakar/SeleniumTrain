package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValueFromTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://duckduckgo.com/";
		driver.get(baseURL);
		
		String textToBox="ThisTextIsToCheckTextBoxValue";
		
		driver.findElement(By.name("q")).sendKeys("ThisTextIsToCheckTextBoxValue");
		Thread.sleep(4000);
		driver.findElement(By.id("search_button_homepage")).click();
		String Actual= driver.findElement(By.name("q")).getAttribute("value");
		if(Actual.equals(textToBox)) {
			System.out.println("This is test case pass::::::::::");
		}else {
			System.out.println("This test case Fail:::::::::::::::");
		}
		System.out.println(driver.getTitle());
		
		
		
		//get attribute name in google search
		
		//getValue from google search
		
	}

}
