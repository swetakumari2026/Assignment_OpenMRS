package LibraryFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactoryClass
{
    //a class which contains code related to open and close browser
    public static WebDriver driver;     //declare global variable-> to access driver in anyclass

    public static void initializeBrowser(String browserName)   //will set up browser and will pass browserName,will open specific browser
                     //initializeBrowser ->user defined method to open browser
    {
          if(browserName.equalsIgnoreCase("chrome"))
          {
              driver= new ChromeDriver();
          }
          else if(browserName.equalsIgnoreCase("Firefox"))
          {
              driver= new FirefoxDriver();
          }
          else if (browserName.equalsIgnoreCase("Edge"))
          {
              driver=new EdgeDriver();
          }

          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
