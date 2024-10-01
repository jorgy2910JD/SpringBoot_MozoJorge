package com.exaple.PonchoPOS.model;

public class user {
    private String username;
    private Stirng password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

     User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}