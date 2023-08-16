package com.workintech.library.model;

import java.util.Arrays;
import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.operations=new Operatable[]{
                new ViewBook(),
                new Search(),
                new PlaceOrder(),
                new BarrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    public NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operations=new Operatable[]{
                new ViewBook(),
                new Search(),
                new PlaceOrder(),
                new BarrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    @Override
    public void menu(Databases databases,User user) {
        System.out.println("1. View Books");
        System.out.println("2. Search");
        System.out.println("3. Place Order");
        System.out.println("4. Borrow Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Book");
        System.out.println("7. Exit");

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        this.operations[n-1].oper(databases, user);

    }

    @Override
    public String toString() {
        return name + "<N/>"+ email + "<N/>" + phoneNumber + "<N/>" + "Normal";
    }
}
