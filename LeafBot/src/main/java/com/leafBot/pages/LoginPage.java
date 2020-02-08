package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {


	public LoginPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}

	@FindBy(how=How.ID,using="email")
	private WebElement emailId;

	public LoginPage enterEmailId(String emailIdValue){
		clearAndType(emailId,emailIdValue);
		return this;

	}

	@FindBy(how=How.ID,using="password")
	private WebElement enterPassword;

	public LoginPage enterPassword(String passwordValue) {
		clearAndType(enterPassword, passwordValue);
		return this;
	}
	
	@FindBy(how=How.ID,using="buttonLogin")
	private WebElement clickLogin;

	public HomePage clickLogn() {
		click(clickLogin);
		return new HomePage(driver,node,test);
	}

}

