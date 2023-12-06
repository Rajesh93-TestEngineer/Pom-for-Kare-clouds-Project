package com.kareclouds.pages;

import org.openqa.selenium.By;

import com.kareclouds.utility.BaseClass;

public class LogoutFun extends BaseClass{
//object
	static By lgoutclick=By.xpath("//a[@class='topuser-image']");
	static By logout=By.xpath("//a[@class='pull-right']");
//Function	
	public static void Logout() {
	driver.findElement(lgoutclick).click();
	driver.findElement(logout).click();
	}
}
