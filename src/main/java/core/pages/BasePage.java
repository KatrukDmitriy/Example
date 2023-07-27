package core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
    public static WebDriver driver;

    public BasePage() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openUrl(String pageUrl) {
        driver.navigate().to(pageUrl);
    }

}
