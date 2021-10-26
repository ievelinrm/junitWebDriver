package todoist;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
//se agregó para jalar parametros de csv
import org.junit.runner.RunWith;
//se agregó para jalar parametros de csv
@RunWith(JUnitParamsRunner.class)
public class TodoistTestsWParams extends ParentTest{

    @Test
    //se agregó para jalar parametros de csv
    @FileParameters("./data/paramsTodoist.csv")
    //se agregarón variables en el void y en las funciones
    public void testCreateProject(String url, String user, String password, String nombreProyecto, String color){
        navegarUrl(url);
        validarLandingPage();
        login(user, password );
        validarHomePage();
        crearProyecto(nombreProyecto, color);
        validarProyecto(nombreProyecto, color);
    }
}
