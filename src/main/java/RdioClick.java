import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RdioClick {
    public static void main(String[] args) throws InterruptedException {
//		WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio1.click();
        Thread.sleep(3000);
        radio2.click();
    }
}
