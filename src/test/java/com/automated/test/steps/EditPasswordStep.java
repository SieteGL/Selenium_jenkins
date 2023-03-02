package com.automated.test.steps;

import com.automated.basepage.pages.EditPasswordPage;
import io.cucumber.java.es.*;

public class EditPasswordStep extends AbstractSteps{

    EditPasswordPage edit = new EditPasswordPage();

    @Dado("^ingreso al menu Admin$")
    public void clickMenuAdmin(){
        edit.click(edit.adminMenu);
        edit.waitInMillis(1500);
    }

    @E("^ingreso el userName para realizar la busqueda$")
    public void writeUserName(){
        edit.write(edit.userName, testContext().get("userName"));
        edit.waitInMillis(5000);
    }

    @Y("^hago click en el boton de search$")
    public void clickSearch(){
        edit.click(edit.search);
        edit.waitInMillis(1500);
    }

    @Y("^selecciono el elemento de la tabla$")
    public void clickElemento(){
        edit.click(edit.editButton);
        edit.waitInMillis(1500);
    }

    @Y("^activo el change password$")
    public void clickChangePassword(){
        edit.click(edit.changePassword);
        edit.waitInMillis(1500);
    }

    @E("^ingreso la nueva password (.+)$")
    public void writeNewPassword(String text){
        edit.click(edit.passWord);
        edit.write(edit.passWord, text);
        edit.waitInMillis(1500);
    }

    @Y("^luego confirmo la password (.+)$")
    public void writeConfirmNewPassword(String text){
        edit.click(edit.confirmPassword);
        edit.write(edit.confirmPassword, text);
        edit.waitInMillis(1500);
    }

    @Y("^hago click en el boton de save$")
    public void clickSaveButton(){
        edit.click(edit.saveButton);
        edit.waitInMillis(1500);
    }

}
