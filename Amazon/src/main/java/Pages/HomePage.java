package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class HomePage{
    WebDriver driver;
    WebDriverWait wait;
    By my_account = By.xpath("//a[@id=\"nav-link-accountList\"]");
    By register = By.xpath("//a[@id=\"createAccountSubmit\"]");

    public HomePage(WebDriver driver){
        this.driver = driver ;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
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

}
