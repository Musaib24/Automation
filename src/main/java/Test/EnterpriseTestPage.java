package Test;


import Pages.EnterpriseHomePage;
import Pages.EnterpriseLogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EnterpriseTestPage {

    WebDriver driver;

    EnterpriseLogInPage objLogin;

    EnterpriseHomePage objHomePage;

    @BeforeTest

    public void setup() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");

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

    public void test_Home_Page_Appear_Correct() throws InterruptedException {

        //Create Login Page object

        objLogin = new EnterpriseLogInPage(driver);

        //Verify login page title
        Thread.sleep(2000);

        String loginPageTitle = objLogin.getLoginTitle();

//        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

        //login to application

        objLogin.loginEnterprise("musaib1124@gmail.com", "musaib1124");

        // go the next page

        objHomePage = new EnterpriseHomePage(driver);

        //Verify home page

        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }
}
