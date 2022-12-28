package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StorePage extends BasePage {

    public StorePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//*[@id=\"cat\"]")
    private WebElement txtCategories;
    public WebElement getTxtCategories() {
        return txtCategories;
    }

    @FindBy(xpath = "//*[@id=\"itemc\"][1]")
    private WebElement txtPhones;
    public WebElement getTxtPhones() {
        return txtPhones;
    }

    @FindBy(xpath = "//*[@id=\"itemc\"][2]")
    private WebElement txtLaptops;
    public WebElement getTxtLaptops() {
        return txtLaptops;
    }

    @FindBy(xpath = "//*[@id=\"itemc\"][3]")
    private WebElement txtMonitors;
    public WebElement getTxtMonitors() {
        return txtMonitors;
    }

    @FindBy(xpath = "//a[contains(text(),'Nexus 6')]")
    private WebElement txtProduct;
    public WebElement getTxtProduct() {
        return txtProduct;
    }

    @FindBy(xpath = "//*[@id=\"imgp\"]/div/img")
    private WebElement imgProduct;
    public WebElement getImgProduct() {
        return imgProduct;
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/h2")
    private WebElement txtProductTitle;
    public WebElement getTxtProductTitle() {
        return txtProductTitle;
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/h3")
    private WebElement txtProductPrice;
    public WebElement getTxtProductPrice() {
        return txtProductPrice;
    }

    @FindBy(xpath = "//*[@id=\"more-information\"]/p")
    private WebElement txtProductDescription;
    public WebElement getTxtProductDescription() {
        return txtProductDescription;
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    private WebElement btnAddToCart;
    public WebElement getBtnAddToCart() {
        return btnAddToCart;
    }

    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[4]/a")
    private WebElement btnCart;
    public WebElement getBtnCart() {
        return btnCart;
    }

    @FindBy(xpath = "//*[@id=\"imgp\"]/div/img")
    private WebElement imgCartProduct;
    public WebElement getImgCartProduct() {
        return imgCartProduct;
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[2]")
    private WebElement txtCartProductTitle;
    public WebElement getTxtCartProductTitle() {
        return txtCartProductTitle;
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[3]")
    private WebElement txtCartProductPrice;
    public WebElement getTxtCartProductPrice() {
        return txtCartProductPrice;
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[4]")
    private WebElement txtCartProductDelete;
    public WebElement getTxtCartProductDelete() {
        return txtCartProductDelete;
    }

    @FindBy(xpath = "//*[@id=\"totalp\"]")
    private WebElement txtTotalProductPrice;
    public WebElement getTxtTotalProductPrice() {
        return txtTotalProductPrice;
    }

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    private WebElement btnPlaceOrder;
    public WebElement getBtnPlaceOrder() {
        return btnPlaceOrder;
    }
}