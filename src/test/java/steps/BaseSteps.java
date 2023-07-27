package steps;

import core.pages.Main;
import org.testng.annotations.AfterSuite;

public class BaseSteps {

    protected Main main;

    public BaseSteps () {
        main = new Main();

    }

    @AfterSuite
    public void closeDriver() {
        main.getDriver().quit();
    }
}
