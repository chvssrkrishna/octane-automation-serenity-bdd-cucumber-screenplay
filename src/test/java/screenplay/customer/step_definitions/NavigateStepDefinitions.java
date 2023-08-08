package screenplay.customer.step_definitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import screenplay.navigation.tasks.NavigateTo;

public class NavigateStepDefinitions extends Environment_File_Reader_Step_Definitions {
    @Given("{actor} launch customer home page of dealer {string}")
    public void launchCustomerHomePage(Actor actor,String dealer) {
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(getCustomerUrl(dealer)));
    }

}