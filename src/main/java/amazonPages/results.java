package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class results {

    WebDriver driver;

    public results(WebDriver driver){
        this.driver = driver;
    }

    // In the Featured Brands Category select first brand
    public void selectFeatrdBrand(){

        WebElement select1 = driver.findElement(By.xpath("//ul[@aria-labelledby=\"p_89-title\"]//li[@id=\"p_89/HP\"]//i"));
        select1.click();

    }

    // Select the first search item
    public void selectFirstItem(){

        driver.findElement(By.xpath("//*[@data-index='1']//div[@class='aok-relative']//a")).click();
    }
}
