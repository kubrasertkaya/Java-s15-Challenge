package com.workintech.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewBook implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
        System.out.println("Görüntülemek istediğiniz kitabın ismini giriniz.");

        String name;
        Scanner s =new Scanner(System.in);
        name=s.nextLine();
        System.out.println(name);
        ArrayList<Book> list =library.getBookListByName(name);
        if(list.isEmpty()){
            System.out.println("Kitap mevcut değildir.");
            return;
        }
        for(Book book:list){
            System.out.println(book.toString());
        }


    }
}
