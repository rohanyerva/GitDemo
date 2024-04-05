package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ZomatoHomePage {
    private WebDriver driver;
    private By signInLink = By.xpath("//a[@data-testid='signin-link']");

    public ZomatoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.zomato.com/");
        System.out.println("Zomato HomePage Opened");
        System.out.println("New Commit 2");
    }

    public void clickSignIn() {
        driver.findElement(signInLink).click();
        System.out.println("Sign In Clicked");

    }
}
