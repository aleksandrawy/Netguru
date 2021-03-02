import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.HomePage;
import selenium.DriverFactory;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.buildDriver();
        final HomePage homePage = new HomePage(driver);
        homePage.clickAcceptCookies();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }
}
