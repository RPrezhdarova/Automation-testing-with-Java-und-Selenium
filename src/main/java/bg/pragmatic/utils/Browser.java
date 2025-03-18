package bg.pragmatic.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {
    public static WebDriver driver;

    /**
     * Opens a maximized Chrome browser and sets a default implicit wait of 10 seconds
     */
    public static void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Quits the opened by this driver browser
     */
    public static void quit() {
        driver.quit();
    }
}
