package com.automation.pages;

import org.openqa.selenium.By;

public class CartPage {

    // Locator
    private By placeOrder =
            By.xpath("//span[normalize-space()='Place Order']");

    public By getPlaceOrder() {
        return placeOrder;
    }
}

