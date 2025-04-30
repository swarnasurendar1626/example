package LoginFunAutomationSuite;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;

public class LoginTest extends BaseTest {
    private final String browserType;

    public LoginTest(String browserType) {
        this.browserType = browserType;
    }
    @Step("Launching browser: {browserType}")
    public void launchBrowser() {
        switch (browserType.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        driver.manage().window().maximize();
    }
    
    @Step("Running test on {browserType}")
    public void runTest() {
        launchBrowser();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:8080/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123");
        closeBrowser();
    }
}