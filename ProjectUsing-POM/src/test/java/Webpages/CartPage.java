package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	 private WebDriver driver;

	    // Locators for CheckOut
	    private By checkoutButton = By.id("checkout");
	    private By firstNameField = By.name("firstName");
	    private By lastNameField = By.name("lastName");
	    private By postalCodeField = By.name("postalCode");
	    private By continueButton = By.xpath("//input[@value='Continue']");
	    private By finishButton = By.xpath("//button[text()='Finish']");

	    // Constructor
	    public CartPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Actions
	    public void clickCheckout() {
	        driver.findElement(checkoutButton).click();
	    }

	    public void enterCheckoutDetails(String firstName, String lastName, String postalCode) {
	        driver.findElement(firstNameField).sendKeys(firstName);
	        driver.findElement(lastNameField).sendKeys(lastName);
	        driver.findElement(postalCodeField).sendKeys(postalCode);
	        driver.findElement(continueButton).click();
	    }

	    public void completeCheckout() {
	        driver.findElement(finishButton).click();
	        System.out.println("Checkout and purchase completed.");
	    }
}
