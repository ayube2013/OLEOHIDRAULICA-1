package com.aplicacionescsge.oleohidraulica.certification.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class PageTitleQuestion implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).getTitle();

    }

    public static PageTitleQuestion is() {
        return new PageTitleQuestion();
    }


}
