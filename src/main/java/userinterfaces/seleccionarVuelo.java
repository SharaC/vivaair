package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class seleccionarVuelo extends PageObject {

    public static final Target SOLO_IDA = Target.the("SOLO_IDA").locatedBy("//*[text()='Solo ida']");
    public static final Target IDA = Target.the("IDA").located(By.id("criteria-airport-select-departure-input"));
    public static final Target DESTINO = Target.the("DESTINO").located(By.id("criteria-airport-select-destination-input"));
    public static final Target FECHA_IDA = Target.the("FECHA_IDA").locatedBy("//*[text()='31']");
    public static final Target FECHA_VUELTA = Target.the("FECHA_VUELTA").located(By.id("criteria-airport-select-departure-input"));
    public static final Target BUSCAR_VUELOS = Target.the("BUSCAR_VUELOS").located(By.id("criteria-search-button-desktop"));

    //public static final Target DEPARTURE = Target.the("Departure").located(By.id("criteria-airport-select-departure-input"));

    //*[@id="inp_user"]
}
