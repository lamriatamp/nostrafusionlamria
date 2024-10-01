package com.nostratech;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    WebDriver driver;
    WebDriverWait wait;
    int timeoutSec = 50;

    By dashboard = By.xpath("//img[@class='w-24 h-24 rounded-full object-cover']");
    By sales = By.cssSelector(".SALES.flex.flex-col.items-center.p-6.text-center.outline-none"); 
    By titleDashboard = By.id("page__title");
    By inventory = By.xpath("//h5[normalize-space()='Inventory']");
    
  
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));  
        driver.get("https://accounting-devteam-b.nostratech.com/apps");
    }
    
    public void clickSalesButton() {
    	driver.findElement(sales).click();	
    }
    
    public void clickInventoryButton() {
    	driver.findElement(inventory).click();
    }

    public boolean titleDashboardDisplayed() {
        return driver.findElement(titleDashboard).isDisplayed();
    }
    
    
}
