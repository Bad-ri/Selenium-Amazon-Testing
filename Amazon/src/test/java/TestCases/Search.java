package TestCases;

import Base.Browser;
import Pages.HomePage;
import org.testng.annotations.Test;
public class Search extends Browser {
    @Test
    public void ValidSearch() {
        HomePage home = new HomePage(driver);
        home.OpenHomePage();
        home.SearchFor("iphone 14 pro max");
        home.NotificationCheck();
    }
}

