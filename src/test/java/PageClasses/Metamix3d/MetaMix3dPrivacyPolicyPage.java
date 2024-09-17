package PageClasses.Metamix3d;

import PageClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MetaMix3dPrivacyPolicyPage extends BasePage {


    // constructor
    public MetaMix3dPrivacyPolicyPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By privacyPolicyHeader = By.xpath("(//span[text()='Privacy Policy'])[1]");


    //Methods

    public boolean verifyPrivacyPolicyHeader() {

        return isElementVisible(privacyPolicyHeader);
    }
}