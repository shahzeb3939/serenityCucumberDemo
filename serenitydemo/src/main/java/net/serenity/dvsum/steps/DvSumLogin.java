package net.serenity.dvsum.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;

public class DvSumLogin {

    public static Task enterCredentials() {
        return Task.where("blala", Enter.theValue("ddfdsfs").into(By.id("emailAddress")));
    }
}
