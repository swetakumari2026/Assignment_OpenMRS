package Hooks;

import LibraryFiles.DriverFactoryClass;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class MRS_Hooks
{
    //Hooks me pehle browser open hoga then step defination class me jakr one bt one steps run hoga

    @Before
    public void openBrowser() throws IOException {
        System.out.println("----open browser----");

       String browser= UtilityClass.getPFData("browserName");  //get browser name from property file
        DriverFactoryClass.initializeBrowser(browser);     //pass browser name to initializeBrowser() method to open browser

        //UtilityClass.getPFData("browserName") -> utility class me browser hai so usko call karenge by calling this method
    }

    @After
    public void closeBrowser()
    {
        System.out.println("----close browser----");
        DriverFactoryClass.driver.quit();
    }
}
