package com.workintech.library.model;

import com.workintech.library.enums.BookStatus;
import com.workintech.library.enums.BookType;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books=new ArrayList<>();
    private static  ArrayList<Book> boughtbooks=new ArrayList<>();
    private static int lastBookId;
    public  Library() {
        lastBookId=0;
        Book book1=new Book("Lavinia","ÖZDEMİR ASAF","Yeryüzü Yayınevi", BookType.TURK_EDEBIYATI, BookStatus.ALINMAMIŞ,3.0);
        addBook(book1);
        Book book2=new Book("Lavinia","ÖZDEMİR ASAF","Yeryüzü Yayınevi",BookType.TURK_EDEBIYATI,BookStatus.ALINMAMIŞ,3.0);
        addBook(book2);
        Book book3=new Book("Yüzbaşının Kızı ","PUŞKİN","Yeryüzü Yayınevi",BookType.RUS_EDEBIYATI,BookStatus.ALINMAMIŞ,3.0);
        addBook(book3);
        Book book4=new Book("Zehra","Nabızade Nazım ","Dolunay Yayınevi",BookType.TURK_EDEBIYATI,BookStatus.ALINMAMIŞ,3.0);
        addBook(book4);
        Book book5=new Book("Zehra","Nabızade Nazım ","Dolunay Yayınevi",BookType.TURK_EDEBIYATI,BookStatus.ALINMAMIŞ,3.0);
        addBook(book5);
        Book book6=new Book("Zehra","Nabızade Nazım ","Dolunay Yayınevi",BookType.TURK_EDEBIYATI,BookStatus.ALINMAMIŞ,3.0);
        addBook(book6);



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

    public static void buyBook(Book book){
        books.remove(books.indexOf(book));
        boughtbooks.add(book);
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

    public static ArrayList<Book> getBoughtbooks() {
        return boughtbooks;
    }

    public static void setBoughtbooks(ArrayList<Book> boughtbook) {
        Library.boughtbooks = boughtbook;
    }

    public static ArrayList<Book> getBookListByType(String name){
        ArrayList<Book> list= new ArrayList<>();
        for(Book book:books) {
            if (book.getType().toString().equals(name)) {
                list.add(book);
            }
        }
        return list;
    }
}
