package PageClasses.Metamix3d;

import PageClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MetaMix3dPortfolioPage extends BasePage {

    public MetaMix3dPortfolioPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By portfolio3DAssetsHeader = By.xpath("//span[text()='3D Game Assets']");
    By portfolio3DAssetsSubHeader = By.xpath("//span[text()='Games, animation and Unity3D']");
    By portfolio3DAssetDesc = By.xpath("//p[contains(text(), 'A One-of-a-Kind')]");
    By portfolioScreenshots = By.xpath("//span[text()='Screenshots']");
    By portfolioRating = By.xpath("//p[contains(text(), 'Rating')]");
    By portfolioReviews = By.xpath("//span[text()='Reviews']");
    By portfolioChallengeDesc = By.xpath("//span[contains(text(), 'Challenge a Friend')]");
    By portfolioPlayNowHeader = By.xpath("//span[text()='Play Now']");
    By portfolioPlayNowAppStore = By.xpath("(//img[@alt='Download on the App Store'])[1]");
    By portfolioPlayNowGooglePlay = By.xpath("(//img[@alt='Get in on Google Play'])[1]");


    //Methods

    public boolean verifyPortfolio3DAssets() {

        return areElementsVisible(
                portfolio3DAssetsHeader,
                portfolio3DAssetsSubHeader,
                portfolio3DAssetDesc
        );
    }
}