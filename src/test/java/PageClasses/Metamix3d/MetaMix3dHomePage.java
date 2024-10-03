package PageClasses.Metamix3d;

import PageClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetaMix3dHomePage extends BasePage {

    // constructor
    public MetaMix3dHomePage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By metaMix3dHeader = By.xpath("//h1[text()='Metamixed']");
    By metaMix3dDesc = By.xpath("//span[contains(text(), 'Creating top quality')]");
    By downloadOnAppStore = By.xpath("(//img[contains(@alt, 'Download on the App Store')])[1]");
    By downloadOnGooglePlay = By.xpath("(//img[contains(@alt, 'Get in on Google Play')])[1]");
    By gameAssets3D = By.xpath("//p[text()='3D Game Assets']");
    By metaVerseInVR = By.xpath("//p[text()='Metaverse in VR']");
    By worksInUnity3D = By.xpath("//p[text()='Works in Unity 3D']");
    By portFolio = By.xpath("//p[text()='Portfolio']");
    By aboutMetaMix3dHeader = By.xpath("//span[text()='About Metamixed']");
    By aboutMetaMix3dDesc1 = By.xpath("//div/p/span[contains(text(), 'Our 3D game asset')]");
    By aboutMetaMix3dDesc2 = By.xpath("//div/p/span[contains(text(), 'Our team of experienced 3D artists')]");
    By aboutMetaMix3dDesc3 = By.xpath("//div/p/span[contains(text(), 'At our company')]");
    By aboutMetaMix3dDesc4 = By.xpath("//div/p/span[contains(text(), 'In addition to our 3D asset')]");
    By metaMix3dLearnMoreBttn = By.xpath("//span[(text()='Learn More')]");
    By gameAssetsSectionTitle = By.xpath("//span[text()='Our Game Assets']");
    By gameAssetsSectionDesc = By.xpath("//span[contains(text(), 'All of our 3D game assets are created')]");
    By gameAssets3DSectionTitle = By.xpath("//a[text()='3D Characters']");
    By gameAssets3DSectionDesc = By.xpath("//span[contains(text(), 'Our team of experienced artists')]");
    By gameAssetsUnity3DAssetsTitle = By.xpath("//a[text()='Unity 3d Assets']");
    By gameAssetsUnity3DAssetsDesc = By.xpath("//span[contains(text(), 'Our Unity 3D assets')]");
    By gameAssetsUnity3DImageLink = By.xpath("//img[contains(@alt, 'open-unity-3d-logo-png')]");
    By gameAssetsVRMetaVerseTitle = By.xpath("//a[text()='VR Metaverse']");
    By gameAssetsVRMetaVerseDesc1 = By.xpath("//span[contains(text(), 'Our VR metaverse app is an innovative')]");
    By gameAssetsVRMetaVerseDesc2 = By.xpath("//span[contains(text(), 'Our VR metaverse app is designed to')]");
    By gameAssetsDownloadOnAppStore = By.xpath("(//img[@alt='Download on the App Store'])[2]");
    By gameAssetsDownloadOnGooglePlay = By.xpath("(//img[@alt='Get in on Google Play'])[2]");
    By portfolioSectionTitle = By.xpath("//span[contains(text(), 'Explore the works')]");
    By portfolioSectionDesc = By.xpath("//span[contains(text(), 'It takes the best talent')]");
    By portfolioVisitButton = By.xpath("//span[contains(text(), 'Visit our portfolio')]");
    By getInTouchSectionTitle = By.xpath("//h2[text()='Get in Touch']");
    By getInTouchSectionFirstName = By.xpath("//label[text()='First Name']");
    By getInTouchSectionLastName = By.xpath("//label[text()='Last Name']");
    By getInTouchSectionEmail = By.xpath("(//label[text()='Email'])[1]");
    By getInTouchSectionMessage = By.xpath("//label[text()='Leave us a message...']");
    By getInTouchSectionFirstNameField = By.xpath("//input[@name='first-name']");
    By getInTouchSectionLastNameField = By.xpath("//input[@name='last-name']");
    By getInTouchSectionEmailField = By.xpath("(//input[@name='email'])[1]");
    By getInTouchSectionMessageField = By.xpath("//label[text()='Leave us a message...']/following-sibling::textarea");
    By getInTouchSectionSubmitButton = By.xpath("//span[text()='Submit']");
    By subscribeNewsLetterTitle = By.xpath("//span[text()='Subscribe to Our Newsletter']");
    By subscribeNewsLetterEmail = By.xpath("(//label[text()='Email'])[2]");
    By subscribeNewsLetterEmailField = By.xpath("(//input[@name='email'])[2]");
    By subscribeNewsLetterJoin = By.xpath("//span[text()='Join']");
    By metaMix3dTradeMarkSectionHeader = By.xpath("//a[text()='MetaMixed3d']");
    By metaMix3dTradeMarkSectionDesc = By.xpath("//span[text()='An Immersive Virtual Reality Experience']");
    By metaMix3dTMSectionContactHeader = By.xpath("//span[text()='An Immersive Virtual Reality Experience']/following::p[text()='Contact']");
    By metaMix3dTMSectionContactEmail = By.xpath("//a[text()='Info@metamix3d.com']");
    By metaMix3dTMSectionContactLocation = By.xpath("//span[text()='Austin, TX, 78738']");
    By metaMix3dTMSectionNavigationGames = By.xpath("//span[text()='Games']");
    By metaMix3dTMSectionNavigationCareers = By.xpath("//span[text()='Careers']");
    By metaMix3dTMSectionNavigationAbout = By.xpath("//span[text()='About']");
    By metaMix3dTMSectionNavigationContact = By.xpath("//span[text()='About']/following::span[text()='Contact']");
    By metaMix3dTMSectionNavigationPrivacy = By.xpath("//span[text()='Privacy Policy']");
    By metaMix3dTMSectionNavigationTerms = By.xpath("//span[text()='Terms & Conditions']");
    By metaMix3dTMSectionSocialDiscord = By.xpath("//span[text()='Discord']");
    By metaMix3dTMSectionSocialTwitch = By.xpath("//span[text()='Twitch']");
    By metaMix3dTMSectionSocialFacebook = By.xpath("//span[text()='Facebook']");
    By metaMix3dTMSectionSocialYouTube = By.xpath("//span[text()='YouTube']");
    By metaMix3dTMSectionSocialTwitter = By.xpath("//span[text()='Twitter']");
    By metaMix3dTMSectionSocialLinkedIn = By.xpath("//span[text()='LinkedIn']");
    By metaMix3dTMSectionFindUsOnAppStore = By.xpath("//p[text()='Find Us On']/following::img[@alt='Download on the App Store']");
    By metaMix3dTMSectionFindUsOnGooglePlay = By.xpath("//p[text()='Find Us On']/following::img[@alt='Get in on Google Play']");
    By metaMix3dTMSectionCopyright = By.xpath("//span[text()='© 2024 by MetaMix3D LLC']");

    // Methods

    public By getTabByName(String tabName) {
        return By.xpath("//p[text()='" + tabName + "']");
    }

    public boolean verifyHomeTabDisplayed() {
        return isElementVisible(getTabByName("Home"));
    }

    public boolean verifyPixelGamesTabDisplayed() {
        return isElementVisible(getTabByName("PixelGames"));
    }

    public boolean verifyContactTabDisplayed() {
        return isElementVisible(getTabByName("Contact"));
    }

    public boolean verifyMetaMix3dHeaderDisplayed() {
        return isElementVisible(metaMix3dHeader);
    }

    public boolean verifyMetaMix3dDescriptionDisplayed() {
        return isElementVisible(metaMix3dDesc);
    }

    public boolean verifyDownloadOnAppStoreDisplayed() {
        return isElementVisible(downloadOnAppStore);
    }

    public boolean verifyDownloadOnGooglePlayDisplayed() {
        return isElementVisible(downloadOnGooglePlay);
    }

    public boolean verifyAboutMetaMix3dSection() {

        scrollToElement(aboutMetaMix3dHeader);

        return areElementsVisible(
                aboutMetaMix3dHeader,
                getTabByName("Your Source for 3D Assets in games and web contents"),
                aboutMetaMix3dDesc1,
                aboutMetaMix3dDesc2,
                aboutMetaMix3dDesc3,
                aboutMetaMix3dDesc4,
                metaMix3dLearnMoreBttn
        );
    }

    public boolean verifyOurGameAssetsSection() {

        scrollToElement(gameAssetsSectionTitle);

        boolean initialGameAssetElementsVisible = areElementsVisible(
                gameAssetsSectionTitle,
                gameAssetsSectionDesc,
                gameAssets3DSectionTitle,
                gameAssets3DSectionDesc,
                gameAssetsUnity3DAssetsTitle,
                gameAssetsUnity3DAssetsDesc,
                gameAssetsUnity3DImageLink
        );

        scrollToElement(gameAssetsVRMetaVerseTitle);

        boolean vrMetaVerseElementsVisible = areElementsVisible(
                gameAssetsVRMetaVerseTitle,
                gameAssetsVRMetaVerseDesc1,
                gameAssetsVRMetaVerseDesc2,
                gameAssetsDownloadOnAppStore,
                gameAssetsDownloadOnGooglePlay
        );

        // Return true only if all checks pass
        return initialGameAssetElementsVisible && vrMetaVerseElementsVisible;
    }

    public boolean verifyPortfolioSection() {

        scrollToElement(portfolioSectionTitle);

        return areElementsVisible(
                portfolioSectionTitle,
                portfolioSectionDesc
        );
    }

    public boolean verifyGetInTouchSection() {

        scrollToElement(getInTouchSectionTitle);

        return areElementsVisible(
                getInTouchSectionTitle,
                getInTouchSectionFirstName,
                getInTouchSectionLastName,
                getInTouchSectionEmail,
                getInTouchSectionMessage,
                getInTouchSectionSubmitButton
        );
    }

    public boolean verifySubscribeNewsLetterSection() {

        scrollToElement(subscribeNewsLetterEmailField);

        return areElementsVisible(
                subscribeNewsLetterTitle,
                subscribeNewsLetterEmail,
                subscribeNewsLetterJoin
        );
    }

    public boolean verifyMetaMix3dTMSectionHeaderAndDesc() {

        scrollToElement(metaMix3dTradeMarkSectionHeader);

        return areElementsVisible(
                metaMix3dTradeMarkSectionHeader,
                metaMix3dTradeMarkSectionDesc
        );
    }

    public boolean verifyMetaMix3dTMSectionContact() {

        scrollToElement(metaMix3dTMSectionContactHeader);

        return areElementsVisible(
                metaMix3dTMSectionContactHeader,
                metaMix3dTMSectionContactEmail,
                metaMix3dTMSectionContactLocation
        );
    }

    public boolean verifyMetaMix3dTMSectionNavigation() {

        return areElementsVisible(
                getTabByName("Navigation"),
                metaMix3dTMSectionNavigationGames,
                metaMix3dTMSectionNavigationCareers,
                metaMix3dTMSectionNavigationAbout,
                metaMix3dTMSectionNavigationContact
        );
    }

    public boolean verifyMetaMix3dTMSectionSocial() {

        return isElementVisible(getTabByName("Social"));
    }

    public boolean verifyMetaMix3dTMSectionFindUsOn() {

        return areElementsVisible(
                getTabByName("Find Us On"),
                metaMix3dTMSectionFindUsOnAppStore,
                metaMix3dTMSectionFindUsOnGooglePlay
        );
    }

    public boolean verifyMetaMix3dCopyrightTrademark() {

        scrollToElement(metaMix3dTMSectionCopyright);
        return isElementVisible(metaMix3dTMSectionCopyright);
    }

    public void enterFirstName(String firstName) {

        scrollToElement(getInTouchSectionFirstName);

        isElementVisible(getInTouchSectionFirstNameField);
        WebElement firstNameField = driver.findElement(getInTouchSectionFirstNameField);
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {

        scrollToElement(getInTouchSectionLastName);

        isElementVisible(getInTouchSectionLastNameField);
        WebElement lastNameField = driver.findElement(getInTouchSectionLastNameField);
        lastNameField.sendKeys(lastName);
    }

    public void enterEmailInGetInTouchSection(String email) {

        scrollToElement(getInTouchSectionEmail);

        isElementVisible(getInTouchSectionEmailField);
        WebElement EmailField = driver.findElement(getInTouchSectionEmailField);
        EmailField.sendKeys(email);
    }

    public void enterMessageInLeaveUsMessage(String message) {

        scrollToElement(getInTouchSectionMessage);

        isElementVisible(getInTouchSectionMessageField);
        WebElement LeaveUsMessageField = driver.findElement(getInTouchSectionMessageField);
        LeaveUsMessageField.sendKeys(message);
    }

    public void clickSubmit() {

        scrollToElement(getInTouchSectionSubmitButton);
        click(getInTouchSectionSubmitButton);
    }

    public void enterEmailInSubscribeNewsletterSection(String email) {

        scrollToElement(subscribeNewsLetterTitle);

        isElementVisible(subscribeNewsLetterEmailField);
        WebElement EmailField = driver.findElement(subscribeNewsLetterEmailField);
        EmailField.sendKeys(email);
    }

    public void clickJoinNewsLetter() {

        click(subscribeNewsLetterJoin);
    }

    public void clickOnPrivacyPolicy() {

        scrollToElement(metaMix3dTMSectionContactHeader);
        click(metaMix3dTMSectionNavigationPrivacy);
    }

    public void clickOnTermsAndConditions() {

        scrollToElement(metaMix3dTMSectionContactHeader);
        click(metaMix3dTMSectionNavigationTerms);
    }

    public void clickOnVisitOurPortfolio() {

        scrollToElement(portfolioSectionTitle);
        click(portfolioVisitButton);
    }

    public void clickOnDiscord() {

        scrollToElement(metaMix3dTMSectionSocialDiscord);
        click(metaMix3dTMSectionSocialDiscord);
    }

    public void clickOnTwitch() {

        scrollToElement(metaMix3dTMSectionSocialDiscord);
        click(metaMix3dTMSectionSocialTwitch);
    }

    public void clickOnFacebook() {

        scrollToElement(metaMix3dTMSectionSocialFacebook);
        click(metaMix3dTMSectionSocialFacebook);
    }

    public void clickOnYoutube() {

        scrollToElement(metaMix3dTMSectionSocialYouTube);
        click(metaMix3dTMSectionSocialYouTube);
    }

    public void clickOnTwitter() {

        scrollToElement(metaMix3dTMSectionSocialTwitter);
        click(metaMix3dTMSectionSocialTwitter);
    }

    public void clickOnLinkedIn() {

        scrollToElement(metaMix3dTMSectionSocialLinkedIn);
        click(metaMix3dTMSectionSocialLinkedIn);
    }
}