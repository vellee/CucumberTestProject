import app.WebdriverSetup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        glue = {"Steps"}
)

@RunWith(Cucumber.class)
public class TestRunner {
    @BeforeClass
    public static void setup() {
        WebdriverSetup.startWebDriver();
    }

    @AfterClass
    public static void tearDown() {
        WebdriverSetup.closeDriver();
    }

}
