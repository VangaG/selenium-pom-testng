package com.automation.tests;


import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.SearchResultsPage;
import com.automation.utils.WaitUtils;

public class FlipkartTest extends BaseTest {

	@Test
	public void addMobileToCartTest() {

	    HomePage homePage = new HomePage(driver);
	    SearchResultsPage resultsPage = new SearchResultsPage(driver);
	    ProductPage productPage = new ProductPage();
	    CartPage cartPage = new CartPage();
	    WaitUtils waitUtils = new WaitUtils(wait);

	    // Search
	    homePage.searchProduct("mobiles");

	    // Click product
	    resultsPage.clickProduct();

	    // Switch to new tab
	    waitUtils.switchToNewTab(driver);

	    // Add to cart
	    waitUtils.clickWhenReady(productPage.getAddToCart());

	    // Place order
	    waitUtils.clickWhenReady(cartPage.getPlaceOrder());
	}

    }


