package com.Eclipse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		 
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).click();
		  
		  Robot robot=new Robot();
		 
		  robot.keyPress(KeyEvent.VK_TAB);
		  
		  robot.keyRelease(KeyEvent.VK_TAB);
		  
		  robot.keyPress(KeyEvent.VK_TAB);
		  
		  robot.keyRelease(KeyEvent.VK_TAB);
		  
		  robot.keyPress(KeyEvent.VK_ENTER);
		  
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  Thread.sleep(10000);
		  
		  driver.quit();
		  
		 }
		

}
