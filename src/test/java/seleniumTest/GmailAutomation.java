package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;

public class GmailAutomation {
    @Test
    public void GmailAutomation () throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://youtube.com");
       // driver.findElement(By.name("identifier")).sendKeys("chyngyztynybekov@gmail.com"+Keys.ENTER);
      //  Thread.sleep(2000);
      //  driver.findElement(By.name("password")).sendKeys("22scarface"+Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("search")).sendKeys("50 Cent ft. Nate Dogg - 21 Questions (Official Video)"+Keys.ENTER);
    //  driver.findElement(By.id("video-title")).click();
      // driver.findElement(By.xpath("<yt-formatted-string class=\"style-scope ytd-video-renderer\" aria-label=\"50 Cent ft. Nate Dogg - 21 Questions (Official Video) by 50 Cent 10 years ago 4 minutes, 20 seconds 319,694,345 views\">50 Cent ft. Nate Dogg - 21 Questions (Official Video)</yt-formatted-string>")).click();
driver.findElement(By.id("img")).click();
    }

}
