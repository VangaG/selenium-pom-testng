package com.automation.pages;

import org.openqa.selenium.By;

public class ProductPage {

    // Locator
    private By addToCart =
            By.xpath("//button[contains(text(),'Add')]");

    public By getAddToCart() {
        return addToCart;
    }
}

