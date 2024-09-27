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

    public boolean isElementVisible(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception while locating element: " + locator);
            return false;
        }
    }

    public boolean areElementsVisible(By... locators) {
        for (By locator : locators) {
            if (!isElementVisible(locator)) {
                System.out.println("Element with locator " + locator.toString() + " is not visible.");
                return false;
            }
        }
        return true;
    }

    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void click(By locator) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException: " + e.getMessage());
            click(locator);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Element not found: " + e.getMessage());
        } catch (ElementClickInterceptedException e) {
            System.out.println("ElementClickInterceptedException: " + e.getMessage());
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locator));
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while clicking the element: " + e.getMessage());
        }
    }

    public void switchToNewTab() {
        String originalWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
    }

    public void waitForButtonToBeEnabled(By buttonLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
    }
}