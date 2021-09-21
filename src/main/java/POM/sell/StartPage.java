package POM.sell;

import POM.locators.SellLocators;
import baseAPI.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BaseAPI {

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = SellLocators.START_MENU)
    public WebElement startMenu;

    @FindBy (css = SellLocators.START_BEGINNER_GUIDE)
    public WebElement startBeginnerGuide;

    @FindBy (css = SellLocators.START_HOW_TO_START_SELLING)
    public WebElement startHowToStartSelling;

    @FindBy (css = SellLocators.START_BUILD_ONLINE_STORE)
    public WebElement startBuildOnlineStore;

    @FindBy (css = SellLocators.START_LAUNCH_YOUR_BRAND)
    public WebElement startLaunchYourBrand;

    @FindBy (css = SellLocators.START_AMAZON_SELLING_PROGRAM)
    public WebElement startAmazonSellingProgram;

    @FindBy (css = SellLocators.TITLE_TEXT_BEGINNER_GUIDE)
    public WebElement titleTextBeginnerGuide;

    @FindBy (css = SellLocators.TITLE_TEXT_HOW_TO_START_SELLING)
    public WebElement titleTextStartSelling;

    @FindBy (css = SellLocators.TITLE_TEXT_BUILD_ONLINE_STORE)
    public WebElement titleTextBuildOnlineStore;

    @FindBy (css = SellLocators.TITLE_TEXT_LAUNCH_YOUR_BRAND)
    public WebElement titleTextLaunchYourBrand;

    @FindBy (css = SellLocators.TITLE_TEXT_AMAZON_SELLING_PROGRAM)
    public WebElement titleTextAmazonSellingProgram;

    public StartPage navigateToBeginnerGuidePage() {
        hoverOverElement(startMenu, startBeginnerGuide);
        return new StartPage();
    }

    public StartPage navigateToHowToStartSellingPage() {
        hoverOverElement(startMenu, startHowToStartSelling);
        return new StartPage();
    }

    public StartPage navigateToBuildOnlineStorePage() {
        hoverOverElement(startMenu, startBuildOnlineStore);
        return new StartPage();
    }

    public StartPage navigateToLaunchYourBrandPage() {
        hoverOverElement(startMenu, startLaunchYourBrand);
        return new StartPage();
    }

    public StartPage navigateToAmazonSellingProgramPage() {
        hoverOverElement(startMenu, startAmazonSellingProgram);
        return new StartPage();
    }

}
