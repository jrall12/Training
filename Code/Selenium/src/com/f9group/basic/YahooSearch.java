package com.f9group.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearch {

	
	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bill\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://yahoo.com");
     //xpath locator technique
      driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("Donald Trump");
      driver.findElement(By.xpath(".//*[@id='uh-search-button']")).click();
      //driver.close();
     
	}
}
