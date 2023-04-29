package tests.pages;

import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class MainPage extends LoadableComponent<MainPage> {

    private WebDriver driver;
    private static final By USER_NAME = By.xpath(".//*[@data-l='t,userPage']");
    private static final By LENTA = By.xpath(".//*[contains(@id, 'UserMainFullMRB')]");
    private static final By USER_AVATAR = By.id("viewImageLinkId");

    public MainPage(WebDriver driver) {
        this.driver = driver;
        isLoaded();
    }

    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
        new WebDriverWait(driver, 5).until(visibilityOfElementLocated(USER_NAME));
        new WebDriverWait(driver, 5).until(visibilityOfElementLocated(LENTA));
        new WebDriverWait(driver, 5).until(visibilityOfElementLocated(USER_AVATAR));

    }

    public String getName() {
        return driver.findElement(USER_NAME).getText();
    }
}
