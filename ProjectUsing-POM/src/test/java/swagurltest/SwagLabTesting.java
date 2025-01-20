package swagurltest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import EnvironmentSetUp.BaseTest;
import Webpages.CartPage;
import Webpages.LogOutPage;
import Webpages.LoginPage;
import Webpages.ProductPage;
import Webpages.PurchasePage;
import Webpages.PurchasePageTwo;
import Webpages.RemoveOneProduct;

public class SwagLabTesting extends BaseTest {
    private LoginPage loginPage;
    private ProductPage productPage;
    private PurchasePage purchasepage;
    private PurchasePageTwo purchasepage1;
    private CartPage cartPage;
    private RemoveOneProduct removeProduct;
    private LogOutPage logOutPage;

    @BeforeMethod
    public void setUpTest() {
        setup();
        loginPage = new LoginPage(getDriver());
        productPage = new ProductPage(getDriver());
        purchasepage = new PurchasePage(getDriver());
        purchasepage1 = new PurchasePageTwo(getDriver());
        cartPage = new CartPage(getDriver());
        removeProduct = new RemoveOneProduct(getDriver());
        logOutPage = new LogOutPage(getDriver());
    }

    @Test
    public void testPurchaseProduct() throws InterruptedException {
        //Step 1: Login
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        Thread.sleep(3000);
        
      //Step 2: Navigate to Product
        productPage.clickOnHighToLowProduct();
        Thread.sleep(3000);
        
      //Step 3: Add Products to Cart
        purchasepage.clickAddToCart();
        Thread.sleep(5000);
        
      //Step 4: Go to Cart
        purchasepage.navigateToCart();
        Thread.sleep(5000);
        purchasepage1.clickcontinueshopping();
        Thread.sleep(5000);
        purchasepage1.addedtwoProducts();
        Thread.sleep(5000);
      //Step 5: Remove a Product
        removeProduct.clickRemoveButton();
        Thread.sleep(3000);
        
      // Step 6 : Checkout  
        cartPage.clickCheckout();
        Thread.sleep(3000);
        cartPage.enterCheckoutDetails("Influx", "Dev", "1209");
        Thread.sleep(3000);
        cartPage.completeCheckout();
        Thread.sleep(3000);
        
      //Step 6: Logout
        logOutPage.clickLogout();
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
