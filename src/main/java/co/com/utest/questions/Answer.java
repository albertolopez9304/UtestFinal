package co.com.utest.questions;

import co.com.utest.userinterface.CreatePasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.Text.*;

public class Answer implements Question<Boolean> {

    private String message;

    public Answer(String message) {
        this.message = message;
    }

    public static Answer toThe(String message) {
        return new Answer(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String messageCapture = of(CreatePasswordPage.WELCOME).viewedBy(actor).asString();
        if (message.equals(messageCapture)){
            return true;
        }else {
            return false;
        }
    }
}
