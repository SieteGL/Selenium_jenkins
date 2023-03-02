package com.automated.basepage.pages;

import com.automated.basepage.BasePage;

public class AdditionalDataPage extends BasePage {

    //Emergency contact
    public String emergencyContact = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a";
    public String addContact = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button";
    public String contactName = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input";
    public String relationship = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input";
    public String mobile = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input";
    public String saveContact = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]";

    //Salary

    public String salary = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[7]/a";
    public String addSalary = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button";
    public String salaryComponent = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input";
    public String currency = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div";
    public String currencySelection = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/comment";
    public String amount = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input";
    public String saveSalary = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button[2]";

    //Qualifications

    public String qualifications = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[10]/a";
    public String addQualification = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button";
    public String company = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input";
    public String jobTitle = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input";
    public String saveQualifications = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]";



    public AdditionalDataPage(){
        super(driver);
    }
}
