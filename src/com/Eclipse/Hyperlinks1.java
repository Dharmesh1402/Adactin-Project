package com.Eclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Link.html");
		 
		driver.manage().window().maximize();
		
		WebElement Homepage = driver.findElement(By.linkText("Go to Home Page"));
		
		Homepage.click();
		
		driver.navigate().back();
		
		WebElement Wheretogo = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
		
		Wheretogo.click();
		
		Thread.sleep(3000);
						
		driver.navigate().back();

		  WebElement Brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
		  
		  Brokenlink.click();
		  
		  Thread.sleep(3000);
		  
		  String title = driver.getTitle();
		  
		  if(title.contains("404")) {
		  
		  System.out.println("Link is broken"); }
		  
		  driver.navigate().back();
		  
		 List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		  
		  int linkcount = totallinks.size();
		  
		  System.out.println("Total link:"+linkcount);
		 
		

		

	}

}
