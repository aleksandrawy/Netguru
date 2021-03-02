package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountManagementPage extends Page {

    @FindBy(id="usertabs")
    public WebElement userTabs;

    public AccountManagementPage(final WebDriver driver) {
        super(driver);
    }
}
