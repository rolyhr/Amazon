package POM.sell;

import baseAPI.BaseAPI;
import org.openqa.selenium.support.PageFactory;

public class LearnPage extends BaseAPI {

    public LearnPage() {
        PageFactory.initElements(driver, this);
    }
}
