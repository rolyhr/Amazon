package POM;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class CustomerService extends BaseAPI {

    //Bibi Sabiya Aaman

    public CustomerService() {
        PageFactory.initElements(driver, this);
    }
}
