package com.deutsche.twitter.StepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.deutsche.twitter.base.TestBase;
import com.deutsche.twitter.pages.EditProfileScreen;
import com.deutsche.twitter.pages.HomeScreen;
import com.deutsche.twitter.pages.LoginScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterStepDef extends TestBase {

	LoginScreen login = new LoginScreen();
	HomeScreen home = new HomeScreen();
	EditProfileScreen edit = new EditProfileScreen();

	@Given("^User  is  on Twitter Login Screen$")
	public void user_is_on_Twitter_Login_Screen() throws Throwable {

		login.navigateToLoginScreen();
		String title = driver.getTitle();
		// System.out.println(title);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (title.contains("Home")) {
			Assert.assertTrue(true);

		}

	}

	@When("^User  enters credentials  and  login$")
	public void user_enters_credentials_and_login() throws Throwable {

		login.login(prop.getProperty("userID"), prop.getProperty("password"));

	}

	@When("^no credentilas are  entered$")
	public void no_credentilas_are_entered() throws Throwable {

		login.login();

	}

	@When("^User enters only UserName$")
	public void user_enters_only_UserName() throws Throwable {

		login.passwordMandatory(prop.getProperty("userID"));

	}

	@When("^User enters only Password$")
	public void user_enters_only_Password() throws Throwable {

		login.userNmMandatory(prop.getProperty("password"));

	}

	@When("^user  navigates to EditProfileScreen$")
	public void user_navigates_to_EditProfileScreen() throws Throwable {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		home.navigateToEditProfileScreen();

	}

	@When("^user updates  the details$")
	public void user_updates_the_details() throws Throwable {

		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		edit.updateProfile(prop.getProperty("bio"), prop.getProperty("location"), prop.getProperty("swbsite"));
	}


	@Then("^Profile Updated$")
	public void profile_Updated() throws Throwable {

		home.navigateToEditProfileScreen();

		if (edit.profileBIO.getText() == prop.getProperty("bio")) {

			Assert.assertTrue(true);
			System.out.println("BIO udated");
		}

		if (edit.profileLocation.getText() == prop.getProperty("location")) {

			Assert.assertTrue(true);
			System.out.println("location udated");
		}

		if (edit.profileWebsite.getText() == prop.getProperty("website")) {

			Assert.assertTrue(true);
			System.out.println("website udated");
		}
	}

	@When("^user updates  the ProfilePhoto$")
	public void user_updates_the_ProfilePhoto() throws Throwable {


		edit.updateProfilePhoto();


	}




	@Given("^user loggedout$")
	public void user_loggedout() throws Throwable {

		driver.quit();

	}
}
