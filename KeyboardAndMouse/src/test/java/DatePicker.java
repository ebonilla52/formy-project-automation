import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();
        WebElement dateSelect = driver.findElement(By.cssSelector("td[data-date='1548288000000']"));
        dateSelect.click();

        //Another option is to type a specific day in the date field
        /*dateField.sendKeys("01/24/2019");
        dateField.sendKeys(Keys.RETURN);*/

        driver.quit();
    }
}
