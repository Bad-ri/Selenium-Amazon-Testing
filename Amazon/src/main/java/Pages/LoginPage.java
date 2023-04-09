package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
    }
    By email = By.xpath("//input[@id=\"input-email\"]");
    By password = By.xpath("//input[@id=\"input-password\"]");
    By submit = By.xpath("//*[@id=\"form-login\"]/button");
    By alert = By.xpath("//*[@id=\"alert\"]/div");
    public void EnterEmail(String input){
        WebElement Email = driver.findElement(email);
        wait.until(ExpectedConditions.elementToBeClickable(Email));
        Email.sendKeys(input);
    }
    public void EnterPassword(String input){
        WebElement Password = driver.findElement(password);
        Password.sendKeys(input);
    }
    public void ClickSubmit(){
        WebElement Submit = driver.findElement(submit);
        Submit.click();
    }
    public String GetNotification(){
        WebElement Alert = driver.findElement(alert);
        wait.until(ExpectedConditions.visibilityOf(Alert));
        String notification = Alert.getText();
        return notification;
    }
}
