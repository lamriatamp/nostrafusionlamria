package com.nostratech;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesQuotationStep {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	SalesQuotationPage salesQuotationPage;
	
	
	
	@Given("I already on sales page")
	public void i_already_on_sales_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		loginPage = new LoginPage(driver);
		loginPage.login("cold15@warunkpedia.com", "Admin19951996!");
		loginPage.clickSigninButton();
		dashboardPage = new DashboardPage(driver);
		salesQuotationPage = new SalesQuotationPage(driver);
	}


	@When("I click the transaction menu button")
	public void i_click_the_transaction_menu_button() {
		salesQuotationPage.clickTransactionBtn();
		
	}

	@When("I click sales quotation")
	public void i_click_sales_quotation() {
		salesQuotationPage.clickSalesQuotation();
	}

	@When("I click new sales quotation")
	public void i_click_new_sales_quotation() {
		salesQuotationPage.KlikCreateBtn();
	}
	
	@When("I Klik customer in sales quotation")
	public void i_klik_customer_in_sales_quotation() {
		salesQuotationPage.SetfieldCust();
	}

	@When("I set customer in sales quotation")
	public void i_set_customer_in_sales_quotation() {
		salesQuotationPage.setCustomer();
	}


	@When("I set Sales Quotation Date")
	public void i_set_sales_quotation_date() {
		salesQuotationPage.KlikfieldSQDate();
		salesQuotationPage.setSQDate();
	}

	@When("I set Sales Quotation Number {string}")
	public void i_set_sales_quotation_number(String string) {
		salesQuotationPage.SetPONumber(string);
	}

	@When("I set Customer PO Number {string}")
	public void i_set_customer_po_number(String string) {
		salesQuotationPage.SetPONumber(string);
	}

	@When("I set Salesperson {string}")
	public void i_set_salesperson(String string) {
		salesQuotationPage.SetSalesPerson(string);
	}

	@When("I set Est. Delivery Date {string}")
	public void i_set_est_delivery_date(String string) {
		salesQuotationPage.setEstDate(string);
	}

	@When("I Klik item")
	public void i_klik_item() {
		salesQuotationPage.KlikfieldColoumn();
	}
	
	@When("I set Item")
	public void i_set_item() {
		salesQuotationPage.setItem();
	}
	

	@When("I klik submit")
	public void i_klik_submit() {
		salesQuotationPage.KlikSubmitBtn();
	}

	@Then("I see success Notif")
	public void i_see_success_notif() {
		try {
			boolean info = salesQuotationPage.successNotif();
			Assert.assertEquals(info, true);
			salesQuotationPage.successNotif();
		} finally {
			driver.quit();
		}
	}
	
	@When("I click Elemen to update")
	public void i_click_elemen_to_update() {
	    salesQuotationPage.KlikUpadate();
	}
	
	@When("I Klik Edit button")
	public void i_klik_edit_button() {
	    salesQuotationPage.IklikEditBtn();
	}
	
	@When("I set update Customer PO Number {string}")
	public void i_set_update_customer_po_number(String string) {
	    salesQuotationPage.SetPONumber(string);
	}
	
	@Then("I see success Notif update")
	public void i_see_success_notif_update() {
		try {
			boolean info = salesQuotationPage.successNotif();
			Assert.assertEquals(info, true);
			salesQuotationPage.successNotif();
		} finally {
			driver.quit();
		}
	}

}
