package com.Eclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement button = driver.findElement(By.id("Click"));
		
		button.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		WebElement button2 = driver.findElement(By.id("Click1"));
		
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		
		int size = totalframes.size();
		
		System.out.println(size);



		
		
		
	}

}
