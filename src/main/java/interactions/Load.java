package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Load implements Interaction {
    public static Load theApplication() {
        return instrumented(Load.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        
    }
}
