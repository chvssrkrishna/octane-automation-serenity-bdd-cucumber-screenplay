package helpers.filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ResourceHelper {

    public static String getResourcePath(String resource) {
        return getBaseResourcePath() + resource;
    }

    public static String getAbsolutePath(String resource) {
        File f = new File(getBaseResourcePath() + resource);
        return f.getAbsolutePath();
    }

    public static String getBaseResourcePath() {
        return System.getProperty("user.dir");
    }

    public static InputStream getResourcePathInputStream(String path) throws FileNotFoundException{
        return new FileInputStream(ResourceHelper.getResourcePath(path));
    }

    public static OutputStream getResourcePathOutputStream(String path) throws FileNotFoundException{
        return new FileOutputStream(ResourceHelper.getResourcePath(path));
    }


    /*
     * public static void main(String[] args) throws FileNotFoundException {
     * System.out.println(ResourceHelper.getResourcePathInputStream(
     * "/src/main/resources/configfile/config.properties")); }
     */

}
