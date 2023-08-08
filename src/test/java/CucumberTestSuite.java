import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@CucumberOptions(tags = "@launch2",dryRun=false)
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@launch")
public class CucumberTestSuite {}