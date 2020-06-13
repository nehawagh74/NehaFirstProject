package com.cucumber.Udemy.AmazonAddtoCart.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Udemy.AmazonAddtoCart.testBase.testBase;

public class LoginPage extends testBase {

	private static final String String = null;

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath ="//a[@href='https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn']")
//	WebElement SignInLink;

	@FindBy(xpath = "//span[contains(text(),'Account & Lists')]")
	WebElement SignInLink;

	@FindBy(id = "ap_email")
	WebElement MobileNumber;

	@FindBy(id = "continue")
	WebElement continuebutton;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement loginButton;

	@FindBy(xpath = "//h1[contains(text(),'Login')]")
	WebElement loginText;

	public ProductsPage signUp() {
		SignInLink.click();
		System.out.println(prop.getProperty("mobilenumber"));
		MobileNumber.sendKeys(prop.getProperty("mobilenumber"));
		continuebutton.click();
		String passwordText = prop.getProperty("password");
		password.sendKeys(passwordText);
		loginButton.click();
		return new ProductsPage();

	}

	public String getLoginText() {
		String Expectedtext = loginText.getText();
		return Expectedtext;
	}

	public void openSignInPage(){ 
		  SignInLink.click(); 
		  }
	/*
	 * / * public void EnterMobileNumber() {
	 * MobileNumber.sendKeys(prop.getProperty("mobilenumber")); }
	 * 
	 * public void clickOnContinue() { continuebutton.click(); }
	 * 
	 * public void EnterPassword() {
	 * password.sendKeys(prop.getProperty("password")); }
	 * 
	 * public void clickOnLogin() { loginButton.click(); }
	 */

}
