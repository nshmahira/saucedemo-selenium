package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePages extends BasePageObject {

    public void userSelectSorting(String arg0) {
        By element = By.className("product_sort_container");
        selectOn(element,arg0);
    }
}
