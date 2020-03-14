package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterpriseHomePage {

    WebDriver driver;

    By homePageSingIn = By.id("signInJoinButton");



    public EnterpriseHomePage(WebDriver driver){

        this.driver = driver;

    }

    //Get the User name from Home Page

    public String getHomePageDashboardUserName(){

        return    driver.findElement(homePageSingIn).getText();

    }

}
