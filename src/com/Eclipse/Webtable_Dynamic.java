package com.Eclipse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Dynamic {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		 
		driver.manage().window().maximize();
		
		List<WebElement> Columns = driver.findElements(By.tagName("th"));
		
		int ColumnCount = Columns.size();
		
		System.out.println("No Of Columns:"+ColumnCount);
		
        List<WebElement> Rows = driver.findElements(By.tagName("tr"));
		
		int RowsCount = Rows.size();
		
		System.out.println("No Of Columns:"+RowsCount);
		
		WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
		String percent = getpercent.getText();
		
		System.out.println("Percentage is :"+percent);
		
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberlist = new ArrayList<Integer>();
		
		for (WebElement webElement : allprogress) {
			
			String individualvalue = webElement.getText().replace("%", "");
			
			numberlist.add(Integer.parseInt(individualvalue));
		
		}
		
		System.out.println("Final list:"+numberlist);
		
		int smallvalue = Collections.min(numberlist);
		
		System.out.println(smallvalue);
		
		String smallvaluestring = Integer.toString(smallvalue)+"%";
		
		String finalXpath = "//td[normalize-space()="+"\""+smallvaluestring+ "\""+"]"+"//following::td[1]";
		
		System.out.println(finalXpath);
		
		WebElement check = driver.findElement(By.xpath(finalXpath));
		
		check.click();
		
		
	}

}
