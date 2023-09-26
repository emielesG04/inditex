package java.co.inditex.wikipedia.tasks;


import java.co.inditex.wikipedia.interation.WaitInteration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static java.co.inditex.wikipedia.userinterfaces.Home.*;

public class EnterText implements Task {

   private String dataText;
    public EnterText(String dataText) {

        this.dataText = dataText;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TEXT_SEARCH),
                Enter.theValue(dataText).into(TEXT_SEARCH),
                Click.on(BUTTON_SEARCH)
        );
        WaitInteration.waitFor(30);
    }
    public static EnterText information(String dataText) {
        return new EnterText(dataText);
    }
}
