import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
public class ExpediaTestNG {
    public String baseUrl = "https://www.expedia.com/";

    public WebDriver driver ;

    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement flights = driver.findElement(By.id("tab-flight-tab-hp"));
        flights.click();
        Thread.sleep(1000);
        WebElement flyingFrom = driver.findElement(By.id("flight-origin-hp-flight"));
        Thread.sleep(1000);
        flyingFrom.sendKeys("New York");
        WebElement flyinTo = driver.findElement(By.id("flight-destination-hp-flight"));
        flyinTo.sendKeys("Dhaka");
        WebElement departing = driver.findElement(By.id("flight-departing-hp-flight"));
        departing.sendKeys("03/12/2020");
        Thread.sleep(3000);
        WebElement returning = driver.findElement(By.name("endDate"));
        returning.sendKeys("04/12/2020");
        Thread.sleep(3000);



    }
    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}
