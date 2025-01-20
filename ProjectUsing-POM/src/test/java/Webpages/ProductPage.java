package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

	private WebDriver driver;

	// Locators for sorting product high to low
	private By productHighToLow = By.xpath("//a[@id='item_5_title_link']//div[1]");

	// Constructor
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions for sorting and products
	public void clickOnHighToLowProduct() {
		WebElement sortdropdown = driver.findElement(By.xpath("//span[@class='select_container']//select[1]"));
		Select select = new Select(sortdropdown);
		select.selectByVisibleText("Price (high to low)");
		driver.findElement(productHighToLow).click();
		System.out.println("Clicked High to Low Product");
	}
}
