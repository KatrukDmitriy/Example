package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.MainPageSteps;

public class MainPage extends BaseTests {
    private MainPageSteps mainPageSteps;


    @BeforeClass()
    private void beforeMaiPage() {
        mainPageSteps = new MainPageSteps();
    }

    @Test()
    public void verifySlideBlock() {
        mainPageSteps.goToTheFiveSlide()
        .goToTheFiveSlide();
    }


}
