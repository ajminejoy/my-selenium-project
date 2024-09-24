package TestScenarios.Lemonade_tests;

import PageClasses.Lemonade.LemonadeHomePage;
import PageClasses.Lemonade.LemonadeOnboardingPage;
import TestScenarios.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LemonadeTests extends BaseTest {

    private LemonadeHomePage lemonadeHomePage;
    private LemonadeOnboardingPage lemonadeOnboardingPage;

    @BeforeClass
    public void setup() {

        lemonadeHomePage = new LemonadeHomePage(driver);
        lemonadeOnboardingPage = new LemonadeOnboardingPage(driver);
    }

    @Test
    public void verifyVerificationEmailSentForRentersInsurance() {

        // Entering  Registration Credentials

        lemonadeHomePage.clickOnCheckOurPricesButton();
        lemonadeOnboardingPage.selectNopeRadioButton();
        lemonadeOnboardingPage.clickOnNextButton();
        lemonadeOnboardingPage.selectRentersInsuranceCheckbox();
        lemonadeOnboardingPage.clickOnNextButton();
        fillPersonalInformation();
        lemonadeOnboardingPage.clickOnNextButton();
        lemonadeOnboardingPage.clickLooksGoodButton();
        lemonadeOnboardingPage.clickFireAlarmCheckBox();
        lemonadeOnboardingPage.clickOnNextButton();
        lemonadeOnboardingPage.clickRoommateCheckBox();
        lemonadeOnboardingPage.clickOnNextButton();
        lemonadeOnboardingPage.clickNoRadioButton();
        lemonadeOnboardingPage.clickOnNextButton();
        lemonadeOnboardingPage.clickNoRadioButton();
        lemonadeOnboardingPage.clickOnNextButton();
        lemonadeOnboardingPage.clickSingleFamilyBox();
        lemonadeOnboardingPage.clickOnNextButton();

        clickOnNoRadioButtons(10);

        lemonadeOnboardingPage.enterEmail("test@email.com");
        lemonadeOnboardingPage.enterDobMonth("01");
        lemonadeOnboardingPage.enterDobDay("01");
        lemonadeOnboardingPage.enterDobYear("1990");
        lemonadeOnboardingPage.agreeToTermsConditions();
        lemonadeOnboardingPage.clickOnNextButton();
        Assert.assertTrue(lemonadeOnboardingPage.verifyVerificationEmailSent(), "Verification Email is not sent or message not visible");
    }

    @Test
    public void verifyTabsDisplayed() {

        Assert.assertTrue(lemonadeHomePage.verifyTabsVisible(), "Tab/Tabs are not displayed or visible");
    }

    @Test
    public void verifyInsuranceHeaderDescDisplayed() {

        Assert.assertTrue(lemonadeHomePage.verifyInsuranceHeaderDescVisible(), "Insurance Header/Desc is not displayed or visible");
    }

    @Test
    public void verifyLemonadePageTitle() {

        Assert.assertEquals(driver.getTitle(), "Lemonade: An Insurance Company Built for the 21st Century");
        System.out.println(driver.getTitle());
    }

    private void fillPersonalInformation() {
        lemonadeOnboardingPage.enterFirstName("Test");
        lemonadeOnboardingPage.enterLastName("Test");
        lemonadeOnboardingPage.clickOnLetsDoThisButton();
        lemonadeOnboardingPage.enterAddress("Testa Place");
        lemonadeOnboardingPage.selectFirstOptionInAddressDropdown();
        lemonadeOnboardingPage.enterAptNumber("12");
        lemonadeOnboardingPage.clickOnNextButton();
        lemonadeOnboardingPage.enterStreetNumber("12 Test Street");
    }

    private void clickOnNoRadioButtons(int times) {
        for (int i = 0; i < times; i++) {
            lemonadeOnboardingPage.clickNoRadioButton();
            lemonadeOnboardingPage.clickOnNextButton();
        }
    }
}