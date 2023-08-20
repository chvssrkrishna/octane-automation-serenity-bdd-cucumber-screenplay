package screenplay.ability;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Performable;

public class Deliver implements Ability {
    final String item;
    private int counter = 1;

    private Deliver(String item) {
        this.item = item;
    }

    public static Deliver some(String item) {
        return new Deliver(item);
    }

    public String deliverItem() {
        System.out.println(item + " #" + counter++);
        return item + " #" + counter++;
    }
}
