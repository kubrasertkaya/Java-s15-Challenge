package com.workintech.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static ArrayList<Book> books=new ArrayList<>();
    private static int lastBookId;
    public  Library() {
        lastBookId=0;
        Book book1=new Book();
        book1.setName("Yüzbaşının Kızı");
        book1.setAuthor("PUŞKİN");
        book1.setPublisher("Yeryüzü Yayınevi");
        book1.setPrice(3.0);
        addBook(book1);
        Book book2=new Book();
        book2.setName("Lavinia");
        book2.setAuthor("ÖZDEMİR ASAF");
        book2.setPublisher("Yeryüzü Yayınevi");
        book2.setPrice(3.0);
        addBook(book2);


    }

    public static  void addBook(Book book){
        lastBookId += 1;
        book.setId(lastBookId);
        books.add(book);
        System.out.println("Kitap eklendi.");

    }

    public static void deleteBook(Book book){
        books.remove(books.indexOf(book));
    }

    public static void deleteAllData(){
        books.clear();
    }

    public  static Book getBookWithId(int id){
        for(Book book:books){
            if(book.getId()==id){
                return book;
            }
        }
        System.out.println("Aranılan kitap bulunamadı");
        return null;
    }

    public  static Book getBookWithName(String name){
        for(Book book:books){
            if(book.getName()==name){
                return book;
            }
        }
        System.out.println("Aranılan kitap bulunamadı");
        return null;
    }

    public static ArrayList<Book> getBookListByName(String name){
        ArrayList<Book> list= new ArrayList<>();
        for(Book book:books) {
            if (book.getName().equals(name)) {
                list.add(book);
            }
        }
        return list;
    }

    public static ArrayList<Book> getAllBooks(){
        return books;
    }








}
