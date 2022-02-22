package co.com.utest.tasks;

import co.com.utest.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.Keys;
import static co.com.utest.userinterface.RegisterDevicePage.*;
import static net.serenitybdd.screenplay.actions.Click.*;
import static net.serenitybdd.screenplay.actions.type.Type.*;


public class RegisterDevice implements Task {

    private final UserData userData;

    public RegisterDevice(UserData userData) {
        this.userData = userData;
    }

    public static RegisterDevice withData(UserData userData){
        return Tasks.instrumented(RegisterDevice.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(COMPUTER),
                theValue(userData.getComputer()).into(SELECT_COMPUTER).thenHit(Keys.ENTER),
                on(VERSION),
                theValue(userData.getVersion()).into(SELECT_VERSION).thenHit(Keys.ENTER),
                on(LANGUAGE),
                theValue(userData.getLanguage()).into(SELECT_LANGUAGE).thenHit(Keys.ENTER),
                on(MOBILE),
                theValue(userData.getMobile()).into(SELECT_MOBILE).thenHit(Keys.ENTER),
                on(MODEL),
                theValue(userData.getModelMobile()).into(SELECT_MODEL).thenHit(Keys.ENTER),
                on(SYSTEM),
                theValue(userData.getOperatingSystem()).into(SELECT_SYSTEM).thenHit(Keys.ENTER),
                on(LAST_STEP)
        );

    }
}
