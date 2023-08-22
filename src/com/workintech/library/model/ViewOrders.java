package com.workintech.library.model;

import java.util.ArrayList;

public class ViewOrders implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
       ArrayList<Book> boughtbooks = library.getBoughtbooks();
       for(Book book :boughtbooks){
           System.out.println("Alınmış kitaplar: " +  book.toString());
       }

    }
}
