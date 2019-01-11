import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        //WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        //autocompleteItem.click();

        WebElement enableDisableItem = driver.findElement(By.linkText("Enabled and disabled elements"));
        enableDisableItem.click();

        driver.quit();
    }
}
