package POM.sell;

import POM.locators.SellLocators;
import baseAPI.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sell extends BaseAPI {

    //Roly Hr

    public Sell() {
        PageFactory.initElements(driver, this);
    }

    //START - Main Menu
    @FindBy (css = SellLocators.START_MENU)
    public WebElement startMenu;

    @FindBy (css = SellLocators.GROW_MENU)
    public WebElement growMenu;

    @FindBy (css = SellLocators.LEARN_MENU)
    public WebElement learnMenu;

    @FindBy (css = SellLocators.PRICING_MENU)
    public WebElement pricingMenu;
    //END - Main Menu

    //START - Create Account Page
    @FindBy (css = SellLocators.SIGN_UP_BUTTON)
    public WebElement signUpButton;

    @FindBy (css = SellLocators.CREATE_AMAZON_ACCOUNT_BUTTON)
    public WebElement createAccountButton;

    @FindBy (id = SellLocators.CREATE_ACCOUNT_YOUR_NAME)
    public WebElement createAccountYourName;

    @FindBy (id = SellLocators.CREATE_ACCOUNT_EMAIL)
    public WebElement createAccountEmail;

    @FindBy (id = SellLocators.CREATE_ACCOUNT_PASSWORD)
    public WebElement createAccountPassword;

    @FindBy (id = SellLocators.CREATE_ACCOUNT_REENTER_PASSWORD)
    public WebElement createAccountReEnterPassword;

    @FindBy (id = SellLocators.CREATE_ACCOUNT_NEXT_BUTTON)
    public WebElement createAccountNextButton;
    //END - Create Account Page

    //START - Main Menu
    public StartPage navigateToStartPage() {
        clickOnElement(startMenu);
        return new StartPage();
    }

    public GrowPage navigateToGrowPage() {
        clickOnElement(growMenu);
        return new GrowPage();
    }

    public LearnPage navigateToLearnPage() {
        clickOnElement(learnMenu);
        return new LearnPage();
    }

    public PricingPage navigateToPricingPage() {
        clickOnElement(pricingMenu);
        return new PricingPage();
    }
    //END - Main Menu

    //START - Create Account Page
    public Sell clickOnSignUpButton() {
        clickOnElement(signUpButton);
        return new Sell();
    }

    public Sell clickOnCreateAccountButton() {
        clickOnElement(createAccountButton);
        return new Sell();
    }

    public Sell sendNameToTextField (String yourName) {
        sendKeysToElement(createAccountYourName, yourName);
        return new Sell();
    }

    public Sell sendEmailToTextField (String email) {
        sendKeysToElement(createAccountEmail, email);
        return new Sell();
    }

    public Sell sendPasswordToPasswordField (String password) {
        sendKeysToElement(createAccountPassword, password);
        return new Sell();
    }

    public Sell sendReEnterPasswordToPasswordField (String reEnterPassword) {
        sendKeysToElement(createAccountReEnterPassword, reEnterPassword);
        return new Sell();
    }

    public Sell clickOnNextButtonInCreateAccountPage() {
        clickOnElement(createAccountNextButton);
        return new Sell();
    }
    //END - Create Account Page
}
