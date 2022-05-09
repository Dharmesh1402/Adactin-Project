package com.Eclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		
		Select a = new Select(dropdown);
		
		a.selectByValue("3");
		
		WebElement dropdown1 = driver.findElement(By.xpath("(//select)[6]"));
		
		Select b = new Select(dropdown1);
		
		b.selectByIndex(2);
		
		b.selectByValue("4");
		
		b.selectByVisibleText("Selenium");
		
		b.deselectByIndex(2);
		
		List<WebElement>option = b.getOptions();
		for(WebElement opt : option) {
			System.out.println(opt.getText());
		}
		
			
		List<WebElement> Selectall = b.getAllSelectedOptions();
		for(WebElement opt1 : Selectall) {
			System.out.println(opt1.getText());
		}
		
		WebElement First = b.getFirstSelectedOption();
			System.out.println(First.getText());
	
		
		boolean c = b.isMultiple();
		System.out.println(c);
		
		b.deselectAll();
		
		

	}

}
