package com.co.demoqa.stepsdefinitions;

import com.co.models.DataFormModels;
import com.co.tasks.FormTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class FormSteoDefinition {

    @Managed
    WebDriver hisBroswer;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Rosita");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBroswer));
    }

    @Given("^he user enter in the page$")
    public void heUserEnterInThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));

    }

    @Then("^he user fill form$")
    public void heUserFillForm(List<DataFormModels>dataFormModelsList) {
        DataFormModels dataFormModels;
        dataFormModels=dataFormModelsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(FormTask.form(dataFormModels));
    }




    @When("^he user fill form succesfully$")
    public void heUserFillFormSuccesfully() {

    }
}
