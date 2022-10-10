package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.sun.org.apache.xerces.internal.util.XMLChar.trim;

public class pageFive {

    WebDriver driver;

    public pageFive(WebDriver driver){
        this.driver = driver;
    }

    public void verifyDetails(String price,String name){

        String newPrice = driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getAttribute("innerHTML");
        Assert.assertEquals(newPrice,price,"Price is incorrect");

        String newName = driver.findElement(By.xpath("//*[@id='productTitle']")).getAttribute("innerHTML");
        Assert.assertEquals(trim(newName),trim(name),"Name is incorrect");

    }

    //Assert the ‘quantity of the Item (should not be empty)
    public void verifyQuantity(){

        Assert.assertNotNull( driver.findElement(By.xpath("//*[@id='a-autoid-0']")).getAttribute("innerHTML"),"Proceed to checkout quantity of the item is not empty ");

    }

    //Assert the Shopping Cart Subtotal (should be equal)
    public void verifySubTotal(){
        Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")).getAttribute("innerHTML"),driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")).getAttribute("innerHTML"),"Proceed to checkout subtotal is not equal to shopping cart subtotal");
    }

    //Click on ‘Proceed to Checkout’ button
    public void clickProceedToCheckOutButton(){

        driver.findElement(By.xpath("//*[@name='proceedToRetailCheckout']")).click();
    }
}



