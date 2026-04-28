package Pom_pageFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenMRSBirthDatePage
{

    @FindBy(xpath = "//input[@name='birthdateDay']") private WebElement day;
    @FindBy(xpath = "//select[@name='birthdateMonth']") private WebElement monthfield;
    @FindBy(xpath = "//option[text()='Select']") private WebElement monthDropdown;
    //@FindBy(xpath = "") private WebElement month;
    @FindBy(xpath = "//input[@name='birthdateYear']") private WebElement year;
    @FindBy(xpath = "//icon[@class='fas fa-chevron-right']") private WebElement next;

    public OpenMRSBirthDatePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void enterdate(String date)
    {
        day.sendKeys(date);
    }
    public void clickMonth()
    {
       monthfield.click();
    }
   public void monthDropdown()
    {
        monthDropdown.click();
        Select s=new Select(monthDropdown);
       s.selectByVisibleText("March");

    }
//    public void enterYear()
//    {
//        year.sendKeys();
//    }
//    public void clickNext()
//    {
//        next.click();
//    }

}
