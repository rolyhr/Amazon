package testBase;

import POM.*;
import baseAPI.BaseAPI;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;

public class TestBase extends BaseAPI {

    public Books getBooks() {
        return new Books();
    }

    public CustomerService getCustomerService() {
        return new CustomerService();
    }

    public Fashion getFashion() {
        return new Fashion();
    }

    public Pharmacy getPharmacy() {
        return new Pharmacy();
    }

    public SearchBar getSearchBar() {
        return new SearchBar();
    }

    public Sell getSell() {
        return new Sell();
    }

    public ToysGames getToysGames() {
        return new ToysGames();
    }

    //region ASSERTION HELPER METHODS
    public boolean isElementPresent(WebElement element) {
        boolean flag = false;

        try {
            if (element.isDisplayed()) {
                flag = true;
            }
        } catch (ElementNotVisibleException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
