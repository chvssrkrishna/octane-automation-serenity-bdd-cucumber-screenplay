package screenplay.navigation.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theCustomerHomePage(String url) {
        return Task.where("{0} opens the Customer home page",
                Open.url(url));
    }

    public static Performable theAgentLoginPage(String url) {
        return Task.where("{0} opens the Agent login page",
                Open.url(url));
    }

    public static Performable theAdminLogInPage(String url) {
        return Task.where("{0} opens the Admin login page",
                Open.url(url));
    }

}
