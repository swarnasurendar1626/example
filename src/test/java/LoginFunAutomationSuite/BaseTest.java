package LoginFunAutomationSuite;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public abstract class BaseTest implements BrowserActions {
    protected WebDriver driver;
    
    @Step("Closing browser")
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}