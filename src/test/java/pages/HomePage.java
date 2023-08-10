package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;
    private final By welcomeMessage = By.id("welcomeMsg");

    private final By becomeTester = By.className("btn-unauth");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBecomeButton() {
        driver.findElement(becomeTester).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessage).getText();
    }
}
