import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
public class ClickAction{
    public static void main(String[] args) throws InterruptedException {
//		WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/simple_context_menu.html";
        driver.get(baseUrl);
        WebElement rightClick = driver.findElement(By.cssSelector(".context-menu-one"));
        WebElement txtUsername = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions builder = new Actions(driver);
        builder.doubleClick(txtUsername).perform();
        builder.contextClick(rightClick).perform();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(alert.getText());
        alert.accept();
        builder.keyUp(txtUsername,Keys.SHIFT);

    }


}