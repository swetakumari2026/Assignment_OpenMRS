package Pom_pageFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static LibraryFiles.DriverFactoryClass.driver;

public class OpenMRSNamePage
{
    @FindBy(xpath = "(//input[@type='text'])[1]") private WebElement givenName;
    @FindBy(xpath = "//input[@name='middleName']") private WebElement middleName;
    @FindBy(xpath = "//input[@name='familyName']") private WebElement familyName;
    @FindBy(xpath = "//button[@class='confirm right']") private WebElement clicknextButton;
    @FindBy(xpath = "//h2[contains(text(),'patient')]") private WebElement registerPatientText;

    public OpenMRSNamePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public String getText()
    {
       String actText= registerPatientText.getText();
       return actText;
    }
    public void enterGivenName(String firstname)
    {
        givenName.sendKeys(firstname);
    }
    public void enterMiddleName(String middlename)
    {
        middleName.sendKeys(middlename);
    }
    public void enterFamilyName(String lastname)
    {
        familyName.sendKeys(lastname);
    }
    public void clickNext()
    {
        clicknextButton.click();
    }

}
