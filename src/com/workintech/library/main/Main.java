package com.workintech.library.main;

import com.workintech.library.model.*;

import java.util.ArrayList;
import java.util.Scanner;




public class Main {

    static Scanner s;
    static Databases databases;
    static Library library;

    public static  void main(String[] args) {

        databases = new Databases();

        Admin user=new Admin("Kübra","haticekubrasertkaya@gmail.com","5352321292",0);

        databases.AddUser(user);

        library=new Library();

        loginMenu();


    }

    private static void login() {
        System.out.println("Enter phone number:");
        String phoneNumber = s.next();
        System.out.println("Enter email:");
        String email = s.next();
        int n = databases.login(phoneNumber, email);
        if (n != -1) {
            User user = databases.getUser(n);
            menu(user);
        } else {
            System.out.println("User doesn't exist!");
        }

    }

    private static void newUser() {
        System.out.println("Enter name:");
        String name = s.next();
        System.out.println("Enter phone number:");
        String phoneNumber = s.next();
        System.out.println("Enter email:");
        String email = s.next();
        System.out.println("1. Admin\n2. Normal User");
        int n2 = s.nextInt();
        User user;
        if (n2 == 1) {
           user = new Admin(name, email, phoneNumber,0);

        } else {
           user = new NormalUser(name, email, phoneNumber,0,  new ArrayList<Book>());

        }
        databases.AddUser(user);
        menu(user);
    }

    public  static void menu(User user){

       int a= user.menu(library,user,databases);
       if(a==0){
           loginMenu();
       }else if(a==1){
           menu(user);

       }


    }

    public  static  void loginMenu(){
        int num;

        System.out.println("Welcome to Library Management System!\n"
                + " 0.Exit\n"
                + " 1.Login\n 2.New User");
        s = new Scanner(System.in);
        num = s.nextInt();
        if(num<0 || num>2){
            System.out.println("num must be between 0 and 2");
        }
        switch (num) {
            case 1:
                login();
            case 2:
                newUser();

        }

    }
}

