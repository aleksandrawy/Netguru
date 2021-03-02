import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountManagementPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

@Epic("Login flow")
@Feature("Login")
public class LoginTest extends BaseTest {

    @Test(description = "As a user I want to login with valid credentials.")
    public void testFlow() {
        final HomePage homePage = new HomePage(driver);
        final LoginPage loginPage = homePage.clickMyAccount();
        loginPage.fillEmail(System.getProperty("test-user"));
        loginPage.fillPassword(System.getProperty("test-password"));
        final AccountManagementPage accountManagementPage = loginPage.clickLogin();
        Assert.assertTrue(accountManagementPage.userTabs.isDisplayed(), "Login failed.");
    }
}
