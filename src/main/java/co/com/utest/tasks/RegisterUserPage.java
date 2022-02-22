package co.com.utest.tasks;

import co.com.utest.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.utest.userinterface.PageBasicData.*;
import static co.com.utest.userinterface.UtestPage.*;
import static net.serenitybdd.screenplay.actions.Click.*;
import static net.serenitybdd.screenplay.actions.Enter.*;
import static net.serenitybdd.screenplay.actions.SelectFromOptions.*;


public class RegisterUserPage implements Task {

    private final UserData userData;

    public RegisterUserPage(UserData userData) {
        this.userData = userData;
    }

    public static RegisterUserPage withData(UserData userData) {
        return Tasks.instrumented(RegisterUserPage.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(JOIN_TODAY),
                theValue(userData.getFirtsName()).into(FIRST_NAME),
                theValue(userData.getLastName()).into(LAST_NAME),
                theValue(userData.getEmail()).into(EMAIL),
                byVisibleText(userData.getMonth()).from(MONTH),
                byVisibleText(userData.getDay()).from(DAY),
                byVisibleText(userData.getYear()).from(YEAR),
                on(NEXT_LOCATION)
        );
    }
}
