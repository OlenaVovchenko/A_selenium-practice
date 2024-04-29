import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Registration {
    ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.drever",
                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://suninjuly.github.io/registration1.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void successRegistrationWithRequiredFields() throws InterruptedException {
        WebElement firstNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your first name']"));
                firstNameInputField.sendKeys("John");
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your last name']"));
        lastNameInputField.sendKeys("Black");
        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
        emailInputField.sendKeys("jblack@gmail.com");
        WebElement submitButton = driver.findElement(By.className("btn-default"));
        submitButton.click();
//        sleep(5000);
        WebElement header = driver.findElement(By.tagName("h1"));
        assertEquals("Congratulations! You have successfully registered!", header.getText());
    }

    @Test
    public void successRegistrationWithAllFields() throws InterruptedException {
        WebElement firstNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your first name']"));
        firstNameInputField.sendKeys("John");
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your last name']"));
        lastNameInputField.sendKeys("Black");
        WebElement phoneInputField = driver.findElement(By.xpath("//input[@placeholder='Input your phone:']"));
        phoneInputField.sendKeys("0187667899");
        WebElement addressInputField = driver.findElement(By.xpath("//input[@placeholder='Input your address:']"));
        addressInputField.sendKeys("Dortmund str 44");
        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
        emailInputField.sendKeys("jblack@gmail.com");
        WebElement submitButton = driver.findElement(By.className("btn-default"));
        submitButton.click();
//        sleep(5000);
        WebElement header = driver.findElement(By.tagName("h1"));
        assertEquals("Congratulations! You have successfully registered!", header.getText());
    }
    @Test
    public void withoutFirstName(){
               WebElement lastNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your last name']"));
        lastNameInputField.sendKeys("Black");
        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
        emailInputField.sendKeys("jblack@gmail.com");
        WebElement submitButton = driver.findElement(By.className("btn-default"));
        submitButton.click();
     //CHeck that error message is "Заполните это поле."
        WebElement firstNameInputField =
                driver.findElement(By.xpath("//input[@placeholder='Input your first name']"));
        assertEquals("Заполните это поле.",
                firstNameInputField.getAttribute("validationMessage"));
    }
    //Для формы регистрации https://suninjuly.github.io/registration1.html
    //Написать автотест на проверку отображения текста ошибки в случае НЕзаполнения полей last name и email.
    @Test
    public void withoutLastName(){
        WebElement firstNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your first name']"));
        firstNameInputField.sendKeys("John");
//        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your last name']"));
//        lastNameInputField.sendKeys("Black");
        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
        emailInputField.sendKeys("jblack@gmail.com");
        WebElement submitButton = driver.findElement(By.className("btn-default"));
        submitButton.click();
        //CHeck that error message is "Заполните это поле."
        WebElement lastNameInputField =
                driver.findElement(By.xpath("//input[@placeholder='Input your last name']"));
        assertEquals("Заполните это поле.",
                lastNameInputField.getAttribute("validationMessage"));
    }

    @Test
    public void withoutEmail(){
        WebElement firstNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your first name']"));
        firstNameInputField.sendKeys("John");
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@placeholder='Input your last name']"));
        lastNameInputField.sendKeys("Black");
//        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
//        emailInputField.sendKeys("jblack@gmail.com");
        WebElement submitButton = driver.findElement(By.className("btn-default"));
        submitButton.click();
        //CHeck that error message is "Заполните это поле."
        WebElement emailInputField =
                driver.findElement(By.xpath("//input[@placeholder='Input your email']"));
        assertEquals("Заполните это поле.",
                emailInputField.getAttribute("validationMessage"));
    }
}
