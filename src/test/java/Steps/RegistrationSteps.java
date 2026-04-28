package Steps;

import LibraryFiles.DriverFactoryClass;
import Pom_pageFiles.OpenMRSBirthDatePage;
import Pom_pageFiles.OpenMRSGenderPage;
import Pom_pageFiles.OpenMRSHomePage;
import Pom_pageFiles.OpenMRSNamePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegistrationSteps
{
      OpenMRSHomePage home=new OpenMRSHomePage(DriverFactoryClass.driver);
      OpenMRSNamePage name=new OpenMRSNamePage(DriverFactoryClass.driver);
      OpenMRSGenderPage gender=new OpenMRSGenderPage(DriverFactoryClass.driver);
      OpenMRSBirthDatePage birth=new OpenMRSBirthDatePage(DriverFactoryClass.driver);


    @When("user click on register button")
    public void user_click_on_register_button()
    {
          home.clickRegButtton();
    }

    @When("registration page is visible with text {string}")
    public void registration_page_is_visible_with_text(String expResult)
    {
          String actResult= name.getText();
        Assert.assertEquals(actResult,expResult,"Text mismatch");
    }

    @When("user enter firstname on given field as {string}")
    public void user_enter_firstname_on_given_field_as(String firstname)
    {
        name.enterGivenName(firstname);
    }

    @When("user enter middlename on middle field as {string}")
    public void user_enter_middlename_on_middle_field_as(String middlename)
    {
       name.enterMiddleName(middlename);
    }

    @When("user enter lastname on family name field as {string}")
    public void user_enter_lastname_on_family_name_field_as(String lastname)
    {
         name.enterFamilyName(lastname);
    }

    @When("user click on arrow next button")
    public void user_click_on_arrow_next_button()
    {
        name.clickNext();
    }

    @When("user click on gender button")
    public void user_click_on_gender_button()
    {
          gender.clickGenderField();
    }

    @When("User select on female")
    public void user_select_on_female()
    {
        gender.selectFemale();
    }

//    @When("user enter date in day field as {int}")
//    public void user_enter_date_in_day_field_as(Integer date)
//    {
//        birth.enterdate(date);
//    }
    @When("user click on select tab")
    public void user_click_on_select_tab()
    {
        birth.clickMonth();
    }
    @When("user click on select button")
    public void user_click_on_select_button()
    {
         birth.monthDropdown();
    }
//    @When("user select month as March")
//    public void user_select_month_as_march()
//    {
//        birth.monthDropdown();
//    }

    @When("user enter year of birth date as {int}")
    public void user_enter_year_of_birth_date_as(Integer int1) {


    }

    @When("user enter address as {string}")
    public void user_enter_address_as(String string) {


    }

    @When("user enter address2 as {string}")
    public void user_enter_address2_as(String string) {

    }

    @When("user enter city name as {string}")
    public void user_enter_city_name_as(String string) {

    }

    @When("user enter state as {string}")
    public void user_enter_state_as(String string) {


    }

    @When("user enter country as {string}")
    public void user_enter_country_as(String string) {

    }

    @When("user enter postal code as {int}")
    public void user_enter_postal_code_as(Integer int1) {

    }

    @When("user enter phone number as {int}")
    public void user_enter_phone_number_as(Integer int1) {

    }

    @When("user click on confirm button")
    public void user_click_on_confirm_button() {

    }

    @Then("user get registered with visible page as {string}")
    public void user_get_registered_with_visible_page_as(String string) {

    }

    @When("user enter date in day field as {string}")
    public void user_enter_date_in_day_field_as(String date)
    {
         birth.enterdate(date);
    }
    @When("user select month as {string}")
    public void user_select_month_as(String string)
    {
     birth.monthDropdown();


    }}
