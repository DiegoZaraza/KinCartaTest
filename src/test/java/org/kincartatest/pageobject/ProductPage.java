package org.kincartatest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage{
    WebDriver driver;

    @FindBy(id = "add-to-cart-button")
    WebElement btnAddToCard;

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayedBtnAddToCard() {
        return isDisplayed(btnAddToCard, "Show the button");
    }
}
