package com.workintech.library.model;

import java.util.ArrayList;

public class ConfirmCart implements Operatable{
    @Override
    public void oper(Library library, User user, Databases databases) {
       ArrayList<Book> cart = ((NormalUser) user).getCart();
        System.out.println("Fiyat  görüntüleniyor...");
        double sum=0;
        for(Book book:cart){
            sum+= book.getPrice();
        }
        System.out.println(sum);
        for(Book book:cart){
            library.buyBook(book);
    }
        ((NormalUser) user).clearCart();
        System.out.println("Satın alınma işlemi gerçekleşti.Güle güle okuyun.");

    }
}
