package TestCases;

import Base.Browser;
import Functions.ActionClass;
import Functions.ExcelData;
import Pages.HomePage;
import Pages.RegistrationPage;
import org.testng.annotations.Test;
import java.io.IOException;

public class Registration extends Browser {
    @Test
    public void ValidRegistration() throws IOException{
        HomePage home = new HomePage(driver);
        RegistrationPage register = new RegistrationPage(driver);
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
        register.AuthenticationCheck("Authentication required");
    }
    @Test
    public void InValidRegistration() throws IOException{
        HomePage home = new HomePage(driver);
        RegistrationPage register = new RegistrationPage(driver);
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
        register.AuthenticationCheck("Amazon Registration");
    }

}
