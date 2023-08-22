package com.workintech.library.model;

import java.util.ArrayList;
import java.util.Scanner;

public class NormalUser extends User{

    protected ArrayList<Book> cart;


    public NormalUser(String name, String email, String phoneNumber,int id,ArrayList<Book> cart) {

        super(name, email, phoneNumber,id);
        this.cart=cart;
        this.operations=new Operatable[]{
                new ViewBook(),
                new AddCart(),
                new BarrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new ViewBooks(),
                new ViewCart(),
                new ConfirmCart(),
                new Exit()

        };
    }

    @Override
    public int menu(Library library,User user,Databases databases) {
        System.out.println("1. View Books");
        System.out.println("2. Add To Cart");
        System.out.println("3. Borrow Book");
        System.out.println("4. Calculate Fine");
        System.out.println("5. Return Book");
        System.out.println("6.View Books");
        System.out.println("7.View Cart");
        System.out.println("8.Confirm Cart");
        System.out.println("9. Exit");


        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        this.operations[n-1].oper(library, user,databases);
        if(n==9){
            return 0;
        }else{
            return 1;

        }

    }

    public ArrayList<Book> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Book> cart) {
        this.cart = cart;
    }

    public  void addToCart(Book book){
        cart.add(book);
    }

    public void clearCart(){
        cart.clear();
    }

    @Override
    public String toString() {
        return name + "<N/>"+ email + "<N/>" + phoneNumber + "<N/>" + "Normal";
    }
}
