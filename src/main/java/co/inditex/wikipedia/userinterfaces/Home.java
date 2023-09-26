package java.co.inditex.wikipedia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target TEXT_SEARCH =
            Target.the("text search")
            .locatedBy("//*[@class='cdx-text-input__input']");

    public static final Target BUTTON_SEARCH =
            Target.the("Title")
                    .locatedBy("//*[@class='cdx-text-input cdx-text-input--has-start-icon cdx-text-input--status-default cdx-search-input__text-input']");

    public static final Target TITLE =
            Target.the("Title")
                    .locatedBy("//*[@class='mw-page-title-main']");

}
