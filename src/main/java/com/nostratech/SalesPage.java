package com.nostratech;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesPage {

	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	int timeoutSec = 60;


	//Locator menu product
	By sales = By.className("SALES");
	By masterMenuButton = By.id("headlessui-menu-button-1");
	By product = By.xpath("//a[normalize-space()='Product']");
	By create = By.name("btn-create");
	By code = By.name("code");
	By name = By.name("name");
	By TypeDropDown = By.cssSelector("div[data-testid='comp-select-type'] div .multiselect__tags");
	By Stockable = By.xpath("//span[normalize-space()='Stockable']");
	By barcode = By.name("barcode");
	By amountsAre = By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/div[2]/form/div[1]/div[2]/div[5]/div/div[2]/div/div[1]");
	By Exclusive = By.xpath("//span[normalize-space()='Exclusive']");
	By UOM = By.xpath("//div[@class='multiselect select__control select__control--grouped select__control--size--sm select__control--rounded--md select__control--required']//div[@class='multiselect__tags']");
	By UOMSelect = By.xpath("//li[@id='unitOfMeasurement-5']//span[1]");
	
	By CheckboxTrack = By.xpath("//input[@id='checkbox-4b19a8eb-936e-4be8-a2cb-4c92d09c3f6e']");

	By CheckboxCanbePurchased = By.name("canBePurchased");
	By purchasePrice = By.name("purchasePrice");
	By salesPrice = By.name("salesPrice");
	By canBeSold = By.name("canBeSold");


	By submitProduct = By.xpath("//button[normalize-space()='Submit Product']");
	By successCreate = By.xpath("//li[@role='status']");
	By ProductActive = By.xpath("//h2[normalize-space()='Product (Active)']");
	By SearchButton = By.name("searchName");
	By ProductName = By.tagName("a");
	By ClickProduct = By.xpath("//a[normalize-space()='Iphone 15 Pro']");
	By ClickEditbutton = By.xpath("//span[normalize-space()='Edit']");
	By SuccessUpadate = By.xpath("//div[normalize-space()='Edited successfully']");
	By ProductDetails = By.xpath("//a[normalize-space()='Yakult']");
	By InfoRecord = By.xpath("//h2[@class='font-medium text-lg text-muted-800 dark:text-muted-100']");
	By SearchField = By.xpath("//input[@id='da472d9d-7b88-4ecb-a179-d6cf0c74637f']");
	By EditButton = By.xpath("//button[@data-testid='btn-edit']");
	By DeleteButton = By.xpath(" //span[normalize-space()='Delete']");
	By Confirmdelete = By.xpath("//button[@class='relative inline-flex items-center justify-center font-medium transition duration-300 focus:outline-none whitespace-nowrap bg-danger-600 hover:bg-danger-700 focus:bg-danger-700 border border-danger-600 text-muted-100 focus:ring-2 focus:ring-offset-2 dark:focus:ring-offset-0 focus:ring-danger-700 dark:focus:ring-danger-500 rounded-md h-9 text-sm px-4']");
	By SuccessDelete = By.xpath("//div[normalize-space()='Deleted successfully']");

	//Locator menu Customer
	By Customer = By.xpath("//a[normalize-space()='Customer']");
	By CustomerCode = By.name("code");
	By CustomerName = By.name("name");
	By Region = By.xpath("//input[@id='region']");


	By KlikNumberPhone = By.xpath("//span[normalize-space()='Add Phone Number']");
	By setNumberPhone = By.name("phones[0]");
	By Notes = By.name("notes");
	By Continue = By.xpath("//button[normalize-space()='Continue']");

	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By Email = By.name("email");
	By BillingAdress = By.xpath("//div[@class='flex flex-col mt-4 gap-4']//div[1]//div[2]//div[1]//div[1]//button[1]//span[1]");
	By DeliveryAdress = By.xpath("//div[@class='flex flex-col mt-4 gap-4']//div[2]//div[2]//div[1]//div[1]//button[1]//span[1]");
	By Address = By.name("address");
	By City = By.name("city");
	By State = By.name("state");
	By Country = By.name("country");
	By ZipCode = By.name("zipCode");
	By PrimaryAddress = By.name("asPrimaryAddress");
	By SubmitBtn = By.xpath("//button[@class='relative inline-flex items-center justify-center font-normal transition duration-300 focus:outline-none hover:bg-primary-700 focus:bg-primary-700 border text-muted-100 focus:ring-2 focus:ring-offset-2 dark:focus:ring-offset-0 focus:ring-primary-700 dark:focus:ring-primary-600 rounded-md h-9 text-sm px-4 !bg-primary-600 !border-primary-600'][normalize-space()='Submit']");
	By FinallySubmit = By.xpath("//button[normalize-space()='Submit']");
	By SuccessCreated = By.xpath("//div[normalize-space()='Created successfully']");
	By SuccessEdited = By.xpath("//div[normalize-space()='Edited successfully']");
	By ErrorCreate = By.xpath("//div[normalize-space()='Code has been used']");
	By invalidNotif = By.xpath("//li[contains(@data-type,'error')]");

	By searchButton = By.name("searchName");
	By NametoEdit = By.xpath("//a[normalize-space()='Michelle']");
	By editButton = By.name("btn-edit-contact");

	//untuk Delete
	By NametoDelete = By.xpath("//a[normalize-space()='Magdalena']");
	By tigaTitik = By.xpath("//button[@id='headlessui-menu-button-31']//*[name()='svg']");
	By DeleteBtn = By.name("btn-delete");
	By ConfirBtn = By.xpath("//button[@class='relative inline-flex items-center justify-center font-normal transition duration-300 focus:outline-none bg-danger-600 hover:bg-danger-700 focus:bg-danger-700 border border-danger-600 text-muted-100 focus:ring-2 focus:ring-offset-2 dark:focus:ring-offset-0 focus:ring-danger-700 dark:focus:ring-danger-500 rounded-md h-9 text-sm px-4']");





	public SalesPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));
		this.actions = new Actions(driver);
		driver.get("https://accounting-devteam-b.nostratech.com/sales-module/dashboard");
	}

	public void clickmasterMenuButton() {
		driver.findElement(masterMenuButton).click();
	}

	public void clickProduct() {
		driver.findElement(product).click();
	}

	public void clickNewProduct() {
		driver.findElement(create).click();;
	}

	public void setCodeProduct(String codee){
		driver.findElement(code).sendKeys(codee);
	}
	public void setNameProduct(String names) {
		driver.findElement(name).sendKeys(names);
	}

	public void setType() {
		driver.findElement(TypeDropDown).click();
	}

	public void Stockable() {
		driver.findElement(Stockable).click();
	}

	public void setBarcode(String Barcode) {
		driver.findElement(barcode).sendKeys(Barcode);
	}
	public void setamountsAre() {
		driver.findElement(amountsAre).click();
	}

	public void Exclusive() {
		driver.findElement(Exclusive).click();;
	}

	public void setUOM() {
		driver.findElement(UOM).click();
	}

	public void setUOMSelect() {
		driver.findElement(UOMSelect).click();
	}


	public void setPurchasePrice(String cost) {
		driver.findElement(purchasePrice).sendKeys(cost);
	}

	public void canBeSold() {
		driver.findElement(canBeSold).click();
	}

	public void setPrice(String price) {
		driver.findElement(salesPrice).sendKeys(price);
	}

	public void ClickSubmit() {
		driver.findElement(submitProduct).click();
	}

	public boolean productInformation() {
		return driver.findElement(successCreate).isDisplayed();
	}

	public void searchProductisAdd(String string) {
		driver.findElement(SearchButton).sendKeys(string);
	}

	public boolean productisDisplayed() {
		return driver.findElement(ProductName).isDisplayed();
	}

	public void ClickProduct() {
		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickProduct));
		product.click();
	}

	public void ClickEditbutton() {
		driver.findElement(ClickEditbutton).click();
	}

	public void setUpdateCode (String codee) {
		WebElement usernameFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(code));

		Actions actions = new Actions(driver);
		actions.moveToElement(usernameFieldElement)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();

		usernameFieldElement.sendKeys(codee);
	}

	public void setUpdateSubmit() {
		driver.findElement(submitProduct).click();
	}

	public String updateproductisDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessUpadate));
			return successElement.getText();
		} catch (NoSuchElementException e) {
			return "Expected message not displayed";
		}
	}

	public boolean errorupdateproductisDisplayed() {
		return driver.findElement(invalidNotif).isDisplayed();
	}

	public void SearchProducttoDelete(String string) {
		driver.findElement(SearchButton).sendKeys(string);
	}

	public void ClicktoDelete() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ClickProduct));
		element.click();
	}


	public void DeleteProduct() {
		driver.findElement(DeleteButton).click();;
	}

	public void ConfirmDelete() {
		driver.findElement(Confirmdelete).click();;
	}

	public String getDeletedMessage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessDelete));
			return successElement.getText();
		} catch (NoSuchElementException e) {
			return "Expected message not displayed";
		}
	}

	public void KlikCustomer() {
		driver.findElement(Customer).click();
	}

	public void KlikCreate() {
		driver.findElement(create).click();;
	}

	public void setCustomerCode(String codes) {
		WebElement codeFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerCode));

		Actions actions = new Actions(driver);
		actions.moveToElement(codeFieldElement)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();

		codeFieldElement.sendKeys(codes);
	}

	public void setCustomerName(String name) {
		driver.findElement(CustomerName).sendKeys(name);
	}

	public void seeRegion() {
		driver.findElement(Region).isDisplayed();
	}

	public void KlikNumberPhone() {
		driver.findElement(KlikNumberPhone).click();
	}

	public void setNumberPhone(String number) {
		driver.findElement(setNumberPhone).sendKeys(number);;
	}

	public void setNotes(String notes) {
		driver.findElement(Notes).sendKeys(notes);;
	}

	public void klikContinue() {
		try {
			WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(Continue));
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", continueButton);
			jsExecutor.executeScript("arguments[0].click();", continueButton);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw e;
		}
	}

	public void setFirstName(String firstname) {
		driver.findElement(FirstName).sendKeys(firstname);;
	}

	public void setLastName(String lastname) {
		driver.findElement(LastName).sendKeys(lastname);;
	}

	public void setEmail(String emails) {
		driver.findElement(Email).sendKeys(emails);;
	}

	public void KlikBillingAddress() {
		driver.findElement(BillingAdress).click();
	}

	public void setAddress(String address) {
		driver.findElement(Address).sendKeys(address);
	}

	public void setCity(String city) {
		driver.findElement(City).sendKeys(city);
	}

	public void setState(String state) {
		driver.findElement(State).sendKeys(state);
	}

	public void setCountry(String country) {
		driver.findElement(Country).sendKeys(country);
	}

	public void setZipCode(String zipcode) {
		driver.findElement(ZipCode).sendKeys(zipcode);
	}

	public void CheckPrimaryAddress() {
		driver.findElement(PrimaryAddress).click();
	}

	public void KlikSubmit() {
		driver.findElement(FinallySubmit).click();

	}

	public void FinallySubmit() {
		try {
			WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(FinallySubmit));
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
			jsExecutor.executeScript("arguments[0].click();", submitButton);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw e;
		}
	}



	public boolean isSuccessCreateDisplayed() {
		try {
			return driver.findElement(SuccessCreated).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public String getSuccessMessage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessCreated));
			return successElement.getText();
		} catch (NoSuchElementException e) {
			return "Expected message not displayed";
		}
	}

	public String getErrorMessage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ErrorCreate));
			return errorElement.getText();
		} catch (NoSuchElementException e) {
			return "Expected error message not displayed";
		}
	}

	public void searchName(String customerName) {
		driver.findElement(searchButton).sendKeys(customerName);;
	}

	public void nametoEdit() {
		driver.findElement(NametoEdit).click();
	}

	public void klikNametoEdit (String namaBaru) {
		driver.findElement(CustomerName).sendKeys(namaBaru);
	}

	public void kliksubmittiEdit () {
		driver.findElement(SubmitBtn).click();
	}

	public boolean getSuccessUpdate() {
		return driver.findElement(SuccessCreated).isDisplayed();

	}

	public void ClicknametoEdit(String customerName) {	
		WebElement searchInput = driver.findElement(searchButton);
		searchInput.clear();
		searchInput.sendKeys(customerName);

		driver.findElement(NametoEdit).click();

	}

	public void IclickEditBtn() {
		driver.findElement(editButton).click();
	}

	public void setnewCustomerName(String namaBaru) {
		WebElement customerFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerName));

		Actions actions = new Actions(driver);
		actions.moveToElement(customerFieldElement)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();

		customerFieldElement.sendKeys(namaBaru);
	}

	public void savenewCustName() {
		driver.findElement(SubmitBtn).click();
	}

	public String EditSuccessDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessEdited));
			return errorElement.getText();
		} catch (NoSuchElementException e) {
			return "Expected error message not displayed";
		}
	}

	public void IKliktitikTigaBtn() {
		driver.findElement(tigaTitik).click();
	}

	public void KlikNamatoDelete(String customerName) {
		WebElement searchInput = driver.findElement(searchButton);
		searchInput.clear();
		searchInput.sendKeys(customerName);

		driver.findElement(NametoDelete).click();
	}

	public void IklikDeleteBtn() {
		driver.findElement(DeleteBtn).click();
	}

	public void IklikConfirmBtn() {
		driver.findElement(ConfirBtn).click();
	}

	public String DeleteSuccessDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessDelete));
			return errorElement.getText();
		} catch (NoSuchElementException e) {
			return "Expected error message not displayed";
		}
	}

	public void KlikCreateSQ() {
		driver.findElement(create).click();
	}


}





