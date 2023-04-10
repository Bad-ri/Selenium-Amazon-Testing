package TestCases;

import Base.edgeBrowser;
import Functions.ActionClass;
import Functions.JavaScriptClass;
import Pages.CategoryPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class AddToCart extends edgeBrowser {
    @Test
    public void ValidAddToCart() throws InterruptedException {
        HomePage home = new HomePage(driver);
        CategoryPage category = new CategoryPage(driver);
        JavaScriptClass js = new JavaScriptClass(driver);
        ActionClass action = new ActionClass(driver);
        home.OpenCategory();
        category.ChooseProduct();
        js.ScrollByPixels(500);
        category.ChooseSize();
        action.scrollUp();
        category.ClickAddToCart();
        //category.ClickAddToCart();
        category.SwitchTab();
        this.CheckCart(category.GetCartInformation());
    }
    public void CheckCart(String input){
        String Expected = "Your Amazon Cart is empty.";
        System.out.print(input);
    }
}
