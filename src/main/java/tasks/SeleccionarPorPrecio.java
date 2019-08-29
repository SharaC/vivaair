package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.SeccionVuelos;

public class SeleccionarPorPrecio implements Task {
    String[] precios = new String[6];
    String precioCasilla;

    public SeleccionarPorPrecio (){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {



           //System.out.println(Text.of(SeccionVuelos.PRECIO.get(1)).viewedBy(actor));



    }

    public static SeleccionarPorPrecio at(){

        return Tasks.instrumented(SeleccionarPorPrecio.class);
    }
}
