package POM;

import POM.locators.SearchBarLocators;
import baseAPI.BaseAPI;
import baseAPI.DataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchBar extends BaseAPI {

    //Osman Aziz

    public SearchBar() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = SearchBarLocators.SEARCH_BAR)
    WebElement searchBar;

    @FindBy(id = SearchBarLocators.SEARCH_BUTTON)
    WebElement searchButton;

    @FindBy(xpath = SearchBarLocators.CATEGORY_AUDIBLE)
    WebElement categoryAudible;

    @FindBy(xpath = SearchBarLocators.CATEGORY_ALEXA_SKILLS)
    WebElement categoryAlexaSkills;

    @FindBy(xpath = SearchBarLocators.CATEGORY_AMAZON_DEVICES)
    WebElement categoryAmazonDevices;

    @FindBy(xpath = SearchBarLocators.CATEGORY_AMAZON_PHARMACY)
    WebElement categoryAmazonPharmacy;

    @FindBy(xpath = SearchBarLocators.CATEGORY_WAREHOUSE)
    WebElement categoryWarehouseDeals;

    @FindBy(xpath = SearchBarLocators.CATEGORY_APPLIANCES)
    WebElement categoryAppliances;

    @FindBy(xpath = SearchBarLocators.CATEGORY_MOBILE_APPS)
    WebElement categoryMobileApps;

    @FindBy(xpath = SearchBarLocators.CATEGORY_ARTS_CRAFTS)
    WebElement categoryArtsCrafts;

    @FindBy(xpath = SearchBarLocators.CATEGORY_AUTOMOTIVE)
    WebElement categoryAutomotive;

    @FindBy(xpath = SearchBarLocators.CATEGORY_BABY_PRODUCTS)
    WebElement categoryBabyProducts;

    @FindBy(xpath = SearchBarLocators.CATEGORY_BEAUTY_PRODUCTS)
    WebElement categoryBeautyProducts;


    void sendKeysToSearchBar(String value){sendKeysToElement(searchBar,value);}

    void clickSearchButton(){
        clickOnElement(searchButton);
    }

    void clickCategoryAudible(){
        clickOnElement(categoryAudible);
    }

    void clickCategoryAlexaSkills(){clickOnElement(categoryAlexaSkills);}

    void clickCategoryAmazonDevices(){clickOnElement(categoryAmazonDevices);}

    void clickCategoryAmazonPharmacy(){clickOnElement(categoryAmazonPharmacy);}

    void clickCategoryWarehouseDeals(){clickOnElement(categoryWarehouseDeals);}

    void clickCategoryAppliances(){clickOnElement(categoryAppliances);}

    void clickCategoryMobileApps(){clickOnElement(categoryMobileApps);}

    void clickCategoryArtsCrafts(){clickOnElement(categoryArtsCrafts);}

    void clickCategoryAutomotive(){clickOnElement(categoryAutomotive);}

    void clickCategoryBabyProducts(){clickOnElement(categoryBabyProducts);}

    void clickCategoryBeautyProducts(){clickOnElement(categoryBeautyProducts);}


    public void doSearch(String value){
        sendKeysToSearchBar(value);
        clickSearchButton();
    }

    public void doSearchByCategoryAudible(String value){
        sendKeysToSearchBar(value);
        clickCategoryAudible();
        clickSearchButton();
    }

    public void doSearchByCategoryAlexaSkills(String value){
        sendKeysToSearchBar(value);
        clickCategoryAlexaSkills();
        clickSearchButton();
    }

    public void doSearchByCategoryAmazonDevices(String value){
        sendKeysToSearchBar(value);
        clickCategoryAmazonDevices();
        clickSearchButton();
    }

    public void doSearchByCategoryAmazonPharmacy(String  value){
        sendKeysToSearchBar(value);
        clickCategoryAmazonPharmacy();
        clickSearchButton();
    }

    public void doSearchByCategoryWarehouseDeals(String value){
        sendKeysToSearchBar(value);
        clickCategoryWarehouseDeals();
        clickSearchButton();
    }

    public void doSearchByCategoryAppliances(String value){
        sendKeysToSearchBar(value);
        clickCategoryAppliances();
        clickSearchButton();
    }

    public void doSearchByCategoryMobileApps(String value){
        sendKeysToSearchBar(value);
        clickCategoryMobileApps();
        clickSearchButton();
    }

    public void doSearchByCategoryArtCrafts(String value){
        sendKeysToSearchBar(value);
        clickCategoryArtsCrafts();
        clickSearchButton();
    }

    public void doSearchByCategoryAutomotive(String value){
        sendKeysToSearchBar(value);
        clickCategoryAutomotive();
        clickSearchButton();
    }

    public void doSearchByCategoryBabyProducts(String value){
        sendKeysToSearchBar(value);
        clickCategoryBabyProducts();
        clickSearchButton();
    }

    public void doSearchByCategoryBeautyProducts(String value){
        sendKeysToSearchBar(value);
        clickCategoryBeautyProducts();
        clickSearchButton();
    }


    static String path = System.getProperty("user.dir") + "/src/test/resources/TestData/AmazonTestData.xlsx";
    public String[][] getValidSearchBarTestData() throws IOException {
        dataReader = new DataReader();
        String sheetName = "osman_aziz";
        String[][] testData = dataReader.fileReaderArrayStringArraysXSSF(path,sheetName);
        return testData;
    }
}
