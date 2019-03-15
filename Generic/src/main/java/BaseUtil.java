import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseUtil {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shaq\\Selinium2019\\WebAutomation\\Generic\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }


}
