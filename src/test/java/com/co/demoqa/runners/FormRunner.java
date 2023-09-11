package com.co.demoqa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/form.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.demoqa.stepsdefinitions",
        plugin = "pretty"
)
public class FormRunner {
}
