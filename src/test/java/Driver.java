import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;
    private static Boolean headless = false;

    public static WebDriver getDriver() {
        if (driver == null) {
            return getNewDriver();
        }
        return driver;
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }

    public static void setHeadless() {
        headless = true;
    }

    private static WebDriver getNewDriver() {
        ChromeOptions options = new ChromeOptions();
        if (headless) {
            options.addArguments("--headless=new");
        }
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        return driver;
    }
}
