package Base;

import TestCases.Search;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Browser {
    public WebDriver driver;
    protected static Logger logger = LogManager.getLogger();

    @BeforeClass
    public void openBrowser(){
        String edgePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\msedgedriver.exe";
        driver = new EdgeDriver();
        System.setProperty("webdriver.edge.driver",edgePath);
        //driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
    }
    public WebDriver GetDriver(){
        return driver;
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

}
