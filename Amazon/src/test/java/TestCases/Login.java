package TestCases;

import Base.edgeBrowser;
import Functions.ExcelData;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends edgeBrowser {
    @Test
    public void ValidLogin() throws IOException, InterruptedException {
        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        ExcelData data = new ExcelData();
        home.OpenMyAccount();
        //home.OpenLogin();
        data.ReadValidData();
        login.EnterEmail(data.GetValidEmail());
        login.EnterPassword(data.GetValidPassword());
        login.ClickSubmit();
        Thread.sleep(1000);
        String notification = login.GetNotification();
        System.out.println(notification);
        Thread.sleep(2000);
    }
}
