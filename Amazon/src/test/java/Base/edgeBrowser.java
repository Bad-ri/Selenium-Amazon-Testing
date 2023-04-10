package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class edgeBrowser {
    public WebDriver driver;
    @BeforeClass
    public void openBrowser(){
        String edgePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\msedgedriver.exe";
        driver = new EdgeDriver();
        System.setProperty("webdriver.edge.driver",edgePath);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

}
