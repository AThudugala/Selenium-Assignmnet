package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class home {

    WebDriver driver;


    public home(WebDriver driver){
        this.driver = driver;
    }

    // Get the page URL and verify if it is the correct page that is opened
    public void verifyURL(){

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.com/","Incorrect URL");
    }

    // Select “Computers” from main drop-down box
    public void selectDpBox() {

        Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropdown.selectByVisibleText("Computers");
    }

    // Type “Laptop” on search bar and Click on Search button icon [ Left hand side]
    public void searchItem() {

        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Laptop");
        driver.findElement(By.xpath("//*[@value='Go']")).click();
    }

}
