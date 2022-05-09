package com.Eclipse;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		WebElement insta = driver.findElement(By.xpath("//a[text()='Instagram']"));
		
		Js.executeScript("arguments[0].scrollIntoView();",insta);
		
		Js.executeScript("window.scrollBy(0,-600);");
		

}}
