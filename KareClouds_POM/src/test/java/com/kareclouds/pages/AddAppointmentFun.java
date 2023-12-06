package com.kareclouds.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.kareclouds.utility.BaseClass;

public class AddAppointmentFun extends BaseClass{
static By AdApmnt=By.xpath("//a[@class='btn btn-primary btn-sm addappointment']");
static By Date=By.xpath("//input[@id='date']");
//static By Dat=By.xpath("//input[@id='date']");
static By patientName=By.id("patient_name");
static By PhoneNum=By.id("phone");
static By Doctor=By.xpath("//select[@id='doctorid']");
static By message=By.id("note");
static By liveConslt=By.name("live_consult");
public static void addappointmntFun(String dt,String UN,String ph) {
	driver.findElement(AdApmnt).click();
	driver.findElement(Date).sendKeys(dt);
	//driver.findElement(Dat).click();
	driver.findElement(patientName).sendKeys(UN);
	driver.findElement(PhoneNum).sendKeys(ph);	
	Reporter.log("add appointment complted");	
}
public static void Doctordropdown(String msg) {
	Select st=new Select(driver.findElement(Doctor));
	st.deselectByVisibleText("Doctor 101 Big");
	driver.findElement(message).sendKeys(msg);	
	Reporter.log("Doctor complted");	
}
public static void liveConslt() {
	Select st=new Select(driver.findElement(liveConslt));
    st.selectByVisibleText("Yes");
}
}

