package helpers.filereader;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static DealerConfigFileReader dealerConfigFileReader;

    private static WaitConfigFileReader waitConfigFileReader;

    private static GmailFileReader gmailFileReader;

    private static CN_Auth_Trusted_Device cn_Auth_Trusted_Device;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public DealerConfigFileReader getDealerConfigFileReader(String environment) {
        return (dealerConfigFileReader == null) ? new DealerConfigFileReader(environment) : dealerConfigFileReader;
    }

    public WaitConfigFileReader getWaitConfigFileReader() {
        return (waitConfigFileReader == null) ? new WaitConfigFileReader() : waitConfigFileReader;
    }

    public GmailFileReader getGmailFileReader() {
        return (gmailFileReader == null) ? new GmailFileReader() : gmailFileReader;
    }

    public CN_Auth_Trusted_Device get_CN_Auth_Trusted_Device(String env) {
        return (cn_Auth_Trusted_Device == null) ? new CN_Auth_Trusted_Device(env) : cn_Auth_Trusted_Device;
    }

}
