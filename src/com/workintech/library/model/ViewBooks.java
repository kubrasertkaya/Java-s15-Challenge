package com.workintech.library.model;

import java.util.ArrayList;

public class ViewBooks implements Operatable{
    @Override
    public void oper(Library library, User user, Databases databases) {
       ArrayList<Book> books =library.getAllBooks();
       String name;
       String id;
       String status;
       for(Book book:books){
           name=book.getName();
           id= Integer.toString(book.getId());

           if(book.getStatus()==BookStatus.ALINMIŞ){
               status="Alınmış.";
           }else{
               status="Alınmamış";
           }
           System.out.println("Kitap id:"+id + " Kitap adı:" + name + "  Kitao durumu:" + status);
       }
    }
}
