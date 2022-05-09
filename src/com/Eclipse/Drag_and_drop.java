package com.Eclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		 
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(frame);
		  
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement dest=driver.findElement(By.id("droppable"));
		  
		Actions action=new Actions(driver);
		
		//action.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
		  
		action.dragAndDrop(src, dest).build().perform();
		  
		driver.switchTo().defaultContent();
		  
		Thread.sleep(10000);
		  
		//driver.quit();

	}

}
