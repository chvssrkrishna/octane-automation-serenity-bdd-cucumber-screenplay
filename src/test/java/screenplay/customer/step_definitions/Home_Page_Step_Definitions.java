package screenplay.customer.step_definitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import screenplay.ability.Deliver;
import screenplay.customer.home.tasks.Open;

public class Home_Page_Step_Definitions extends Environment_File_Reader_Step_Definitions {

    @When("{actor} open chat panel from {string} Icon Button")
    public void openChatPanel(Actor actor,String button) {
        actor.whoCan(Deliver.some("coffe"));
        actor.abilityTo(Deliver.class).deliverItem();
        actor.attemptsTo(Open.chat_window_via_IconButton_Default_Department(button));
    }



}
