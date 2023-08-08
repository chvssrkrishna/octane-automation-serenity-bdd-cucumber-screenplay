package screenplay.customer.chat_window_your_info.tasks;

import helpers.constants.WaitConstants;
import screenplay.wait.tasks.WaitForElement;
import model.CustomerContactInfo;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.customer.chat_window.Chat_Window_Page;
import screenplay.customer.chat_window_your_info.Your_Info_Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Submit {

    public static Task contactInfo(CustomerContactInfo customerInfo) {
        return Task.where(
                "{0} submit contact info",
                Click.on(Chat_Window_Page.YOUR_INFO_BUTTON),
                WaitForElement.visibility(Your_Info_Page.SUBMIT, WaitConstants.getExplicitWait()),
                Enter.theValue(customerInfo.getFirstName()).into(Your_Info_Page.FIRST_NAME),
                Enter.theValue(customerInfo.getLastName()).into(Your_Info_Page.LAST_NAME),
                Enter.theValue(customerInfo.getPhone()).into(Your_Info_Page.PHONE),
                Enter.theValue(customerInfo.getEmail()).into(Your_Info_Page.EMAIL),
                Click.on(Your_Info_Page.SUBMIT),
                WaitUntil.the(Your_Info_Page.SUBMIT, isNotVisible()).forNoMoreThan(10).seconds()
        );

    }

}
