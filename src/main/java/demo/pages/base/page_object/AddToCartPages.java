package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AddToCartPages extends BasePageObject {

  public static List<String> listProduct = new ArrayList<String>();


    public void clickAddToCart() {
        By element = By.id("add-to-cart-sauce-labs-backpack");
        clickOn(element);
    }
    public boolean isSuccessAddToCart(int i) {
        By element = By.xpath("//*[contains(text(),'" +listProduct.get(i)+"')]");
        return isPresent(element);
    }
    //krn kita menggunakn variable
    public void ClickToCart(String product) { //penerima barang (arg0)itu si product
        listProduct.add(product);
        By element = By.id ("add-to-cart-"+product.toLowerCase().replaceAll(" ","-"));
        clickOn(element);
    }
    public void userClickCartButton (){
        By element = By.id("shopping_cart_container");
        clickOn(element);
    }
    public void userRemoveItemFromCart (String product){
            By element = By.id ("remove-"+product.toLowerCase().replaceAll(" ","-"));
            clickOn(element);
    }
    public boolean successRemove (String product) {
        By element = By.xpath("//*[contains(text(),'" +product+"')]");
        return isPresent(element);
    }
    public void userCanClickContinueShopping (){
        By element = By.id("continue-shopping");
        clickOn(element);
    }
}
