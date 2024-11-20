package steps_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigurationFields {

    WebDriver driver;
    @Given("user login to application")
    public void user_login_to_application() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();


    }
    @When("click on PIM link")
    public void click_on_pim_link() throws InterruptedException {
        Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()='PIM']")).click();
    }
    @When("user click on configuration drop down")
    public void user_click_on_configuration_drop_down() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Configuration ']")).click();
    }
    @When("user select custom fields")
    public void user_select_custom_fields() {
        driver.findElement(By.xpath("//a[text()='Custom Fields']")).click();
    }
    @When("user click on add button")
    public void user_click_on_add_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();

    }
    @When("user enter field name {string}")
    public void user_enter_field_name(String fieldsName) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']"))
                .sendKeys(fieldsName);
    }
    @When("user select screen {string}")
    public void user_select_screen(String string) throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[1]//div[text()='-- Select --']")));
        driver.findElement(By.xpath("//form/div[1]//div[text()='-- Select --']")).click();
        driver.findElement(By.xpath("//span[text()='Personal Details']")).click();
    }
    @When("user select type {string}")
    public void user_select_type(String string) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form/div[2]//div[text()='-- Select --']")).click();
        driver.findElement(By.xpath("//div[text()='Text or Number']")).click();
    }

    @When("user click on save")
    public void user_click_on_save() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("field will be added to the list")
    public void field_will_be_added_to_the_list() {

    }

}
