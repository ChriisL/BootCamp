package pageobjects;

import org.openqa.selenium.WebDriver;

//POM -> Page Object Model Base
public class BasePage {
    WebDriver webDriver;

    public BasePage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

}
