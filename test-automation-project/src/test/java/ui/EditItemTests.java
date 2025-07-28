package ui;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class EditItemTests extends BaseTest {

    @Test
    public void editExistingItem() {
        driver.findElement(By.id("editBtn-1")).click(); // assume ID format
        driver.findElement(By.id("itemName")).clear();
        driver.findElement(By.id("itemName")).sendKeys("Updated Item");
        driver.findElement(By.id("saveBtn")).click();

        boolean updated = driver.getPageSource().contains("Updated Item");
        Assert.assertTrue(updated, "Item was not updated");
    }
}
