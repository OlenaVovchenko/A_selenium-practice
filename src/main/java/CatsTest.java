import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatsTest {
    ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.drever",
                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://suninjuly.github.io/cats.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    //    @Test
//    public void firstTest(){
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
//    }
    @Test
    public void headerTest() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        WebElement header = driver.findElement(By.tagName("h1"));
        assertEquals("Cat memes", header.getText());
    }

    @Test
    public void firstCardNametest() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        WebElement firstcardName = driver.findElement(By.cssSelector(".col-sm-4:nth-child(1) .card-text"));
        assertEquals("Bullet cat", firstcardName.getText());
    }

    @Test
    public void catsAlbumTextTest() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        WebElement catsAlbumText = driver.findElement(By.cssSelector("strong"));
        assertEquals("Cats album", catsAlbumText.getText());
    }

    //@Test
//public void checkContainsTextTest(){
//    System.setProperty("webdriver.chrome.drever",
//            "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    driver.get("http://suninjuly.github.io/cats.html");
//    WebElement checkContainsText = driver.findElement(By.id("moto"));
//    assertEquals("cat memes", checkContainsText.getText()); // ошибка так как часть текста
//}
//Check that subheader contains text "cat memes"
    @Test
    public void subHeaderTextTest() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        WebElement subHeader = driver.findElement(By.id("moto"));
        assertTrue(subHeader.getText().contains("cat memes"));
    }

    @Test
    public void firstCardsIsDisplayed() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        WebElement firstCard = driver.findElement(By.cssSelector(".col-sm-4:nth-child(1)"));
        assertTrue(firstCard.isDisplayed());
    }

    //    @Test
//    public void buttonEditThirdCardsIsDisplayed() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
//        WebElement buttonEditThirdCards = driver.findElement(By.cssSelector(".col-sm-4:nth-child(3) button:nth-child(2)"));
//        assertTrue(buttonEditThirdCards.isDisplayed());
//    }
    @Test
    public void buttonEditThirdCardsIsDisplayed() {
//    System.setProperty("webdriver.chrome.drever",
//            "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    driver.get("http://suninjuly.github.io/cats.html");
        WebElement buttonEditThirdCards = driver.findElement(By.xpath("//div[@class=\"col-sm-4\"][3]//button[2]"));
        assertTrue(buttonEditThirdCards.isDisplayed());
    }

    @Test
    public void buttonEditFifthCardsIsDisplayed() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        WebElement buttonEditThirdCards = driver.findElement(By.xpath("//div[@class=\"col-sm-4\"][5]//button[1]"));
        assertTrue(buttonEditThirdCards.isDisplayed());
    }

    @Test
    public void nameOfSixCardContainsTextTest() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        WebElement subHeader = driver.findElement(By.cssSelector(".col-sm-4:nth-child(6) p"));
        assertTrue(subHeader.getText().contains("I love you so much"));
    }

    //Check that there are 6 cards
    @Test
    public void checkCardQuantity() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        List<WebElement> cards = driver.findElements(By.className("col-sm-4"));
        assertEquals(6, cards.size());
    }

    //Check that there are 6 images on the page
    @Test
    public void checkImgQuantity() {
//        System.setProperty("webdriver.chrome.drever",
//                "D:\\Weiterbildung\\HomeWorks\\QA\\QALessonSilenium\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://suninjuly.github.io/cats.html");
        List<WebElement> cards = driver.findElements(By.className("card-img-top"));
        assertEquals(6, cards.size());
    }

    @Test
    public void checkCardsAreDisplayed() {
        List<WebElement> cards = driver.findElements(By.className("col-sm-4"));
//        for (int i=0; i<cards.size(); i++){
//            assertTrue(cards.get(i).isDisplayed());
//        }
//        for (WebElement card: cards) {
//            assertTrue(card.isDisplayed());
//        }
        cards.forEach(card ->assertTrue(card.isDisplayed()));
    }
    //2. Все кнопки "View" и "Edit" отбражаются на странице
    @Test
    public void checkButtonAreDisplayed() {
        List<WebElement> buttons = driver.findElements(By.cssSelector("button"));
//        for (int i=0; i<cards.size(); i++){
//            assertTrue(cards.get(i).isDisplayed());
//        }
//        for (WebElement card: cards) {
//            assertTrue(card.isDisplayed());
//        }
        buttons.forEach(button ->assertTrue(button.isDisplayed()));
    }
    //1. Все картинки с котиками отображаются на странице
    @Test
    public void checkPictureCatsAreDisplayed() {
        List<WebElement> pictures = driver.findElements(By.tagName("img"));
//        for (int i=0; i<cards.size(); i++){
//            assertTrue(cards.get(i).isDisplayed());
//        }
//        for (WebElement card: cards) {
//            assertTrue(card.isDisplayed());
//        }
        pictures.forEach(picture ->assertTrue(picture.isDisplayed()));
    }
}