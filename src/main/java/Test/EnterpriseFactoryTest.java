package Test;

import java.util.concurrent.TimeUnit;

import Pages.EnterprisePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import Pages.EnterpriseFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnterpriseFactoryTest {
    WebDriver driver;

    EnterprisePage page;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.enterprise.com/en/home.html");
    }

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * <p>
     * Verify login page title as guru99 bank
     * <p>
     * Login to application
     * <p>
     * Verify the home page using Dashboard message
     */

    @Test(priority = 0)
    public void verifyHomePageTitle() throws InterruptedException {
        page = new EnterprisePage(driver);

        page.clickSingInButton();
        page.enterEmail("musaib1124@gmail.com");
        page.enterPassword("musaib1124");
        page.clickSubmit();
    }

    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}
