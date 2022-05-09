package com.Eclipse;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();
		        
        List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement Ele : list) {
			
			System.out.println(Ele.getText());
		}
		
		 System.out.println();
	        
	        List<WebElement> list1 = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
			
			for (WebElement Ele1 : list1) {
				
				System.out.println(Ele1.getText());
			}
			
			 System.out.println();
		        
		        List<WebElement> list2 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
				
				for (WebElement Ele2 : list2) {
					
					System.out.println(Ele2.getText());
				}
				
				 System.out.println();
			        
			        WebElement Element = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]"));
					
						System.out.println(Element.getText());
						
						System.out.println();
				        
				        WebElement Head = driver.findElement(By.tagName("th"));
						
							System.out.println(Head.getText());
							
						

}}
