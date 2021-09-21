package testPOM.testSell;

import POM.sell.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.io.IOException;

public class TestSell extends TestBase {

    //Roly Hr

    @Test (description = "TC001", priority = 1, enabled = true)
    public void testNavigateToStartPage() throws IOException {
        Sell sell = getSell();
        sell.navigateToStartPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 0);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Start Page!");
    }

    @Test (description = "TC002", priority = 2, enabled = true)
    public void testNavigateToGrowPage() throws IOException {
        Sell sell = getSell();
        sell.navigateToGrowPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 1);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Grow Page!");
    }

    @Test (description = "TC003", priority = 3, enabled = true)
    public void testNavigateToLearnPage() throws IOException {
        Sell sell = getSell();
        sell.navigateToLearnPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 2);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Learn Page!");
    }

    @Test (description = "TC004", priority = 4, enabled = true)
    public void testNavigateToPricingPage() throws IOException {
        Sell sell = getSell();
        sell.navigateToPricingPage();
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestSell", 3);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Pricing Page!");
    }

    @Test (description = "TC001CA", priority = 5, enabled = true)
    public void testCreateNewAccountWithValidData() {
        Sell sell = getSell();
        sell.clickOnSignUpButton();
        sell.clickOnCreateAccountButton();
        sell.sendNameToTextField("Roly Hr");
        sell.sendEmailToTextField("sample@email.com");
        sell.sendPasswordToPasswordField("password");
        sell.sendReEnterPasswordToPasswordField("password");
        sell.clickOnNextButtonInCreateAccountPage();

        //Need to assert on the result...
    }

}
