package ui;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class DeleteItemTests extends BaseTest {

    @Test
    public void deleteItem() {
        driver.findElement(By.id("deleteBtn-1")).click(); // assume ID format
        driver.switchTo().alert().accept(); // confirm delete

        boolean deleted = !driver.getPageSource().contains("Item 1");
        Assert.assertTrue(deleted, "Item was not deleted");
    }
}
