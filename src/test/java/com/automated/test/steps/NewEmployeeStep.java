package com.automated.test.steps;


import com.automated.basepage.pages.NewEmployeePage;
import io.cucumber.java.es.*;

public class NewEmployeeStep extends AbstractSteps{

    NewEmployeePage add = new NewEmployeePage();

    @Dado("^ingreso al menu de PIM$")
    public void clickPIMOption(){
        add.click(add.PIM);
        add.waitInMillis(1500);
    }

    @Cuando("^selecciono add employee$")
    public void clickAddEmployee(){
        add.click(add.addEmployee);
        add.waitInMillis(1500);
    }

    @E("^ingreso el nombre (.+)$")
    public void writeEmployeeName(String text){
        add.click(add.firstName);
        add.write(add.firstName, text);
        add.waitInMillis(1500);
    }

    @Y("^agrego el segundo nombre (.+)$")
    public void writeEmployeeMiddleName(String text){
        add.click(add.midleName);
        add.write(add.midleName, text);
        add.waitInMillis(1500);
    }

    @E("^ingreso el apellido (.+)$")
    public void writeEmployeeLastName(String text){
        add.click(add.lastName);
        add.write(add.lastName, text);
        add.waitInMillis(1500);
    }

    @Y("^luego recupero el employee ID$")
    public void saveEmployeeID(){
        //String id = add.extractGetText(add.employeeID);
        //testContext().set("employeeID", id);
        //System.out.println("employeeID: "+id);
    }

    @Y("^luego habilito el radio button$")
    public void clickRadioButton(){
        add.click(add.loginDetails);
        add.waitInMillis(1500);
    }

    @E("^ingreso el username (.+)$")
    public void writeEmployeeUsername(String text){
        add.click(add.userName);
        add.write(add.userName, text);
        testContext().set("userName", text);
        add.waitInMillis(1500);
    }

    @Y("^tambien creo una contraseña con la combinacion requerida (.+)$")
    public void writeEmployeePassword(String text){
        add.click(add.password);
        add.write(add.password, text);
        add.waitInMillis(1500);
    }

    @Y("^luego confirmo mi contraseña (.+)$")
    public void writeEmployeeRPassword(String text){
        add.click(add.confirmPassword);
        add.write(add.confirmPassword, text);
        add.waitInMillis(1500);
    }

    @Y("^hago click en el save button$")
    public void clickSaveButton(){
        add.click(add.save);
        add.waitInMillis(5000);
    }
}
