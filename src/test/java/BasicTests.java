import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTests {

    public static void main(String[] args) {
            myFirstTest();
    }


        public static void myFirstTest() {

            System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize(); //okno przeglądaerki na cały ekran
            driver.get("https://www.pracuj.pl/"); //przechodzi pod adres
            String title = driver.getTitle(); //pobiera tytuł strony
                if("Praca - Pracuj.pl".equals(title))
                {
                    System.out.println("TestPassed!");
                } else{
                    System.out.println("TestFailed!");
                }

            String url = driver.getCurrentUrl(); //zwraca aktualny adres

            driver.navigate().refresh(); //odświeża okno przeglądarki



            System.out.println(title);

            driver.quit();


        }


}
