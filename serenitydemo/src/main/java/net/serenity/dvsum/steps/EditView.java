package net.serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class EditView {
    public static Performable named(String testView) {
        return Task.where("heheheheh", LoginImplement.enterEmail("myemaial dhdhdh").enterPassword("pswd"));
    }
}
