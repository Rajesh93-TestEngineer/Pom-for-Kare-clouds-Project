package com.kareclouds.testscripts;

import org.testng.annotations.Test;

import com.kareclouds.pages.LoginFun;
import com.kareclouds.pages.VerifyTitle;
import com.kareclouds.utility.BaseClass;

public class TC001 {
@Test
public static void tc001()  {
BaseClass.openApplication();	
LoginFun.Loginfuntion("superadmin@gmail.com","Admin@123");
VerifyTitle.verifyTitle("Kare Clouds&Research Center");
BaseClass.CloseApplication();
}
}