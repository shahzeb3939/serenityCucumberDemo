package net.serenity.dvsum.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;

public class LoginImplement implements Task {

    private String email;
    private String password;

    public LoginImplement(String email) {
        this.email = email;
    }

    public static LoginImplement enterEmail(String email) {
        return new LoginImplement(email);
    }

    public LoginImplement enterPassword(String pswd) {
        this.password = pswd;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://devqa.dvsum.com/login?logout"),
                Enter.theValue(email).into(By.id("emailAddress")));
    }
}
