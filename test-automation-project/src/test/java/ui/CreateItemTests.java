package ui;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class CreateItemTests extends BaseTest {

    @Test
    public void createNewItem() {
        driver.findElement(By.id("createBtn")).click();
        driver.findElement(By.id("itemName")).sendKeys("New Test Item");
        driver.findElement(By.id("saveBtn")).click();

        boolean created = driver.getPageSource().contains("New Test Item");
        Assert.assertTrue(created, "Item was not created");
    }
}
