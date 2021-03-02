package utils;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class EnvironmentUtils {

    public static void setProperties() {
        final Properties properties = new Properties();
        try {
            final InputStream propFile = EnvironmentUtils.class.getClassLoader().getResourceAsStream("run.properties");
            properties.load(propFile);
            properties.keySet().forEach(p -> System.setProperty((String) p, properties.getProperty((String) p)));
        } catch (final IOException e) {
            log.error("Error while run.properties file loading.");
        }
    }

    public static String getBrowserType() {
        final String browserType = System.getProperty("browser");
        if (browserType == null || browserType.isEmpty()) {
            return "chrome";
        }
        return browserType;
    }
}
