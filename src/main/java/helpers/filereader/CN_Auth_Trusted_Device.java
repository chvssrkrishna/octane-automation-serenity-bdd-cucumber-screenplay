package helpers.filereader;

import java.io.File;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CN_Auth_Trusted_Device {

    private Properties prop=null;
    String filePath="/src/main/resources/";
    public CN_Auth_Trusted_Device(String env){
        filePath=filePath + env+"_agent_cn_session.properties";
        File file = new File(ResourceHelper.getAbsolutePath(filePath));
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prop=new Properties();

        try{
            prop.load(ResourceHelper.getResourcePathInputStream(filePath));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String get_cn_auth_trusted_device(String username) {
        if(prop.containsKey(username+"_cnauth_trusted_device"))
            return prop.getProperty(username+"_cnauth_trusted_device");
        return "";
    }

    public void set_cn_auth_trusted_device(String username,String _cn_session) throws FileNotFoundException, IOException {
        prop.setProperty(username+"_cnauth_trusted_device",_cn_session);
        prop.store(ResourceHelper.getResourcePathOutputStream(filePath), null);
    }

    public void delete_cn_auth_trusted_device(String username) throws FileNotFoundException, IOException {
        prop.remove(username+"_cnauth_trusted_device");
        prop.store(ResourceHelper.getResourcePathOutputStream(filePath), null);
    }

    public void delete_cn_auth_trusted_device() throws FileNotFoundException, IOException {
        prop.clear();
        prop.store(ResourceHelper.getResourcePathOutputStream(filePath), null);
    }

}
