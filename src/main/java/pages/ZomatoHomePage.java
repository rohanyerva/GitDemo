package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZomatoHomePage {
    private WebDriver driver;
    private By signInLink = By.xpath("//a[@data-testid='signin-link']");

    public ZomatoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.zomato.com/");
    }

    public void clickSignIn() {
        driver.findElement(signInLink).click();
    }
}
