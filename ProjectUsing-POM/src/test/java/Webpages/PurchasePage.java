package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

	private WebDriver driver;

	// Locators
	private By addToCartButton = By.id("add-to-cart");
	private By cartButton = By.xpath("//div[@id='shopping_cart_container']//a[1]");

	// Constructor
	public PurchasePage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions
	public void clickAddToCart() {
		driver.findElement(addToCartButton).click();
	}

	public void navigateToCart() {
		driver.findElement(cartButton).click();
		System.out.println("First Product added to cart Completed");

	}
}
