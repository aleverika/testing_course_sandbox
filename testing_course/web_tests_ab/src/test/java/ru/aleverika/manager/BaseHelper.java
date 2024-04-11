package ru.aleverika.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseHelper {
    protected final ApplicationManager manager;

    public BaseHelper(ApplicationManager manager) {
        this.manager = manager;
    }

    protected void click(By locator) {
        manager.driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        manager.driver.findElement(locator).clear();
        manager.driver.findElement(locator).sendKeys(text);
    }

    protected void select(By locator, String text) {
        WebElement dropdown = manager.driver.findElement(locator);
        var locator2 = By.xpath(String.format("//option[. = '%s']", text));
        dropdown.findElement(locator2).click();
    }
}
