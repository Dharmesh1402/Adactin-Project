package com.Eclipse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://www.leafground.com/pages/Calendar.html");
			
			driver.manage().window().maximize();
			
			JavascriptExecutor Js = (JavascriptExecutor)driver;
			// By using id
			Js.executeScript("document.getElementById('datepicker').value='14/02/1994'");
			// By using selector
			//Js.executeScript("document.querySelector('#datepicker').value='14/02/1994'");

	}

}
