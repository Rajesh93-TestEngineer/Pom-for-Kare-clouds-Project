package com.kareclouds.pages;

import org.openqa.selenium.By;

import com.kareclouds.utility.BaseClass;

public class FrontOfficeModule extends BaseClass {
	//static By Frontoffice=By.xpath("//a[@class='fas fa-dungeon']");
	static By Frontoffice=By.linkText("Front Office");

public static void FOffice() {
	driver.findElement(Frontoffice).click();
}
}
