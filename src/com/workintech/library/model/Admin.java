package com.workintech.library.model;

import com.workintech.library.main.Main;

import java.util.Scanner;

public class Admin extends User {


    public Admin(String name) {
        super(name);
        this.operations=new Operatable[]{
                new ViewBook(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new ViewBooks()

    };
    }


    public Admin(String name, String email, String phoneNumber,int id) {
        super(name, email, phoneNumber,id);
        this.operations=new Operatable[]{
                new ViewBook(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new ViewBooks()

        };

    }

    @Override
    public int menu(Library library,User user,Databases databases) {
        System.out.println("1. View Book");
        System.out.println("2. Add Book");
        System.out.println("3. Delete Book");
        System.out.println("4. Search");
        System.out.println("5. Delete All Data");
        System.out.println("6. View Orders");
        System.out.println("7.View Books");
        System.out.println("8. Exit");

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        if(n==8){
            return 0;
        }else{
            this.operations[n-1].oper(library, user,databases);
            return 1;

        }
    }
}
