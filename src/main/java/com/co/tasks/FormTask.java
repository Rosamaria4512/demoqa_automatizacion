package com.co.tasks;

import com.co.models.DataFormModels;
import com.co.userinterfaces.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


public class FormTask implements Task {

    DataFormModels dataFormModels;

    public FormTask(DataFormModels dataFormModels) {
        this.dataFormModels = dataFormModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(FormPage.DIV_ELEMENTS));
        actor.attemptsTo(Click.on(FormPage.DIV_ELEMENTS));
        actor.attemptsTo(Scroll.to(FormPage.LI_WEBTABLES));
        actor.attemptsTo(Click.on(FormPage.LI_WEBTABLES));
        actor.attemptsTo(Enter.theValue("Alden").into(FormPage.TXT_SEARCH));
        actor.attemptsTo(Click.on(FormPage.BTN_ADD));
        actor.attemptsTo(Enter.theValue(dataFormModels.getName()).into(FormPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(dataFormModels.getLastname()).into(FormPage.TXT_APELLIDOS));
        actor.attemptsTo(Enter.theValue(dataFormModels.getEmail()).into(FormPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(dataFormModels.getAge()).into(FormPage.TXT_AGE));
        actor.attemptsTo(Enter.theValue(dataFormModels.getSalary()).into(FormPage.TXT_SALARY));
        actor.attemptsTo(Enter.theValue(dataFormModels.getDepartment()).into(FormPage.TXT_DEPARMENT));
        actor.attemptsTo(Scroll.to(FormPage.BTN_ENVIAR));
        actor.attemptsTo(Click.on(FormPage.BTN_ENVIAR));


    }

    public static FormTask form (DataFormModels dataFormModels){
        return Tasks.instrumented(FormTask.class,dataFormModels);
    }
}
