package PageClasses.Lemonade;

import PageClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LemonadeOnboardingPage extends BasePage {

    // constructor
    public LemonadeOnboardingPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By nopeRadioButton = By.xpath("//h5[text()='Nope']");
    By nextButton = By.xpath("//button[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = 'next']");
    By firstNameField = By.xpath("//input[@name='user_first_name' and @type='text']");
    By lastNameField = By.xpath("//input[@name='user_last_name' and @type='text']");
    By letsDoThisButton = By.xpath("//button[contains(text(), 'do this')]");
    By addressField = By.xpath("//input[@type='text' and @role='combobox']");
    By addressDropdownFirstOption = By.xpath("(//li[@role='option'])[1]");
    By streetNumberField = By.xpath("//label[contains(text(), 'street')]/preceding::input");
    By AptNumber = By.xpath("//label[contains(text(), 'APT')]/preceding-sibling::input");
    By looksGoodButton = By.xpath("//button[text()='Looks good' and @type='submit']");
    By fireAlarmCheckBox = By.xpath("//h5[normalize-space(text()) = 'FIRE ALARM']");
    By roommateCheckBox = By.xpath("//h5[normalize-space(text()) = 'ROOMMATES']");
    By noRadioButton = By.xpath("(//div[@class='option-inner'])[2]");

    By singleFamilyCheckbox = By.xpath("//h5[text()='SINGLE FAMILY']");
    By emailAddress = By.xpath("//input[@type='email']");
    By dobMonth = By.name("birth_month");
    By dobDay = By.name("birth_day");
    By dobYear = By.name("birth_year");
    By termsConditionsCheckBox = By.xpath("//h5[contains(text(), 'I agree')]/preceding::input[@type='checkbox']");
    By verificationEmailSent = By.xpath("//p[contains(text(), 'verification')]");


    //Methods

    public By getInsuranceByText(String tabName) {
        return By.xpath("//h5[text()='" + tabName + "']");
    }

    public void selectNopeRadioButton() {

        click(nopeRadioButton);
    }

    public void clickOnNextButton() {

        isElementVisible(nextButton);
        waitForButtonToBeEnabled(nextButton);
        click(nextButton);
    }

    public void selectRentersInsuranceCheckbox() {

        click(getInsuranceByText("Renters"));
    }

    public void enterFirstName(String firstName) {

        WebElement EmailField = driver.findElement(firstNameField);
        EmailField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {

        WebElement EmailField = driver.findElement(lastNameField);
        EmailField.sendKeys(lastName);
    }

    public void clickOnLetsDoThisButton() {

        click(letsDoThisButton);
    }
    public void enterAddress(String address) {

        isElementVisible(addressField);
        WebElement EmailField = driver.findElement(addressField);
        EmailField.sendKeys(address);
    }

    public void selectFirstOptionInAddressDropdown() {

        isElementVisible(addressDropdownFirstOption);
        click(addressDropdownFirstOption);
    }

    public void enterAptNumber(String number) {

        WebElement EmailField = driver.findElement(AptNumber);
        EmailField.sendKeys(number);
    }

    public void enterStreetNumber(String streetNumber) {

        WebElement EmailField = driver.findElement(streetNumberField);
        EmailField.sendKeys(streetNumber);
    }

    public void clickLooksGoodButton() {

        click(looksGoodButton);
    }

    public void clickFireAlarmCheckBox() {

        click(fireAlarmCheckBox);
    }

    public void clickRoommateCheckBox() {

        click(roommateCheckBox);
    }

    public void clickSingleFamilyBox() {

        isElementVisible(singleFamilyCheckbox);
        click(singleFamilyCheckbox);
    }


    public void clickNoRadioButton() {

        isElementVisible(noRadioButton);
        click(noRadioButton);
    }

    public void enterEmail(String email) {

        isElementVisible(emailAddress);

        WebElement EmailField = driver.findElement(emailAddress);
        EmailField.sendKeys(email);
    }

    public void enterDobMonth(String month) {

        WebElement EmailField = driver.findElement(dobMonth);
        EmailField.sendKeys(month);
    }

    public void enterDobDay(String day) {

        WebElement EmailField = driver.findElement(dobDay);
        EmailField.sendKeys(day);
    }

    public void enterDobYear(String year) {

        WebElement EmailField = driver.findElement(dobYear);
        EmailField.sendKeys(year);
    }

    public void agreeToTermsConditions() {

        click(termsConditionsCheckBox);
    }

    public boolean verifyVerificationEmailSent() {

        return isElementVisible(verificationEmailSent);
    }
}