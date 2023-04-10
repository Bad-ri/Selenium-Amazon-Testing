package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class CategoryPage {
    WebDriver driver;
    WebDriverWait wait;
    public CategoryPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    By item = By.xpath("//img[@alt=\"PRETTYGARDEN Women's 2023 Floral Summer Dress Wrap V Neck Short Sleeve Belted Ruffle Hem A-Line Bohemian Maxi Dresses\"]");
    By select_size = By.xpath("//input[@aria-labelledby=\"size_name_1-announce\"]");
    By cart_message = By.xpath("\"//*[@id=\\\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\\\"]/span\"");
    By add_to_cart = By.xpath("//input[@id=\"add-to-cart-button\"]");
    public void ChooseProduct() throws InterruptedException {
        WebElement Item = driver.findElement(item);
        wait.until(ExpectedConditions.presenceOfElementLocated(item));
        Item.click();
    }
    public void ChooseSize () throws InterruptedException {
        WebElement SizeSelect = driver.findElement(select_size);
        wait.until(ExpectedConditions.presenceOfElementLocated(select_size));
        SizeSelect.click();
    }
    public void ClickAddToCart() throws InterruptedException {
        WebElement AddToCart = driver.findElement(add_to_cart);
        wait.until(ExpectedConditions.elementToBeClickable(AddToCart));
        AddToCart.click();
    }
    public void SwitchTab() throws InterruptedException {
        Thread.sleep(4000);
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }
    public String GetCartInformation() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(cart_message));
        String Actual = driver.findElement(cart_message).getText();
        return Actual;
    }
}
