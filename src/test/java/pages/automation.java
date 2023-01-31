package pages;

import org.openqa.selenium.support.PageFactory;

public class automation {
    public automation() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
