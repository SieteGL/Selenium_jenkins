package com.automated.basepage.pages;

import com.automated.basepage.BasePage;

public class EditPasswordPage extends BasePage {

    public String adminMenu = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a";
    public String userName = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input";
    public String search = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]";
    public String editButton = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]";
    public String changePassword = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[5]/div/div[2]/div/label";
    public String passWord = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
    public String confirmPassword = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input";
    public String saveButton = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";



    public EditPasswordPage(){
        super(driver);
    }
}
