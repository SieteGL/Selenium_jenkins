package com.automated.test.steps;

import com.automated.basepage.pages.AdditionalDataPage;
import io.cucumber.java.an.Cuan;
import io.cucumber.java.es.*;

public class AdditionalDataStep {

    AdditionalDataPage additional = new AdditionalDataPage();

    //Emergency contact

    @Dado("^ingreso al menu de emergency contacts$")
    public void clickEmergencyContacts(){
        additional.click(additional.emergencyContact);
        additional.waitInMillis(1500);
    }

    @Cuando("^selecciono add contact$")
    public void clickAddContact(){
        additional.click(additional.addContact);
        additional.waitInMillis(1500);
    }

    @E("^ingreso el dato del contacto (.+)$")
    public void writeContactName(String text){
        additional.click(additional.contactName);
        additional.write(additional.contactName, text);
        additional.waitInMillis(1500);
    }

    @Y("^agrego la relacion con el empleado (.+)$")
    public void writeRelationship(String text){
        additional.click(additional.relationship);
        additional.write(additional.relationship, text);
        additional.waitInMillis(1500);
    }

    @E("^ingreso el numero mobil (.+)$")
    public void writeMobil(String text){
        additional.click(additional.mobile);
        additional.write(additional.mobile, text);
        additional.waitInMillis(1500);
    }

    @Y("^guardo el contacto$")
    public void clickSaveContact(){
        additional.click(additional.saveContact);
        additional.waitInMillis(1500);
    }

    //Salary

    @Dado("^ingreso al menu de salary$")
    public void clickMenuSalary(){
        additional.click(additional.salary);
        additional.waitInMillis(1500);
    }

    @Cuando("^selecciono add salary$")
    public void clickAddSalary(){
        additional.click(additional.addSalary);
        additional.waitInMillis(1500);
    }

    @E("^ingreso el componentSalary (.+)$")
    public void writeSalaryComponent(String text){
        additional.click(additional.salaryComponent);
        additional.write(additional.salaryComponent, text);
        additional.waitInMillis(1500);
    }

    @Y("^selecciono el tipo de currency$")
    public void selectCurrency(){
        additional.click(additional.currency);
        additional.waitInMillis(1500);
        //additional.sendC(additional.currency);
        String text = additional.getText(additional.currency);
        System.out.println("currency country: "+text);
        additional.waitInMillis(1500);
    }

    //Qualifications

    @Dado("^ingreso al menu de qualifications$")
    public void clickQualifications(){
        additional.click(additional.qualifications);
        additional.waitInMillis(1500);
    }

    @Cuando("^selecciono add qualifications$")
    public void clickAddQualifications(){
        additional.click(additional.addQualification);
        additional.waitInMillis(1500);
    }

    @E("^ingreso el dato para empresa (.+)$")
    public void writeCompany(String text){
        additional.click(additional.company);
        additional.write(additional.company, text);
        additional.waitInMillis(1500);
    }

    @Y("^el dato para cargo (.+)$")
    public void writeJobTitle(String text){
        additional.click(additional.jobTitle);
        additional.write(additional.jobTitle, text);
        additional.waitInMillis(1500);
    }

    @Y("^guardo las calificaciones$")
    public void clickSaveQualification(){
        additional.click(additional.saveQualifications);
        additional.waitInMillis(1500);
    }

}
