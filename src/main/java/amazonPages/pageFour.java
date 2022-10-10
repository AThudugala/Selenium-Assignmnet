package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageFour {

    WebDriver driver;

    public pageFour(WebDriver driver){
        this.driver = driver;
    }

    // 13 . Click on Cart
    public void clickOnCart(){

        driver.findElement(By.xpath("//*[@id='//*[@id='attach-sidesheet-view-cart-button']']")).click();

    }



}
