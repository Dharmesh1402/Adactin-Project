package com.Eclipse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Window.html");

		driver.manage().window().maximize();
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement firstbutton = driver.findElement(By.id("home"));
		
		firstbutton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
			
		}
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		
		editbox.click();
		
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement Openmultiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		
		Openmultiple.click();
		
		int Noofwindows = driver.getWindowHandles().size();
		
		System.out.println("No of windows opened:"+Noofwindows);
		
		WebElement donotcloseme = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		
		donotcloseme.click();
		
		Set<String> newwindowHandles = driver.getWindowHandles();
		
		for (String allwindows : newwindowHandles) {
			
			if(!allwindows.equals(oldwindow)) {
				
				driver.switchTo().window(allwindows);
				
				driver.close();
			}
			
		}

	}

}
