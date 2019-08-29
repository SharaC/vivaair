package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterfaces.seleccionarVuelo;

public class SeleccionarCaracteristicas implements Task {

    String ida;
    String destino;

    public SeleccionarCaracteristicas (String ida, String destino){
        this.ida = ida;
        this.destino = destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(seleccionarVuelo.SOLO_IDA));
        actor.attemptsTo(Enter.theValue(ida).into(seleccionarVuelo.IDA).thenHit(Keys.TAB));
        actor.attemptsTo(Enter.theValue(destino).into(seleccionarVuelo.DESTINO).thenHit(Keys.TAB));
        actor.attemptsTo(Click.on(seleccionarVuelo.FECHA_IDA));
        actor.attemptsTo(Click.on(seleccionarVuelo.BUSCAR_VUELOS));
        //String textoPrueba = SeccionVuelos.PRECIO.resolveFor(actor).getText();
        //System.out.println(textoPrueba);
    }

    public static SeleccionarCaracteristicas at(String ida, String destino){

        return Tasks.instrumented(SeleccionarCaracteristicas.class, ida, destino);
    }
}
