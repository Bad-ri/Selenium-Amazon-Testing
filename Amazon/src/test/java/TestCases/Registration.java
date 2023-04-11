package TestCases;

import Base.edgeBrowser;
import Functions.ActionClass;
import Functions.ExcelData;
import Pages.HomePage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class Registration extends edgeBrowser{
    @Test
    public void ValidRegistration() throws IOException, InterruptedException {
        HomePage home = new HomePage();
        RegistrationPage register = new RegistrationPage();
        ExcelData data = new ExcelData();
        ActionClass action = new ActionClass(driver);
        home.OpenHomePage();
        action.DoubleClick(home.OpenMyAccount());
        home.OpenRegistration();
        data.ReadValidData();
        register.EnterName(data.GetValidName());
        register.EnterEmail(data.GetValidEmail());
        register.EnterPassword(data.GetValidPassword());
        register.Submit();
        this.AuthenticationPassCheck(register.GetAuthenticationNotification());
    }
    @Test
    public void InValidRegistration() throws IOException, InterruptedException {
        HomePage home = new HomePage();
        RegistrationPage register = new RegistrationPage();
        ExcelData data = new ExcelData();
        ActionClass action = new ActionClass(driver);
        home.OpenHomePage();
        action.DoubleClick(home.OpenMyAccount());
        home.OpenRegistration();
        data.ReadValidData();
        register.EnterName(data.GetValidName());
        register.EnterEmail(data.GetInValidEmail());
        register.EnterPassword(data.GetValidPassword());
        register.Submit();
        this.AuthenticationFailCheck(register.GetErrorNotification());
    }
    public void AuthenticationPassCheck(String notification){
        String Expected = "Authentication required";
        Assert.assertTrue(notification.contains(Expected));
    }
    public void AuthenticationFailCheck(String notification){
        String Expected = "Amazon Registration";
        Assert.assertTrue(notification.contains(Expected));
    }
}
