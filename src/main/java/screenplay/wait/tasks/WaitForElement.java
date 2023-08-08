package screenplay.wait.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class WaitForElement {
    public static Performable visibility(Target target , long explicitWait) {
        return Task.where("{0} wait till " + target.getName() + " visible",
                actor -> {
                    boolean isDisplayed = actor.asksFor(Visibility.of(target.waitingForNoMoreThan(Duration.ofSeconds(explicitWait))));
                }
        );
    }

}
