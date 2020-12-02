package net.serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Start {

    public static Performable onLoginPage(){
        return Task.where("{0} is on login page", Open.browserOn().thePageNamed("home.page"));
    }

    public static Performable onColumnDictionaryPage() {
        return Task.where("{0} is on Column Dictionary Page", Open.url("https://devqa.dvsum.com/dictionary/column"));
    }
}
