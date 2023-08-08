package screenplay.customer.home.tasks;

import helpers.constants.WaitConstants;
import screenplay.wait.tasks.WaitForElement;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import screenplay.customer.chat_window.Chat_Window_Page;
import screenplay.customer.home.Home_Page;

import java.time.Duration;

public class Open {

    public static Task chat_window_via_IconButton(String button) {
        return Task.where(
                "{0} open Chat Window via Icon Button " + button,
                Click.on(Home_Page.ICON_BUTTON.of(button)),
                WaitForElement.visibility(Home_Page.CHATPANEL_IFRAME, WaitConstants.getExplicitWait()),
                Switch.toFrame(Home_Page.CHATPANEL_IFRAME_NAME)
        );

    }

    public static Task chat_window_via_IconButton_Default_Department(String button) {

        return Task.where(
                "{0} open Chat Window via Icon Button " + button,
                Open.chat_window_via_IconButton(button),
                Check.whether(Presence.of(Chat_Window_Page.DEPARTMENT_SELECTOR_FORM.waitingForNoMoreThan(Duration.ofSeconds(WaitConstants.getExplicitWait())))).andIfSo(Click.on(Chat_Window_Page.DEFAULT_DEPARTMENT_SELECTOR)),
                WaitForElement.visibility(Chat_Window_Page.CHATPANEL_ENTER_YOUR_MESSAGE, WaitConstants.getExplicitWait())
        );

    }

    public static Task chat_window_via_IconButton_and_DepartmentSelector(String button,String department) {
        return Task.where(
                "{0} open Chat Window via Icon Button " + button+" and department "+department,
                Open.chat_window_via_IconButton(button),
                Check.whether(Presence.of(Chat_Window_Page.DEPARTMENT_SELECTOR.of(department).waitingForNoMoreThan(Duration.ofSeconds(WaitConstants.getExplicitWait())))).andIfSo(Click.on(Chat_Window_Page.DEPARTMENT_SELECTOR.of(department))),
                WaitForElement.visibility(Chat_Window_Page.CHATPANEL_ENTER_YOUR_MESSAGE, WaitConstants.getExplicitWait())
        );

    }


}
