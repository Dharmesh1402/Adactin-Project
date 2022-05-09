package com.Eclipse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactinhotel {
	
	public static void main(String[] args) throws IOException, InterruptedException  {

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
		  
		  WebElement location = driver.findElement(By.id("location"));
			
		  Select a = new Select(location);
			
		  a.selectByValue("Sydney");
		  
		  WebElement Hotels = driver.findElement(By.id("hotels"));
			
		  Select b = new Select(Hotels);
			
		  b.selectByValue("Hotel Creek");

		  WebElement Room_Type = driver.findElement(By.id("room_type"));
			
		  Select c = new Select(Room_Type);
			
		  c.selectByValue("Super Deluxe");

		  WebElement Number_of_Rooms = driver.findElement(By.id("room_nos"));
			
		  Select d = new Select(Number_of_Rooms);
			
		  d.selectByValue("2");

		  WebElement Adults_per_Room = driver.findElement(By.id("adult_room"));
			
		  Select e = new Select(Adults_per_Room);
			
		  e.selectByValue("2");

		  WebElement Children_per_Room 	 = driver.findElement(By.id("child_room"));
			
		  Select f = new Select(Children_per_Room);
			
		  f.selectByValue("1");
		  
          WebElement Search = driver.findElement(By.id("Submit"));
          
          Search.click();

          WebElement Radiobutton = driver.findElement(By.id("radiobutton_0"));
          
          Radiobutton.click();
          
          WebElement Continue = driver.findElement(By.id("continue"));
          
          Continue.click();
          
          WebElement FirstName = driver.findElement(By.id("first_name"));
          
          FirstName.sendKeys("ABC");
          
          WebElement LastName = driver.findElement(By.id("last_name"));
          
          LastName.sendKeys("XYZ");

          WebElement BillingAddress = driver.findElement(By.id("address"));
          
          BillingAddress.sendKeys("123");

          WebElement CreditCardNo = driver.findElement(By.id("cc_num"));
          
          CreditCardNo.sendKeys("9876543210123456");
          
          WebElement Credit_Card_Type 	 = driver.findElement(By.id("cc_type"));
			
		  Select g = new Select(Credit_Card_Type );
			
		  g.selectByValue("VISA");
		  
		  WebElement Expiry_Month = driver.findElement(By.id("cc_exp_month"));
			
		  Select h = new Select(Expiry_Month);
			
		  h.selectByValue("4");
		  
		  WebElement Expiry_Year  = driver.findElement(By.id("cc_exp_year"));
			
		  Select i = new Select(Expiry_Year);
			
		  i.selectByValue("2022");
		  
		  WebElement CVVNumber = driver.findElement(By.id("cc_cvv"));
		  
		  CVVNumber.sendKeys("1234567890123456");

		  
		  WebElement Booknow = driver.findElement(By.id("book_now"));
		  
		  Booknow.click();
		  
		  Thread.sleep(10000);
		  
		  WebElement MyItinerary= driver.findElement(By.xpath("//input[@value='My Itinerary']"));
		 
		  MyItinerary.click();
          
		  TakesScreenshot j = (TakesScreenshot) driver;
		  
		  File Source = j.getScreenshotAs(OutputType.FILE);
		  
		  File Destination = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\screenshot\\Screenshot.png");
		  
		  FileHandler.copy(Source, Destination);
		  
		  WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		  
		  logout.click();
		  
		  driver.close();
		  
		}}
