package baseAPI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseAPI {

    public static WebDriver driver;
    public static Wait<WebDriver> fluentWait;
    public static WebDriverWait explicitWait;
    public static DataReader dataReader;
    public static MySQLConnection mySQLConnection;
    private Properties properties;

    public final String systemPath = System.getProperty("user.dir");
    private final String PROP_RELATIVE_PATH = "/src/main/resources/credentials.properties";
    private final String PROP_FILE_PATH = systemPath + PROP_RELATIVE_PATH;

    @BeforeSuite (alwaysRun = true)
    public void setup() {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream(PROP_FILE_PATH);
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            dataReader = new DataReader();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            mySQLConnection = new MySQLConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Parameters({"browserName"})
    @BeforeMethod
    public void initializeDriver(@Optional("chrome") String browserName) {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver = getLocalDriver(browserName);
        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(StaleElementReferenceException.class);
        explicitWait = new WebDriverWait(driver, 10);

        driver.get(properties.getProperty("URL"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @AfterSuite (alwaysRun = true)
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getLocalDriver(String browserName) {
        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
        }
        return driver;
    }

    public void clickOnElement(WebElement element) {
        try {
            explicitWait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO CLICK ON ELEMENT");
        }
    }

    public void sendKeysToElement(WebElement element, String value) {
        try {
            element.sendKeys(value);
        } catch (TimeoutException e) {
            element.sendKeys(value);
        }
    }
}
