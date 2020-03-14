import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstDay {
    public static void main(String []args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\geckodriver.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Musaib\\Documents\\SeleniumDriver\\IEDriverServer.exe");
        WebDriver driver=new ChromeDriver();
        //WebDriver firefoxDriver=new FirefoxDriver();
        //WebDriver ieDriver = new InternetExplorerDriver();
        driver.navigate().to("http://www.linkedin.com");

        //driver.get("http://www.linkedin.com");
       // firefoxDriver.get("http://www.facebook.com");
        //ieDriver.get("http://www.yahoo.com");

        WebElement findJobTextBox = driver.findElement(By.xpath("/html/body/main/section[1]/section/div[1]/button"));
        Thread.sleep(2*1000);
         findJobTextBox.click();
         WebElement jobSearchTextBox = driver.findElement(By.xpath("//*[@id=\"JOBS\"]/section[1]/input"));
                jobSearchTextBox .sendKeys("Software Developer");
                jobSearchTextBox.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"JOBS\"]/section[1]/input"))));
                jobSearchTextBox.click();


        WebElement googleSearchButton = driver.findElement(By.xpath("//div[@class='tfB0Bf']//input[@name='btnK']"));
        googleSearchButton.click();
    }
}
