package screenplay.agent.login.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.agent.login.Login_Page;

public class Login {

    public static Task asAdminUser(String user_name, String password) {

        return Task.where(
                "{0} sign in as admin with username " + user_name,
                Enter.theValue(user_name).into(Login_Page.USER_NAME),
                Enter.theValue(password).into(Login_Page.USER_PASSWORD),
                Click.on(Login_Page.SIGN_IN)

        );
    }

}
