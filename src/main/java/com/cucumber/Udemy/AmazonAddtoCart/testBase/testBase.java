package com.cucumber.Udemy.AmazonAddtoCart.testBase;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testBase {

	public static Properties prop;
	public static WebDriver driver;

	public testBase() throws IOException {

		testBase.driver = driver;
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Neha\\workspace\\AmazonAddtoCart\\src\\main\\java\\com\\cucumber\\Udemy\\AmazonAddtoCart\\config\\config.properties");
		prop.load(fis);
	}

public static void Initialisation() throws IOException {
		
		/*
		 * prop = new Properties(); FileInputStream fis = new FileInputStream(
		 * "D:\\Neha\\workspace\\AmazonAddtoCart\\src\\main\\java\\com\\cucumber\\Udemy\\AmazonAddtoCart\\config\\config.properties"
		 * ); prop.load(fis);
		 */
		// System.setProperty("webdriver.chrome.driver","C://Users//Harshal//Desktop//Neha//chromedriver.exe");
		// driver = new ChromeDriver();

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		// String browserName = Chrome;

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//Harshal//Desktop//Neha//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Internet Explorer")) {
			System.setProperty("webDriver.ie.driver", "D:\\\\Neha\\\\Neha New Downloads\\\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webDriver.gecko.driver", "D:\\\\Neha\\\\Neha New Downloads\\\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}
}
