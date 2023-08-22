package com.workintech.library.model;

import com.workintech.library.enums.BookType;

import java.util.Scanner;

public class UpdateBook implements Operatable{
    @Override
    public void oper(Library library, User user, Databases databases) {
        System.out.println("Güncellemek  istediğiniz kitabın id sini giriniz.");

        int num;
        Scanner s =new Scanner(System.in);
        num=s.nextInt();
        System.out.println(num);
        Book book =library.getBookWithId(num);
        if(book==null){
            System.out.println("Kitap mevcut değildir.");
            return;
        }
        System.out.println("Enter book name: ");
        book.setName(s.next());
        System.out.println("Enter book author: ");
        book.setAuthor(s.next());
        System.out.println("Enter book publisher: ");
        book.setPublisher(s.next());
        System.out.println("Enter book collection adress: ");
        book.setType(BookType.valueOf(s.next()));
        System.out.println("Enter book price: ");
        book.setPrice(s.nextDouble());
        s.close();

        System.out.println("Kitap bilgileri güncellendi."+ book.toString());
    }
}
