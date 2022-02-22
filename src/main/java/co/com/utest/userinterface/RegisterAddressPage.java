package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.*;

public class RegisterAddressPage {
    public static final Target CITY = the("Enter City").located(By.id("city"));
    public static final Target POSTAL_CODE = the("Enter PostalCode").located(By.id("zip"));
    public static final Target COUNTRY = the("Select Country").located(By.xpath("//div[@class='ui-select-match']/span/span[@class='ui-select-match-text pull-left']"));
    public static final Target ENTER_COUNTRY = the("Enter Country").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target NEXT_DEVICES = the("Enter NextDevice").located(By.xpath("//div[@class='pull-right next-step']/a/span"));
}
