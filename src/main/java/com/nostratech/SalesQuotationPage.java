package com.nostratech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesQuotationPage {

	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	int timeoutSec = 45;

	//Locator untuk Sales Quotation
	By create = By.name("btn-create");
	By transactionMenu = By.xpath("//span[normalize-space()='Transaction']");
	By SalesQuotation = By.xpath("//a[normalize-space()='Sales Quotation']");
	By HinataHyuga = By.xpath("//span[normalize-space()='Hinata Hyuga']");
	By fieldCust = By.xpath("//input[@id='customer']");
	By fieldSQDate = By.name("salesQuotationDate");
	By SelectDate = By.xpath("//div[contains(@class,'datepicker__cell')][normalize-space()='9']");
	By fieldSQNumber = By.name("salesQuotationNumber");
	By custPONumber = By.name("purchaseOrderNumber");
	By SalesPerson = By.name("salesperson");
	By estDelivery = By.name("estimatedDeliveryDate");
	By fieldColoumn = By.name("product[0].item");
	By ItemOne = By.xpath("//span[normalize-space()='Crusita - Famous']");
	By submitBtn = By.name("btn-submit");
	By successNotif = By.xpath("//li[contains(@data-type,'success')]");
	By invalidNotif = By.xpath("//li[contains(@data-type,'error')]");
	By elementtoUpdate = By.xpath("//a[normalize-space()='SQ-2024/8/2-00015']");
	By editBtn = By.xpath("//button[@data-testid='btn-edit']");
	


	public SalesQuotationPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));
		this.actions = new Actions(driver);
		driver.get("https://accounting-devteam-b.nostratech.com/sales-module/dashboard");
	}

	public void clickTransactionBtn() {
		driver.findElement(transactionMenu).click();
	}

	public void clickSalesQuotation() {
		driver.findElement(SalesQuotation).click();
	}

	public void KlikCreateBtn() {
		driver.findElement(create).click();
	}

	public void SetfieldCust() {
		driver.findElement(fieldCust).click();
	}

	public void setCustomer() {
		driver.findElement(HinataHyuga).click();
	}
		

	public void KlikfieldSQDate() {
		driver.findElement(fieldSQDate).click();
	}

	public void setSQDate() {
		driver.findElement(SelectDate).click();
	}

	public void SetSQNumber(String SalesQuotationNumber) {
		
		WebElement SalesQuotationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldSQNumber));

		Actions actions = new Actions(driver);
		actions.moveToElement(SalesQuotationElement)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();
		
		SalesQuotationElement.sendKeys(SalesQuotationNumber);
	}

	public void SetPONumber(String CustomerPONumber) {
		WebElement CustomerPONumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(custPONumber));

		Actions actions = new Actions(driver);
		actions.moveToElement(CustomerPONumberElement)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();

		CustomerPONumberElement.sendKeys(CustomerPONumber);

	}

	public void SetSalesPerson(String Salesperson) {
		driver.findElement(SalesPerson).sendKeys(Salesperson);
	}

	public void setEstDate(String string) {
		driver.findElement(estDelivery).sendKeys(string);
		// Move focus to the next field by sending the TAB key
		driver.findElement(estDelivery).sendKeys(Keys.TAB);
	}

	public void KlikfieldColoumn() {
		driver.findElement(fieldColoumn).click();
	}

	public void setItem() {
		driver.findElement(ItemOne).click();
	}

	public void KlikSubmitBtn() {
		driver.findElement(submitBtn).click();
	}
	
	public boolean successNotif() {
		return driver.findElement(successNotif).isDisplayed();
	}
	
	public boolean invalidNotif() {
		return driver.findElement(invalidNotif).isDisplayed();
	}
	
	public void KlikUpadate() {
		driver.findElement(elementtoUpdate).click();
	}
	
	public void IklikEditBtn() {
		driver.findElement(editBtn).click();
	}

}
