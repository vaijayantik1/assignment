package com.deutsche.twitter.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deutsche.twitter.base.TestBase;

public class EditProfileScreen extends TestBase {

	public EditProfileScreen() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "description")
	public WebElement profileBIO;

	@FindBy(name = "location")
	public WebElement profileLocation;

	@FindBy(name = "url")
	public WebElement profileWebsite;

	@FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div[3]/div/div/span/span")
	public WebElement btnSave;

	@FindBy(css = "#layers > div:nth-child(2) > div > div > div > div > div > div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1pi2tsx.r-1777fci.r-1xcajam.r-ipm5af.r-g6jmlv > div.css-1dbjc4n.r-1ylenci.r-1wbh5a2.r-kwpbio.r-rsyp9y.r-1pjcn9w.r-1279nm1.r-htvplk.r-1udh08x > div > div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1jgb5lz.r-1ye8kvj.r-13qz1uu > div > div > div.css-1dbjc4n.r-14lw9ot.r-11mg6pl.r-sdzlij.r-1phboty.r-d045u9.r-1777fci.r-11jgdu4.r-1uvakcn.r-1re40zr.r-1udh08x.r-1xce0ei > div > div > div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1pi2tsx.r-1777fci.r-lsa89y.r-u8s1d.r-ipm5af.r-13qz1uu > div > div > svg > g > path:nth-child(2)")
	public WebElement prophilePhotoIcon;

	public void updateProfile(String bio, String location, String website) {

		try {

			profileBIO.click();
			profileBIO.sendKeys(bio);

			profileLocation.click();
			profileLocation.sendKeys(location);

			profileWebsite.click();
			profileWebsite.sendKeys(website);

			btnSave.click();
		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void updateProfilePhoto() throws InterruptedException {

		prophilePhotoIcon.click();


		try {

			Runtime.getRuntime().exec("C:\\Users\\vaija\\Desktop\\FileUpload.exe");
			Thread.sleep(6000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			btnSave.click();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
