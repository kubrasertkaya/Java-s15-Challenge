package com.workintech.library.model;

public class User {

    protected String name;
    protected String email;
    protected String phoneNumber;



    protected  Operatable[] operations;

    public User(String name){
        this.name=name;
    }

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }




    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

     public void menu(Databases databases,User user){
         System.out.println("Here will be printed options.");

     }
}
