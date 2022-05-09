package com.Eclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		  
		driver.manage().window().maximize();
		

		 WebElement Accounts = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		  
		
		  Actions actions=new Actions(driver);
		  
		  actions.moveToElement(Accounts).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span")).click();
		  
		  Thread.sleep(10000);
		 
		  driver.quit();
		 
		 }


}
