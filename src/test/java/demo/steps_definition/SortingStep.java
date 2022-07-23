package demo.steps_definition;

import demo.pages.base.page_object.AddToCartPages;
import demo.pages.base.page_object.HomePages;
import io.cucumber.java.en.When;

public class SortingStep {
    HomePages homePages= new HomePages();

    @When("user select sorting {string}")
    public void userSelectSorting(String arg0) { homePages.userSelectSorting(arg0);
    }
}
