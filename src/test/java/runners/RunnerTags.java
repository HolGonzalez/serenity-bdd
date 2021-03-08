package runners;
import  cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/demo.feature",
                tags = "@tag1",
                glue = "co.com.chocair.certificacion.proyectobase.stepdefinitions",
                snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
