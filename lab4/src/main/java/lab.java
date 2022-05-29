import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab {
    @Test
    public void testcase1() {
        System.setProperty("webdriver.chrome.driver", "\"D:\\chromedriver_win32\\chromedriver.exe\"");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement jobTitleInput = driver.findElement(By.id("jobtitle"));
        firstNameInput.sendKeys("Ibrahim");
        lastNameInput.sendKeys("Amr");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("First-name")).click();
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void testcase2() {
        System.setProperty("webdriver.chrome.driver", "\"D:\\chromedriver_win32\\chromedriver.exe\"");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement jobTitleInput = driver.findElement(By.id("jobtitle"));
        lastNameInput.sendKeys("Amr");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void testcase3() {
        System.setProperty("webdriver.chrome.driver", "\"D:\\chromedriver_win32\\chromedriver.exe\"");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement jobTitleInput = driver.findElement(By.id("jobtitle"));
        firstNameInput.sendKeys("Ibrahim");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void testcase4() {
        System.setProperty("webdriver.chrome.driver", "\"D:\\chromedriver_win32\\chromedriver.exe\"");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement jobTitleInput = driver.findElement(By.id("jobtitle"));
        firstNameInput.sendKeys("Ibrahim");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void testcase5() {
        System.setProperty("webdriver.chrome.driver", "\"D:\\chromedriver_win32\\chromedriver.exe\"");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement jobTitleInput = driver.findElement(By.id("jobtitle"));
        firstNameInput.sendKeys("Ibrahim");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
    }
}
