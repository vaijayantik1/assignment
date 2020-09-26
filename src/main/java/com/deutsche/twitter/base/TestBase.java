package com.deutsche.twitter.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;

	public static WebDriver driver;

	public TestBase() {

		try {

			prop = new Properties();

			FileInputStream inputStream = new FileInputStream(
					"src/main/java/com/deutsche/twitter/resources/InputData.properties");

			prop.load(inputStream);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));


	}

}
