package digital.quipux.com.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://digital.quipux.com/portal-movilidad/#/inicio-login")
public class LoginPage extends PageObject {

    public static final Target USUARIO = Target.the("Usuario").located(By.name("usuario"));
    public static final Target CONTRASENA = Target.the("contrasena").located(By.id("contrasena"));
    public static final Target BTN_REGRESAR = Target.the("boton regresar").located(By.xpath("//a[contains(text(), Regresar)]"));
    public static final Target BTN_INICIAR_SESION = Target.the("boton iniciar sesion").located(By.buttonText("Iniciar sesión"));
    public static final Target REGISTRARSE = Target.the("Registrarse").located(By.className("text-primary"));
}
