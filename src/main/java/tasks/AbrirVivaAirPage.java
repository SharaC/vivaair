package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirVivaAirPage implements Task {

    PageObject mainPage;  // para usar lo default url

    public AbrirVivaAirPage (PageObject mainPage){
        this.mainPage = mainPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(mainPage));
    }

    public static AbrirVivaAirPage on(PageObject mainPage){

        return instrumented(AbrirVivaAirPage.class, mainPage);
    }
}
