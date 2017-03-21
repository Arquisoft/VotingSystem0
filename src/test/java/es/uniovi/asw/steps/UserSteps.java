package es.uniovi.asw.steps;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

/**
 * Created by Labra on 21/03/2017.
 */
public class UserSteps {
    @Dado("^que no hay usuarios$")
    public void que_no_hay_usuarios() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("No hay usuarios");
    }

    @Cuando("^creo un usuario \"([^\"]*)\" con password \"([^\"]*)\"$")
    public void creo_un_usuario_con_password(String nombre, String password) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        System.out.println("Creando usuario " + nombre + " con password " + password);
}

@Entonces("^el número de usuarios es (\\d+)$")
public void el_numero_de_usuarios_es(int n) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    System.out.println("Probando que el número es " + n);
}

}
