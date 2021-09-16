package POM;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class ToysGames extends BaseAPI {

    //Dihia Bounab

    public ToysGames() {
        PageFactory.initElements(driver, this);
    }
}
