package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.*;

@DefaultUrl("https://www.utest.com/")

public class UtestPage extends PageObject {

    public static final Target JOIN_TODAY = the("Click join today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
