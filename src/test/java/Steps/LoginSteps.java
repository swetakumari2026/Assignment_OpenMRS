package Steps;

import LibraryFiles.DriverFactoryClass;
import LibraryFiles.UtilityClass;
import Pom_pageFiles.OpenMRSHomePage;
import Pom_pageFiles.OpenMRS_LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class LoginSteps
{
    OpenMRS_LoginPage login=new OpenMRS_LoginPage(DriverFactoryClass.driver);
    OpenMRSHomePage home=new OpenMRSHomePage(DriverFactoryClass.driver);

    @Given("user is on MRS login page")
    public void user_is_on_mrs_login_page() throws IOException
    {
        String urlValue =UtilityClass.getPFData("URL");         //get url from property file
        DriverFactoryClass.driver.get(urlValue);
    }

    @When("user enter username on MRS login page {string}")
    public void user_enter_username_on_mrs_login_page(String username)
    {
         login.enterUN(username);
    }

    @When("wait {int} seconds")
    public void wait_seconds(Integer timeInSec) throws InterruptedException {
      Thread.sleep(timeInSec*1000);
    }

    @When("user enter password on MRS login page {string}")
    public void user_enter_password_on_mrs_login_page(String password)
    {
        login.enterPWD(password);
    }

    @When("user click on inpatientWard button")
    public void user_click_on_inpatient_ward_button()
    {
        login.clickImpatientButton();
    }

    @When("user click on login button")
    public void user_click_on_login_button()
    {
          login.clickLoginButton();
    }

    @Then("home page is visible with text {string}")
    public void home_page_is_visible_with_text(String expText)
    {
        String actText= home.getText();
        Assert.assertEquals(actText,expText,"text mismatch");
    }
}
