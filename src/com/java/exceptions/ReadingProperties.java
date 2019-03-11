package com.java.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingProperties {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\sudha\\eclipse-workspace\\SeleniumEveningBatch\\src\\com\\java\\exceptions\\test.properties";
		
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		
		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
		
		String brow = prop.getProperty("browser");
		
		if(brow.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
//			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\SeleniumDrivers\\chromedriver.exe");
			driver.get("https://www.hackerrank.com/");
			driver.close();
		}else if(brow.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.hackerrank.com/");
			driver.close();
		}
		
		

	}
}