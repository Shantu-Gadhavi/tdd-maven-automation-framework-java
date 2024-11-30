package testng.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By userNameTextBox = By.xpath("//*[@name='loginfmt']");
    By nextButton = By.xpath("//input[@id='idSIButton9']");
    By passwordTextBox = By.xpath("//input[@id='i0118']");
    By staySignedInButton = By.xpath("//*[@id='idBtn_Back']");


    WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void enterUserName(String userName){
        driver.findElement(userNameTextBox).sendKeys(userName);
    }

    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }

    public void enterPassword(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickStaySignInButton(){
        driver.findElement(staySignedInButton).click();
    }

    public String getTitleText(){
        return driver.getTitle();
    }

}
