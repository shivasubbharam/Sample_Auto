package stepDefinitions;

import org.openqa.selenium.By;

import Mob.Auto.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class run extends Base {

	AndroidDriver<AndroidElement> driver = launch();
	

	@Given("I select Accessibility option")
	public void i_select_accessibility_option() {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']")).click();
		
	}

	@When("I select Custom view Option")
	public void i_select_custom_view_option() {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Custom View']")).click();
		
	}

	@Then("I verify whether I am in Custom view screen")
	public void i_verify_whether_i_am_in_custom_view_screen() {
		String actual = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Accessibility/Custom View']")).getText();
		Assert.assertEquals(actual, "Accessibility/Custom View");
		
	}
}