package org.kincartatest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage{
    WebDriver driver;

    @FindBy(xpath = "//li[@class='a-normal']//a[contains(text(),'2')]")
    WebElement btnSecondPage;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")
    WebElement thirdElement;

    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickBtnSecondPage() {
        click(btnSecondPage, "Click on second page option");
    }

    public void  clickThirdElement() {
        click(thirdElement, "Click on third element option");
    }

}
