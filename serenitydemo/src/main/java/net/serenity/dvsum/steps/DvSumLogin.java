package net.serenity.dvsum.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class DvSumLogin implements Task {

    public static DvSumLogin enterCredentials() {
        return new DvSumLogin();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Open.url("https://www.toastmasters.org/");
    }
}
