package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class buy_object {
    public final WebDriver driver;

    public buy_object(WebDriver driver) {
        this.driver = driver;
    }



    public void openWalmartWebsite() {
        driver.get("https://www.walmart.com");
    }

    public void searchForShoes(String keyword) {
        driver.findElement(By.name("query")).sendKeys(keyword);
        driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
    }

    public void clickOnShoeProduct(String productName) {
        driver.findElement(By.linkText(productName)).click();
    }

    public void addToCart() {
        driver.findElement(By.cssSelector(".prod-product-cta-add-to-cart-1")).click();
    }

    public void goToCart() {
        driver.findElement(By.cssSelector(".cart-pos-right")).click();
    }


}
