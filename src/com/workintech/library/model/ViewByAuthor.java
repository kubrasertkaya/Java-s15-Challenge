package com.workintech.library.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewByAuthor implements Operatable{
    @Override
    public void oper(Library library, User user, Databases databases) {
        System.out.println("Yazarı giriniz");
        String name;
        Scanner s =new Scanner(System.in);
        name=s.nextLine();
        System.out.println(name);
        ArrayList<Book> list =library.getBookListByAuthor(name);
        if(list.isEmpty()){
            System.out.println("Kitap mevcut değildir.");
            return;
        }
        for(Book book:list){
            System.out.println(book.toString());
        }
    }
}
