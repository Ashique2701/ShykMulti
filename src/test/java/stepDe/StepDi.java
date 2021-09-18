package stepDe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDi {

	WebDriver driver;

	@Given("^OPEN FB URL$")
	public void open_FB_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	@Then("^ENTER INVlid USER AND PASSWORD$")
	public void enter_INVlid_USER_AND_PASSWORD() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ashique");
		driver.findElement(By.id("pass")).sendKeys("1234567");
	}

	@Then("^CLICK ON LOGIN$")
	public void click_ON_LOGIN() throws Throwable {
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	@Then("^VERIFY USER SHOULD NOT LOGIN$")
	public void verify_USER_SHOULD_NOT_LOGIN() throws Throwable {
		boolean errormessage = driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).isDisplayed();
		Assert.assertTrue(errormessage);
		Thread.sleep(2000);
	}

	@Then("^Verify FB logo$")
	public void verify_FB_logo() throws Throwable {
		boolean logo = driver
				.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc." + "php/y8/r/dF5SId3UHWd.svg']"))
				.isDisplayed();
		Assert.assertTrue(logo);
	}

	@Then("^text under logo$")
	public void text_under_logo() throws Throwable {
		boolean textlogo = driver
				.findElement(By.xpath("//h2[text()='Connect with friends " + "and the world around you on Facebook.']"))
				.isDisplayed();
		Assert.assertTrue(textlogo);

	}

}
