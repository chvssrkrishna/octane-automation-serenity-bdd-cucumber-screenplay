package helpers.filereader;

import java.util.Properties;

public class DealerConfigFileReader {

    private Properties prop = null;

    public DealerConfigFileReader(String environment) {
        prop = new Properties();
        try {
            prop.load(ResourceHelper.getResourcePathInputStream("/src/test/resources/" + environment + ".properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getAgentUserName(String dealer, String agent) {
        return prop.getProperty(dealer + "." + agent + ".Username");
    }

    public String getAgentPassword(String dealer, String agent) {
        return prop.getProperty(dealer + "." + agent + ".Password");
    }

    public String getDealerID(String dealer) {
        return prop.getProperty(dealer + ".id");
    }

    public String getDealerName(String dealer) {
        return prop.getProperty(dealer + ".name");
    }


}
