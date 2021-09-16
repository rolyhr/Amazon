package POM;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class SearchBar extends BaseAPI {

    //Osman Aziz

    public SearchBar() {
        PageFactory.initElements(driver, this);
    }
}
