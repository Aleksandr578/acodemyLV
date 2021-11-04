package hooks;


import io.cucumber.java.After;
import utils.LocalWebDriver;

public class Hook {

    @After
    public void tearDown(){
        LocalWebDriver.closeDriver();
    }
}
