package screenplay.customer.chat_window_your_info;

import net.serenitybdd.screenplay.targets.Target;

public class Your_Info_Page {

    //Customer Your Info Page Objects
    public static Target FIRST_NAME = Target.the("Customer First Name").locatedBy("css:input[name='firstName']");
    public static Target LAST_NAME = Target.the("Customer Last Name").locatedBy("css:input[name='lastName']");
    public static Target PHONE = Target.the("Customer Phone Number").locatedBy("css:input[name='phone']");
    public static Target EMAIL = Target.the("Customer Email").locatedBy("css:input[name='email']");
    public static Target SUBMIT = Target.the("Customer Contact Submit Button").locatedBy("css:div[data-testid='mn-slideout_customer_info_form'] form button");
    public static Target DISCLAIMER = Target.the("Customer Contact Info Disclaimer").locatedBy("css:div[data-testid='mn-slideout_customer_info_form-disclaimer']");


}
