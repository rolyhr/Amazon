package POM;

import baseAPI.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books extends BaseAPI {

    //Theodore Clunis


    public Books() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "class=\"a-section a-spacing-mini imageContainer aok-relative")

    public WebElement shopByHistory;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[4]/a/div/div[1]/div")

    public WebElement shopByChildrensBooks;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[9]/a/div/div[1]/div")

    public WebElement shopByRomance;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[8]/a/div/div[2]/span")
    public WebElement shopByMysteryAndSuspence;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[3]/a/div/div[1]/div")
    public WebElement shopByBusinessAndInvesting;


    public void clickOnHistory(String value) {

        shopByHistory.click();
    }

    public void clickOnChildrenBooks() {

        shopByChildrensBooks.click();
    }
     public void clickOnRomance(){
        shopByRomance.click();
     }

     public void clickOnMysteryAndSuspense() {
        shopByMysteryAndSuspence.click();
     }
     public void clickOnBusinessAndInvesting() {
        shopByBusinessAndInvesting.click();

        
     }


}





