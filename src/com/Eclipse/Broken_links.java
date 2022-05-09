package com.Eclipse;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.co.in/");
		// capture link from a webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for (WebElement element : links) {
		// By using href attribute we can get url of required link			
		String url=element.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           // HttpURLConnection=check whether the link is connect in the target page or not
           // create a connection using url object 'links'
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           //Establish connection
           httpURLConnect.connect();
           //Response code = greater than 200
           int rescode = httpURLConnect.getResponseCode();
           
           if (rescode>=400) {
        	  
        	   System.out.println(url+"-"+"is a broken link");
           }
           else {
        	   
        	   System.out.println(url+"-"+"is a valid link");

        	   
           }
           
         
        } catch (Exception e) {
           
        }
    } 
	

}
