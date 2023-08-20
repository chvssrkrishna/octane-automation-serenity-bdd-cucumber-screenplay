package screenplay.customer.home.tasks;

import helpers.constants.WaitConstants;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import screenplay.customer.chat_window.Chat_Window_Page;
import screenplay.customer.home.Home_Page;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Open {

    public static Task chat_window_via_IconButton(String button) {
        return Task.where(
                "{0} open Chat Window via Icon Button " + button,
                Click.on(Home_Page.ICON_BUTTON.of(button)),
                WaitUntil.the(Home_Page.CHATPANEL_IFRAME, isVisible()).forNoMoreThan(WaitConstants.getExplicitWait()).seconds(),
                Switch.toFrame(Home_Page.CHATPANEL_IFRAME_NAME)
        );

    }

    public static Task chat_window_via_IconButton_Default_Department(String button) {

        return Task.where(
                "{0} open Chat Window via Icon Button " + button,
                Open.chat_window_via_IconButton(button),
                Check.whether(Presence.of(Chat_Window_Page.DEPARTMENT_SELECTOR_FORM.waitingForNoMoreThan(Duration.ofSeconds(WaitConstants.getExplicitWait())))).andIfSo(Click.on(Chat_Window_Page.DEFAULT_DEPARTMENT_SELECTOR)),
                WaitUntil.the(Chat_Window_Page.CHATPANEL_ENTER_YOUR_MESSAGE, isVisible()).forNoMoreThan(WaitConstants.getExplicitWait()).seconds()
        );

    }

    public static Task chat_window_via_IconButton_and_DepartmentSelector(String button,String department) {
        return Task.where(
                "{0} open Chat Window via Icon Button " + button+" and department "+department,
                Open.chat_window_via_IconButton(button),
                Check.whether(Presence.of(Chat_Window_Page.DEPARTMENT_SELECTOR.of(department).waitingForNoMoreThan(Duration.ofSeconds(WaitConstants.getExplicitWait())))).andIfSo(Click.on(Chat_Window_Page.DEPARTMENT_SELECTOR.of(department)))

        );

    }


}
