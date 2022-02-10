package step_definition;


import Models.pages.LoginPage;
import com.test.util.hooks.Hooks;
import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    //Hooks hooks = new Hooks();
    public WebDriver driver = Hooks.driver;

    @Given("an existing user launches parasoft application")
    public void an_existing_user_launches_parasoft_application() {
      driver.get("https://parabank.parasoft.com");
      System.out.println("Parasoft launched successfully..");
    }
    @When("user enters the login details")
    public void user_enters_the_login_details() {
        driver.findElement(By.xpath(LoginPage.getTextboxUsername())).sendKeys("Biswajit");
        driver.findElement(By.xpath(LoginPage.getTextboxPassword())).sendKeys("biswajit");
        driver.findElement(By.xpath(LoginPage.getButtonLogin())).click();
        System.out.println("User logged in successfully..");

    }
    @Then("user is navigated to home screen")
    public void user_is_navigated_to_home_screen() {

           Assert.assertTrue("Home Page is NOT displayed !",driver.findElement(By.cssSelector(LoginPage.getTextAccountOverview())).isDisplayed());

        System.out.println("Home screen is visible successfully..");
    }

    @Then("account balance should greater than zero")
    public void accountBalanceShouldGreaterThanZero() {
        String strTotalAmount = driver.findElement(By.cssSelector(LoginPage.getTextAccountTotal())).getText();
        String myAmount[] = strTotalAmount.split("$",1);
        //2192.67
        SoftAssertions theSoftAssert = new SoftAssertions();
        theSoftAssert.assertThat(Double.parseDouble(myAmount[0])).as("Total amount is not correct").isGreaterThan(0.0);
    }
}
