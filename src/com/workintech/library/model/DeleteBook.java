package com.workintech.library.model;

import java.util.Scanner;

public class DeleteBook implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {

        int num;

        System.out.println("Silmek istediğiniz kitabın id'sini giriniz.");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
       Book book = library.getBookWithId(num) ;
         if(book==null){
             System.out.println("Kitap bulunamadı.");
             return;
         }
         library.deleteBook(book);
        System.out.println("Kitap silindi.");



    }
}
