package com.workintech.library.model;

public class User {

    protected String name;
    protected String email;
    protected String phoneNumber;

    protected int id;



    protected  Operatable[] operations;

    public User(String name){
        this.name=name;
    }

    public User(String name, String email, String phoneNumber,int id) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id=id;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOperations(Operatable[] operations) {
        this.operations = operations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int menu(Library library, User user,Databases databases){
         System.out.println("Here will be printed options.");
         return -1;

     }
}
