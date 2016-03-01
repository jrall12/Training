package com.f9group.basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bill\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://yahoo.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getPageSource());
      System.out.println(driver.getCurrentUrl());
      driver.close();
       
	}

}
