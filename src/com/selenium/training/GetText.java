package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(baseURL);
		String expectedName = "Alfreds Futterkiste";
		String actualName = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();
		if(expectedName.equalsIgnoreCase(actualName)) {
			System.out.println("This test case is pass:::::::::::");
		}else {
			System.out.println("This test case is fail::::::::::");
		}
			
				
	}

}
