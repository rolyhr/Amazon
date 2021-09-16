package POM;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class Pharmacy extends BaseAPI {

    //Jannatul Tuba

    public Pharmacy() {
        PageFactory.initElements(driver, this);
    }
}
