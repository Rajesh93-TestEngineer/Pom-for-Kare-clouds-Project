package com.kareclouds.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
//driver
	 public static WebDriver driver;
//openBrowser
	 public static void openApplication() {
		 driver=new ChromeDriver();
		 driver.get("https://hms.kareclouds.com/site/login");
		 Reporter.log("Application opened" );
	 }
	 public static void CloseApplication() { 
		 driver.close();
		 Reporter.log("Application closed" );
	 }
	 }
