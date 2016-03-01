package com.f9group.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {


	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", 
    		  "C:\\Users\\Bill\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://facebook.com");
      //id locator technique
      driver.findElement(By.id("email")).sendKeys("bibhuti");
      //name locator technique
      driver.findElement(By.name("pass")).sendKeys("12134");
      //xpath locator technique
      driver.findElement(By.xpath(".//*[@id='u_0_x']")).click();
      driver.close();
       
	}
	
}
