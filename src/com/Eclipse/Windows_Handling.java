package com.Eclipse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		WebElement Fashion = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
		
		Robot r = new Robot();
		
		Actions a = new Actions(driver);
		
		a.contextClick(Fashion).build().perform();	
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
        r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Bestsellers = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		
        a.contextClick(Bestsellers).build().perform();	
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
        r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
        WebElement Electronics = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
		
        a.contextClick(Electronics).build().perform();	
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
        r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> Set = driver.getWindowHandles();
		
		for (String id : Set) {
			
			String Title = driver.switchTo().window(id).getTitle();
			System.out.println(Title);
			
		}
		Set<String> Set1 = driver.getWindowHandles();
     	System.out.println(Set1);
			
		
		
		String a1 = "Amazon.in Bestsellers: The most popular items on Amazon";
		
		for (String id : Set) {
			if(driver.switchTo().window(id).getTitle().equals(a1)) {
				continue;
			}
			else {
				driver.close();
			}
			
		}


		
		
		
}}
