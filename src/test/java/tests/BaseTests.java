package tests;

import org.testng.annotations.AfterSuite;

import static core.pages.BasePage.driver;

public abstract class BaseTests {

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }
}
