package com.cucumber.Udemy.AmazonAddtoCart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	
@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement Searchbox;

@FindBy(xpath="//div[@class='nav-search-submit']")
WebElement Searchclick;



public void SearchItem(String searchValue)
{
	Searchbox.sendKeys(searchValue);
	Searchclick.click();
}
}
