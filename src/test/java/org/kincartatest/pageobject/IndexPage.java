package org.kincartatest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {
    WebDriver driver;
    @FindBy(id = "twotabsearchtextbox")
    WebElement inputSearch;

    @FindBy(id = "nav-search-submit-button")
    WebElement btnFind;

    public IndexPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setInpurSearch(String value) {
        clearTxt(inputSearch, "Clear txt until introduce a new search");
        sendKeys(inputSearch, value, "Input text for find a product");
    }

    public void clickBtnFind() {
        click(btnFind, "Click on button find");
    }
}
