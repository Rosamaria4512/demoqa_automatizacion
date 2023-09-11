package com.co.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target DIV_ELEMENTS = Target.the("dar clic en el boton elements").
            locatedBy("//*[@id='app']/div/div/div[2]/div/div[1]");
    public static final Target LI_WEBTABLES = Target.the("dar clic en el boton elements").
            locatedBy("//*[@id='item-3']");
    public static final Target BTN_ADD = Target.the("dar clic para agregar").
            locatedBy("//*[@id='addNewRecordButton']");
    public static final Target TXT_SEARCH= Target.the("dar clic para agregar").
            locatedBy("   //*[@id='searchBox']");
    public static final Target TXT_NAME= Target.the("campo para escribir nombre").
            locatedBy("   //*[@id='firstName']");
    public static final Target TXT_APELLIDOS= Target.the("campo para escribir apellido ").
            locatedBy("//*[@id='lastName']");
    public static final Target TXT_EMAIL= Target.the("campo para escribir correo").
            locatedBy(" //input[@id='userEmail']");
    public static final Target TXT_AGE= Target.the("campo para escribir correo").
            locatedBy(" //*[@id='age']");
    public static final Target TXT_SALARY= Target.the("campo para salario").
            locatedBy(" //input[@id='salary']");
    public static final Target TXT_DEPARMENT= Target.the("campo para escribir nombre").
            locatedBy("//*[@id='department']");
    public static final Target BTN_ENVIAR= Target.the("dar clic para ENVIAR").
            locatedBy("//*[@id='submit']");








}

