package cucumber.bdd.stpes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseSetup {

    protected WebDriver driver;

    public void setUp() {
        String browser = Config.get("ui.browser");
        boolean headless = Boolean.parseBoolean(Config.get("ui.headless"));
        System.out.println("Browser: " + browser);
        System.out.println("Headless: " + headless);

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            if (headless) {
                options.addArguments("--headless=new"); // for Chrome 109+
                options.addArguments("--disable-gpu", "--window-size=1920,1080");
            }
            driver = new ChromeDriver(options);
        }

        driver.get(Config.get("ui.url"));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
