package com.Eclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");
		 
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@class='demo-frame']")));
		
		WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(slider);
		
		actions.moveByOffset(150, 0);
		
		actions.build().perform();
		
		driver.switchTo().defaultContent();
				
		Thread.sleep(5000);
		
		driver.quit();
		 
		

	}

}
