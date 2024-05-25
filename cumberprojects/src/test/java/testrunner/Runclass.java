package testrunner;

import org.testng.annotations.Test;

@io.cucumber.junit.CucumberOptions(
    features = "cumfolder",
    glue = {"stepsdefinition", "hooks"},
    dryRun = false,
    monochrome = true,
    plugin = {"html:report/adilreports.html", "json:reports/adilreports.json"},
    tags = "@backgrounds"
)
public class Runclass  { 

    @Test
    public void runCucumber() {
        // This method can be empty; TestNG will execute the Cucumber tests.
    }
}
