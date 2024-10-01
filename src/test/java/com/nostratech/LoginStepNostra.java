package com.nostratech;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepNostra {
	static WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Given("I use web {string}")
	public void i_use_web(String browser) {
		driver = WebDriverManager.getInstance(browser).create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("I navigate to login page Nostratech")
	public void i_navigate_to_login_page_nostratech() {
		loginPage = new LoginPage(driver);
	}

	@When("I login with the email {string} and password {string}")
	public void i_login_with_the_email_and_password(String username, String password) {
		loginPage.login(username, password);
	}

	@When("I login with the wrong email {string} and correct password {string}")
	public void i_login_with_the_wrong_email_and_correct_password(String username, String password) {
		loginPage.login(username, password);
	}

	@When("I click sign in button")
	public void i_click_sign_in_button() {
		loginPage.clickSigninButton();
	}

	@Then("I see error message")
	public void i_see_error_message() {
		try {
			boolean isErrorDisplayed = loginPage.isErrorMessageDisplayed();
			Assert.assertEquals(isErrorDisplayed, true, "Error message was not displayed as expected.");
		} finally {
			driver.quit();
		}
	}

	@Then("I see success notif and navigate to dashboard page Nostratech")
	public void i_see_success_notif_and_navigate_to_dashboard_page_nostratech() {
		try {
			boolean info = loginPage.isDashboardDisplayed();
			Assert.assertEquals(info, true);
			loginPage.isDashboardDisplayed();
		} finally {
			driver.quit();
		}
	}

	@Then("I navigate to dashboard page nostra fusion")	
	public void i_navigate_to_dashboard_page_nostra_fusion() {
		try {
			driver = new ChromeDriver();
			dashboardPage = new DashboardPage(driver);
		} finally {
			driver.quit();
		}

	}

}