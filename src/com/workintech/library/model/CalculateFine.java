package com.workintech.library.model;

import java.util.Scanner;

public class CalculateFine implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
        System.out.println("Kitabın ismini giriniz.");
        String name;
        Scanner s =new Scanner(System.in);
        name=s.nextLine();
        Book book=library.getBookWithName(name);
        System.out.println("Tutar:"+ book.getPrice());


    }
}
