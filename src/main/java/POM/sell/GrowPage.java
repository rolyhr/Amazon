package POM.sell;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class GrowPage extends BaseAPI {

    public GrowPage() {
        PageFactory.initElements(driver, this);
    }
}
