package todoist;

import org.junit.Test;

public class TodoistTests extends ParentTest{
    @Test
    public void testCreateProject(){
        navegarUrl("https://todoist.com");
        validarLandingPage();
        login("jomarnavarro@gmail.com", "Test@1234");
        validarHomePage();
        crearProyecto("proyectoXXXXL", "Teal");
        validarProyecto("prouectoXXXXL", "Teal");
    }

}
