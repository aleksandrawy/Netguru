package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    @FindBy(id="userEmail")
    private WebElement emailInput;
    @FindBy(id="userPass")
    private WebElement passwordInput;
    @FindBy(id="se_userLogin")
    private WebElement loginButton;
    @FindBy(id="register_tab")
    private WebElement registerTab;

    public LoginPage(final WebDriver driver) {
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
    public AccountManagementPage clickLogin() {
        loginButton.click();
        return new AccountManagementPage(driver);
    }

    @Step
    public RegisterPage goToRegisterTab() {
        registerTab.click();
        return new RegisterPage(driver);
    }
}
