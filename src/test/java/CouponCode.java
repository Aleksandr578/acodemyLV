import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_object.MainPage;
import utils.LocalWebDriver;

import static org.junit.Assert.*;
import static utils.PropertiesReader.getProperties;

@Slf4j
public class CouponCode<pitstop> {


        private final WebDriver driver = LocalWebDriver.getInstance();
        private final MainPage mainPage = new MainPage();

        @BeforeEach
        public void setUp() {
            driver.get(getProperties().getProperty("home.page"));
        }

    @ParameterizedTest(name = "Buy product with name {0} and apply coupon {1}")
    @CsvSource({"Belt,acodemy10off", "Album, acodemy20off"})
    public void applyCouponTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCardPage()
                .applyCouponCode(couponCode);
    }

    @Test
    public void couponCodeFieldShouldBeNotAvailableOnTheHomePage() {
        By fieldSearchCouponCode = By.name("coupon_code");
        assertThrows(NoSuchElementException.class, () -> driver.findElement(fieldSearchCouponCode));
    }

    @Test
    public void couponCodeFieldShouldBeNotAvailableOnProductPade() {
        mainPage.selectProductFromListByName("Polo");
        By fieldSearchCouponCode = By.name("coupon_code");
        assertThrows(NoSuchElementException.class, () -> driver.findElement(fieldSearchCouponCode));
    }

    @Test
    public void couponCodeFieldShouldBeAvailableOnTheCartPage() {
        mainPage.selectProductFromListByName("Polo")
                .addProductToCart();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By cartPage = By.className("cart-contents");
        driver.findElement(cartPage).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By fieldSearchCouponCode = By.name("coupon_code");
        WebElement webElement = driver.findElement(fieldSearchCouponCode);
        assertTrue(webElement.isDisplayed());
    }

    @Test
    public void couponCodeIsNotCorrect() {
        mainPage.selectProductFromListByName("Polo")
                .addProductToCart();

        By cartPage = By.className("cart-contents");
        driver.findElement(cartPage).click();

        By fieldSearchCouponCode = By.name("coupon_code");
        driver.findElement(fieldSearchCouponCode).sendKeys("tra-lja-lja");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //assertTrue(driver.findElement(fieldSearchCouponCode).getText().contains("tra-lja-lja"));
        By applyCouponButton = By.name("apply_coupon");
        driver.findElement(applyCouponButton).click();
        By couponCodeError = By.className("woocommerce-error");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement webElement = driver.findElement(couponCodeError);
        assertTrue(webElement.isDisplayed());


    }

    @Test
    public void multipleCouponsUsings (){

        mainPage.selectProductFromListByName("Polo")
                .addProductToCart();

        By cartPage = By.className("cart-contents");
        driver.findElement(cartPage).click();

        By fieldSearchCouponCode = By.name("coupon_code");
        driver.findElement(fieldSearchCouponCode).sendKeys("easy_discount");
        By applyCouponButton = By.name("apply_coupon");
        driver.findElement(applyCouponButton).click();

        driver.findElement(fieldSearchCouponCode).sendKeys("additional_discount");
        driver.findElement(applyCouponButton).click();

        By subTotal = By.className("woocommerce-Price-amount amount");
        By total = By.className("order-total");

      //  assertEquals(driver.findElement(subTotal),driver.findElement(total);
       // assert(webElement.isDisplayed());


    }


    @AfterEach
    public void tearDown() {
        LocalWebDriver.closeDriver();
    }


}

