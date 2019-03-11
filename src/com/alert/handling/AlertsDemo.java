package com.alert.handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/SeleniumDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		driver.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
		Thread.sleep(3000);
//		String alertString = driver.switchTo().alert().getText();
//		System.out.println(alertString);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//*[@value='Display a confirm box']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@value='Display a confirm box']")).click();
//		Thread.sleep(6000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(6000);
		
		
		Alert alertObj = driver.switchTo().alert();
		String alertText = alertObj.getText();
		System.out.println(alertText);
		Thread.sleep(3000);
//		alertObj.accept();
		
	}

}
