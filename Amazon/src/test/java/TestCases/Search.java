package TestCases;

import Base.edgeBrowser;
import Functions.ExcelData;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends edgeBrowser {
    @Test
    public void ValidSearch() throws InterruptedException {
        HomePage home = new HomePage();
        ExcelData data = new ExcelData();
        home.OpenHomePage();
        home.SearchFor(data.GetValidSearch());
        this.NotificationCheck(home.GetSearchResult());
    }
    public void NotificationCheck(String input){
        String Expected = "iphone 14 pro max";
        Assert.assertTrue(input.contains(Expected));
    }
}
