package POM;

import POM.locators.PharmacyLocators;
import baseAPI.BaseAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pharmacy extends BaseAPI {

    //Jannatul Tuba

    public Pharmacy() {

        PageFactory.initElements(driver, this);
    }
    public String actualTitle(){
        String actualTitle = driver.getTitle();
        return actualTitle;
    }
    @FindBy(linkText =PharmacyLocators.HOMEPAGE_PHARMACY_NAVBAR_ELEMENT )
    public  WebElement HomepagePharmacyNavBarElement;

    @FindBy(linkText =PharmacyLocators.PHARMACY_SHOP_ALL_NAVBAR_ELEMENT)
    public  WebElement pharmacyShopAllNavBarElement;

    @FindBy(linkText =PharmacyLocators.PHARMACY_How_Works_NAVBAR_ELEMENT )
    public  WebElement pharmacyHowWorksNavBarElement;

    @FindBy(linkText =PharmacyLocators.PHARMACY_Prime_Savings_NAVBAR_ELEMENT )
    public  WebElement pharmacyPrimeSavingNavBarElement;

    @FindBy(linkText =PharmacyLocators.PHARMACY_Promise_NAVBAR_ELEMENT )
    public  WebElement pharmacyPromiseNavBarElement;

    @FindBy(linkText =PharmacyLocators.PHARMACY_FOR_PRESCRIBERS_NAVBAR_ELEMENT )
    public  WebElement pharmacyPrescriberNavBarElement;

    @FindBy(linkText =PharmacyLocators.PHARMACY_Help_NAVBAR_ELEMENT)
    public  WebElement pharmacyHelpNavBarElement;

    @FindBy(css = PharmacyLocators.PHARMACY_SEARCH_YOUR_MEDS)
    public  WebElement pharmacySearrchYourMeds;

    @FindBy(id = PharmacyLocators.PHARMACY_SHOP_COMMON_MEDICATION_BUTTON_SCROLL_RIGHT)
    public  WebElement pharmacyShopCommonMedicineScrollRight;

    @FindBy(id = PharmacyLocators.PHARMACY_SHOP_COMMON_MEDICATION_BUTTON_SCROLL_LEFT)
    public  WebElement pharmacyShopCommonMedicineScrollLeft;

    @FindBy(css = PharmacyLocators.PHARMACY_HIGH_BLOOD_PRESSURE)
    public  WebElement pharmacyHighBloodPressure;

    @FindBy(css = PharmacyLocators.PHARMACY_DEPRESSION_MEDS)
    public  WebElement pharmacyDepression;

    @FindBy(css = PharmacyLocators.PHARMACY_ANXIETY_MEDS)
    public  WebElement pharmacyAnxiety;

    @FindBy(css = PharmacyLocators.PHARMACY_HIGH_COLESTOREL_MEDS)
    public  WebElement phamacyHighCholestorel;

    @FindBy(css = PharmacyLocators.PHARMACY_HYPERTHYRODISIM_MEDS)
    public  WebElement pharmacyHyperthydrodisim;

    @FindBy(css = PharmacyLocators.PHARMACY_DIEBETICS_MEDS)
    public  WebElement pharmacyDiabetics;

    @FindBy(className = PharmacyLocators.Pharmacy_PRIMERX_SEARCH_YOUR_MEDICATION)
    public  WebElement primerxSearchMedicationPlaceholder;

    @FindBy(css = PharmacyLocators.Pharmacy_PRIMERX_SEARCH_DISCOUNT_BUTTON)
    public  WebElement pharmacyDiscountButton;

    @FindBy(css = PharmacyLocators.PHARMACY_SEARCH_RESULT)
    public  WebElement phamacySearchResult;

    /************************************************************************************************************/
    @FindBy(className = PharmacyLocators.LOCATION)
    public  WebElement location;


    @FindBy(xpath  = PharmacyLocators.LOCATION_DROPDOWN)
    public  WebElement locationDropDown ;


    @FindBy(xpath = PharmacyLocators.LOCATION_SELECT)
    public  WebElement locationSelect;


    @FindBy(id = PharmacyLocators.SIGNUPN_BUTTON)
    public  WebElement signUpButton ;

    @FindBy(id = PharmacyLocators.SIGNUP_EMAIL)
    public  WebElement signUpEmail ;


    @FindBy(id = PharmacyLocators.SIGNUP_EMAIL_CONTINUE_BUTTON)
    public  WebElement signUpEmailContinueButton;


    @FindBy(id = PharmacyLocators.SIGNUP_EMAIL_PASSWORD)
    public  WebElement signUpEmailPassword;


    @FindBy(id = PharmacyLocators.SIGNUP_SUBMIT_BUTTON)
    public  WebElement signUpSubmitButton ;

    @FindBy(id = PharmacyLocators.PHARMACY_SEARCH_SUGGESTION)
    public  WebElement searchSuggestion ;

    @FindBy(xpath = PharmacyLocators.PHAMACY_Is_Amazon_Pharmacy_RIGH_FOR_ME)
    public  WebElement amazonRightforme ;

    @FindBy(xpath = PharmacyLocators.PHAMACY_Is_Amazon_Pharmacy_RIGH_FOR_ME_EXPAND)
    public  WebElement expandAmazonRightForme ;
    /************************************************************************************************************/


    public  void navigateToPharmacyPage() {

//        clickOnElement(signUpButton);
//        signUpEmail.sendKeys(email);
//        clickOnElement(signUpEmailContinueButton);
//        signUpEmailPassword.sendKeys(password);
//        clickOnElement(signUpSubmitButton);
//
//        clickOnElement(location);
//        clickOnElement(locationSelect);
//        clickOnElement(locationDropDown);

        clickOnElement(HomepagePharmacyNavBarElement);

    }

    public  void   navigateToPharmacyShopAllPage(){
        clickOnElement(pharmacyShopAllNavBarElement);
    }

    public  void   navigateToPharmacyHowItWorksPage(){
        clickOnElement(pharmacyHowWorksNavBarElement);
    }

    public  void   navigateToPharmacyPrimeSavingPage(){
        clickOnElement(pharmacyPrimeSavingNavBarElement);
    }

    public  void   navigateToPharmacyPromisePage(){
        clickOnElement(pharmacyPromiseNavBarElement);
    }

    public  void   navigateToPharmacyPrescribersPage(){
        clickOnElement(pharmacyPrescriberNavBarElement);
    }

    public  void   navigateToPharmacyHelpPage(){
        clickOnElement(pharmacyHelpNavBarElement);
    }

    public void navigateToComparePricesInSeconds(){
        clickOnElement(pharmacySearrchYourMeds);
    }

    public void scrollShopCommonMedicine() throws InterruptedException {
        clickOnElement(pharmacyShopCommonMedicineScrollRight);
        Thread.sleep(4000);
        clickOnElement(pharmacyShopCommonMedicineScrollLeft);
    }

    public  void  shopByConditionHighBloodPressure(){
        clickOnElement(pharmacyHighBloodPressure);
    }

    public  void  shopByConditionDepression(){
        clickOnElement(pharmacyDepression);
    }

    public  void  shopByConditionAnxiety(){

       clickOnElement(pharmacyAnxiety);

    }

    public  void  shopByConditionHighCholestorel(){
        clickOnElement(phamacyHighCholestorel);
    }

    public  void  shopByConditionHyperthyrodisim(){
        clickOnElement(pharmacyHyperthydrodisim);
    }

    public  void  shopByConditionDiabetes(){
        clickOnElement(pharmacyDiabetics);
    }

    public void phamacySearchDiscountMeds(String value){
        Actions actions = new Actions(driver);

        primerxSearchMedicationPlaceholder.sendKeys(value);
        clickOnElement(searchSuggestion);
        clickOnElement(pharmacyDiscountButton);
    }


    public String exapandPharmacyyContent(){
        clickOnElement(amazonRightforme);
        String className = expandAmazonRightForme.getAttribute("class");
        return className;
    }

}


