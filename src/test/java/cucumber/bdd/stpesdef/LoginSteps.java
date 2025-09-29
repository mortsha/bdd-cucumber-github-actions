package cucumber.bdd.stpesdef;

import cucumber.bdd.stpes.BaseSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps extends BaseSetup {

    @Given("the user is on the login page")
    public void userOnLoginPage() throws InterruptedException {
        System.out.println("Opening");
        setUp();
        Thread.sleep(2000);
        tearDown();
        System.out.println("QUITING");
    }

    @When("the user enters valid credentials")
    public void userEntersCredentials() {
        // Just a simple example of finding fields and logging in
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("the user should be logged in successfully")
    public void userLoggedIn() {
        Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
    }
}
