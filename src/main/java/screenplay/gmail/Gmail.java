package screenplay.gmail;

import helpers.filereader.FileReaderManager;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;

import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import java.util.Properties;

public class Gmail implements Ability {

    private Store loginAs(String Crm) {
        Properties properties = new Properties();
        properties.put("mail.imaps.host", FileReaderManager.getInstance().getGmailFileReader().getHost(Crm));
        properties.put("mail.imaps.port", FileReaderManager.getInstance().getGmailFileReader().getPort(Crm));
        properties.setProperty("mail.imaps.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.imaps.socketFactory.fallback", "false");
        properties.setProperty("mail.imaps.socketFactory.port",String.valueOf(FileReaderManager.getInstance().getGmailFileReader().getPort(Crm)));

        Session session = Session.getDefaultInstance(properties);
        try {
            Store store = session.getStore("imaps");
            store.connect(FileReaderManager.getInstance().getGmailFileReader().getUsername(Crm), FileReaderManager.getInstance().getGmailFileReader().getPassword(Crm));
            return store;
        }catch (NoSuchProviderException ex) {
            System.out.println("No provider.");
            ex.printStackTrace();
            return null;
        } catch (MessagingException ex) {
            System.out.println("Could not connect to the message store.");
            ex.printStackTrace();
            return null;
        }

    }



}
