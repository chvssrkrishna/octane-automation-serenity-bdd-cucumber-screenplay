package screenplay.webdriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Cookie;

public class AddCookie implements Performable {
    private String cookieName;
    private String cookieValue;

    public AddCookie() {}

    public AddCookie(String cookieName,String cookieValue) {
        this.cookieName = cookieName;
        this.cookieValue = cookieValue;
    }

    @Override
    @Step("{0} adds cookie to web driver")
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().addCookie(new Cookie(cookieName, cookieValue));
    }

    public static AddCookie toBrowser(String cookieName,String cookieValue) {
        return new AddCookie(cookieName, cookieValue);
    }
}
