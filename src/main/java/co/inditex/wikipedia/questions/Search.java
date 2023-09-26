package java.co.inditex.wikipedia.questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import stati java.co.inditex.wikipedia.userinterfaces.Home.TITLE;

public class Search implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return TITLE.resolveFor(actor).getText();
    }
    public static Search error() {
        return new Search();
    }
}

