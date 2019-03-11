package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackGroundColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "http://softwaretesting-guru.blogspot.com/p/main-page.html";
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[text()='Selenium Practice page']")).click();
		String color = driver.findElement(By.xpath("//*[@id=\"sampleform\"]/table/tbody/tr[7]/td")).getCssValue("background-color");
		System.out.println(color);
		driver.quit();
	}

}
