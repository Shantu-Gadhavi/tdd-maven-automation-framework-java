package Utilities;

import io.opentelemetry.api.incubator.metrics.ExtendedDoubleGaugeBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class BaseTest {

    //public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver driver;
    public ReadPropertiesFiles readPropertiesFiles = new ReadPropertiesFiles();

    public WebDriver initBrowser() throws IOException {
        String browserName = readPropertiesFiles.readProperties("browser");
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            //driver.set(new ChromeDriver());
        }else if(browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            //driver.set(new FirefoxDriver());
        }else if(browserName.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
            //driver.set(new EdgeDriver());
        }else{
            System.out.println("Not able to find the browser.");
        }
        return driver;
    }

//    public static synchronized WebDriver getDriver(){
//        return driver.get();
//    }
}
