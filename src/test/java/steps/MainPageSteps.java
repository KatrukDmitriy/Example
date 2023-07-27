package steps;

import core.pages.Main;

public class MainPageSteps extends BaseSteps{



    public MainPageSteps goToTheFiveSlide() {
        main.clickOnFifthSlideButton();
        return this;
    }


}
