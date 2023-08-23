package com.workintech.library.model;

import com.workintech.library.enums.BookStatus;

import java.util.Scanner;

public class BarrowBook implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
        System.out.println("Ödünç almak istediğiniz kitabın id sini giriniz.");

        int num;
        Scanner s =new Scanner(System.in);
        num=s.nextInt();
        System.out.println(num);
        Book book =library.getBookWithId(num);
        if(book==null){
            System.out.println("Kitap mevcut değildir.");
            return;
        }
        if(book.getStatus()== BookStatus.ALINMIŞ){
            System.out.println("Kitap alınmıştır." + book.getOwner().getName());
            return;
        }
        if(((NormalUser) user).getBorrowedbooks().size()==5){
            System.out.println("Kitap alım limitine ulaştınız.");
            return;
        }
        book.setOwner(user);
        ((NormalUser) user).addBarrowedBook(book);
        book.setStatus(BookStatus.ALINMIŞ);
        System.out.println("Kitap ödünç verildi.");
        System.out.println( Double.toString(book.getPrice()/2) + "TL alındı." );
    }
}
