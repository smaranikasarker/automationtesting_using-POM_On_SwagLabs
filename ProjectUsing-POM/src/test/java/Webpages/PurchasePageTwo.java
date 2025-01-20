package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PurchasePageTwo {

	private WebDriver driver;

	// Locators for sorting product low to high
	private By productLowToHigh1 = By.xpath("(//div[@class='pricebar']//button)[1]");
	private By productLowToHigh2 = By.xpath("(//div[@class='pricebar']//button)[2]");
	private By continueshopping = By.id("continue-shopping");
	private By cartButton1 = By.xpath("//a[@class='shopping_cart_link']//span[1]");

	// Constructor
	public PurchasePageTwo(WebDriver driver) {
		this.driver = driver;
	}

	// Actions for sorting and products

	public void clickcontinueshopping() {
		driver.findElement(continueshopping).click();
	}

	public void addedtwoProducts() {
		WebElement dropdown = driver.findElement(By.xpath("//span[@class='select_container']//select[1]"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Price (low to high)");
		driver.findElement(productLowToHigh1).click();
		driver.findElement(productLowToHigh2).click();
		driver.findElement(cartButton1).click();
		System.out.println("Two Products purchase Completed");

	}
}
