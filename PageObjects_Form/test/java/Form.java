import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        ConfirmationPage confirmatioPage = new ConfirmationPage();

        formPage.submitForm(driver);
        confirmatioPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!",confirmatioPage.getAlertBannerText(driver));

        driver.quit();
    }
}
