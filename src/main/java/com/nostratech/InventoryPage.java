package com.nostratech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	int timeoutSec = 45;


	//Locator for Supplier
	By masterMenuButton = By.id("headlessui-menu-button-1");
	By SupplierBtn = By.xpath("//a[normalize-space()='Supplier']");
	By CreateBtn = By.name("btn-create");
	By codeField = By.name("code");
	By nameField = By.name("name");
	By Region = By.xpath("//div[@class='multiselect__tags']");
	By AddPhonenumber = By.xpath("//span[normalize-space()='Add Phone Number']");
	By Phonenumber = By.name("phones[0]");
	By ContinueBtn = By.name("btn-submit");
	By SubmitBtn = By.name("btn-submit");
	By Firstname = By.name("firstName");
	By Lastname = By.name("lastName");
	By email = By.name("email");
	By Addaddress = By.xpath("//div[@class='flex flex-col mt-4 gap-4']//div[1]//div[2]//div[1]//div[1]//button[1]");
	By Alamat = By.name("address");
	By City = By.name("city");
	By State = By.name("state");
	By Country = By.name("country");
	By Zipcode = By.name("zipCode");
	By SetasPrimary = By.name("asPrimaryAddress");
	By invalidNotif = By.xpath("//li[contains(@data-type,'error')]");
	By SuccessNotif = By.xpath("//li[contains(@data-type,'success')]");
	By Editbtn = By.name("btn-edit-contact");
	By Suppname = By.xpath("//a[normalize-space()='Automation Tests 4977']");
	By actionBtn = By.cssSelector(".dropdown__action-button-icon");
	By DeleteBtn = By.name("btn-delete");
	By confirmDelete = By.xpath("//button[@class='relative inline-flex items-center justify-center font-medium transition duration-300 focus:outline-none whitespace-nowrap bg-danger-600 hover:bg-danger-700 focus:bg-danger-700 border border-danger-600 text-muted-100 focus:ring-2 focus:ring-offset-2 dark:focus:ring-offset-0 focus:ring-danger-700 dark:focus:ring-danger-500 rounded-md h-9 text-sm px-4']");

	//Locator for Warehouse
	By WarehouseBtn = By.xpath("//a[normalize-space()='Warehouse']");
	By rackCode = By.name("racks[0]");
	By SubmitButton = By.xpath("//button[normalize-space()='Submit']");
	By codeWarehouse = By.xpath("//a[normalize-space()='MDN-120403']");
	By editWarehouse = By.xpath("//button[@type='button']//div[@class='flex items-center gap-1']");
	By createNewWarehouse = By.xpath("//span[normalize-space()='Create New Warehouse']");

	
	//Locator for Good Receipt
	By operationBtn = By.xpath("//button[@id='headlessui-menu-button-3']");
	By grBtn = By.xpath("//a[normalize-space()='Goods Receipt']");
	By supplierSelected = By.cssSelector("#supplier");
	By suppSelect = By.xpath("//span[@class='multiselect__option--highlight multiselect__option']");
	By selectedPO = By.xpath("//span[normalize-space()='Select Purchase Order']");
	By selectPO = By.xpath("//span[normalize-space()='PO-00022']");
	By suppDONumber = By.name("supplier_do_number");
	By setReceivedQty = By.name("products[0].batchs[0].qty_received");
	By submitBtn = By.xpath("//button[normalize-space()='Submit']");
	By submitAgain = By.xpath("//button[@type='button'][normalize-space()='Submit']");
	By Createbutton = By.xpath("//span[normalize-space()='Create New Goods Receipt']");

	
	
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));
		this.actions = new Actions(driver);
		driver.get("https://accounting-devteam-b.nostratech.com/inventory-module/dashboard");
	}

	public void clickmasterMenuButton() {
		driver.findElement(masterMenuButton).click();
	}

	public void clickSupplierBtn() {
		driver.findElement(SupplierBtn).click();
	}

	public void IclickCreateBtn() {
		driver.findElement(CreateBtn).click();
	}

	public void IsetSupplierCode(String code) {
		WebElement SupplierCode = wait.until(ExpectedConditions.visibilityOfElementLocated(codeField));

		Actions actions = new Actions(driver);
		actions.moveToElement(SupplierCode)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();

		SupplierCode.sendKeys(code);
	}

	public void  IsetSupplierName(String name) {
		driver.findElement(nameField).sendKeys(name);
	}

	public void IsetRegion() {
		driver.findElement(Region).isDisplayed();

	}

	public void IclickAddphoneNumber() {
		driver.findElement(AddPhonenumber).click();
	}

	public void IaddphoneNumber(String numberphone) {
		driver.findElement(Phonenumber).sendKeys(numberphone);
	}

	public void KlikSubmitBtn() {
		driver.findElement(SubmitBtn).click();
	}

	public void IclickContinueBtn() {
		try {
			WebElement ContinueButton = wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ContinueButton);
			jsExecutor.executeScript("arguments[0].click();", ContinueButton);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw e;
		}
	}

	public void IsetFirstname(String firstname) {
		driver.findElement(Firstname).sendKeys(firstname);
	}

	public void IsetLastname(String lastname) {
		driver.findElement(Lastname).sendKeys(lastname);
	}

	public void IsetEmail(String sendemail) {
		driver.findElement(email).sendKeys(sendemail);
	}

	public void IaddAddress() {
		driver.findElement(Addaddress).click();
	}

	public void IsetAlamat(String alamat) {
		driver.findElement(Alamat).sendKeys(alamat);
	}

	public void IsetCity(String city) {
		driver.findElement(City).sendKeys(city);
	}

	public void IsetState(String state) {
		driver.findElement(State).sendKeys(state);
	}

	public void IsetCountry(String country) {
		driver.findElement(Country).sendKeys(country);
	}

	public void IsetZipcode(String zipcode) {
		driver.findElement(Zipcode).sendKeys(zipcode);
	}

	public void IsetasPrimary() {
		driver.findElement(SetasPrimary).click();
	}

	public boolean successNotif() {
		return driver.findElement(SuccessNotif).isDisplayed();
	}

	public boolean invalidNotif() {
		return driver.findElement(invalidNotif).isDisplayed();
	}

	public void IclickEditBtn() {
		driver.findElement(Editbtn).click();
	}
	public void IclickSuppname() {
		driver.findElement(Suppname).click();
	}

	public void IclickActionbtn() {
		driver.findElement(actionBtn).click();
	}

	public void IclickDeleteBtn() {
		driver.findElement(DeleteBtn).click();
	}

	public void confirmDelete() {
		driver.findElement(confirmDelete).click();
	}

	public void IklikWarehouseBtn() {
		driver.findElement(WarehouseBtn).click();
	}public void IklikcreateNewWarehouse() throws InterruptedException {
	    driver.findElement(createNewWarehouse).click();
	    Thread.sleep(1000); // Beri jeda waktu 1 detik setelah klik
	}

	public void IsetWarehouseCode(String codewarehouse) throws InterruptedException {
	    WebElement warehouseCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(codeField));
	    warehouseCodeField.clear();
	    warehouseCodeField.sendKeys(codewarehouse);
	    Thread.sleep(1000); // Beri jeda waktu 1 detik setelah mengisi kode
	}

	public void IsetWarehouseName(String name) throws InterruptedException {
	    WebElement WarehouseName = wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));

	    Actions actions = new Actions(driver);
	    actions.moveToElement(WarehouseName)
	        .click()
	        .keyDown(Keys.CONTROL)
	        .sendKeys("a")
	        .keyUp(Keys.CONTROL)
	        .sendKeys(Keys.BACK_SPACE)
	        .perform();

	    WarehouseName.sendKeys(name);
	    Thread.sleep(1000); // Beri jeda waktu 1 detik setelah mengisi nama warehouse
	}

	public void IsetWarehouseAddress(String alamat) {
		driver.findElement(Alamat).sendKeys(alamat);
	}

	public void IsetRackCode(String rackcode) {
		driver.findElement(rackCode).sendKeys(rackcode);
	}

	public void IclickEditButtonwarehouse() {
		driver.findElement(editWarehouse).click();
	}

	public void IklikSubmitButton() {
		driver.findElement(SubmitButton).click();
	}

	public void IklikcodeWarehousetoEdit() {
		try {
			WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(codeWarehouse));
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", editButton);
			jsExecutor.executeScript("arguments[0].click();", editButton);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw e;
		}
	}


	public void IclickOperationBtn() {
		driver.findElement(operationBtn).click();
	}

	public void IclickGRbtn() {
		driver.findElement(grBtn).click();
	}

	public void IclickCreateNewBtnGR() {
		driver.findElement(Createbutton).click();
	}
	

	public void IklikselectSupplier() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement supplierElement = wait.until(ExpectedConditions.elementToBeClickable(supplierSelected));
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", supplierElement);
	    supplierElement.click();
	}

	public void IklikSelectsupp(String supplier) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement suppElement = wait.until(ExpectedConditions.elementToBeClickable(suppSelect));
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", suppElement);
	    suppElement.sendKeys(supplier);
	}

	public void IklikselectedPO() {
		driver.findElement(selectedPO).click();
	}
	
	public void IklikselectPO() {
		driver.findElement(selectPO).click();
	}
	
	public void ISetsuppDONumber(String DeliveryOrderNumber) {
		driver.findElement(suppDONumber).sendKeys(DeliveryOrderNumber);
	}
	
	public void IsetReceivedQty(String Qty) {
		driver.findElement(setReceivedQty).sendKeys(Qty);
	}
	
	public void IklikSubmitBtn() {
		driver.findElement(submitBtn).click();
	}
	
	public void IklikSubmitBtnAgain() {
		driver.findElement(submitAgain).click();
	}


}

