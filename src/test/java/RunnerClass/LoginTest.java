package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\SHASHI\\IdeaProjects\\Assignment_OpenMRS\\src\\test\\java\\Features\\RTEx_Login.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty", "html:Sweta/cucumber-reports/OpenMRSReports.html"}
)
public class LoginTest extends AbstractTestNGCucumberTests
{

}
