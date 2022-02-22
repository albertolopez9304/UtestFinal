package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.*;

public class CreatePasswordPage {
    public static final Target CREATEPASSWORD = the("Create_Password").located(By.id("password"));
    public static final Target CONFIRMPASSWORD = the("Confirm_Password").located(By.id("confirmPassword"));
    public static final Target TERMS_OF_USE_UTEST = the("Termo_Of_Use").located(By.xpath("//label[@class='input-check-box signup-consent']/span[@class='checkmark signup-consent__checkbox error' and @ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target TERMS_OF_PRIVACY = the("Termo_Of_Privacy").located(By.xpath("//label[@class='input-check-box signup-consent']/span[@class='checkmark signup-consent__checkbox error' and @ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target COMPLETE_SETUP = the("Complete_Setup").located(By.id("laddaBtn"));
    public static final Target WELCOME = the("Complete_Setup").located(By.xpath("//div[@class='image-box-header']/h1"));
}
