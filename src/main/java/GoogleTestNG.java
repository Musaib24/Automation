import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class GoogleTestNG {
    public String baseUrl = "https://www.google.com/";

    public WebDriver driver ;

    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
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
