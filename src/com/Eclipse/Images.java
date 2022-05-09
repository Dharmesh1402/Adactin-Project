package com.Eclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Image.html");
		 
		driver.manage().window().maximize();
		
		WebElement firstimage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		
		firstimage.click();
		
		driver.navigate().back();
		
		WebElement Brokenimage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		//"naturalWidth" = 0    -css property
		
		if(Brokenimage.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println("The image is broken");
			
		}
		
			else {
				
				System.out.println("The image is not broken");

			}
		
	}

}
