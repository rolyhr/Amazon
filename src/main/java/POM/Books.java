package POM;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class Books extends BaseAPI {

    //Theodore Clunis

    public Books() {
        PageFactory.initElements(driver, this);
    }
}
