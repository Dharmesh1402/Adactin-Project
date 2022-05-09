package com.Eclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion_Box1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("selenium");
		
		Thread.sleep(3000);
		 
		List<WebElement>listOfElements=driver.findElements(By.xpath(".//*[@role='listbox']/li"));
		  
		for (WebElement webElement : listOfElements) {
		  
			System.out.println(webElement.getText());
		   
			if(webElement.getText().trim().equals("selenium ide")) {
		    
				webElement.click();
		    
				break;

		

	}}

}}
