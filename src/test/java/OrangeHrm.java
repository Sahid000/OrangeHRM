import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class OrangeHrm {

    public static WebDriver driver;
    static String BaseURL = "https://opensource-demo.orangehrmlive.com/";
    static JavascriptExecutor js;

    @BeforeTest
    public static void Websetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",  "G:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;
    }

    @Test(priority = 1)
    public static void Login() throws InterruptedException {
        //Login
        driver.findElement(By.xpath("//input[@id='txtUsername']")).click();
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(2000);
        //Password
        driver.findElement(By.xpath("//input[@id='txtPassword']")).click();
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        Thread.sleep(2000);
        //Login_Button
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(8000);

    }

    @Test (priority = 2)
    public static void Admin() throws InterruptedException{
        //Admin
        driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
        Thread.sleep(3000);
        //UserName
        driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).click();
        driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("Admin");
        Thread.sleep(2000);
        //Search
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
        Thread.sleep(2000);
        //Reset
        driver.findElement(By.xpath("//input[@id='resetBtn']")).click();
        Thread.sleep(3000);
        //User Role
        driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']")).click();
        driver.findElement((By.xpath("//select[@id='searchSystemUser_userType']"))).click();
        Thread.sleep(2000);
        //Search
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
        Thread.sleep(2000);
        //Reset
        driver.findElement(By.xpath("//input[@id='resetBtn']")).click();
        Thread.sleep(3000);
        //EmployeeName
        driver.findElement(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")).click();
        driver.findElement(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")).sendKeys("Navdeep");
        Thread.sleep(3000);
        //Search
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
        Thread.sleep(2000);
        //Reset
        driver.findElement(By.xpath("//input[@id='resetBtn']")).click();
        Thread.sleep(3000);
        //Status
        driver.findElement(By.xpath("//select[@id='searchSystemUser_status']")).click();
        driver.findElement((By.xpath("//select[@id='searchSystemUser_status']"))).click();
        Thread.sleep(2000);
        //Search
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
        Thread.sleep(2000);
        //Reset
        driver.findElement(By.xpath("//input[@id='resetBtn']")).click();
        Thread.sleep(3000);
        //HideOptions
        driver.findElement(By.xpath("//a[contains(text(),'>')]")).click();
        Thread.sleep(3000);
        //AddUser
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        Thread.sleep(3000);
        //UserName
        driver.findElement(By.xpath("//select[@id='systemUser_userType']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).click();
        driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Shahid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='systemUser_userName']")).click();
        driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("Shahid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='systemUser_password']")).click();
        driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Admin123@");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).click();
        driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Admin123@");
        Thread.sleep(2000);
        //Save
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        Thread.sleep(2000);
        //Cancel
        driver.findElement(By.xpath("//input[@id='btnCancel']")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 10)
    public static void Log_out() throws InterruptedException, AWTException {
        //LogOut
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("//a[contains(text(),'Logout')]"))).click();
        Thread.sleep(5000);
    }

    @AfterTest
    public static void Test_Closure() {
        driver.quit();
    }

}
