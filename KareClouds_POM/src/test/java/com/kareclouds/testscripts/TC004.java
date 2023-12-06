package com.kareclouds.testscripts;

import org.testng.annotations.Test;

import com.kareclouds.pages.AddAppointmentFun;
import com.kareclouds.pages.FrontOfficeModule;
import com.kareclouds.pages.LoginFun;
import com.kareclouds.pages.VerifyTitle;
import com.kareclouds.utility.BaseClass;

public class TC004 {
@Test
public void tc004() {
	BaseClass.openApplication();
	VerifyTitle.verifyTitle("KareClouds");
	LoginFun.Loginfuntion("superadmin@gmail.com","Admin@123");
	VerifyTitle.verifyTitle("Kare Clouds&Research Center");
	FrontOfficeModule.FOffice();
	AddAppointmentFun.addappointmntFun("03-11-2023","Raj", "123456789");
	AddAppointmentFun.Doctordropdown("hiii heloo12345");
	AddAppointmentFun.liveConslt();
	BaseClass.CloseApplication();
	}
}
