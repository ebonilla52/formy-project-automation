import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

    public static void main(String[] args)
    {
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\vmuser\\IdeaProjects\\Maven_Test1\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vmuser\\IdeaProjects\\Maven_Test1\\chromedriver\\chromedriver.exe");
        //WebDriver obj = new FirefoxDriver();
        WebDriver obj = new ChromeDriver();
        //obj.get("https://www.google.com/");

        obj.get("https://www.seleniumhq.org/download/");

        //obj.quit();
    }
}
