package com.aplicacionescsge.oleohidraulica.certification.tasks.users;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditUser implements Task {
    String Search;

    public EditUser(String search) {

        Search = search;
    }

    @Step("{0} edit user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTION_USER),
                Enter.theValue(Search).into(UserPage.SEARCH_USER),
                Click.on(UserPage.BTN_SORTING.of(Search)),
                Click.on(UserPage.BTN_EDIT.of(Search))
        );
    }

    public static EditUser fillFields(String search) {
        return instrumented(EditUser.class, search);
    }


}
