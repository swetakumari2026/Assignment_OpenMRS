package Pom_pageFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSGenderPage
{
    @FindBy(xpath = "//select[@id='gender-field']") private WebElement gender;
    @FindBy(xpath = "//option[text()='Female']") private WebElement selectFemale;

    public OpenMRSGenderPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void clickGenderField()
    {
        gender.click();
    }
    public void selectFemale()
    {
        selectFemale.click();
    }
}
