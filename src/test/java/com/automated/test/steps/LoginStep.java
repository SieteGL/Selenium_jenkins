package com.automated.test.steps;

import com.automated.basepage.pages.LoginPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Y;


public class LoginStep {

    LoginPage login = new LoginPage();

    @Dado("^navego a la url de orangeHRM (.+)$")
    public void navigate(String url){
        login.navigate(url);
    }

    @Cuando("^ingreso el userName para logearme (.+)$")
    public void writeUserName(String text){
        login.click(login.username);
        login.waitInMillis(1500);
        login.write(login.username,text);
        login.waitInMillis(1500);
    }

    @E("^ingreso el password requerido$")
    public void writePassword(){
        String text = login.getText(login.password);
        String newText = text.substring(11,19);
        login.waitInMillis(1000);
        login.write(login.passwordInput, newText);
        login.waitInMillis(1500);
    }

    @Y("^hago ingreso del password con errores (.+)$")
    public void writePasswordFailure(String data){
        String text = login.getText(login.password);
        String newText = text.substring(11,19);
        newText = newText+data;
        login.waitInMillis(1000);
        login.write(login.passwordInput, newText);
        System.out.println(newText);
        login.waitInMillis(1500);
    }

    @Y("^hago click en boton de login$")
    public void clickLogin(){
        login.click(login.loginButton);
        login.waitInMillis(2000);
        login.waitInMillis(1500);
    }

}
