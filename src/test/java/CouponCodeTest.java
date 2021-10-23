import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.MainPage;
import utils.LocalWebDriver;

import static utils.PropertiesReader.getProperties;

@Slf4j
public class CouponCodeTest {


        private final WebDriver driver = LocalWebDriver.getInstance();
        private final MainPage mainPage = new MainPage();

        @BeforeEach
        public void setUp() {
         //   mainPage = new MainPage(driver);
            driver.get(getProperties().getProperty("home.page"));
        }

        @Test
        public void test (){
            System.out.println("123");
        }

        @Test
        public void  applyCouponTest(){
            mainPage.selectProductFromListByName("Polo")
                    .addProductToCart();
        }

        @AfterEach
        public void tearDown(){
            LocalWebDriver.closeDriver();
        }

    }

