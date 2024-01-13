package digital.quipux.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

import static digital.quipux.com.userinterfaces.LoginPage.*;

public class Registrarse implements Task {

    private WebDriver webDriver;
    public Registrarse( WebDriver driver) {
        webDriver = driver;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_INICIAR_SESION));
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
