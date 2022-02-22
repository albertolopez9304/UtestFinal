package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.*;

public class PageBasicData {
    public static final Target FIRST_NAME = the("Enter firstname").located(By.id("firstName"));
    public static final Target LAST_NAME = the("Enter lastname").located(By.id("lastName"));
    public static final Target EMAIL = the("Enter email").located(By.id("email"));
    public static final Target MONTH = the("select Month").located(By.id("birthMonth"));
    public static final Target DAY = the("select day").located(By.id("birthDay"));
    public static final Target YEAR = the("select year").located(By.id("birthYear"));
    public static final Target NEXT_LOCATION = the("Click next location")
                        .located(By.xpath("//a[@class='btn btn-blue']/span"));
}
