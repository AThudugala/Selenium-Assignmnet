package testCases;

import amazonPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCases {

    String price;
    String name;

    WebDriver driver;

    @BeforeTest public void beforeTest(){

        System.setProperty( "webdriver.chrome.driver", System.getProperty( "user.dir" ) + "\\drivers\\chromedriver.exe" );
        driver = new ChromeDriver();

        //(2) Open the URL
        driver.navigate().to("https://www.amazon.com/");

        //Storing the Application Url in the String variable String
        String url = "https://www.amazon.com/";

        //Launch the ToolsQA WebSite
        driver.get(url);
        driver.manage().window().maximize();

    }

    @Test(priority = 0) public void testHomePage(){

        home home = new home(driver);
        home.verifyURL();
        home.selectDpBox();
        home.searchItem();

    }

    @Test(priority = 1) public void testResultsPage(){

        results results = new results(driver);
        results.selectFeatrdBrand();
        results.selectFirstItem();
    }

    @Test(priority = 2) public void testPageThree(){

        pageThree pageThree = new pageThree(driver);
        pageThree.getItemTitle();
        pageThree.getItemPrice();
        pageThree.printAll();
        pageThree.selectAddToCart();
    }

    @Test(priority = 3) public void testPageFour(){

        pageFour pageFour = new pageFour(driver);
        pageFour.clickOnCart();
    }

    @Test(priority = 4) public void testPageFive(){

        pageFive pageFive = new pageFive(driver);
        pageFive.verifyDetails(price, name);
        pageFive.verifyQuantity();
        pageFive.verifySubTotal();
        pageFive.clickProceedToCheckOutButton();

    }

    @Test(priority = 5) public void testSignInPage(){

        signIn signIn = new signIn(driver);
        signIn.clickCreateAccBtn();
    }

    @Test(priority = 6)
    @Parameters({"sUserName","sEmail","sPassword"}) public void testCreateAccountPage(){

        createAccount createAccount = new createAccount(driver);
        createAccount.addDetails("Anupa","anuamawarni@gamil.com","ama10");

    }


    @AfterTest public void afterTest(){

        driver.close();
    }
}



