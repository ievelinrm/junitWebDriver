import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleTestTodoist {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void main(String[] args) {
        navegarUrl("https://todoist.com");
        validarLandingPage();
        login("jomarnavarro@gmail.com", "Test@1234");
        validarHomePage();
        crearProyecto("proyectoXXXXL", "Teal");
        validarProyecto("prouectoXXXXL", "Teal");
    }

    private static void navegarUrl(String url) {
    }

    private static void validarLandingPage() {
    }

    private static void login(String user, String password) {
    }

    private static void validarHomePage() {
    }

    private static void crearProyecto(String nombreProyecto, String color) {
    }

    private static void validarProyecto(String nombreProyecto, String color) {
    }
}