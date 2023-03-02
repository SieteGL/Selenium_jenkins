package com.automated.basepage.pages;

import com.automated.basepage.BasePage;

public class LoginPage extends BasePage {

    //Usando Xpath directo desde Chrome

    public String username = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
    public String password = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div/p[2]";
    public String passwordInput = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    public String loginButton = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";


    public LoginPage(){
        super(driver);
    }
}
