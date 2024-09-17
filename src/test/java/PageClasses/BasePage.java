package PageClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Method to check if an element is visible
    public boolean isElementVisible(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception while locating element: " + locator);
            return false;
        }
    }

    // Method to check if multiple elements are visible
    public boolean areElementsVisible(By... locators) {
        for (By locator : locators) {
            if (!isElementVisible(locator)) {
                System.out.println("Element with locator " + locator.toString() + " is not visible.");
                return false;
            }
        }
        return true;
    }

    // Method to scroll to an element
    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void click(By locator) {
        WebElement element = driver.findElement(locator);
        if (isElementVisible(locator)) {
            element.click();
        } else {
            throw new NoSuchElementException("Element is not visible");
        }
    }

    public void switchToNewTab() {
        String originalWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void closeCurrentTabAndSwitchBack() {
        // Get the handle of the original tab
        String originalWindow = driver.getWindowHandles().iterator().next();

        // Close the current tab
        driver.close();

        // Switch back to the original tab
        driver.switchTo().window(originalWindow);
    }

    // Test comment to verify Git push
}