package com.Eclipse;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion_Box {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiz1pKPo-32AhWaZWwGHafmB-YQPAgI");

		driver.manage().window().maximize();

		
		  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("India");
		  
		  Thread.sleep(10000);
		  
		  List<WebElement>Suggestions=driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='eIPGRd']"));
		  
		  for (WebElement Suggest : Suggestions) {
			  
			 String Text = Suggest.getText();
			
			 System.out.println(Text);
			  
			  if( Suggest.getText().equalsIgnoreCase("India post")) {
				  
				  Suggest.click();
				 
				  break;
			  }
			
		}

	}

}
