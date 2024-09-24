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
    By insuranceHeader = By.xpath("//h1[contains(normalize-space(text()), 'Forget Everything')]");
    By insuranceDesc = By.xpath("//p[contains(normalize-space(text()), 'Instant everything')]");
    By checkOurPricesButton = By.xpath("//a[text()='Check our Prices']");


    //Methods

    public By getTabByName(String tabName) {
        return By.xpath("//a[text()='" + tabName + "']");
    }

    public boolean verifyTabsVisible() {

        return areElementsVisible(
                getTabByName("Renters"),
                getTabByName("Homeowners"),
                getTabByName("Car"),
                getTabByName("Pet"),
                getTabByName("Life"),
                givebackTab
        );
    }

    public boolean verifyInsuranceHeaderDescVisible() {

        return areElementsVisible(
                insuranceHeader,
                insuranceDesc
        );
    }

    public void clickOnCheckOurPricesButton() {
        click(checkOurPricesButton);
    }
}