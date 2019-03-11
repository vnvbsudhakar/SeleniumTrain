package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetToolTipText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(baseURL);
		System.out.println(driver.findElement(By.xpath("//a[text()='JAVASCRIPT']")).getAttribute("title"));
		//Difference between getAttribute("title") and getTitle() - getTitle() gives title of webpage and getAttribute("title") gives tooltip text
	}

}
