package tests;

import steps.StoreSteps;
import org.testng.annotations.Test;

public class StoreTests extends BaseTest {
    StoreSteps storeSteps = new StoreSteps(driver);

    @Test(testName = "SR-12111", priority = 1, suiteName = "Store Tests",
            description = "Test categories available on the web site")
    public void categories() throws InterruptedException {
        String expectedCategoryText = "CATEGORIES";
        String expectedPhonesText = "Phones";
        String expectedLaptopsText = "Laptops";
        String expectedMonitorsText = "Monitors";

        Thread.sleep(3000);
        String actualCategoryText = String.valueOf(storeSteps.getCategoriesText());
        String actualPhonesText = String.valueOf(storeSteps.getPhonesText());
        String actualLaptopsText = String.valueOf(storeSteps.getLaptopsText());
        String actualMonitorsText = String.valueOf(storeSteps.getMonitorsText());

        CustomAssertions.isTextEqual(expectedCategoryText, actualCategoryText);
        CustomAssertions.isTextEqual(expectedPhonesText, actualPhonesText);
        CustomAssertions.isTextEqual(expectedLaptopsText, actualLaptopsText);
        CustomAssertions.isTextEqual(expectedMonitorsText, actualMonitorsText);
    }
    @Test(testName = "SR-12120", priority = 2, suiteName = "Store Tests",
            description = "Test to validate in the product page the: " +
            "- Add to cart button\n" +
            "- Product description\n" +
            "- Price\n" +
            "- Name of product\n" +
            "- Image of product")
    public void product() throws InterruptedException {
        Thread.sleep(3000);
        storeSteps.clickProduct();
        storeSteps.getProductImage();

        String expectedProductTitle = "Nexus 6";
        String expectedProductPrice = "$650 *includes tax";
        String expectedProductDescription = "The Motorola Google Nexus 6 is powered by " +
                "2.7GHz quad-core Qualcomm Snapdragon 805 processor and it comes with 3GB of RAM.";
        String expectedAddToCartBtn = "Add to cart";

        Thread.sleep(3000);
        String actualProductTitle = String.valueOf(storeSteps.getProductTitle());
        String actualProductPrice = String.valueOf(storeSteps.getProductPrice());
        String actualProductDescription = String.valueOf(storeSteps.getProductDescription());
        String actualAddToCartBtn = String.valueOf(storeSteps.getAddToCartBtn());

        CustomAssertions.isTextEqual(expectedProductTitle, actualProductTitle);
        CustomAssertions.isTextEqual(expectedProductPrice, actualProductPrice);
        CustomAssertions.isTextEqual(expectedProductDescription, actualProductDescription);
        CustomAssertions.isTextEqual(expectedAddToCartBtn, actualAddToCartBtn);
    }
    @Test(testName = "SR-12121", priority = 3, suiteName = "Store Tests",
            description = "Test to validate the information below in the browser alert:\n" +
            "Product added\n" +
            "OK button to accept")
    public void browserAlert() throws InterruptedException {
        Thread.sleep(3000);
        storeSteps.clickProduct();
        Thread.sleep(3000);
        storeSteps.clickAddToCart();
        Thread.sleep(3000);
        String expectedBrowserAlertText = "Product added";
        String actualBrowserAlertText = String.valueOf(driver.switchTo().alert().getText());
        CustomAssertions.isTextEqual(expectedBrowserAlertText, actualBrowserAlertText);
        driver.switchTo().alert().accept();
    }
    @Test(testName = "SR-12130", priority = 4, suiteName = "Store Tests",
            description = "Test cart link to validate the below information:\n" +
            "1. List of items added including picture, title, price and delete link\n" +
            "2. Total of items prices\n" +
            "3. Place order button")
    public void cart() throws InterruptedException {
        Thread.sleep(3000);
        storeSteps.clickProduct();
        Thread.sleep(3000);
        storeSteps.clickAddToCart();
        Thread.sleep(3000);
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        storeSteps.clickCart();
        Thread.sleep(3000);
        storeSteps.getCartProductImage();

        String expectedCartProductTitle = "Nexus 6";
        String expectedCartProductPrice = "650";
        String expectedCartProductDelete = "Delete";
        String expectedCartTotalProductPrice = "650"; //change to 1300 if you run the testNG xml
        String expectedCartPlaceOrderBtn = "Place Order";

        Thread.sleep(3000);
        String actualCartProductTitle = String.valueOf(storeSteps.getCartProductTitle());
        String actualCartProductPrice = String.valueOf(storeSteps.getCartProductPrice());
        String actualCartProductDelete = String.valueOf(storeSteps.getCartProductDelete());
        String actualCartTotalProductPrice = String.valueOf(storeSteps.getCartTotalProductPrice());
        String actualCartPlaceOrderBtn = String.valueOf(storeSteps.getPlaceOrderBtn());

        CustomAssertions.isTextEqual(expectedCartProductTitle, actualCartProductTitle);
        CustomAssertions.isTextEqual(expectedCartProductPrice, actualCartProductPrice);
        CustomAssertions.isTextEqual(expectedCartProductDelete, actualCartProductDelete);
        CustomAssertions.isTextEqual(expectedCartTotalProductPrice, actualCartTotalProductPrice);
        CustomAssertions.isTextEqual(expectedCartPlaceOrderBtn, actualCartPlaceOrderBtn);
    }
}