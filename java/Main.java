import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\web\\chromedriver.exe"); // указываем путь, куда установили наш селениум driver
        WebDriverManager.chromedriver().setup(); // настройка под актуальную версию
        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com"); // страница которую откроет драйвер И СДЕЛАЕТ её мейн страницой. Для работы на других страницах используйте switchTo();


        Authorized authorized = new Authorized("Login", "Pass", driver); // Создаём экземпляр класса, передаём в него параметры для авторизации логин, пароль, двайвер
        authorized.auth(); // Метод авторизации
        System.out.println(authorized.authorizationСheck()); // Проверяем авторизацию на успех

    }
}
