package Functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClass {
    WebDriver driver;
    JavascriptExecutor js;
    public JavaScriptClass(WebDriver driver){
        this.driver = driver ;
        js = (JavascriptExecutor)driver;
    }
    public void ScrollByPixels(int pixels){
        js.executeScript("window.scrollBy(0,"+pixels+")");
    }
}
