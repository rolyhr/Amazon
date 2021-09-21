package testPOM;

import baseAPI.DataReader;
import dataProviders.TestSearchBarDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;
import java.io.IOException;

public class TestSearchBar extends TestBase{

    //Osman Aziz

    String [][] testData;

    @Test(description = "ID:001", priority = 1, enabled = true)
    public void testDoSearch() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearch(testData[0][0]);
        String expectedTitle = testData[0][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:002", priority = 2)
    public void testDoSearchByCategoryAudible() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryAudible(testData[1][0]);
        String expectedTitle = testData[1][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:003", priority = 3, enabled = true)
    public void testDoSearchByCategoryAlexaSkills() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryAlexaSkills(testData[2][0]);
        String expectedTitle = testData[2][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:004", priority = 4, enabled = true)
    public void testDoSearchByCategoryAmazonDevices() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryAmazonDevices(testData[3][0]);
        String expectedTitle = testData[3][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:005", priority = 5, enabled = true)
    public void testDoSearchByCategoryAmazonPharmacy() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryAmazonPharmacy(testData[4][0]);
        String expectedTitle = testData[4][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:006", priority = 6, enabled = true)
    public void testDoSearchByCategoryWarehouseDeals() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryWarehouseDeals(testData[5][0]);
        String expectedTitle = testData[5][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:007", priority = 7, enabled = true)
    public void testDoSearchByCategoryAppliances() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryAppliances(testData[6][0]);
        String expectedTitle = testData[6][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:008", priority = 8, enabled = true)
    public void testDoSearchByCategoryMobileApps() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryMobileApps(testData[7][0]);
        String expectedTitle = testData[7][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:009", priority = 9, enabled = true)
    public void testDoSearchByCategoryArtsCrafts() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryArtCrafts(testData[8][0]);
        String expectedTitle = testData[8][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:010", priority = 10, enabled = true)
    public void testDoSearchByCategoryAutomotive() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryAutomotive(testData[9][0]);
        String expectedTitle = testData[9][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:011", priority = 11, enabled = true)
    public void testDoSearchByCategoryBabyProducts() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryBabyProducts(testData[10][0]);
        String expectedTitle = testData[10][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(description = "ID:012", priority = 12, enabled = true)
    public void testDoSearchByCategoryBeautyProducts() throws IOException {
        testData = getSearchBar().getValidSearchBarTestData();
        getSearchBar().doSearchByCategoryBeautyProducts(testData[11][0]);
        String expectedTitle = testData[11][1];
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
