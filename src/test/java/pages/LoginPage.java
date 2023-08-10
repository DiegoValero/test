package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("loginBtn");
    private final By stepButton = By.xpath("//span[contains(text(),'Step 1')]");

    private final By subTitleElement = By.className("sub-title");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void verifyStep() {
        if ( driver.findElement(stepButton).isDisplayed()) {
            System.out.println("El elemento es visible.");
        } else {
            System.out.println("El elemento no es visible.");
        }
    }


    public void verifySubTitle(String subTitle) {
        String text = driver.findElement(subTitleElement).getText();
        Assert.assertEquals(text, subTitle);
    }

}
