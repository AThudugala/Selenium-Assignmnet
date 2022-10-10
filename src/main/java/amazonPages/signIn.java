package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signIn {

    WebDriver driver;

    public signIn(WebDriver driver){

        this.driver=driver;
    }

    //Click on ‘Create your Amazon Account’ button
    public void clickCreateAccBtn(){

        driver.findElement(By.id("createAccountSubmit")).click();
    }



}
