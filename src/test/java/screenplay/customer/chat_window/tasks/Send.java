package screenplay.customer.chat_window.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.customer.chat_window.Chat_Window_Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Send {

    public static Task message(String message) {
        return Task.where(
                "{0} customer sent message " + message,
                Enter.theValue(message).into(Chat_Window_Page.CHATPANEL_ENTER_YOUR_MESSAGE),
                Click.on(Chat_Window_Page.CHATPANEL_SEND_BUTTON),
                WaitUntil.the(Chat_Window_Page.CHATPANEL_SEND_BUTTON, isVisible()).forNoMoreThan(10).seconds()


        );

    }


}
