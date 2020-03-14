import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.linkedin.com");

        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;





    }
}

