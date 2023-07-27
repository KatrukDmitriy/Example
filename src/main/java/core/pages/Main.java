package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends BasePage {

    private String slidesSelector = "[num='%d']";

    public Main() {
        super();
        openUrl("https://dou.ua/");
    }

    private WebElement getSlideElement(int numberOfSlide) {
        if (numberOfSlide > 5) {
            throw new RuntimeException("cannot be more than five slides");
        } else {
            return getDriver().findElement(By.cssSelector(String.format(slidesSelector, numberOfSlide)));
        }
    }

    private void clickOnSlideButton(int numberOfButton) {
        getSlideElement(numberOfButton).click();
    }

    public void clickOnFifthSlideButton() {
        clickOnSlideButton(5);
    }

    public void clickOnSecondSlideButton() {
        clickOnSlideButton(5);
    }
}
