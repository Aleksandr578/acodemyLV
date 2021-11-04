package utils;

import exceptions.UnsupportedBrowserException;
import exceptions.UnsupportedEnvironmentException;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

public class LocalWebDriver {

    private static WebDriver driver;

    public static WebDriver getInstance(){
        if (driver == null){
            driver = configureDriver();
        }
        return driver;
    }
    public static WebDriver localDriver (){
        String browser = PropertiesReader.getProperties().getProperty("browser").toUpperCase();
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized"); // headless ; start-maximized ; incognito
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
                chromeOptions.merge(capabilities);
                return  new ChromeDriver(chromeOptions);
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                return new FirefoxDriver();

            default: throw  new UnsupportedBrowserException("Following browser is not supported: "+ browser);
        }
    }

    public static DesiredCapabilities setUpCapabilities() {
        // example of how manage your code better
        return new DesiredCapabilities();
    }

    @SneakyThrows
    public static RemoteWebDriver remoteWebDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
//        capabilities.setVersion("");
        capabilities.setCapability("enableVNC", true);
       capabilities.setCapability("enableVideo", true);

        return new RemoteWebDriver(
                URI.create("http://(moj ajpi adres):4444/wd/hub").toURL(),
                capabilities
        );
    }

    public static WebDriver configureDriver(){
     String environment = PropertiesReader.readProperties().getProperty("environment");

     switch (environment){
         case "local":
             return localDriver();
         case "remote":
             return remoteWebDriver();
         default: throw new UnsupportedEnvironmentException(String.format("'%s' environment is not supported", environment));
     }
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
