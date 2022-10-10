package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageThree {

    WebDriver driver;


    public pageThree(WebDriver driver){
        this.driver = driver;
    }

    public String getItemTitle(){

        String itemTitle = driver.findElement(By.id("productTitle")).getAttribute("innerHTML");
        return itemTitle;
    }

    public String getItemPrice(){

        String itemPrice = driver.findElement(By.xpath("//*[@class='a-offscreen']")).getAttribute("innerHTML");
        return itemPrice;
    }

    public void printAll(){

        String Title  = getItemTitle();
        int length = Title.length();
        String Price = getItemPrice();

        System.out.println("Item title is : "+Title);
        System.out.println("Title length is : "+length);
        System.out.println("Item price is : "+ Price);

    }

    public void selectAddToCart(){

        driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).submit();
    }
}




