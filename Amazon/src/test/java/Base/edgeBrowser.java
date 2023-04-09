package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class edgeBrowser {
    public WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        String edgePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\msedgedriver.exe";
        driver = new EdgeDriver();
        System.setProperty("webdriver.edge.driver",edgePath);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
