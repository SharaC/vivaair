package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.SeccionVuelos;

public class LowCost implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(Text.of(SeccionVuelos.PRECIO).toString().equals("Comparacion")) {
            return true;
        }else {
            return false;
        }

    }

    public static LowCost on(){
        return new LowCost();
    }


}
