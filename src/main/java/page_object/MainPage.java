package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LocalWebDriver;
import utils.SharedContext;
import utils.StaticKeys;

import java.util.List;

import static utils.StaticKeys.CURRENT_ITEM;

public class MainPage {

    WebDriver driver = LocalWebDriver.getInstance();
   private final By productsElements = By.xpath("//ul[contains(@class,'products')]/li");

    @FindBy(xpath ="//ul[contains(@class,'products')]/li")
    List<WebElement>webElements;


    public List<WebElement>getALLProducts(){
    return driver.findElements(productsElements);
    }

    public ProductPage selectProductFromListByName(String productName){
        getALLProducts().stream()
                .filter(product -> product.getText().contains(productName))
                .findFirst()
                .ifPresent(WebElement::click);

        SharedContext.setValue(CURRENT_ITEM, productName);

       /*{ for (int i=0; i < getALLProducts().size();i++){
            if (getALLProducts().get(i).getText().equals(productName)){
                getALLProducts().get(i).click();
                break;
            }
            {for(WebElement product: driver.findElements(productsElements)){
            if(product.getText().contains("productName")){
             product.click();
             break;
            }*/
    {
 //       for (WebElement product: driver.findElements(productsElements)){
  //          if (product.getText().contains(productName)){
   //             product.click();
   //             break;
     //       }
     //   }
            return new ProductPage();
    }

    }}

