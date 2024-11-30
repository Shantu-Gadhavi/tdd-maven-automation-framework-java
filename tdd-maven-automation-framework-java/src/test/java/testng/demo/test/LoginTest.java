package testng.demo.test;

import Utilities.BaseTest;
import Utilities.ReadPropertiesFiles;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import testng.demo.pages.Login;

import java.io.IOException;

public class LoginTest extends BaseTest{

    Login login = new Login(driver);
    ReadPropertiesFiles readPropertiesFiles = new ReadPropertiesFiles();

    @Test
    public void doLogin() throws IOException {
        String userName = readPropertiesFiles.readProperties("userId");
        String password = readPropertiesFiles.readProperties("password");
        login.clickLoginButton();
        login.enterUserName(userName);
        login.clickNextButton();
        login.enterPassword(password);
        login.clickNextButton();
        login.clickStaySignInButton();
        String getTitle = login.getTitleText();
        Assert.assertEquals(getTitle,"dashboard");
    }
}
