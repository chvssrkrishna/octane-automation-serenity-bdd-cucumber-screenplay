package helpers.filereader;

import java.util.Properties;

public class WaitConfigFileReader {

    private Properties prop = null;

    public WaitConfigFileReader() {
        prop = new Properties();
        try {
            prop.load(ResourceHelper.getResourcePathInputStream("/src/test/resources/wait.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long getExplicitWait() {
        return Long.valueOf(prop.getProperty("ExplicitWait"));
    }

}
