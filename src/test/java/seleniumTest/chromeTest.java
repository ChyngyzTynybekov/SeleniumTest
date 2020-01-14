package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class chromeTest {
    @Test
    public void testPartialLink() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Search")).click();
        String expecteditle="Discover How Google Search Works";

        Assert.assertTrue(driver.getTitle().contains(expecteditle));
        driver.close();

    }
    @Test
    public void testSearch() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Australia"+Keys.ENTER);
        //driver.findElement(By.name("q")).sendKeys("Australia"+ Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Australia"));
        driver.close();
    }
    @Test
    public void testHumbergerButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://amazon.com");

       // driver.findElement(By.xpath("driver.findElement(By.xpath(\"\"))\n")).click();
        WebElement text=driver.findElement(By.id("hmenu-customer-name\""));
        Assert.assertTrue(text.isDisplayed());
        driver.close();



    }
    @Test
            public void testTea() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" http://www.practiceselenium.com/");
        driver.findElement(By.linkText("Let's Talk Tea")).click();
       driver.findElement(By.name("name")).sendKeys("John");
     //   WebElement text =driver.findElement()
        driver.findElement(By.name("email")).sendKeys("abc123.gmail.com");
        driver.findElement(By.name("subject")).sendKeys("special request");
        driver.findElement(By.name("message")).sendKeys("chika");
        driver.findElement(By.className("form-submit")).click();

        driver.close();

    }
    public void Amazontest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://amazon.com");
       // driver.findElement("B")
    }
    @Test
    public void ExpediaTest()throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Flights")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tab-flightHotel-tab-flp-fh")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("package-origin-flp-fh")).sendKeys("Chicago"+Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-flp-fh")).sendKeys("New York"+Keys.ENTER);
        Thread.sleep(2000);
        driver.close();






    }

}
