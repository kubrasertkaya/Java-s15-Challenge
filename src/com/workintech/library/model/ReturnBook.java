package com.workintech.library.model;

import com.workintech.library.enums.BookStatus;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBook implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
         ArrayList<Book> barrowedbooks= ((NormalUser) user).getBorrowedbooks();
         for (Book book:barrowedbooks){
             System.out.println(book.toString2());
         }
        System.out.println("Bırakmak istediğiniz kitabın id siniz giriniz.");
         int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
         Book returnbook=null;
        for (Book book:barrowedbooks){
            if(book.getId()== num){
                returnbook=book;
            }

        }
        if(returnbook==null){
            System.out.println("Girdiğiniz id yanlış");
            return;
        }
        returnbook.setStatus(BookStatus.ALINMAMIŞ);
        ((NormalUser) user).removedBarrowBook(returnbook);
        returnbook.setOwner(null);
        System.out.println("Kitap geri bırakıldı.");
        System.out.println( Double.toString(returnbook.getPrice()/2) + "TL iade edildi." );

    }
}
