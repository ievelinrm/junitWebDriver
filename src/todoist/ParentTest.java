package todoist;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ParentTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    public final int SHORT_WAIT = 5;
    public final int MEDIUM_WAIT = 10;
    public final int LONG_WAIT = 15;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, LONG_WAIT);
        driver.manage().timeouts().implicitlyWait(SHORT_WAIT, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    public void navegarUrl(String url) {
        driver.get(url);
    }

    public void validarLandingPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[mask*='logo-wordmark']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Iniciar sesión")));
        System.out.println("We're in Landing page");
    }

    public void login(String user, String password) {
        WebElement loginLink = driver.findElement(By.linkText("Iniciar sesión"));
        loginLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        System.out.println("We're in Login page");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(user);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector(".submit_btn"));
        loginButton.click();
    }

    public void validarHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".left_control > button:last-of-type")));
        System.out.println("We're in Homepage");
    }

    public void crearProyecto(String nombreProyecto, String color) {
        WebElement addProjectIcon = driver.findElement(By.cssSelector("[data-track='navigation|projects_quick_add']"));
        addProjectIcon.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit_project_modal_field_name")));
        System.out.println("We're on Add Project pop up");
        WebElement projectNameField = driver.findElement(By.id("edit_project_modal_field_name"));
        projectNameField.sendKeys(nombreProyecto);
    }

    public void validarProyecto(String nombreProyecto, String color) {
    }
}