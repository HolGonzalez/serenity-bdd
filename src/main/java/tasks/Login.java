package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairloginPage;

public class Login implements Task{
    public static Login onThePage() {
       return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairloginPage.LOGIN_BUTTON),
                Enter.theValue("1053342743").into(ChoucairloginPage.INPUT_USER),
                Enter.theValue("Choucair2021*").into(ChoucairloginPage.INPUT_PASSWORD),
                Click.on(ChoucairloginPage.ENTER_BUTTON)
        );
    }
}
