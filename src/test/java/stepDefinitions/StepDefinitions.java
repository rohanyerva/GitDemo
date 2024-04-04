package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.After;
import cucumber.api.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.ZomatoHomePage;
import pages.ZomatoLoginPage;

import java.util.List;
import java.util.Map;

public class StepDefinitions {
    private WebDriver driver;
    private ZomatoHomePage homePage;
    private ZomatoLoginPage loginPage;

    @Given("User is on the Zomato HomePage and open Sign In page")
    public void user_is_on_the_zomato_homepage_and_open_sign_in_page() {
       ChromeDriver driver = new ChromeDriver(); 
        
        homePage = new ZomatoHomePage(driver);
        homePage.open();
        homePage.clickSignIn();
    }

    @When("User logins with credentials from Excel")
    public void user_logins_with_credentials_from_excel(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String username = data.get(0).get("Username");
        String password = data.get(0).get("Password");
        
        loginPage = new ZomatoLoginPage(driver);
        loginPage.login(username, password);
    }

    @And("User searches for {string} in the search box")
    public void user_searches_for_food_item_in_the_search_box(String foodItem) {
        // Implement search functionality
    }

    @And("User selects {string} with least delivery time from the search results")
    public void user_selects_food_item_with_least_delivery_time_from_the_search_results(String foodItem) {
        // Implement selecting food item with least delivery time
    }

    @And("User bookmarks the selected restaurant")
    public void user_bookmarks_the_selected_restaurant() {
        // Implement bookmarking functionality
    }

    @Then("User should see the bookmarked restaurant from profile page")
    public void user_should_see_the_bookmarked_restaurant_from_profile_page() {
        // Implement verification of bookmarked restaurant
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
