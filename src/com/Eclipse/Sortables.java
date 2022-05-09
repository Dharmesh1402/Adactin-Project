package com.Eclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/sortable.html");
		 
		driver.manage().window().maximize();
		
		List<WebElement> Elements = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		WebElement fromElement = Elements.get(6);
		
		WebElement toElement = Elements.get(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(fromElement);
		
		action.moveToElement(toElement);
		
		action.release(toElement);
		
		action.build().perform();

		

	}

}
