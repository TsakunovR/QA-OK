package tests.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginFormPage {

    private final WebDriver driver;
    By loginField = By.id("field_email");
    By passwordField = By.id("field_password");

    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(loginField));
    }

    public void setLogin(String login) {
        driver.findElement(loginField).sendKeys(login);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
}