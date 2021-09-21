package testPOM;

import POM.Pharmacy;
import baseAPI.DataReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPharmacy extends TestBase {
    //Jannatul Tuba

    public String actualURL(){
        String actualURL = driver.getCurrentUrl();
        return actualURL;
    }

    public String actualTitle(){
        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    /********************************************* Navigate To Pharmacy Home Page **********************************************************/
    @Test (description = "TC001PP",enabled = false,groups = {"Regression"},priority = 0)
    public void testNavigationToAmazonPharmacyPage() throws InterruptedException {
        Thread.sleep(2000);
        getPharmacy().navigateToPharmacyPage();
        String expectedURL = "https://www.amazon.com/b?node=23435487011&ref_=nav_cs_pharmacy_641fc8228c0a4254ba0c834bf1a0429c";
        Assert.assertEquals(  actualURL(),expectedURL,"FAILED TO NAVIGATE TO PHARMACY HOME PAGE");
    }


    /********************************************* Test Pharmacy Navigation Bar **********************************************************/

    @Test(description = "TC002PP",enabled = true,priority = 1)
    public void testNavigationToHowItWorksPharmacyPage() {
        SoftAssert softAssert = new SoftAssert();


        getPharmacy().navigateToPharmacyPage();
        getPharmacy().navigateToPharmacyHowItWorksPage();
        String expectedURL = "https://pharmacy.amazon.com/how-it-works";
        softAssert.assertEquals(actualURL(),expectedURL,"FAILED TO NAVIGATE TO PHARMACY HOME PAGE");
        driver.navigate().back();

        getPharmacy().navigateToPharmacyPrimeSavingPage();
        String expectedURL1 = "https://pharmacy.amazon.com/pricing";
        softAssert.assertEquals(actualURL(),expectedURL1,"FAILED TO NAVIGATE TO PHARMACY HOME PAGE");
        driver.navigate().back();

        getPharmacy().navigateToPharmacyPromisePage();
        String expectedURL2 = "https://pharmacy.amazon.com/promise";
        softAssert.assertEquals(actualURL(),expectedURL2,"FAILED TO NAVIGATE TO PHARMACY PROMISE PAGE");
        driver.navigate().back();

        getPharmacy().navigateToPharmacyPrescribersPage();
        String expectedURL3 = "https://pharmacy.amazon.com/prescribers";
        softAssert.assertEquals(actualURL(),expectedURL3,"FAILED TO NAVIGATE TO PHARMACY PRESCRIBER PAGE");
        driver.navigate().back();

        getPharmacy().navigateToPharmacyHelpPage();
        String expectedURL4 = "https://pharmacy.amazon.com/help";
        softAssert.assertEquals(actualURL(),expectedURL4,"FAILED TO NAVIGATE TO PHARMACY HOME PAGE");
//        driver.navigate().back();

//        pharmacy.navigateToPharmacyShopAllPage();
//        String expectedURL5 = "https://www.amazon.com/b?node=23435487011&ref_=nav_cs_pharmacy_641fc8228c0a4254ba0c834bf1a0429c";
//        softAssert.assertEquals(actualURL(),expectedURL5,"FAILED TO NAVIGATE TO PHARMACY HOME PAGE");
         softAssert.assertAll();

    }
    /********************************************* Test navigate To Compare Prices In Seconds Page**********************************************************/

    @Test(description = "TC003PP",enabled = true,priority = 2)
    public void TestnavigateToComparePricesInSeconds(){

        getPharmacy().navigateToPharmacyPage();
        getPharmacy().navigateToComparePricesInSeconds();
        String expectedTitle = "Prime Rx";
        Assert.assertEquals(actualTitle(),expectedTitle,"FAILED TO NAVIGATE TO COMPAREP RICE IN SECOND PAGE");
    }

    /********************************************* Test scroll left and Right Shop CommonMedicines **********************************************************/

    @Test(description = "TC004PP",enabled = true,priority = 3)
    public void TestscrollShopCommonMedicine() throws InterruptedException {
        getPharmacy().navigateToPharmacyPage();
        getPharmacy().scrollShopCommonMedicine();

    }

    /********************************************* Test shop by condition**********************************************************/

    @Test(description = "TC005PP",enabled = true,priority = 4)

    public void TestShopByCondition(){
        getPharmacy().navigateToPharmacyPage();

        getPharmacy().shopByConditionAnxiety();
        driver.navigate().back();

        getPharmacy().shopByConditionDepression();
        driver.navigate().back();

        getPharmacy().shopByConditionDiabetes();
        driver.navigate().back();

        getPharmacy().shopByConditionHighBloodPressure();
        driver.navigate().back();

        getPharmacy().shopByConditionHighCholestorel();
        driver.navigate().back();

        getPharmacy().shopByConditionHyperthyrodisim();
        driver.navigate().back();

        getPharmacy().shopByConditionDiabetes();
        driver.navigate().back();
    }

    /********************************************* Test Search Discount MEDS **********************************************************/
    @Test(description = "TC006PP",enabled = true,priority = 5)
    public void testPhamacySearchDiscountMeds() throws IOException {

        dataReader = new DataReader();
        SoftAssert softAssert = new SoftAssert();
        String refPath = "/src/test/resources/TestData/AmazonTestData.xlsx";
        String actualSearchResult;
        String expectedSearchResult;
        String[] expectedText = dataReader.fileReaderStringXSSF(systemPath+refPath,"AmazonPhamacyTestData");

        List<String> searchMEDList = new ArrayList<>();
        Collections.addAll(searchMEDList, "Bisoprolol","Misoprostol","Carisoprodol","Propranolol");

        getPharmacy().navigateToPharmacyPage();
        getPharmacy().navigateToComparePricesInSeconds();

        for(int i = 0;i<=searchMEDList.size()-1;i++){
            getPharmacy().phamacySearchDiscountMeds(searchMEDList.get(i));
            actualSearchResult = getPharmacy().phamacySearchResult.getText();
            expectedSearchResult = expectedText[i];
            System.out.println("ACTUAL SEARCH RESULT: "+ actualSearchResult);
            System.out.println("EXPECTED SEARCH RESULT: "+ expectedSearchResult);
            softAssert.assertEquals(actualSearchResult,expectedSearchResult,"SEARCH DISCOOUNT MEDS IS NOT WORKIGN PROPERLY");

        }
    }


    /********************************************* Test Expand Pharmacy Page Content **********************************************************/

    @Test(description = "TC007PP",enabled = true,priority = 6)
    public void testExapandPharmacyyContent() throws InterruptedException {

        getPharmacy().navigateToPharmacyPage();
        String className = getPharmacy().exapandPharmacyyContent();
        System.out.println(className);
        if(className.contains("expanded")){
            Assert.assertTrue(true,"CLASS EXPANDED TEST PASSED");
        }else {
            Assert.assertTrue(false,"CLASS EXPANDED TEST FAILED");

        }
    }
}
