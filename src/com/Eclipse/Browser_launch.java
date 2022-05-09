package com.Eclipse;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Browser_launch {

	public static void main(String[] args) throws IOException, AWTException  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		
		  WebElement User = driver.findElement(By.xpath("//input[@type='text']"));
		  
		  User.sendKeys("dharmesh1234");
		  
		  WebElement Password = driver.findElement(By.id("password"));
		  
		  Password.sendKeys("dharmesh1234@");
		  
		  WebElement login = driver.findElement(By.id("login"));
		  
		  login.click();
		  
		  //Take Full Page
		  
		  TakesScreenshot a = (TakesScreenshot) driver;
		  
		  File Source = a.getScreenshotAs(OutputType.FILE);
		  
		  File Destination = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\screenshot\\Screenshot.png");
		  
		  FileHandler.copy(Source, Destination);
		  
		  //Portion of a Page
		  
		 /* WebElement Section = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[3]/table"));
		  
		  File Source = Section.getScreenshotAs(OutputType.FILE);
		  
		  File Destination = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\screenshot\\Screenshot1.png");
		  
		  FileHandler.copy(Source, Destination);*/
		  
		  /*Robot robot = new Robot();
		  
		  Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		  
		  Rectangle rectangle = new Rectangle(screensize);
		  
		  BufferedImage source = robot.createScreenCapture(rectangle);
		  
		  File destination = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\screenshot\\Screenshot2.png");
		  
		  ImageIO.write(source, "png", destination);*/
		  
		  
		 

		
		/*
		 * WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		 * 
		 * Mobiles.click();
		 * 
		 * Thread.sleep(10000);
		 * 
		 * 
		 * WebElement Bestsellers =
		 * driver.findElement(By.xpath("(//a[@tabindex='0'])[5]"));
		 * 
		 * Bestsellers.click();
		 */

	}

}
