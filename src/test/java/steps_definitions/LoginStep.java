package steps_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStep {
    WebDriver driver;
    @Given("user open application")
    public void user_open_application() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("user enter valid username")
    public void user_enter_valid_username() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
    }
    @When("user enter valid password")
    public void user_enter_valid_password() {
        driver.findElement(By.name("password")).sendKeys("admin123");
    }
    @When("user click on login")
    public void user_click_on_login() {
        driver.findElement(By.xpath("//button")).click();
    }
    @Then("account page should be open")
    public void account_page_should_be_open() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
    @When("user enter invalid username {string}")
    public void user_enter_invalid_username(String username) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
    }
    @When("user enter invalid password {string}")
    public void user_enter_invalid_password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }
    @Then("invalid credentials msg pop up")
    public void invalid_credentials_msg_pop_up() throws InterruptedException {
        // if web element display test case pass
        // else test case failed
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Invalid credentials']"))));
        Thread.sleep(3000);
        boolean invalidMSG = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
        Assert.assertTrue(invalidMSG);
    }

}
