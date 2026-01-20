package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By searchBox =
            By.xpath("//input[@placeholder='Search for Products, Brands and More']");
    private By searchButton =
            By.xpath("//button[@type='submit']");

    // Action
    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }
}

