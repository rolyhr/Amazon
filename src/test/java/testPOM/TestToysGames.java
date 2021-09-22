package testPOM;

import POM.Sell;
import POM.ToysGames;
import baseAPI.MySQLConnection;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

//Dihia Bounab


public class TestToysGames extends TestBase {


    public void ToysGames() {
        PageFactory.initElements(driver, this);
    }

    @Test(enabled = true)
    public void TestNavigateToToysGames() {
        getToysGames().clickOnKidsGiftGuideMenu();
        String actualTitle = driver.getTitle();

        String expTitle = "Toys&Games";
        String actualURL = "Toys&Games";

        Assert.assertEquals(actualTitle, expTitle);

    }

    @Test()
    public void testNavigateToShopToysByAge() {
        getToysGames().clickOnShopToysByAge();
        String actualTitle = driver.getTitle();
        String expTitle = "ShopToysByAge";
        String actualURL = "Toys&Games";
        Assert.assertEquals(actualTitle, expTitle);
        Assert.assertEquals(actualURL, "URL");
    }

    @Test()
    public void testNavigateToShopBestSellingToys() {
        getToysGames().clickOnShopBestSellingToys();
        String actualTitle = driver.getTitle();
        //Thread.sleep(3000);
        String expTitle = "Shop Best Selling Toys";
        String actualURL = " Toys&Games ";
        Assert.assertEquals(actualTitle, expTitle);
        Assert.assertEquals(actualURL, "URL");
    }


    @Test(description = "Dresss", priority = 1)
    public void testNavigateToToysGames() {
        getToysGames().nigthMareBeforeChristmas();
        String actualTitle = driver.getTitle();
        String expTitle = "nigthMareBeforeChristmas";
        String actualURL = "Toys&Games";
        Assert.assertEquals(actualTitle, expTitle);
        Assert.assertEquals(actualURL, "URL");


    }


    @Test(enabled = true)
    public void testNavigateTodoSearch() {

        String searchtearm = "BAKE FOR ONE YEAR OLD";
        getToysGames().doSearch(searchtearm);
        String currentUrl = driver.getCurrentUrl();

        String expectedURL = " Toys&Games";
       // System.out.println("Actual Tile");
        Assert.assertEquals(currentUrl,expectedURL, "URL ");


    }
  /*  @Test (description = "TC001CA", priority = 5, enabled = true)
    public void testCreateNewAccountWithValidData() throws IOException, SQLException, ClassNotFoundException {
        mySQLConnection = new MySQLConnection();
        MySQLConnection.loadProperties();
        MySQLConnection.connectToSqlDatabase();
        Sell sell = getSell();

        sell.clickOnSignUpButton();
        sell.clickOnCreateAccountButton();
        sell.sendNameToTextField("Roly Hr");
        sell.sendEmailToTextField("sample@email.com");
        sell.sendPasswordToPasswordField("password");
        sell.sendReEnterPasswordToPasswordField("password");
        sell.clickOnNextButtonInCreateAccountPage();

        //Need to assert on the result...
    }*/

}
