package LoginFunAutomationSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class LoginPage  {
    private WebDriver driver;

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Logging in with username: {user} and password: {pass}")
    public void login(String user, String pass) {  	
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }
}
