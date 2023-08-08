package screenplay.customer.chat_window_connect_on_mobile;

import net.serenitybdd.screenplay.targets.Target;

public class Connect_on_Mobile_Page {

    //Connect On Mobile Page Objects
    public static Target MOBILE = Target.the("Connect On Mobile Mobile").locatedBy("input[name='firstName']");
    public static Target EMAIL = Target.the("Connect On Mobile Email").locatedBy("input[name='lastName']");
    public static Target SUBMIT = Target.the("Connect On Mobile Submit").locatedBy("input[name='phone']");
    public static Target CANCEL = Target.the("Connect On Mobile Cancel").locatedBy("input[name='email']");
    public static Target DISCLAIMER = Target.the("Connect On Mobile Disclaimer").locatedBy("[data-testid='mn-container_send-to-mobile-form_disclaimer']");

}
