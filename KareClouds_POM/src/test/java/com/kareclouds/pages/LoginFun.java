package com.kareclouds.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.kareclouds.utility.BaseClass;

public class LoginFun extends BaseClass{
//object
	static By UserName=By.id("email");
	static By UserPassword=By.id("password");
	static By UserSignin=By.xpath("//button[@class='btn']");
	//function
public static void Loginfuntion(String un, String pw) {
	driver.findElement(UserName).sendKeys(un);
	driver.findElement(UserPassword).sendKeys(pw);
	driver.findElement(UserSignin).click();
	Reporter.log("login fun completed");
}
}
