package Functions;

import Base.edgeBrowser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClass extends edgeBrowser {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    public void ScrollByPixels(int pixels){
        js.executeScript("window.scrollBy(0,"+pixels+")");
    }
}
