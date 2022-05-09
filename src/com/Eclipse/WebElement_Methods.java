package com.Eclipse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();
	
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dharmesh1234");
	    
	    driver.findElement(By.xpath("//input[@type='text']")).clear();

        System.out.println(driver.findElement(By.name("username")).getAttribute("type"));
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[4]/td[2]/div/a")).getCssValue("text-transform"));
	
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]")).getSize());
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]")).getLocation());
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")).getText());
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]")).isDisplayed());
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]")).isEnabled());

        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]")).isSelected());
                 
            
	}
	
}
