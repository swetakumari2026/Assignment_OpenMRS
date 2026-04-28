package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{
    //used to get test data from property file
    //need to provide keyName as a input & return
    public static String getPFData(String key) throws IOException

    {
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");

        //System.getProperty("user.der") ->will get project location

        Properties p=new Properties();         //to open property file,there is properties inbuilt class
        p.load(file);                          //to open file
       String value= p.getProperty(key);       //to get value of key

        return value;
    }
}
