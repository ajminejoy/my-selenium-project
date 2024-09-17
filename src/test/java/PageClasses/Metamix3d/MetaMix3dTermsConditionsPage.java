package PageClasses.Metamix3d;

import PageClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MetaMix3dTermsConditionsPage extends BasePage {

    public MetaMix3dTermsConditionsPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By termsConditionsHeader = By.xpath("(//span[text()='Terms & Conditions'])[1]");


    //Methods

    public boolean verifyTermsConditionsHeader() {

        return isElementVisible(termsConditionsHeader);
    }
}