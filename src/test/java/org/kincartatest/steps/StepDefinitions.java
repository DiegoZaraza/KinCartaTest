package org.kincartatest.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jsoup.Connection;
import org.kincartatest.pageobject.BasePage;
import org.kincartatest.pageobject.IndexPage;
import org.kincartatest.pageobject.ResultPage;
import org.kincartatest.utilities.PropertiesRead;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    private static final String PAGE = PropertiesRead.readFromFrameworkConfig("URL");
    private WebDriver webDriver;
    private SoftAssertions softAssertions;
    private IndexPage indexPage;
    private ResultPage resultPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        indexPage = new IndexPage(webDriver);
        resultPage = new ResultPage(webDriver);
        softAssertions = new SoftAssertions();
        webDriver.manage().window().maximize();
    }

    @Given("The user navigates to www.amazon.com")
    public void theUserNavigatesToWwwAmazonCom() {
        BasePage.setImplicitlyWait();
        webDriver.get(PAGE);
    }

    @And("Searches for {string}")
    public void searchesForAlexa(String value) {
        indexPage.setInpurSearch(value);
        indexPage.clickBtnFind();
    }

    @And("Navigates to the second page")
    public void navigatesToTheSecondPage(){
        resultPage.clickBtnSecondPage();
    }

    @And("Select the third item")
    public void selectTheThirdItem() throws InterruptedException {

        resultPage.clickThirdElement();
    }

    @Then("Validate Result")
    public void validateResult() {
    }

    @After
    public void end() {
        //softAssertions.assertAll();
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
