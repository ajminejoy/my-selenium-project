package PageClasses.Lemonade;

import PageClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LemonadeHomePage extends BasePage {

    // constructor
    public LemonadeHomePage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By givebackTab = By.xpath("//a[text()='My Account']/preceding::a[text()='Giveback']");
    By rentersInsuranceHeader = By.xpath("//h1[contains(normalize-space(text()), 'Forget Everything')]");
    By rentersInsuranceDesc1 = By.xpath("//p[contains(normalize-space(text()), 'Instant everything')]");
    By checkOurPricesButton = By.xpath("//a[text()='Check our Prices']");
    By rentersInsuranceDesc2 = By.xpath("//h2[normalize-space(text())='Most loved renters insurance in America']");


    //Methods

    public By getTabByName(String tabName) {
        return By.xpath("//a[text()='" + tabName + "']");
    }

    public boolean verifyRentersTab() {

        return isElementVisible(getTabByName("Renters"));
    }
}