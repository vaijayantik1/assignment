package com.deutsche.twitter.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deutsche.twitter.base.TestBase;

public class HomeScreen extends TestBase {

	public HomeScreen() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/a/div/span/span")
	public WebElement btn_EditProfile;

	@FindBy(css = "#react-root > div > div > div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 > header > div > div > div > div:nth-child(1) > div.css-1dbjc4n.r-1awozwy.r-d0pm55.r-1bymd8e.r-13qz1uu > nav > a:nth-child(7) > div > div > svg > g > path")
	public WebElement profileLogo_lhs;



	public void navigateToEditProfileScreen() {

		try {

		profileLogo_lhs.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		btn_EditProfile.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
