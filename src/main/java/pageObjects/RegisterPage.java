package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page {

    @FindBy(id="userEmailRegister")
    private WebElement emailInput;
    @FindBy(id="userPassRegister")
    private WebElement passwordInput;
    @FindBy(id="button_register")
    private WebElement registerButton;
    @FindBy(id="se_emailError")
    private WebElement emailErrorMessage;

    public RegisterPage(final WebDriver driver) {
        super(driver);
    }

    @Step
    public void fillEmail(final String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    @Step
    public void fillPassword(final String password) {
        passwordInput.sendKeys(password);
    }

    @Step
    public void clickRegister() {
        registerButton.click();
    }

    public String getEmailErrorMessage() {
        return emailErrorMessage.getText();
    }
}
