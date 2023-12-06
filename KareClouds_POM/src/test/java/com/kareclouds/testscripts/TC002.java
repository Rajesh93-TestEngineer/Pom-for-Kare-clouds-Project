package com.kareclouds.testscripts;

import org.testng.annotations.Test;
import com.kareclouds.pages.FrontOfficeModule;
import com.kareclouds.pages.LoginFun;
import com.kareclouds.pages.VerifyTitle;
import com.kareclouds.utility.BaseClass;

public class TC002 {
@Test
public void tc002() {
BaseClass.openApplication();
VerifyTitle.verifyTitle("KareClouds");
LoginFun.Loginfuntion("superadmin@gmail.com","Admin@123");
VerifyTitle.verifyTitle("Kare Clouds&Research Center");
FrontOfficeModule.FOffice();
BaseClass.CloseApplication();
}
}
