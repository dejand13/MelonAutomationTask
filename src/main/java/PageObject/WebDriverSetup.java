package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebDriverSetup {
    public WebDriver driver;
    public Properties prop;

    public WebDriver initDriver() throws IOException {
        prop = new Properties();

        File src = new File("src//data.properties");
        FileInputStream data = new FileInputStream(src);

        prop.load(data);

        String browserName = prop.getProperty("browser");

        if (browserName.contains("firefox")) {
            System.setProperty("webdriver.gecko.driver","//Users//dejanadmin//Downloads//geckodriver");
            driver = new FirefoxDriver();
        } else {
            ChromeOptions options = new ChromeOptions();
//            In case we want to run headless
//            options.addArguments("--headless");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Selectors listItem = new Selectors(driver);
        return driver;
    }
}
