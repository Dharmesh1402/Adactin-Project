package com.Eclipse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions a = new ChromeOptions();
		
		a.addArguments("Incognito");
		
		WebDriver driver = new ChromeDriver(a);
		
		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
	}

}
