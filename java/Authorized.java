import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Authorized {

    private String loginVK;
    private String passVK;
    private WebDriver driver;
    private Contexts contexts;


    public Authorized(String login, String pass, WebDriver driver) {
        this.loginVK = login;
        this.passVK = pass;
        this.driver = driver;
        this.contexts = new Contexts();
    }

    public void auth () {
        try {
            WebElement login = driver.findElement(By.xpath(contexts.getLoginContext()));
            login.sendKeys(loginVK);

            WebElement toComeInOne = driver.findElement(By.xpath(contexts.getAuthButton_1()));
            toComeInOne.click();

            WebElement pass = new WebDriverWait(driver, Duration.ofSeconds(1000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(contexts.getPasswordContext())));
            pass.sendKeys(passVK);

            WebElement toComeInTwo = driver.findElement(By.xpath(contexts.getAuthButton_2()));
            toComeInTwo.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean authorizationСheck () {
       if(new WebDriverWait(driver, Duration.ofSeconds(1000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(contexts.getAuthValid()))).isDisplayed()) return true;
       return false;
    }

}
