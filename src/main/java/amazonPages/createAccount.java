package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createAccount {

    WebDriver driver;

    public createAccount(WebDriver driver){

        this.driver=driver;
    }

    // Type sample username, email, password and re-enter password
    public void addDetails(String sUserName,String sEmail,String sPassword){

        driver.findElement(By.name("customerName")).sendKeys(sUserName);
        driver.findElement(By.name("email")).sendKeys(sEmail);
        driver.findElement(By.name("password")).sendKeys(sPassword);
        driver.findElement(By.name("passwordCheck")).sendKeys(sPassword);
    }


}
