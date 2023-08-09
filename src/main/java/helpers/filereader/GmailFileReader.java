package helpers.filereader;

import java.util.Properties;
public class GmailFileReader {

    private Properties prop=null;

    public GmailFileReader(){
        prop=new Properties();
        try{
            prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resources/gmail.properties"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getHost(String Crm) {
        return prop.getProperty(Crm+".host");
    }

    public String getPort(String Crm) {
        return prop.getProperty(Crm+".port");
    }

    public String getUsername(String Crm) {
        return prop.getProperty(Crm+".username");
    }

    public String getPassword(String Crm) {
        return prop.getProperty(Crm+".password");
    }
}
