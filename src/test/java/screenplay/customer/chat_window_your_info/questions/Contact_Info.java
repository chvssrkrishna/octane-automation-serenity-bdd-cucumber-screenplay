package screenplay.customer.chat_window_your_info.questions;

import model.CustomerContactInfo;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static screenplay.customer.chat_window_your_info.Your_Info_Page.*;

@Subject("the displayed username")
public class Contact_Info {
    public static Question<CustomerContactInfo> of_Customer() {

        return actor -> new CustomerContactInfo(FIRST_NAME.resolveFor(actor).getValue(),LAST_NAME.resolveFor(actor).getValue(),PHONE.resolveFor(actor).getValue(),EMAIL.resolveFor(actor).getValue(), null);
    }
}
