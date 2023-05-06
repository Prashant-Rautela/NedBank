package StepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {
	
	
	private WebDriver driver;
	private By myHomeLink = By.linkText("My account");
	private By usernameInput = By.id("username");
	private By passwordInput = By.id("password");
	private By loginButton = By.xpath("//button[@name='login']");
	private By shopLink = By.linkText("Shop");
	private By technologyLink = By.xpath("//ul[@class='products columns-3']/li[2]");
	private By addToCartButton = By.xpath("//button[@name='add-to-cart']");
	private By checkoutLink = By.linkText("Proceed to checkout");
	private By orderNumber = By.xpath("//ul[@class='woocommerce-order-overview woocommerce-thankyou-order-details order_details']/li[1]");
	
	
	
	@When("User searches for the product {string}")
	public void user_searches_for_the_product(String productName) {
		
		
		
		String xpath = "//ul[@class='products columns-3']/li/a/h2[contains(text(),'" + productName +"')]";
		driver.findElement(By.xpath(xpath)).click();
		
	    
	}
		
	@When("User places order for the product")
	public void User_places_order_for_the_product() throws InterruptedException {
		
		driver.findElement(addToCartButton).click();
		driver.findElement(checkoutLink).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(5000);
		String orderNum = driver.findElement(orderNumber).getText();
		System.out.println("order number is: " + orderNum);		
	    driver.quit();
	}
	
	
	
	@Given("User launces application url {string}")
	public void user_launces_application_url(String string) {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
		
		
	}
	
	@When("User clicks on My Account link.")
	public void user_clicks_on_my_account_link() {
		
		
		driver.findElement(myHomeLink).click();
	    
	}


	
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
	    
		driver.findElement(usernameInput).sendKeys(username);
		driver.findElement(passwordInput).sendKeys(password);
		driver.findElement(loginButton).click();
		
		
		
	}
		
	@When("User clicks on Shop icon at the top")
	public void user_clicks_on_shop_icon_at_the_top() {
		
		driver.findElement(shopLink).click();
		
	    
	}


	
	@When("User goes to technology link")
	public void user_goes_to_technology_link() {
	   
		driver.findElement(technologyLink).click();
		
	}
	
	
	
	
	

}
