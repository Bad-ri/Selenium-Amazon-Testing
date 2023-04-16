package Pages;

import Base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class HomePage{
    WebDriver driver;
    WebDriverWait wait;
    By my_account = By.xpath("//a[@id=\"nav-link-accountList\"]");
    By register = By.xpath("//a[@id=\"createAccountSubmit\"]");
    By search = By.xpath("//input[@id=\"twotabsearchtextbox\"]");
    By search_result = By.xpath("//span[@class=\"a-color-state a-text-bold\"]");
    By dress_category = By.xpath("//img[@alt=\"Dresses\"]");
    By cart = By.xpath("//a[@id=\"nav-cart\"]");

    public HomePage(WebDriver driver){
        //this.driver = null ;
        this.driver = driver ;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }
    public void OpenHomePage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    public WebElement OpenMyAccount() {
        WebElement myAccount = driver.findElement(my_account);
        wait.until(ExpectedConditions.elementToBeClickable(myAccount));
        return myAccount;
    }
    public void OpenRegistration(){
        WebElement registration = driver.findElement(register);
        wait.until(ExpectedConditions.elementToBeClickable(registration));
        registration.click();
    }
    public void SearchFor(String input){
        wait.until(ExpectedConditions.presenceOfElementLocated(search));
        WebElement Search = driver.findElement(search);
        Search.sendKeys(input);
        Search.submit();
    }
    public void NotificationCheck(){
        wait.until(ExpectedConditions.presenceOfElementLocated(search_result));
        String Expected = "iphone 14 pro max";
        String Actual = driver.findElement(search_result).getText();
        Assert.assertTrue(Actual.contains(Expected));
    }
    public void OpenCategory(){
        WebElement DressCategory = driver.findElement(dress_category);
        DressCategory.click();
    }

}
