package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SeccionVuelos extends PageObject {
    public static final Target PRECIO =  Target.the("PRECIO").locatedBy("(//*[@class=\"from-price\"])");

}
