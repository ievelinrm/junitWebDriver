package todoist;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TodoistTests extends ParentTest{
    @Test
    @FileParameters("./data/params.csv")
    public void testCreateProject(){
        navegarUrl("https://todoist.com");
        validarLandingPage();
        login("jomarnavarro@gmail.com", "Test@1234" );
        validarHomePage();
        crearProyecto("proyectoXXXXL01", "Teal");
        validarProyecto("proyectoXXXXL01", "Charcoal");
    }

}
