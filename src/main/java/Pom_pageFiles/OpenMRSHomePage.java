package Pom_pageFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSHomePage
{
    @FindBy(xpath = "//span[text()='Inpatient Ward']") private WebElement text;
    @FindBy(xpath = "(//a[@type='button'])[4]") private WebElement registrationButton;

    //initalization
    public OpenMRSHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    //perform action
    public String getText()
    {
        String actText=text.getText();
        return actText;
    }
    public void clickRegButtton()
    {
        registrationButton.click();
    }
}
