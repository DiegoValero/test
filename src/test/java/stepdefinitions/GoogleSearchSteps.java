package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleSearchSteps {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;

    @Given("que estoy en la pagina de inicio")
    public void navigateToGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dievaler\\Desktop\\Documentos\\Study\\SeleniumCucumber\\Selenium-Cucumber\\chrome-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.get("https://utest.com/");
    }

    @Then("el titulo de la pagina deberia ser {string}")
    public void verifyTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, containsString(expectedTitle));
        // Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("hago click en el become tester")
    public void clickBecomeTester() {
        homePage.clickBecomeButton();
    }

    @Then("el step 1 debe ser visible")
    public void verifyStep() {
        loginPage.verifyStep();

    }

    @And("el subTitle debe ser {string}")
    public void verifySubTitle(String subTitle) {
        loginPage.verifySubTitle(subTitle);
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}