package stepDefinations1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCRMSteps {
	WebDriver driver = null;

	@Given("Browser is open")
	public void Browser_is_open() {
		System.out.println("Inside Step: Browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("Inside Step: User is on login page");
		driver.navigate().to("https://www.freeCRM.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@When("User enters username and password")
	public void User_enters_username_and_password() throws InterruptedException {
		System.out.println("Inside Step: User enters username and password");
		driver.findElement(By.name("email")).sendKeys("akashshinde28ass@gmail.com");
		driver.findElement(By.name("password")).sendKeys("EagleAKKI@1437");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@Then("user is navigated  to Homepage then to settings and then Logout")
	public void user_is_navigated_to_Homepage_then_to_settings_and_then_Logout() throws InterruptedException {
		System.out.println("Inside Step: user is navigated  to Homepage then to settings and then Logout");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[5]/span")).click();
		driver.close();
	}

}
