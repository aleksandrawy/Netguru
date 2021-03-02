package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public enum DriverType implements DriverSetup {

    CHROME {
        public WebDriver getDriver() {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            return driver;
        }
    },
    FIREFOX {
        public WebDriver getDriver() {
            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            return driver;
        }
    },
    IE {
        public WebDriver getDriver() {
            WebDriver driver = new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            return driver;
        }
    }
}
