package selenium;

import utils.EnvironmentUtils;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@Slf4j
public class DriverFactory {

    public static WebDriver buildDriver() {
        EnvironmentUtils.setProperties();
        final DriverType driverType = DriverType.valueOf(EnvironmentUtils.getBrowserType().toUpperCase());
        final WebDriver driver = driverType.getDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(System.getProperty("page-load-timeout")), TimeUnit.SECONDS);
        driver.get(System.getProperty("app-url"));
        return driver;
    }
}
