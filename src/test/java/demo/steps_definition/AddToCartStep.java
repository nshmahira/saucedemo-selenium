package demo.steps_definition;

import demo.pages.base.page_object.AddToCartPages;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class AddToCartStep {

    AddToCartPages addToCartPages = new AddToCartPages();

    @Then("user can see the shopping cart added")
    public void isSuccessAddToCart()
    {
        for(int i = 0; i< AddToCartPages.listProduct.size(); i++){
            Assert.assertTrue(addToCartPages.isSuccessAddToCart(i));
        }
    }

    @When("user click {string} to cart")
    public void userClickToCart(String arg0) { addToCartPages.ClickToCart(arg0);//kurir *Clicktocart
    }

    @And("user click cart button")
    public void userClickCartButton() { addToCartPages.userClickCartButton();
    }

    @When("user remove item {string} from cart")
    public void userRemoveItemFromCart(String arg0) {
        addToCartPages.userRemoveItemFromCart(arg0);
    }

    @Then("{string} success remove")
    public void successRemove(String arg0) {
       boolean notpresent;
       try {
           addToCartPages.successRemove(arg0);
           notpresent = false;
       } catch (Exception e){
           notpresent = true;
       }
       Assert.assertTrue(notpresent);
    }

    @When("user can click continue shopping")
    public void userCanClickContinueShopping() { addToCartPages.userCanClickContinueShopping();
    }

    @Given("user click add to cart")
    public void userClickAddToCart() { addToCartPages.clickAddToCart();
    }
}
