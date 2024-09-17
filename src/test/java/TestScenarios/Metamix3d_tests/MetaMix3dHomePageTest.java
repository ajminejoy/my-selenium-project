package TestScenarios.Metamix3d_tests;

import PageClasses.Metamix3d.MetaMix3dHomePage;
import TestScenarios.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MetaMix3dHomePageTest extends BaseTest {

    private MetaMix3dHomePage metaMix3dHomePage;

    @BeforeClass
    public void setup() {

        metaMix3dHomePage = new MetaMix3dHomePage(driver);
    }

    @Test
    public void metaMix3dHomeTest() {

        Assert.assertTrue(metaMix3dHomePage.verifyMetaMix3dHeaderDisplayed(), "MetaMix3d header should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyMetaMix3dDescriptionDisplayed(), "MetaMix3d description should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyHomeTabDisplayed(), "Home tab should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyOurWorksTabDisplayed(), "Our Works tab should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyPixelGamesTabDisplayed(), "Pixel Games tab should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyAboutTabDisplayed(), "About tab should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyContactTabDisplayed(), "Contact tab should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyDownloadOnAppStoreDisplayed(), "Download on App Store image should be displayed.");
        Assert.assertTrue(metaMix3dHomePage.verifyDownloadOnGooglePlayDisplayed(), "Download on Google Play image should be displayed.");

        Assert.assertEquals(driver.getTitle(), "Home | Metamix3d");
    }

    @Test
    public void verifyMetaMix3dAboutSection() {

        boolean isAboutMetaMix3dSectionVisible = metaMix3dHomePage.verifyAboutMetaMix3dSection();
        Assert.assertTrue(isAboutMetaMix3dSectionVisible, "About MetaMix3D section elements are not visible.");
    }

    @Test
    public void verifyMetaMix3dOurGameAssetsSection() {

        boolean isOurGameAssetsSectionVisible = metaMix3dHomePage.verifyOurGameAssetsSection();
        Assert.assertTrue(isOurGameAssetsSectionVisible, "Game Assets section elements are not visible.");
    }

    @Test
    public void verifyPortfolioSection() {

        boolean isPortfolioSectionVisible = metaMix3dHomePage.verifyPortfolioSection();
        Assert.assertTrue(isPortfolioSectionVisible, "Portfolio section elements are not visible.");
    }

    @Test
    public void verifyGetInTouchSection() {

        boolean isGetInTouchSectionVisible = metaMix3dHomePage.verifyGetInTouchSection();
        Assert.assertTrue(isGetInTouchSectionVisible, "Get in Touch section elements are not visible.");
    }

    @Test
    public void verifySubscribeNewsLetterSection() {

        boolean isSubscribeToNewsLetterSectionVisible = metaMix3dHomePage.verifySubscribeNewsLetterSection();
        Assert.assertTrue(isSubscribeToNewsLetterSectionVisible, "Subscribe to News Letter section elements are not visible.");
    }

    @Test
    public void verifyMetaMix3dTMSectionHeaderAndDesc() {

        boolean isMetaMix3dTMSectionHeaderDescVisible = metaMix3dHomePage.verifyMetaMix3dTMSectionHeaderAndDesc();
        Assert.assertTrue(isMetaMix3dTMSectionHeaderDescVisible, "MetaMix3d Trademark Section Header/Desc elements are not visible.");
    }

    @Test
    public void verifyMetaMix3dTMSectionContact() {

        boolean isMetaMix3dTMSectionContactVisible = metaMix3dHomePage.verifyMetaMix3dTMSectionContact();
        Assert.assertTrue(isMetaMix3dTMSectionContactVisible, "MetaMix3d Trademark Section Contact elements are not visible.");
    }

    @Test
    public void verifyMetaMix3dTMSectionNavigation() {

        boolean isMetaMix3dTMSectionNavigationVisible = metaMix3dHomePage.verifyMetaMix3dTMSectionNavigation();
        Assert.assertTrue(isMetaMix3dTMSectionNavigationVisible, "MetaMix3d Trademark Section Navigation elements are not visible.");
    }

    @Test
    public void verifyMetaMix3dTMSectionSocial() {

        boolean isMetaMix3dTMSectionSocialVisible = metaMix3dHomePage.verifyMetaMix3dTMSectionSocial();
        Assert.assertTrue(isMetaMix3dTMSectionSocialVisible, "MetaMix3d Trademark Section Social header is not visible");
    }

    @Test
    public void verifyMetaMix3dTMSectionFindUsOn() {

        boolean isMetaMix3dTMSectionFindUsOnVisible = metaMix3dHomePage.verifyMetaMix3dTMSectionFindUsOn();
        Assert.assertTrue(isMetaMix3dTMSectionFindUsOnVisible, "MetaMix3d Trademark Section Find Us On elements are not visible.");
    }

    @Test
    public void verifyMetaMix3dCopyrightTrademark() {

        boolean isMetaMix3dCopyrightTrademarkVisible = metaMix3dHomePage.verifyMetaMix3dCopyrightTrademark();
        Assert.assertTrue(isMetaMix3dCopyrightTrademarkVisible, "MetaMix3d Copyright Trademark element is not visible.");
    }

    @Test
    public void verifyUserCanEnterInfoGetInTouch() {

        metaMix3dHomePage.enterFirstName("First Name");
        metaMix3dHomePage.enterLastName("Last Name");
        metaMix3dHomePage.enterEmailInGetInTouchSection("testemail");
        metaMix3dHomePage.enterMessageInLeaveUsMessage("This is a test message");
        metaMix3dHomePage.clickSubmit();
    }

    @Test
    public void verifyUserCanEnterInfoNewsLetter() {

        metaMix3dHomePage.enterEmailInSubscribeNewsletterSection("testemail");
        metaMix3dHomePage.clickJoinNewsLetter();
    }

    @Test
    public void verifyDiscordPageLoads() {

        metaMix3dHomePage.clickOnDiscord();
        metaMix3dHomePage.switchToNewTab();
        Assert.assertEquals(driver.getTitle(), "Discord - Group Chat That’s All Fun & Games");
        metaMix3dHomePage.closeCurrentTabAndSwitchBack();
    }

    @Test
    public void verifyTwitchPageLoads() {

        metaMix3dHomePage.clickOnTwitch();
        metaMix3dHomePage.switchToNewTab();
        Assert.assertEquals(driver.getTitle(), "Twitch");
        metaMix3dHomePage.closeCurrentTabAndSwitchBack();
    }

    @Test
    public void verifyFacebookPageLoads() {

        metaMix3dHomePage.clickOnFacebook();
        metaMix3dHomePage.switchToNewTab();
        driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
        Assert.assertEquals(driver.getTitle(), "MetaMix3d | Austin TX | Facebook");
        metaMix3dHomePage.closeCurrentTabAndSwitchBack();
    }

    @Test
    public void verifyYoutubePageLoads() {

        metaMix3dHomePage.clickOnYoutube();
        metaMix3dHomePage.switchToNewTab();
        Assert.assertEquals(driver.getTitle(), "YouTube");
        metaMix3dHomePage.closeCurrentTabAndSwitchBack();
    }

    @Test
    public void verifyTwitterPageLoads() {

        metaMix3dHomePage.clickOnTwitter();
        metaMix3dHomePage.switchToNewTab();
        Assert.assertEquals(driver.getTitle(), "X. It’s what’s happening / X");
        metaMix3dHomePage.closeCurrentTabAndSwitchBack();
    }

    @Test
    public void verifyLinkedInPageLoads() {

        metaMix3dHomePage.clickOnLinkedIn();
        metaMix3dHomePage.switchToNewTab();
        Assert.assertEquals(driver.getTitle(), "LinkedIn: Log In or Sign Up");
        metaMix3dHomePage.closeCurrentTabAndSwitchBack();
    }
}