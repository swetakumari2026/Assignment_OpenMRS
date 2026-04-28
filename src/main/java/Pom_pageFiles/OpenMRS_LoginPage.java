package Pom_pageFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRS_LoginPage
{
    //declare variable with private access specifier with @FindBy (xpath) annotation

    @FindBy(xpath = "//input[@name='username']") private WebElement UN;
    @FindBy(xpath = "//input[@name='password']") private WebElement PWD;
    @FindBy(xpath = "//li[text()='Inpatient Ward']") private WebElement ImpatientWardButton;
    @FindBy(xpath = "//input[@type='submit']") private WebElement LoginButton;

    //initialization
    public OpenMRS_LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);   //to initialize/connect findby annotation with driver
    }

    //perform action
    public void enterUN(String username)
    {
        UN.sendKeys(username);
    }
    public void enterPWD(String password)
    {
        PWD.sendKeys(password);
    }
    public void clickImpatientButton()
    {
        ImpatientWardButton.click();
    }
    public void clickLoginButton()
    {
        LoginButton.click();
    }
}
