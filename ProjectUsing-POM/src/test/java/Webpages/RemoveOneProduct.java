package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveOneProduct {
	private WebDriver driver;

    // Locators for Remove product
    private By removeButton = By.name("remove-sauce-labs-bike-light");

    // Constructor
    public RemoveOneProduct(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickRemoveButton() {
        driver.findElement(removeButton).click();
        System.out.println("Product removed from cart.");
    }
}
