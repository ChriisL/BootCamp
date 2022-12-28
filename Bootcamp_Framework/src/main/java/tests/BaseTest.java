package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver = getDriver();

    private WebDriver getDriver() {
        setupDriver("chrome");
        return driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    private void setupDriver(String browserName) {
        switch(browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "geckodriver");
                //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Web Driver was not found in directory");
                break;
        }
    }

    public void print(String text) {
        System.out.println(text);
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        driver.quit();
    }
}
