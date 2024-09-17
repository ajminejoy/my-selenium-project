package TestScenarios.Metamix3d_tests;

import PageClasses.Metamix3d.MetaMix3dHomePage;
import PageClasses.Metamix3d.MetaMix3dPrivacyPolicyPage;
import TestScenarios.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MetaMix3dPrivacyPageTest extends BaseTest {

    private MetaMix3dHomePage homePage;
    private MetaMix3dPrivacyPolicyPage privacyPolicyPage;

    @BeforeClass
    public void setup() {
        homePage = new MetaMix3dHomePage(driver); // Initialize homepage
        privacyPolicyPage = new MetaMix3dPrivacyPolicyPage(driver); // Initialize privacy policy page
    }

    @Test
    public void verifyPrivacyPolicyHeader() {
        // Navigate to Privacy Policy page from Home Page
        homePage.clickOnPrivacyPolicy(); // Assuming this method navigates to the Privacy Policy page

        // Verify the Privacy Policy header
        boolean isPrivacyPolicyHeaderVisible = privacyPolicyPage.verifyPrivacyPolicyHeader();
        Assert.assertTrue(isPrivacyPolicyHeaderVisible, "Privacy Policy header is not visible");
    }
}