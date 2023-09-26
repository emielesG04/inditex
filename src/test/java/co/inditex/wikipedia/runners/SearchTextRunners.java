package java.co.inditex.wikipedia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search.feature",
        glue = {"java.co.inditex.wikipedia.stepdefinitions","java.co.inditex.wikipedia.setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")
public class WriteTextRunners {
}
