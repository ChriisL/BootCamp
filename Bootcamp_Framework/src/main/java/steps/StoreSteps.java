package steps;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pageobjects.StorePage;

import java.time.Duration;

public class StoreSteps extends BaseSteps {

    public StoreSteps(WebDriver webDriver) {
        super(webDriver);
    }
    StorePage storePage = PageFactory.initElements(webDriver, StorePage.class);

    public String getCategoriesText() {
        return getElementText(storePage.getTxtCategories());
    }
    public String getPhonesText() {
        return getElementText(storePage.getTxtPhones());
    }
    public String getLaptopsText() {
        return getElementText(storePage.getTxtLaptops());
    }
    public String getMonitorsText() {
        return getElementText(storePage.getTxtMonitors());
    }
    public String getTitle() {
        return webDriver.getTitle();
    }

    public void clickProduct() {
        storePage.getTxtProduct().click();
    }

    public void getProductImage() {
        storePage.getImgProduct();
    }

    public String getProductTitle() {
        return getElementText(storePage.getTxtProductTitle());
    }

    public String getProductPrice() {
        return getElementText(storePage.getTxtProductPrice());
    }

    public String getProductDescription() {
        return getElementText(storePage.getTxtProductDescription());
    }

    public String getAddToCartBtn() {
        return getElementText(storePage.getBtnAddToCart());
    }
    public void clickAddToCart() {
        storePage.getBtnAddToCart().click();
    }

    public void clickCart() {
        storePage.getBtnCart().click();
    }

    public void getCartProductImage() {
        storePage.getImgCartProduct();
    }

    public String getCartProductTitle() {
        return getElementText(storePage.getTxtCartProductTitle());
    }

    public String getCartProductPrice() {
        return getElementText(storePage.getTxtCartProductPrice());
    }

    public String getCartProductDelete() {
        return getElementText(storePage.getTxtCartProductDelete());
    }

    public String getCartTotalProductPrice() {
        return getElementText(storePage.getTxtTotalProductPrice());
    }

    public String getPlaceOrderBtn() {
        return getElementText(storePage.getBtnPlaceOrder());
    }
    public Wait<WebDriver> waitForElementUsingFluentWait(long seconds, long millis) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofMillis(millis)).ignoring(NoSuchElementException.class);
        return wait;
    }

}
