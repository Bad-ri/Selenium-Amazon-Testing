package TestCases;

import Base.edgeBrowser;
import Functions.ActionClass;
import Functions.JavaScriptClass;
import Pages.HomePage;
import Pages.RegistrationPage;
import org.testng.annotations.Test;

public class Registration extends edgeBrowser {
    @Test
    public void ValidRegistration() throws InterruptedException {
        HomePage home = new HomePage(driver);
        RegistrationPage register = new RegistrationPage(driver);
        JavaScriptClass js = new JavaScriptClass(driver);
        home.OpenMyAccount();
        home.OpenRegistration();
        js.ScrollByPixels(250);
        //driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
//        register.EnterFirstName("");
//        register.EnterLastName("");
//        register.EnterEmail("");
//        register.EnterPassword("");
        Thread.sleep(10000);
        register.EnterFirstName("mohamed");
        register.EnterLastName("elbadri");
        register.EnterEmail("blue@blue.com");
        register.EnterPassword("1234");
        register.AcceptPolicy();
        Thread.sleep(10000);

        //register.Submit();
       // driver.navigate().to("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");
        //Thread.sleep(3000);
        //String result = register.GetPopNotification();
        //System.out.println("--------");
        //System.out.println(result);
       // System.out.println("--------");
    }
}
