package POM;

import POM.locators.SearchBarLocators;
import baseAPI.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class SearchBar extends BaseAPI {

    //Osman Aziz

    public SearchBar() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = SearchBarLocators.searchBar)
    WebElement searchBar;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @FindBy(xpath = "//option[@value = \"search-alias=audible\"]")
    WebElement categoryAudible;

    @FindBy(xpath = "//option[@value = \"search-alias=alexa-skills\"]")
    WebElement categoryAlexaSkills;

    @FindBy(xpath = "//option[@value = \"search-alias=amazon-devices\"]")
    WebElement categoryAmazonDevices;

    @FindBy(xpath = "//option[@value = \"search-alias=amazon-pharmacy\"]")
    WebElement categoryAmazonPharmacy;

    @FindBy(xpath = "//option[@value = \"search-alias=warehouse-deals\"]")
    WebElement categoryWarehouseDeals;

    @FindBy(xpath = "//option[@value = \"search-alias=appliances\"]")
    WebElement categoryAppliances;

    @FindBy(xpath = "//option[@value = \"search-alias=mobile-apps\"]")
    WebElement categoryMobileApps;

    @FindBy(xpath = "//option[@value = \"search-alias=arts-crafts\"]")
    WebElement categoryArtsCrafts;

    @FindBy(xpath = "//option[@value = \"search-alias=automotive\"]")
    WebElement categoryAutomotive;

    @FindBy(xpath = "//option[@value = \"search-alias=baby-products\"]")
    WebElement categoryBabyProducts;

    @FindBy(xpath = "//option[@value = \"search-alias=beauty\"]")
    WebElement categoryBeautyProducts;



    void sendKeysToSearchBar(String value){
        sendKeysToElement(searchBar,value);
    }

    void clickSearchButton(){
        clickOnElement(searchButton);
    }
    void clickToSelectACategory(){
        clickOnElement(categoryAudible);
    }

    public void doSearch(String value){
        sendKeysToSearchBar(value);
        clickOnElement(searchButton);

    }
    public void doSearchByCategoryAudible(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryAudible);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryAlexaSkills(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryAlexaSkills);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryAmazonDevices(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryAmazonDevices);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryAmazonPharmacy(String  value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryAmazonPharmacy);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryWarehouseDeals(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryWarehouseDeals);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryAppliances(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryAppliances);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryMobileApps(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryMobileApps);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryArtCrafts(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryArtsCrafts);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryAutomotive(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryAutomotive);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryBabyProducts(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryBabyProducts);
        clickOnElement(searchButton);
    }

    public void doSearchByCategoryBeautyProducts(String value){
        sendKeysToSearchBar(value);
        clickOnElement(categoryBeautyProducts);
        clickOnElement(searchButton);
    }
}
