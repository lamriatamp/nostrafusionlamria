package com.nostratech;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InventoryStep {
	WebDriver driver;
	LoginPage loginPage;
	InventoryPage inventoryPage;


	@Given("I already on inventory page")
	public void i_already_on_inventory_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		loginPage = new LoginPage(driver);
		loginPage.login("cold15@warunkpedia.com", "Admin19951996!");
		loginPage.clickSigninButton();
		inventoryPage = new InventoryPage(driver);
	}

	@When("I click the master menu button and click supplier")
	public void i_click_the_master_menu_button_and_click_supplier() {
		inventoryPage.clickmasterMenuButton();
		inventoryPage.clickSupplierBtn();
	}

	@When("I click Create button")
	public void i_click_create_button() {
		inventoryPage.IclickCreateBtn(); 
	}

	@When("I set supplier code {string}")
	public void i_set_supplier_code(String code) {
		inventoryPage.IsetSupplierCode(code);
	}

	@When("I set supplier name {string}")
	public void i_set_supplier_name(String name) {
		inventoryPage.IsetSupplierName(name);
	}


	@When("I set region")
	public void i_set_region() {
		inventoryPage.IsetRegion();
	}

	@When("I set add phone Number {string}")
	public void i_set_add_phone_number(String numberphone) {
		inventoryPage.IclickAddphoneNumber();
		inventoryPage.IaddphoneNumber(numberphone);
	}

	@When("I click continueBtn")
	public void i_click_continue_btn() {
		inventoryPage.IclickContinueBtn();
	}

	@When("I set firstname {string}")
	public void i_set_firstname(String firstname) {
		inventoryPage.IsetFirstname(firstname);
	}

	@When("I set lastname {string}")
	public void i_set_lastname(String lastname) {
		inventoryPage.IsetLastname(lastname);
	}

	@When("I set email {string}")
	public void i_set_email(String email) {
		inventoryPage.IsetEmail(email);
	}

	@When("I klik continue btn")
	public void i_klik_continue_btn() {
		inventoryPage.IclickContinueBtn();
	}

	@When("I click add Address")
	public void i_click_add_a_address() {
		inventoryPage.IaddAddress();
	}


	@When("I set Alamat {string}")
	public void i_set_alamat(String alamat) {
		inventoryPage.IsetAlamat(alamat);
	}

	@When("I set city {string}")
	public void i_set_city(String city) {
		inventoryPage.IsetCity(city);
	}

	@When("I set state {string}")
	public void i_set_state(String state) {
		inventoryPage.IsetState(state);
	}

	@When("I set country {string}")
	public void i_set_country(String country) {
		inventoryPage.IsetCountry(country);
	}

	@When("I set zip code {string}")
	public void i_set_zip_code(String zipcode) {
		inventoryPage.IsetZipcode(zipcode);
	}

	@When("I set as primary")
	public void i_set_as_primary() {
		inventoryPage.IsetasPrimary();
	}

	@When("I klik submit Btn")
	public void i_klik_submit_btn() {
		inventoryPage.IclickContinueBtn();
	}

	@When("I klik submit Btn again")
	public void i_klik_submit_btn_again() {
		inventoryPage.IclickContinueBtn();
	}

	@Then("I see success Notif supplier")
	public void i_see_success_notif_supplier() {
		try {
			boolean info = inventoryPage.successNotif();
			Assert.assertEquals(info, true);
			inventoryPage.successNotif();
		} finally {
			driver.quit();
		}
	}

	@Then("I see invalid Notif supplier")
	public void i_see_invalid_notif_supplier() {
		try {
			boolean info = inventoryPage.invalidNotif();
			Assert.assertEquals(info, true);
			inventoryPage.invalidNotif();
		} finally {
			driver.quit();
		}
	}


	@When("I click supp name")
	public void i_click_supp_name() {
		inventoryPage.IclickSuppname();
	}

	@When("I click Edit btn")
	public void i_click_edit_btn() {
		inventoryPage.IclickEditBtn();
	}

	@When("I set update supp code {string}")
	public void i_set_update_supp_code(String code) {
		inventoryPage.IsetSupplierCode(code);
	}

	@When("I click Submit btn edit")
	public void i_click_submit_btn_edit() {
		inventoryPage.IclickContinueBtn();
	}


	@Then("I see success Notif delete")
	public void i_see_success_notif_delete() {
		try {
			boolean info = inventoryPage.successNotif();
			Assert.assertEquals(info, true);
			inventoryPage.successNotif();
		} finally {
			driver.quit();
		}
	}

	@When ("I click Delete btn")
	public void i_click_delete_btn() {
		inventoryPage.IclickActionbtn();
		inventoryPage.IclickDeleteBtn();
	}

	@When ("I click konfirmasi delete")
	public void i_click_konfirmasi_delete() {
		inventoryPage.confirmDelete();
	}


	@When("I click the master menu button and click warehouse")
	public void i_click_the_master_menu_button_and_click_warehouse() {
		inventoryPage.clickmasterMenuButton();
		inventoryPage.IklikWarehouseBtn();
	}
	
	@When("I klik create btn warehouse")
	public void i_klik_create_btn_warehouse() throws InterruptedException {
		inventoryPage.IklikcreateNewWarehouse();
	}

	@When("I set Warehouse code {string}")
	public void i_set_warehouse_code(String codewarehouse) throws InterruptedException {
		inventoryPage.IsetWarehouseCode(codewarehouse);
	}

	@When("I set Warehouse name {string}")
	public void i_set_warehouse_name(String name) throws InterruptedException {
		inventoryPage.IsetWarehouseName(name);
	}

	@When("I set address for warehouse {string}")
	public void i_set_address_for_warehouse(String string) {
		inventoryPage.IsetWarehouseAddress(string);
	}

	@When("I set Rack Code {string}")
	public void i_set_rack_code(String string) {
		inventoryPage.IsetRackCode(string);
	}

	@When("I click Submit button")
	public void i_click_submit_button() {
		inventoryPage.IklikSubmitButton();
	}

	@When("I click code warehouse")
	public void i_click_code_warehouse() {
		inventoryPage.IklikcodeWarehousetoEdit();
	}


	@When("I click edit Btn warehouse")
	public void i_click_edit_btn_warehouse() {
		inventoryPage.IclickEditButtonwarehouse();
	}

	@When("I set update warehouse name {string}")
	public void i_set_update_warehouse_name(String name) throws InterruptedException {
		inventoryPage.IsetWarehouseName(name);
	}

	@Then("I see success notif warehouse")
	public void i_see_success_notif_warehouse() {
		try {
			boolean info = inventoryPage.successNotif();
			Assert.assertEquals(info, true);
			inventoryPage.successNotif();
		} finally {
			driver.quit();
		}
	}

}
