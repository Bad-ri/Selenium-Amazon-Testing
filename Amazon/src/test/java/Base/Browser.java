package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
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
        logger.info("************************** Test Execution Started **************************");
        logger.info("Welcome![browser opens]");
    }
    @AfterSuite
    public void getInfo(ITestContext context) {
        int total = context.getAllTestMethods().length;
        int passed = context.getPassedTests().size();
        int failed = context.getFailedTests().size();
        int skipped = context.getSkippedTests().size();
        logger.info("Total number of testcases :" + total);
        logger.info("Number of testcases Passed : " + passed);
        logger.info("Number of testcases Failed : " + failed);
        logger.info("Number of testcases Skipped  : " + skipped);
        logger.info("Goodbye![browser close]");
        logger.info("************************** Test Execution Ends **************************");
    }
    @AfterClass
    public void closeBrowser(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
