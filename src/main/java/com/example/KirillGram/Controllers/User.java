package com.example.KirillGram.Controllers;

import java.time.LocalDate;


public class User {

    private String password, name;
    public User(String password, String name){
        this.name =name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String email) {
        this.name = name;
    }


}
