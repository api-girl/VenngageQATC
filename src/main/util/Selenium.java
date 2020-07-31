import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    // Assume that the WebDriver manages browser actions.
    private WebDriver driver;
    //chromedriver.exe is stored as an env variable and is a part of the PATH
    private String chromeDriverPath = System.getenv("chromedriver");

    public Selenium (){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    /**
     * Gets an element by its xpath
     * @param xpath
     * @return
     */
    public WebElement getElement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    /**
     * Navigate to specified URL.
     * @param url to navigate to.
     **/
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Get page title
     * @return title in String format
     */
    public String getPageTitle(){
        return driver.getTitle();
    }

    /**
     * Get element text
     * @return text in String format
     */
    public String getElementText(String xpath){
        return driver.findElement(By.xpath(xpath)).getText();
    }

    /**
     * Simulates typing keys into the specified xpath
     *
     * @param xpath xpath of text field to send keys to
     * @param keys  keys to send to xpath
     */
    public void sendKeys(String xpath, String keys) {
        driver.findElement(By.xpath(xpath)).sendKeys(keys);
    }

    /**
     * Clicks the specified xpath.
     * Assume that the click function simulates a left mouse click.
     * @param xpath xpath to click
     */
    public void clickByXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    /**
     * Waits until the page title contains a specific String
     * @param title
     */
    public void waitUntilPageTitleContainsString(String title){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));
    }

    /**
     * Closing the browser and deleting all the cookies
     */
    public void quitChrome() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
