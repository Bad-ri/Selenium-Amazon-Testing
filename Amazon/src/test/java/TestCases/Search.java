package TestCases;

import Base.Browser;
import Pages.HomePage;
import org.testng.annotations.Test;
public class Search extends Browser {

    @Test
    public void ValidSearch() {
        HomePage home = new HomePage(driver);
        logger.info("************************** Test Execution Started ************************************");
        logger.info("open browser");
        logger.info("open website");
        home.OpenHomePage();
        logger.info("Searching for iphone");
        home.SearchFor("iphone 14 pro max");
        logger.info("Check for notification");
        home.NotificationCheck();
        logger.info("Close driver");

    }
}

