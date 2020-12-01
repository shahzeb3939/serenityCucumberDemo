package net.serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Login {
    public static Performable withValidCredentials() {
        return Task.where("{0} enters valid credentials", DvSumLogin.enterCredentials());
    }
}
