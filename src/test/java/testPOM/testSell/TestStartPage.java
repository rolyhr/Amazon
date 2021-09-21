package testPOM.testSell;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.io.IOException;

public class TestStartPage extends TestBase {

    @Test(description = "TC001BG", priority = 1, enabled = true)
    public void testNavigateToBeginnerGuidePage() throws IOException {
        startPage = getStartPage();
        startPage.navigateToBeginnerGuidePage();
        waitForElementToContainText(startPage.titleTextBeginnerGuide, "The beginner's guide to selling on Amazon");
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestStartPage", 0);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Start > Beginner's Guide Page!");
    }

    @Test(description = "TC002SSP", priority = 2, enabled = true)
    public void testNavigateToHowToStartSellingPage() throws IOException {
        startPage = getStartPage();
        startPage.navigateToHowToStartSellingPage();
        waitForElementToContainText(startPage.titleTextStartSelling, "How to start selling on Amazon ");
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestStartPage", 1);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Start > How To Start Selling Page!");
    }

    @Test(description = "TC003BOS", priority = 3, enabled = true)
    public void testNavigateToBuildOnlineStorePage() throws IOException {
        startPage = getStartPage();
        startPage.navigateToBuildOnlineStorePage();
        waitForElementToContainText(startPage.titleTextBuildOnlineStore, "Build an online store featuring your brand");
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestStartPage", 2);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Start > Build Online Store Page!");
    }

    @Test(description = "TC003LYB", priority = 4, enabled = true)
    public void testNavigateToLaunchYourBrandPage() throws IOException {
        startPage = getStartPage();
        startPage.navigateToLaunchYourBrandPage();
        waitForElementToContainText(startPage.titleTextLaunchYourBrand, "Launch your brand on Amazon ");
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestStartPage", 3);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Start > Launch Your Brand Page!");
    }

    @Test(description = "TC003ASP", priority = 5, enabled = true)
    public void testNavigateToAmazonSellingProgramPage() throws IOException {
        startPage = getStartPage();
        startPage.navigateToAmazonSellingProgramPage();
        waitForElementToContainText(startPage.titleTextAmazonSellingProgram, "Unlock a universe of selling opportunities");
        String actualTest = driver.getTitle();
        String expectedTest = readFromExcel("TestStartPage", 4);
        Assert.assertEquals(actualTest, expectedTest, "Failed Navigate To Start > Amazon Selling Program Page!");
    }
}
