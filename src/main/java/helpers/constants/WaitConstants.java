package helpers.constants;

import helpers.filereader.FileReaderManager;

public class WaitConstants {
    static final  Long  ExplicitWait = FileReaderManager.getInstance().getWaitConfigFileReader().getExplicitWait();

    public static Long getExplicitWait() {
        return ExplicitWait;
    }
}
