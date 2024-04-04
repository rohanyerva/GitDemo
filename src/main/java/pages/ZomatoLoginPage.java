package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZomatoLoginPage {
    private WebDriver driver;
    private By emailField = By.id("login-email");
    private By passwordField = By.id("login-password");
    private By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    public ZomatoLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }
}

