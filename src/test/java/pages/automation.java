package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class automation {
    public automation() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
