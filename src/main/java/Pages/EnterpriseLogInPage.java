package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class EnterpriseLogInPage {

    WebDriver driver;

    By SingInButton = By.id("signInJoinButton");

    By Email = By.name("eplus-email");

    By Password = By.name("eplus-password");

    By SingIn =By.xpath("//*[@id=\"enterprise-login\"]/div/button[1]");

    By titleText =By.xpath("//*[@id=\"reservationWidget\"]/div/div[2]/div/div[1]/h2");

    public EnterpriseLogInPage(WebDriver driver){

        this.driver = driver;

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        driver.findElement(Email).sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

        driver.findElement(Password).sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

        driver.findElement(SingIn).click();

    }

    public void clickSingUp(){
        driver.findElement(SingInButton).click();
    }

    public String getLoginTitle(){
        String getPageTitle = driver.findElement(titleText).getText();
        System.out.println(getPageTitle);

        return getPageTitle;

    }

    //Get the title of Login Page

    public void loginEnterprise(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();
    }


}
