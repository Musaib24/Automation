import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(baseUrl);
        Select dropCountry = new Select(driver.findElement(By.name("country")));
        dropCountry.selectByVisibleText("ANTARCTICA");
        WebElement selectDropDown = dropCountry.getFirstSelectedOption();
        System.out.println(selectDropDown.getText());
        Thread.sleep(3000);
        dropCountry.selectByIndex(4);
        Thread.sleep(3000);
        dropCountry.selectByValue("BANGLADESH");

    }
}