package com.deutsche.twitter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deutsche.twitter.base.TestBase;

public class LoginScreen extends TestBase {

	public LoginScreen() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#react-root > div > div > div.css-1dbjc4n.r-13qz1uu.r-417010 > main > div > div > div.css-1dbjc4n.r-13qz1uu > form > div > div:nth-child(6) > label > div > div.css-1dbjc4n.r-18u37iz.r-16y2uox.r-1wbh5a2.r-1udh08x > div > input")
	public WebElement userNm;

	@FindBy(name = "session[password]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/form/div/div[3]/div/div")
	public WebElement loginBtn_Enabled;

	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/form/div/div[3]/div/div")
	public WebElement loginBtn_Disabled;

	public void navigateToLoginScreen() {

		initialization();

	}

	public void login(String uNm, String pwd) {
		try {


			userNm.sendKeys(uNm);
			password.sendKeys(pwd);
			loginBtn_Enabled.click();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public boolean login() {

		return loginBtn_Disabled.isDisplayed();

	}

	public boolean passwordMandatory(String uNM) {

		userNm.sendKeys(uNM);

		return loginBtn_Disabled.isDisplayed();

	}

	public boolean userNmMandatory(String pwd) {
try {
		userNm.click();
		userNm.clear();
		password.sendKeys(pwd);}
catch (Exception e) {

	e.printStackTrace();
}


		return loginBtn_Disabled.isDisplayed();
	}

}
