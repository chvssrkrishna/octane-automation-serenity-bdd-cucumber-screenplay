package helpers.filereader;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static DealerConfigFileReader dealerConfigFileReader;

    private static WaitConfigFileReader waitConfigFileReader;

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

}
