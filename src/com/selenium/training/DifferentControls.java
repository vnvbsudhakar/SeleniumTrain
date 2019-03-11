package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DifferentControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "http://softwaretesting-guru.blogspot.com/p/main-page.html";
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//a[text()='Selenium Practice page']")).click();
//		driver.findElement(By.linkText("Selenium Practice page")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Selenium");
		driver.findElement(By.name("subscribe")).click();
		driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("Selenium with Java class");
		
		new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Afganistain");
//		String color = driver.findElement(By.xpath("//*[@id=\"sampleform\"]/table/tbody/tr[7]/td")).getCssValue("background-color");
//		System.out.println(color);
//		driver.quit();
//		
				
		
		
		
		

	}

}
