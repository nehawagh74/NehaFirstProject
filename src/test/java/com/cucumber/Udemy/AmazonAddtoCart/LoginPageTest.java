package com.cucumber.Udemy.AmazonAddtoCart;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cucumber.Udemy.AmazonAddtoCart.pages.LoginPage;
import com.cucumber.Udemy.AmazonAddtoCart.pages.ProductsPage;
import com.cucumber.Udemy.AmazonAddtoCart.testBase.testBase;

public class LoginPageTest extends testBase{
	
	public static LoginPage loginpage;
	public static ProductsPage productsPage;

	public LoginPageTest() throws IOException {
		super();
		//testBase.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
	Initialisation();
		loginpage= new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPage() {
		loginpage.openSignInPage();
		String loginText=loginpage.getLoginText();
		System.out.println(loginText);
		Assert.assertEquals(loginpage.getLoginText(),"Login","Test Passsed");
		//productsPage=loginpage.signUp();
		//return productsPage;
		//return null;
	}
	
	@Test(priority=2)
	public ProductsPage LogintoApp() {
		loginpage.signUp();
		return new ProductsPage();
		
	}
	
	
	/*
	 * @Test public void Login() { loginpage.openSignInPage();
	 * loginpage.EnterMobileNumber(); loginpage.clickOnContinue();
	 * loginpage.EnterPassword(); loginpage.clickOnLogin(); }
	 */

	 @AfterMethod 
	 public void tearDown() throws IOException { 
		 System.out.println("test case executed");
		 driver.quit(); 
		 
	 }
	 
}
