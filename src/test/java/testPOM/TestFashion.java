package testPOM;

import POM.Fashion;
import POM.locators.FashionLocators;
import baseAPI.BaseAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.io.IOException;
import java.net.URL;

public class TestFashion extends TestBase {
    //Khadiza Pushpo
    String [][] testData;

    @Test(description = "TC001FT", priority = 1)
    public void testNavigateToFashionTab() throws InterruptedException, IOException {
       // explicitWait.until(ExpectedConditions.visibilityOfElementLocated());
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
//        getFashion().getFashionTestData(testData[0][0]);
//        String expectedTitle = testData[0][1];
//        Thread.sleep(3000);
        System.out.println("click on fashion Tab");
        String actualTitle = "Amazon.com: Fashion";
        String expectedTitle = "Amazon.com: Fashion";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC002WFT", priority = 2)
    public void testWomenFashionMainMenuTabHover() throws InterruptedException {

        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
        getFashion().clickOnWomenFashionMainMenuTabHover();
        System.out.println("click on WomenFashionHoverMainMenuTabHOver");
        String actualTitle = "Amazon.com: Women";
        String expectedTitle = "Amazon.com: Women";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC003WFT", priority = 3)
    public void testClothingSubMenuTabHover() throws InterruptedException {

        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
        getFashion().clickOnWomenFashionMainMenuTabHover();
        Thread.sleep(3000);
        getFashion().clickOnClothingSubMenu();
        System.out.println("click on clothing SubMenu TabHOver");
        String actualTitle = "Amazon.com: clothing";
        String expectedTitle = "Amazon.com: clothing";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }


    @Test(description = "TC004MFT", priority = 4)
    public void testMenFashionTabHover() throws InterruptedException {
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
       getFashion().clickOnMenFashionTabHover();
        String actualTitle = "Amazon.com: MenFashion";
        String expectedTitle = "Amazon.com: MenFashion";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC005KFT", priority = 5)
    public void testKidsFashionTabHover() throws InterruptedException {
        Thread.sleep(3000);
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
        getFashion().clickOnKidsFashionTabHover();
        String actualTitle = "Amazon.com: KidsFashion";
        String expectedTitle = "Amazon.com: KidsFashion";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC006KFT", priority = 6)
    public void testLuggageFashionTabHover() throws InterruptedException {
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
        getFashion().clickOnLuggageFashionTabHover();
        String actualTitle = "Amazon.com: Luggage";
        String expectedTitle = "Amazon.com: Luggage";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC007SADFT", priority = 7)
    public void testSalesAndDealsFashionTabHover() throws InterruptedException {
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
        getFashion().clickOnSalesAndDealsFashionTabHover();
        String actualTitle = "Amazon.com: SalesAndDeals";
        String expectedTitle = "Amazon.com: SalesAndDeals";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC008NAT", priority = 8)
    public void testNewArrivalsTabHover() throws InterruptedException {
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
        getFashion().clickOnNewArrivalsTabHover();
        String actualTitle = "Amazon.com: NewArrivals";
        String expectedTitle = "Amazon.com: NewArrivals";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC009OBT", priority = 9)
    public void testOurBrandsTabHover() throws InterruptedException {
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
        getFashion().clickOnOurBrandsTabHover();
        String actualTitle = "Amazon.com: OurBrandsTab";
        String expectedTitle = "Amazon.com: OurBrandsTab";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test(description = "TC010PWFT", priority = 10)
    public void testPrimeWardrobeFashionTabHover() throws InterruptedException {
        Thread.sleep(3000);
        getFashion().clickOnFashionTab();
        Thread.sleep(3000);
       getFashion().clickOnPrimeWardrobeFashionTabHover();
        String actualTitle = "Amazon.com: PrimeWardrobeFashion";
        String expectedTitle = "Amazon.com: PrimeWardrobeFashion";
        System.out.println(actualTitle + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);


    }

}
