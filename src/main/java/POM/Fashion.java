package POM;

import baseAPI.BaseAPI;
import baseAPI.DataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Fashion extends BaseAPI {

    //Khadiza Pushpo

    public Fashion() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#nav-xshop > a:nth-child(9)")
    public WebElement fashionTab;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[2]/span[1]")
    public WebElement womenFashionMainMenuTabHover;


    @FindBy(xpath="//*[@id=\"nav-flyout-aj:https://softlines-trova.s3-us-west-2.amazonaws.com" +
            "/prod/US/mediaservice/megamenucreator_basic_en_US.json:subnav-sl-megamenu-1:0\"]/div[2]/div" +
            "/div[1]/ul[1]/li[1]/a/h3")
    public WebElement clothingSubMenu;


    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[3]/span[1]")
    public WebElement menFashionTabHover;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[4]/span[1]")
    public WebElement kidsFashionTabHover;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[5]/span[1]")
    public WebElement luggageFashionTabHover;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[6]/span")
    public WebElement salesAndDealsFashionTabHover;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[7]/span[1]")
    public WebElement newArrivalsTabHover;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[8]/span")
    public WebElement ourBrandsTabHover;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[9]/span[1]/img")
    public WebElement primeWardrobeFashionTabHover;


    public void clickOnFashionTab(){
        clickOnElement(fashionTab);
    }

    public void clickOnWomenFashionMainMenuTabHover(){

        clickOnElement(womenFashionMainMenuTabHover);
    }

    public void clickOnClothingSubMenu(){
        clickOnElement(clothingSubMenu);
    }

    public void clickOnMenFashionTabHover(){
        clickOnElement(menFashionTabHover);
    }

    public void clickOnKidsFashionTabHover(){
      clickOnElement(kidsFashionTabHover);
    }

    public void clickOnLuggageFashionTabHover(){
        clickOnElement(luggageFashionTabHover);
    }

    public void clickOnSalesAndDealsFashionTabHover(){
        clickOnElement(salesAndDealsFashionTabHover);
    }

    public void clickOnNewArrivalsTabHover(){
        clickOnElement(newArrivalsTabHover);
    }

    public void clickOnOurBrandsTabHover(){
        clickOnElement(ourBrandsTabHover);
    }

    public void clickOnPrimeWardrobeFashionTabHover(){
        clickOnElement(primeWardrobeFashionTabHover);
    }

//    public  void fashion(String value){
//        fashion(value);
//    }



    public static String path = System.getProperty("user.dir") + "/src/test/resources/TestData/AmazonTestData.xlsx";
    public String[][] getFashionTestData() throws IOException {
        dataReader = new DataReader();
        String sheetName = "pushpoAmazonTestData";
        String[][] testData = dataReader.fileReaderArrayStringArraysXSSF(path,sheetName);
        return testData;
    }




}
