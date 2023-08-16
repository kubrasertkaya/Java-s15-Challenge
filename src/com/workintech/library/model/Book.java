package com.workintech.library.model;

public class Book {
    private int id;
    private String name;   //title
    private String author;  //author
    private String publisher; //publisher
    private String adress; //Collection location
    private BookStatus  status; //Borrowing status

    private User owner;

    private double price;// price
    private int brwcopies; //Copies for borrowing

    public Book (){};

    public Book(String name, String author, String publisher, String adress, BookStatus status, double price, int brwcopies,
                int id) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.adress = adress;
        this.status = status;
        this.price = price;
        this.brwcopies = brwcopies;
        this.id=id;
        this.owner=null;
    }

    @Override
    public String toString() {
        String text="Book Name: "+ name+
                "Book Author: "+ author +
                "Book Publisher:" + publisher+
                "Book Collection  Adress:" + adress +
                "Book Status:" + status +
                "id:"+ String.valueOf(id)+
                "Price:"+ String.valueOf(price) +
                "Borrowing Copies:" + String.valueOf(brwcopies);
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    public int getBrwcopies() {
        return brwcopies;
    }

    public void setBrwcopies(int brwcopies) {
        this.brwcopies = brwcopies;
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
        String text = name+"<N/>"+author+"<N/>"+publisher+"<N/>"+adress+"<N/>"+String.valueOf(id)+
                "<N/>"+String.valueOf(price)+"<N/>"+String.valueOf(brwcopies);
        return text;
    }


}
