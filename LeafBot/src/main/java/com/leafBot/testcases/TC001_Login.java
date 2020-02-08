package com.leafBot.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_Login extends ProjectSpecificMethods{

		@BeforeTest
		public void setValues() {
		testCaseName = "login";
		testDescription = "Login testCase using kumar.testleaf@gmailcom ";
		nodes = "Leads";
		authors = "Santhosh";
		category = "Smoke";
		dataSheetName = "TC001_Acme";
		}
		@Test(dataProvider = "fetchData")
		public void loginAndVerify(String uName, String pwd, String title) {
		new LoginPage(driver, node, test)
		.enterEmailId(uName)
		.enterPassword(pwd)
		.clickLogn()
		.verifyTitle(title);
		}

	
}
