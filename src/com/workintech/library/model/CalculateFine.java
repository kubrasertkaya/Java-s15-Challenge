package com.workintech.library.model;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateFine implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
        System.out.println("Fiyat  görüntüleniyor...");
        NormalUser normalUser=(NormalUser) user;
        ArrayList<Book> cart=normalUser.getCart();
        double sum=0;
        for(Book book:cart){
           sum+= book.getPrice();
        }
        System.out.println(sum);

    }
}
