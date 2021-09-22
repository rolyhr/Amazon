package testPOM.testSell;

import POM.locators.SellLocators;
import POM.sell.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.io.IOException;
import java.sql.SQLException;

public class TestSell extends TestBase {

    //Roly Hr

    @Test (description = "TC001", priority = 1, enabled = true)
    public void testNavigateToStartPage() {
        Sell sell = getSell();
        sell.navigateToStartPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 0);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Start Page!");
    }

    @Test (description = "TC002", priority = 2, enabled = true)
    public void testNavigateToGrowPage() {
        Sell sell = getSell();
        sell.navigateToGrowPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 1);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Grow Page!");
    }

    @Test (description = "TC003", priority = 3, enabled = true)
    public void testNavigateToLearnPage() {
        Sell sell = getSell();
        sell.navigateToLearnPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 2);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Learn Page!");
    }

    @Test (description = "TC004", priority = 4, enabled = true)
    public void testNavigateToPricingPage() {
        Sell sell = getSell();
        sell.navigateToPricingPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 3);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Pricing Page!");
    }

    @Test (description = "TC001CA", priority = 5, enabled = true)
    public void testCreateNewAccountWithValidData() throws IOException, SQLException, ClassNotFoundException {
        Sell sell = getSell();
        sell.clickOnSignUpButton();
        sell.clickOnCreateAccountButton();
        sell.sendNameToTextField(getDataFromMySQL(SellLocators.QUERY, "yourName"));
        sell.sendEmailToTextField(getDataFromMySQL(SellLocators.QUERY, "email"));
        sell.sendPasswordToPasswordField(getDataFromMySQL(SellLocators.QUERY, "password"));
        sell.sendReEnterPasswordToPasswordField(getDataFromMySQL(SellLocators.QUERY, "reenterPassword"));
        sell.clickOnNextButtonInCreateAccountPage();
        //Need to assert on the result...
    }

}
