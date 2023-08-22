package com.workintech.library.model;

import com.workintech.library.enums.BookStatus;
import com.workintech.library.enums.BookType;

public class Book {
    private int id;
    private String name;   //title
    private String author;  //author
    private String publisher; //publisher
    private BookType type;
    private BookStatus status; //Borrowing status

    private User owner;

    private double price;// price




    public Book (){};

    public Book(String name, String author, String publisher, BookType type, BookStatus status, double price )
    {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.type=type;
        this.status = status;
        this.price = price;
        this.owner=null;
    }

    @Override
    public String toString() {
        String text="Book Name: "+ name+
                "Book Author: "+ author +
                "Book Publisher:" + publisher+
                "Book Collection  Adress:" + type.toString() +
                "Book Status:" + status +
                "id:"+ String.valueOf(id)+
                "Price:"+ String.valueOf(price);

        return  text;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String toString2(){
        String text = name+"<N/>"+author+"<N/>"+publisher+"<N/>"+type.toString()+"<N/>"+String.valueOf(id)+
                "<N/>"+String.valueOf(price)+"<N/>";
        return text;
    }


}
