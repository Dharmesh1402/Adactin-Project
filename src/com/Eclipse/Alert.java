package com.Eclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		WebElement simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		
		simple.click();
		
		driver.switchTo().alert().accept();
						
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		driver.switchTo().alert().dismiss();
						
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
        driver.switchTo().alert().sendKeys("GT");
                       
        System.out.println(driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
        
       
        
      
	}

}
