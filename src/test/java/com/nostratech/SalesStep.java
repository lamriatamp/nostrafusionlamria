package com.nostratech;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesStep {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	SalesPage salesPage;

	
	@Given("I already on sales page with the email {string} and password {string}")
	public void i_already_on_sales_page_with_the_email_and_password(String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		loginPage = new LoginPage(driver);
		loginPage.login("cold15@warunkpedia.com", "Admin19951996!");
		loginPage.clickSigninButton();
		dashboardPage = new DashboardPage(driver);
		salesPage = new SalesPage(driver);

	}

	@When("I click the master menu button")
	public void i_click_the_master_menu_button() {
		salesPage.clickmasterMenuButton();
	}

	@And("I click product")
	public void i_click_product() {
		salesPage.clickProduct();
	}

	@And("I click new product")
	public void i_click_new_product() {
		salesPage.clickNewProduct();
	}


	@And("I set code product {string}")
	public void i_set_code_product(String string) {
		salesPage.setCodeProduct(string);
	}

	@And("I set name product {string}")
	public void i_set_name_product(String names) {
		salesPage.setNameProduct(names);
	}

	@And("I set type")
	public void i_set_type() {
		salesPage.setType();
	}

	@And("I set stockable")
	public void i_set_stockable() {
		salesPage.Stockable();
	}

	@And("I set barcode {string}")
	public void i_set_barcode(String Barcode) {
		salesPage.setBarcode(Barcode);
	}

	@And("I set amounts are")
	public void i_set_amounts_are() {
		salesPage.setamountsAre();
	}

	@And("I click Exclusive")
	public void i_click_exclusive() {
		salesPage.Exclusive();
	}

	@And("I set UOM")
	public void i_set_uom() {
		salesPage.setUOM();
	}

	@And("I select UOM")
	public void i_select_uom() {
		salesPage.setUOMSelect();
	}


	@And("I click Submit")
	public void i_click_submit() {
		salesPage.ClickSubmit();
	}

	@Then("I should see message success create {string}")
	public void i_should_see_message_success_create(String expectedMessage) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			String actualMessage = wait.until(driver -> salesPage.getSuccessMessage());
			Assert.assertEquals("Created successfully", expectedMessage, actualMessage);
		} finally {
			driver.quit();
		}
	}




	@When("I clik search button and type product name {string}")
	public void i_clik_search_button_and_type_product_name(String string) {
		salesPage.clickmasterMenuButton();
		salesPage.clickProduct();
		salesPage.searchProductisAdd(string);


	}

	@Then("I should see product displayed")
	public void i_should_see_product_displayed() {
		try {
			boolean info = salesPage.productisDisplayed();
			Assert.assertEquals(info, true);
			salesPage.productisDisplayed();
		} finally {
			driver.quit();
		}
	}

	@When("I click menu product")
	public void i_click_menu_product() {
		salesPage.clickmasterMenuButton();
		salesPage.clickProduct();
	}

	@And("I click edit button")
	public void i_click_edit_button() {
		salesPage.ClickProduct();
		salesPage.ClickEditbutton();
	}

	@And("I set update code {string}")
	public void i_set_update_code(String codee) {
		salesPage.setUpdateCode(codee);
	}

	@And("I set update submit")
	public void i_set_update_submit() {
		salesPage.setUpdateSubmit();
	}

	@Then("I should see update product displayed {string}")
	public void i_should_see_update_product_displayed(String expectedMessage) {		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			String actualMessage = wait.until(driver -> salesPage.updateproductisDisplayed());
			Assert.assertEquals("Edited successfully", expectedMessage, actualMessage);
		} finally {
			driver.quit();
		}
	}
	
	@Then("I should see error update product displayed")
	public void i_should_see_error_update_product_displayed() {
		try {
			boolean info = salesPage.errorupdateproductisDisplayed();
			Assert.assertEquals(info, true);
			salesPage.errorupdateproductisDisplayed();
		} finally {
			driver.quit();
		}
	}


	@And("I click delete")
	public void i_click_delete() {
		salesPage.ClickProduct();
		salesPage.DeleteProduct();
	}
	
	@And("I click deleted")
	public void i_click_deleted() {
		salesPage.DeleteProduct();
	}

	@And("I confirm delete")
	public void i_confirm_delete() {
		salesPage.ConfirmDelete();

	}

	@Then("I should see deleted product displayed {string}")
	public void i_should_see_deleted_product_displayed(String expectedMessage) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			String actualMessage = wait.until(driver -> salesPage.getDeletedMessage());
			Assert.assertEquals("Deleted successfully", expectedMessage, actualMessage);
		} finally {
			driver.quit();
		}

	}


	@When("I click Customer")
	public void i_click_customer() {
		salesPage.KlikCustomer();
	}

	@And("I click new Customer")
	public void i_click_new_customer() {
		salesPage.KlikCreate();
	}

	@And("I set Customer Code {string}")
	public void i_set_customer_code(String codes) {
		salesPage.setCustomerCode(codes);
	}
	@And ("I set Customer Name {string}")
	public void i_customer_name(String name ) {
		salesPage.setCustomerName(name);
	}

	@And ("I see Region Indonesia")
	public void i_see_region_indonesia () {
		salesPage.seeRegion();
	}

	@And("I click Number Phone")
	public void i_klik_number_phone() {
		salesPage.KlikNumberPhone();
	}

	@And("I set Number Phone {string}")
	public void i_set_number_phone(String number) {
		salesPage.setNumberPhone(number);
	}

	@And("I set Notes {string}")
	public void i_set_notes(String notes) {
		salesPage.setNotes(notes);
	}

	@And("I click Continue")
	public void i_click_continue() {
		salesPage.klikContinue();

	}

	@And ("I set First Name {string}")
	public void i_set_first_name(String firstname) {
		salesPage.setFirstName(firstname);
	}

	@And("I set Last Name {string}")
	public void i_set_last_name(String lastname) {
		salesPage.setLastName(lastname);
	}

	@And("I set Email {string}")
	public void i_set_email (String emails) {
		salesPage.setEmail(emails);
	}

	@And ("I click Continues")
	public void i_click_continues() {
		salesPage.klikContinue();
	}

	@And("I click Billing Address")
	public void i_click_billing_address() {
		salesPage.KlikBillingAddress();
	}

	@And("I set Address {string}")
	public void i_set_address(String address) {
		salesPage.setAddress(address);
	}

	@And("I set City {string}")
	public void i_set_city(String city) {
		salesPage.setCity(city);
	}

	@And("I set State {string}")
	public void i_set_state(String state) {
		salesPage.setState(state);
	}

	@And("I set Country {string}")
	public void i_set_country(String country) {
		salesPage.setCountry(country);
	}

	@And("I set Zip Code {string}")
	public void i_set_zip_code(String zipcode) {
		salesPage.setZipCode(zipcode);
	}


	@And("I click as Primary Address")
	public void i_click_as_primary_address() {
		salesPage.CheckPrimaryAddress();	
	}

	@And("I click Submits")
	public void i_click_submits() {
		salesPage.FinallySubmit();
	}

	@And("I click Finally Submit")
	public void i_click_finally_submit() {
		salesPage.FinallySubmit();
	}

	@Then("I should see {string}")
	public void i_should_see(String expectedMessage) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			String actualMessage = wait.until(driver -> salesPage.getSuccessMessage());
			Assert.assertEquals("Created successfully", expectedMessage, actualMessage);
		} finally {
			driver.quit();
		}
	}

	@Then("I should see error message {string}")
	public void i_should_see_error_message(String expectedErrorMessage) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			String actualMessage = wait.until(driver -> salesPage.getErrorMessage());
			Assert.assertEquals("Code has been used", expectedErrorMessage, actualMessage);
		} finally {
			driver.quit();
		}
	}

	@And("I click name to edit {string}")
	public void i_click_name_to_edit(String EditName) {
		salesPage.ClicknametoEdit(EditName);
	}

	@When("I click edit button customer")
	public void i_click_edit_button_customer() {
		salesPage.IclickEditBtn();
	}

	@When("I click nama to edit {string}")
	public void i_click_nama_to_edit(String namaBaru) {
		salesPage.setnewCustomerName(namaBaru);
	}

	@When("I click submit edit")
	public void i_click_submit_edit() {
		salesPage.savenewCustName();
	}

	@Then("I should see success edit {string}")
	public void i_should_see_success_edit(String expectedMessage) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			String actualMessage = wait.until(driver -> salesPage.EditSuccessDisplayed());
			Assert.assertEquals("Edited successfully", expectedMessage, actualMessage);
		} finally {
			driver.quit();
		}
	}

	@When("I click search button to see delete name {string}")
	public void i_click_search_button_to_see_delete_name(String Deletename) {
		salesPage.KlikNamatoDelete(Deletename);
	}

	@When("I click titik tiga button")
	public void i_click_titik_tiga_button() {
		salesPage.IKliktitikTigaBtn();
	}

	@When("I klik delete button")
	public void i_klik_delete_button() {
		salesPage.IklikDeleteBtn();
	}

	@When("I click confirm delete button")
	public void i_click_confirm_delete_button() {
		salesPage.IklikConfirmBtn();
	}

	@Then("I should see success delete {string}")
	public void i_should_see_success_delete(String expectedMessage) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			String actualMessage = wait.until(driver -> salesPage.DeleteSuccessDisplayed());
			Assert.assertEquals("Deleted successfully", expectedMessage, actualMessage);
		} finally {
			driver.quit();
		}
	}

}



