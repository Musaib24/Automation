package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterprisePage {

    public EnterprisePage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    By singInButtonElm = By.id("signInJoinButton");
    By emailTextFieldElm = By.name("eplus-email");
    By passwordFieldElm = By.id("utility-eplus-password");
    By submitButtonElm = By.xpath("//*[@id=\"enterprise-login\"]/div/button[1]");

    public void clickSingInButton ( ){
        WebElement singInButton = driver.findElement(singInButtonElm);
        singInButton.click();
    }

    public void enterEmail (String email) {
        WebElement emailTextField = driver.findElement(emailTextFieldElm);
        emailTextField.sendKeys(email);
    }

    public void enterPassword (String password){
        WebElement passwordField = driver.findElement(passwordFieldElm);
        passwordField.sendKeys(password);
    }

    public void clickSubmit ( ){
        WebElement submitButton = driver.findElement(submitButtonElm);
        submitButton.click();
    }
}
