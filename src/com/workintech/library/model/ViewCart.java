package com.workintech.library.model;

import java.util.ArrayList;

public class ViewCart implements Operatable{
    @Override
    public void oper(Library library, User user, Databases databases) {
        System.out.println("Sepet görüntüleniyor...");
        NormalUser normalUser=(NormalUser) user;
        ArrayList<Book> cart=normalUser.getCart();
        for(Book book:cart){
            System.out.println(book.toString());
        }
    }
}
