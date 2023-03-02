package com.automated.basepage.pages;

import com.automated.basepage.BasePage;

public class NewEmployeePage extends BasePage {

    public String PIM = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]";
    public String addEmployee = "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a";
    public String firstName = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input";
    public String midleName = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input";
    public String lastName = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input";
    public String employeeID = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input";
    public String loginDetails = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span";
    public String userName = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input";
    public String password = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input";
    public String confirmPassword = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input";
    public String save = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";

    public NewEmployeePage(){
        super(driver);
    }
}
