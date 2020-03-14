import com.google.common.io.ByteArrayDataInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SingUp {public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Musaib\\Documents\\SeleniumDriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
    driver.get(baseUrl);
    Thread.sleep(1000);
    driver.switchTo().frame("flow_close_btn_iframe");
    WebElement ifram = driver.findElement(By.id("closeBtn"));
    ifram.click();
    driver.switchTo().defaultContent();
    WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
    firstName.sendKeys("Musaib");
    Thread.sleep(1000);
    WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
    lastName.sendKeys("Ahmed");
    Thread.sleep(1000);
    WebElement phone = driver.findElement(By.name("phone"));
    phone.sendKeys("9172267873");
    Thread.sleep(1000);
    WebElement email = driver.findElement(By.id("userName"));
    email.sendKeys("musaib1124@gmail.com");
    Thread.sleep(1000);
    WebElement address = driver.findElement(By.xpath("//*[contains(@name,'add')]" ));
    address.sendKeys("123 Main Street");
    Thread.sleep(1000);
    WebElement city = driver.findElement(By.name("city"));
    city.sendKeys("Fairfax");
    Thread.sleep(1000);
    WebElement state = driver.findElement(By.name("state"));
    state.sendKeys("Virginia");
    Thread.sleep(1000);
    WebElement postalCode = driver.findElement(By.name("postalCode"));
    postalCode.sendKeys("22042");
    Thread.sleep(1000);
    WebElement country = driver.findElement(By.name("country"));
    Select dropDown = new Select(country);
    dropDown.selectByValue("UNITED STATES");
    Thread.sleep(1000);
    WebElement userName = driver.findElement(By.id("email"));
    userName.sendKeys("Musaib24");
    Thread.sleep(1000);
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Musaib1124");
    Thread.sleep(1000);
    WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
    confirmPassword.sendKeys("Musaib1124");
    Thread.sleep(1000);
    WebElement submit = driver.findElement(By.name("submit"));
    submit.click();

    
}
}
