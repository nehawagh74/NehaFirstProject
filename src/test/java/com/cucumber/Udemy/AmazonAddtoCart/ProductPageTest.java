package com.cucumber.Udemy.AmazonAddtoCart;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import com.cucumber.Udemy.AmazonAddtoCart.pages.ProductsPage;
import com.cucumber.Udemy.AmazonAddtoCart.testBase.testBase;

public class ProductPageTest extends testBase{
	public static ProductsPage productsPage;

	public ProductPageTest() throws IOException {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
@BeforeTest
public void serchItem() {
	productsPage.SearchItem("Baggit sling bag");
	
}
}
