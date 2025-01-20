package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
	 private WebDriver driver;

	    // Locators
	    private By menuButton = By.id("react-burger-menu-btn");
	    private By logoutButton = By.id("logout_sidebar_link");

	    // Constructor
	    public LogOutPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Actions
	    public void clickLogout() {
	        driver.findElement(menuButton).click();
	        driver.findElement(logoutButton).click();
	        System.out.println("Logout Completed.");
	    }

}
