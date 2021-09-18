package testPOM;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestSearchBar extends TestBase {
    //Osman Aziz

    @Test(description = "ID:001", groups = {"smoke","sanity"})
    public void testDoSearch(){
        getSearchBar().doSearch("Books");
        String expectedTitle = "Amazon.com: Books";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(groups = "sanity")
    public void testDoSearchByCategoryAudible(){
        getSearchBar().doSearchByCategoryAudible("Alice In Wonderland");
        String expectedTitle = "Amazon.com : Alice In Wonderland";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(groups = {"sanity"})
    public void testDoSearchByCategoryAlexaSkills(){
        getSearchBar().doSearchByCategoryAlexaSkills("Play Music");
        String expectedTitle = "Amazon.com : Play Music";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryAmazonDevices(){
        getSearchBar().doSearchByCategoryAmazonDevices("Fire TV");
        String expectedTitle = "Amazon.com : Fire TV";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryAmazonPharmacy(){
        getSearchBar().doSearchByCategoryAmazonPharmacy("Vitamins");
        String expectedTitle = "Amazon.com : Vitamins";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryWarehouseDeals(){
        getSearchBar().doSearchByCategoryWarehouseDeals("Deals of the Day");
        String expectedTitle = "Amazon.com : Deals of the Day";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryAppliances(){
        getSearchBar().doSearchByCategoryAppliances("Toaster");
        String expectedTitle = "Amazon.com : Toaster";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryMobileApps(){
        getSearchBar().doSearchByCategoryMobileApps("Mario");
        String expectedTitle = "Amazon.com : Mario";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryArtsCrafts(){
        getSearchBar().doSearchByCategoryArtCrafts("Painting Supply");
        String expectedTitle = "Amazon.com : Painting Supply";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryAutomotive(){
        getSearchBar().doSearchByCategoryAutomotive("Windshield Wiper");
        String expectedTitle = "Amazon.com : Windshield Wiper";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryBabyProducts(){
        getSearchBar().doSearchByCategoryBabyProducts("Diaper");
        String expectedTitle = "Amazon.com : Diaper";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testDoSearchByCategoryBeautyProducts(){
        getSearchBar().doSearchByCategoryBeautyProducts("Eyeliner");
        String expectedTitle = "Amazon.com : Lotion";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
