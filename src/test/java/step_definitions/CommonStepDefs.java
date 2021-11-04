package step_definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.LocalWebDriver;

public class CommonStepDefs {

    WebDriver driver = LocalWebDriver.getInstance();

    @Given("user open web page {string}")
    public void userOpenWebPage(String url) {
        driver.get(url);
    }
}
