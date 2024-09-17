package TestScenarios.Metamix3d_tests;

import PageClasses.Metamix3d.MetaMix3dHomePage;
import PageClasses.Metamix3d.MetaMix3dPortfolioPage;
import TestScenarios.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MetaMix3dPortfolioPageTest extends BaseTest {

    private MetaMix3dHomePage homePage;
    private MetaMix3dPortfolioPage portfolioPage;

    @BeforeClass
    public void setup() {
        homePage = new MetaMix3dHomePage(driver); // Initialize homepage
        portfolioPage = new MetaMix3dPortfolioPage(driver); // Initialize portfolio page
    }

    @Test
    public void verifyPortfolio3DAssets() {

        homePage.clickOnVisitOurPortfolio();
        boolean arePortfolio3DAssetsVisible = portfolioPage.verifyPortfolio3DAssets();
        Assert.assertTrue(arePortfolio3DAssetsVisible, "Portfolio 3D Asset elements are not visible");
    }
}