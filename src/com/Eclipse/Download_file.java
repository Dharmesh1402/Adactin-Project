package com.Eclipse;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_file {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/download.html");
		 
		driver.manage().window().maximize();
		
		WebElement downloadlink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div/div/div/a[2]"));
		
		downloadlink.click();
		
		Thread.sleep(3000);
		
		File filelocation = new File("C:\\Users\\hp\\Downloads");
		
		File[] totalfile = filelocation.listFiles();
		
		for (File file : totalfile) {
			
			if(file.getName().equals("download.xls")) {
				
				System.out.println("File is downloaded");
				
				break;
			}
			
		}

	}

}
