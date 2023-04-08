package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    WebDriver driver ;
    WebDriverWait wait ;
    By first_name = By.xpath("//div[@class=\"col-sm-10\"]//input[@id=\"input-firstname\"]");
    By last_name = By.xpath("//div[@class=\"col-sm-10\"]//input[@id=\"input-lastname\"]");
    By email = By.xpath("//div[@class=\"col-sm-10\"]//input[@id=\"input-email\"]");
    By password = By.xpath("//div[@class=\"col-sm-10\"]//input[@id=\"input-password\"]");
    By check_bok = By.cssSelector("input[type=\"checkbox\"]");
    By submit = By.cssSelector("button[type=\"submit\"]");
    By error_popup = By.xpath("//div[@id=\"alert\"]");
    By successful_popup = By.xpath("//div[@id=\"content\"]//h1");
    public RegistrationPage(WebDriver driver){
        this.driver = driver ;
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    public void EnterFirstName(String input){
        WebElement FirstName = driver.findElement(first_name);
        wait.until(ExpectedConditions.elementToBeClickable(FirstName));
        FirstName.sendKeys(input);
    }
    public void EnterLastName(String input){
        WebElement LastName = driver.findElement(last_name);
        LastName.sendKeys(input);
    }
    public void EnterEmail(String input){
        WebElement Email = driver.findElement(email);
        Email.sendKeys(input);
    }
    public void EnterPassword(String input){
        WebElement Password = driver.findElement(password);
        Password.sendKeys(input);
    }
    public void AcceptPolicy(){
        WebElement CheckBox = driver.findElement(check_bok);
        CheckBox.click();
    }
    public void Submit(){
        WebElement Submit = driver.findElement(submit);
        Submit.click();
    }
    public String GetPopNotification(){
        WebElement popupNotification = driver.findElement(successful_popup);
        wait.until(ExpectedConditions.visibilityOf(popupNotification));
        String notification= popupNotification.getText();
        return notification;
    }
}
