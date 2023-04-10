package TestCases;

import Base.edgeBrowser;
import Functions.ActionClass;
import Functions.ExcelData;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends edgeBrowser {
    @Test
    public void InValidLogin() throws IOException {
        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        ActionClass action = new ActionClass(driver);
        ExcelData data = new ExcelData();
        action.DoubleClick(home.OpenMyAccount());
        data.ReadValidData();
        login.EnterEmail(data.GetInValidEmail());
        login.ClickSubmit();
        CheckNotification(login.GetNotification());
    }
    public void CheckNotification(String input){
        String Expected = "There was a problem";
        Assert.assertTrue(input.contains(Expected));
    }
}
