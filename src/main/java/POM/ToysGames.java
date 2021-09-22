package POM;

import POM.locators.ToysGamesLocators;
import baseAPI.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Dihia Bounab
public class ToysGames extends BaseAPI {



    @FindBy(css = ToysGamesLocators.toysGames)
    WebElement ToysGameButton;

    @FindBy ( css = ToysGamesLocators.kidsGiftGuide)
    WebElement KidsGiftGuideButton;

    @FindBy ( css = ToysGamesLocators.shopToysByAge)
    WebElement ShopToysByAgeButton;

    @FindBy (css = ToysGamesLocators.shopToysByCharacter)
    WebElement ShopToysByCharacterButton;

    @FindBy (css = ToysGamesLocators.shopBestSellingToys)
    WebElement ShopBestSellingToysButton;

    @FindBy (id = ToysGamesLocators.searchBar)
    public WebElement searchBar;

    @FindBy (id = ToysGamesLocators.searchButton)
    public WebElement searchbutton;

    @FindBy ( css = ToysGamesLocators.nigthMareBeforeChristmas)
    public WebElement nigthMareBeforeChristmas;

       void sendKeysToSearchbar(String value){
        searchBar.sendKeys(value);
        }
        void clickSearchButton(){
        searchbutton.click();
        }
       public void doSearch(String value) {
        sendKeysToSearchbar(value);
        clickSearchButton();
         }

        public void clickOnToysGames() {
           sendKeysToElement(ToysGameButton,"URL");
            clickOnElement(ToysGameButton);

        }

        public void clickOnKidsGiftGuideMenu () {
            clickOnElement(KidsGiftGuideButton);

        }

        public void clickOnShopToysByAge() {

            clickOnElement(ShopToysByAgeButton);


        }


        public void clickOnShopBestSellingToys () {
            clickOnElement(ShopBestSellingToysButton);

        }




    public void nigthMareBeforeChristmas() {

        clickOnElement(nigthMareBeforeChristmas);
    }
}