package TestCases;

import Base.Browser;
import Functions.ActionClass;
import Functions.JavaScriptClass;
import Pages.CategoryPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cart extends Browser {
    @Test
    public void ValidAddToCart() throws InterruptedException {
        HomePage home = new HomePage(driver);
        CategoryPage category = new CategoryPage(driver);
        JavaScriptClass js = new JavaScriptClass(driver);
        ActionClass action = new ActionClass(driver);
        home.OpenHomePage();
        home.OpenCategory();
        category.ChooseProduct();
        js.ScrollByPixels(500);
        category.ChooseSize();
        action.scrollUp();
        category.ClickAddToCart();
        category.ClickAddToCart();
        category.SwitchTab();
        category.CheckCartInformation();
    }
}
