package com.Eclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_complete {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/autoComplete.html");
		 
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.id("tags"));
		
		input.sendKeys("s");
		
		Thread.sleep(4000);
		
		List<WebElement> optionlist = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		System.out.println(optionlist.size());
		
		for (WebElement webElement : optionlist) {
			
			if(webElement.getText().equals("Web Services")) {
				
				webElement.click();
				
				break;
			}
			}
		
	}

}
