package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {

    @FindBy(id="onetrust-accept-btn-handler")
    private WebElement acceptCookies;
    @FindBy(id="topLoginLink")
    private WebElement myAccountLink;
    @FindBy(id="postNewAdLink")
    private WebElement newAdvertisementButton;

    public HomePage(final WebDriver driver) {
        super(driver);
    }

    @Step
    public void clickAcceptCookies() {
        acceptCookies.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(acceptCookies));
    }

    @Step
    public LoginPage clickMyAccount() {
        myAccountLink.click();
        return new LoginPage(driver);
    }
}
