import constants.LoginConstants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

@Epic("Register flow")
@Feature("Registration")
public class RegisterWrongEmailTest extends BaseTest {

    @Test(description = "As a new user I want to get information about wrong email format while registering.")
    public void testFlow() {
        final HomePage homePage = new HomePage(driver);
        final LoginPage loginPage = homePage.clickMyAccount();
        final RegisterPage registerPage = loginPage.goToRegisterTab();
        registerPage.fillEmail(System.getProperty("test-user").split("\\.")[0]);
        registerPage.fillPassword(System.getProperty("test-password"));
        Assert.assertEquals(registerPage.getEmailErrorMessage(), LoginConstants.wrongEmailMessage, "Wrong error email message.");
        registerPage.fillEmail(System.getProperty("test-user"));
        Assert.assertEquals(registerPage.getEmailErrorMessage(), "", "Email error message is still visible.");
    }
}
