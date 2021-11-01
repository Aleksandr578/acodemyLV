package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LocalWebDriver;
import utils.SharedContext;
import utils.StaticKeys;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static page_object.StaticWebElements.*;
import static utils.Messages.PRODUCT_ADDED_TO_CART;

public class ProductPage {

    private final WebDriver driver = LocalWebDriver.getInstance();
    private By addToCartElement = By.name("add-to-cart");
    //private By message = By.className("woocommerce-message");
    private By shopingCar = By.className("cart-contents");
    private By viewCartLink = By.xpath("//div[@class='woocommerce']//a");

  //  public ProductPade(WebDriver driver){
    //    this.driver = driver;
      //  }

        public ProductPage addProductToCart(){
        driver.findElement(addToCartElement).click();
        assertThat(driver.findElement(SUCCESS_MESSAGE_ELEMENT).isDisplayed(), is(Boolean. TRUE));
        assertThat(driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(), equalTo(String.format(PRODUCT_ADDED_TO_CART, SharedContext.getValue(StaticKeys.CURRENT_ITEM))));
        return this;
        }

        public CartPage openCardPage(){
            driver.findElement(viewCartLink).click();
            assertThat("Title is incorrect", driver.getTitle(),containsString("Cart"));
            return new CartPage();

        }
}
