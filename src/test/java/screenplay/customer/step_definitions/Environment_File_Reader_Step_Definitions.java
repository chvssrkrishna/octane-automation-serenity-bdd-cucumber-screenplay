package screenplay.customer.step_definitions;

import helpers.filereader.FileReaderManager;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

public class Environment_File_Reader_Step_Definitions {

    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    public String getEnvironment() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("environment");
    }

    public String getAgentUserName(String dealer, String agent) {
        return FileReaderManager.getInstance().getDealerConfigFileReader(getEnvironment()).getAgentUserName(dealer, agent);
    }

    public String getAgentPassword(String dealer, String agent) {
        return FileReaderManager.getInstance().getDealerConfigFileReader(getEnvironment()).getAgentPassword(dealer, agent);
    }

    public String getDealerID(String dealer) {
        return FileReaderManager.getInstance().getDealerConfigFileReader(getEnvironment()).getDealerID(dealer);
    }

    public String getDealerName(String dealer) {
        return FileReaderManager.getInstance().getDealerConfigFileReader(getEnvironment()).getDealerName(dealer);
    }

    public String getCustomerUrl(String dealer){
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("customer.page").replace("{dealer}",getDealerID(dealer));
    }

    public String getAgentUrl(String dealer){
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("agent.page");
    }

    public String getAdminUrl(String dealer){
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("admin.page");
    }

}
