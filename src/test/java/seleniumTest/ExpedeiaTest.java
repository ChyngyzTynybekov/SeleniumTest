package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpedeiaTest {
    @Test
    public void ExpediaTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Flights")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Flight Only")).click();

        driver.close();

    }
}