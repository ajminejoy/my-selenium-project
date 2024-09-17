package TestScenarios.Metamix3d_tests;

import PageClasses.Metamix3d.MetaMix3dHomePage;
import PageClasses.Metamix3d.MetaMix3dTermsConditionsPage;
import TestScenarios.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MetaMix3dTermsConditionsTest extends BaseTest {

    private MetaMix3dHomePage homePage;
    private MetaMix3dTermsConditionsPage termsConditionsPage;

    @BeforeClass
    public void setup() {
        homePage = new MetaMix3dHomePage(driver); // Initialize homepage
        termsConditionsPage = new MetaMix3dTermsConditionsPage(driver); // Initialize privacy policy page
    }

    @Test
    public void verifyTermsConditionsHeader() {
        // Navigate to Privacy Policy page from Home Page
        homePage.clickOnTermsAndConditions(); // Assuming this method navigates to the Privacy Policy page

        // Verify the Privacy Policy header
        boolean isTermsConditionsHeaderVisible = termsConditionsPage.verifyTermsConditionsHeader();
        Assert.assertTrue(isTermsConditionsHeaderVisible, "Privacy Policy header is not visible");
    }
}