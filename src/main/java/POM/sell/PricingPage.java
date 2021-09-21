package POM.sell;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class PricingPage extends BaseAPI {

    public PricingPage() {
        PageFactory.initElements(driver, this);
    }
}
