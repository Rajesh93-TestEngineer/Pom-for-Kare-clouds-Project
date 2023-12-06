package com.kareclouds.pages;

import org.testng.Reporter;

import com.kareclouds.utility.BaseClass;

public class VerifyTitle extends BaseClass {
	public static void verifyTitle(String title) {
		  if(driver.getTitle().equals(title)) {
		      Reporter.log("Title matched");    
		   }
		   else {
		      Reporter.log("Title not matched");
		      Reporter.log(driver.getTitle());
}
}}