package com.nostratech;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;;

	// Locators
	By emailInput = By.name("email");
	By passwordInput = By.name("password");
	By signInBtn = By.name("btn-login");
	By signOut = By.xpath("//button[@id='headlessui-menu-item-18']");
	By dashboardHeader = By.xpath("//h2[normalize-space()='PT. Nostra Solusi Technology']");  
	By invalidNotif = By.xpath("//li[contains(@data-type,'error')]");
	By SuccessNotif = By.xpath("//li[contains(@data-type,'success')]");


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Initialize WebDriverWait here
		driver.get("https://accounting-devteam-b.nostratech.com/auth/login");
	}

	public void login(String username, String password) {
		driver.findElement(emailInput).sendKeys(username);
		driver.findElement(passwordInput).sendKeys(password);
	}


	public void clickSigninButton() {
		driver.findElement(signInBtn).click();
		wait.until(ExpectedConditions.urlContains("https://accounting-devteam-b.nostratech.com/apps"));  
		
	}
	
	public boolean isErrorMessageDisplayed() {
		WebElement errorElement = driver.findElement(invalidNotif);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", errorElement);
		return errorElement.isDisplayed();
	}


	public boolean isDashboardDisplayed() {
		return driver.findElement(SuccessNotif).isDisplayed();
	}

}