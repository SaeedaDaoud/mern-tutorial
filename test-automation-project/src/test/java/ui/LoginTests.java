package ui;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTests extends BaseTest {

	@Test
	public void loginWithValidCredentials() {
	    driver.findElement(By.id("email")).sendKeys("valid@email.com");
	    driver.findElement(By.id("password")).sendKeys("validPassword123");
	    
	    // Using button class to locate and click Submit
	    driver.findElement(By.cssSelector("button.btn.btn-block")).click();

	    boolean dashboardPresent = driver.getPageSource().contains("Dashboard"); // Update text check as needed
	    Assert.assertTrue(dashboardPresent, "Login failed with valid credentials.");
	}

	@Test
	public void loginWithInvalidCredentials() {
	    driver.findElement(By.id("email")).sendKeys("invalid@email.com");
	    driver.findElement(By.id("password")).sendKeys("wrongPassword");
	    
	    driver.findElement(By.cssSelector("button.btn.btn-block")).click();

	    boolean errorPresent = driver.getPageSource().contains("Invalid credentials"); // Or actual error text
	    Assert.assertTrue(errorPresent, "Expected error message not found.");
	}


}
