package com.nostratech;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardNostraStep {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Given("I already login with the email {string} and password {string}")
	public void i_already_login_with_the_email_and_password(String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		loginPage.clickSigninButton();
		dashboardPage = new DashboardPage(driver);


		if (!driver.getCurrentUrl().contains("https://accounting-devteam-b.nostratech.com/apps")) {
			throw new IllegalStateException("Login failed, still on login page");
		}
	}

	@When("I click sales menu")
	public void i_click_sales_menu() {
		dashboardPage.clickSalesButton();
	}



	@Then("I should see Dashboard sales")
	public void i_should_see_dashboard_sales() {
		try {
			boolean info = dashboardPage.titleDashboardDisplayed();
			Assert.assertEquals(info, true);
			dashboardPage.titleDashboardDisplayed();
		} finally {
			driver.quit();
		}
	}
	
	@Given("I click inventory menu")
	public void i_click_inventory_menu() {
	    dashboardPage.clickInventoryButton();
	}

	@Then("I should see Dashboard inventory")
	public void i_should_see_dashboard_inventory() {
		try {
			boolean info = dashboardPage.titleDashboardDisplayed();
			Assert.assertEquals(info, true);
			dashboardPage.titleDashboardDisplayed();
		} finally {
			driver.quit();
		}
	}

}
