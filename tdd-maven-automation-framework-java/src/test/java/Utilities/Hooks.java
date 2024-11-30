package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class Hooks extends BaseTest{

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite method executed.");
    }

    @BeforeClass()
    public void beforeClass() throws IOException {
        System.out.println("Before class method executed.");
    }

    @BeforeTest
    public void beforeTest() throws IOException {
        System.out.println("Before Test method executed.");
        driver = initBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://absuat.cornerstonebuildingbrands.com/");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method method executed.");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method method executed.");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test method executed.");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class method executed.");
        driver.close();
        driver.quit();
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite method executed.");
    }
}
