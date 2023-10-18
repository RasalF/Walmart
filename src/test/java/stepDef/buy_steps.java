package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.buy_object;

public class buy_steps {

    public buy_object buy_object;
    public WebDriver driver;


    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        buy_object = new buy_object(driver);
    }
    @Given("I am on the Walmart website")
    public void iAmOnTheWalmartWebsite() {
        buy_object.openWalmartWebsite();
    }

    @When("I search for {string}")
    public void iSearchFor(String keyword) {
        buy_object.searchForShoes(keyword);
    }

    @And("I click on the product {string}")
    public void iClickOnTheProduct(String productName) {
        buy_object.clickOnShoeProduct(productName);
    }

    @And("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        buy_object.addToCart();
    }

    @Then("the product should be in the cart")
    public void theProductShouldBeInTheCart() {
        buy_object.goToCart();
        //assertion to verify product is in cart
    }
    @After
    public void tearDown() {
//        driver.quit();
    }
}
