package com.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator (example product)
    private By product =
            By.xpath("//div[normalize-space()='Ai+ Pulse (Purple, 64 GB)']");

    // Action
    public void clickProduct() {
        driver.findElement(product).click();
    }
}

