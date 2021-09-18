package stepDe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;

public class StepDe2 {

	WebDriver driver;

	@Then("^Verify forget password text$")
	public void verify_forget_password_text() throws Throwable {

		try {
			boolean x = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]"))
					.isDisplayed();
			Assert.assertTrue(x);
			System.out.println("User has seen the Logo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
