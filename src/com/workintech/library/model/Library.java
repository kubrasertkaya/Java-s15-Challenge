package com.workintech.library.model;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books=new ArrayList<>();
    private static int lastBookId;
    public static void main(String[] args) {
        lastBookId=0;
        Book book1=new Book();
        book1.setName("Yüzbaşının Kızı");
        book1.setAuthor("PUŞKİN");
        book1.setPublisher("Yeryüzü Yayınevi");
        book1.setPrice(3.0);
        addBook(book1);
        Book book2=new Book();
        book1.setName("Lavinia");
        book1.setAuthor("ÖZDEMİR ASAF");
        book1.setPublisher("Yeryüzü Yayınevi");
        book1.setPrice(3.0);
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








}
