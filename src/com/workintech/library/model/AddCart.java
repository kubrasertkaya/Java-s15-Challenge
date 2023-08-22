package com.workintech.library.model;

import java.util.List;
import java.util.Scanner;

public class AddCart implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
        int id;
        System.out.println("Satın almak istediğiniz kitabın id sini giriniz.");
        Scanner s=new Scanner(System.in);
        id=s.nextInt();
       Book book = library.getBookWithId(id);
       if(book==null){
           return;
       }
        NormalUser normalUser =  (NormalUser) user;
       normalUser.addToCart(book);
        System.out.println("Kitap sepete eklendi.");

    }
}
