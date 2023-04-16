package TestCases;

import Base.Browser;
import Functions.ExcelData;
import Pages.HomePage;
import org.testng.annotations.Test;

public class Search extends Browser {
    @Test
    public void ValidSearch() {
        HomePage home = new HomePage(driver);
        ExcelData data = new ExcelData();
        home.OpenHomePage();
        home.SearchFor("iphone 14 pro max");
        home.NotificationCheck();
    }
}
