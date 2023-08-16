package com.workintech.library.model;

import java.util.List;
import java.util.Scanner;

public class AddBook implements Operatable{


    @Override
    public void oper(Library library,User user) {

        Scanner s=new Scanner(System.in);
        Book book =new Book();
        System.out.println("Enter book name: ");
        book.setName(s.next());
        System.out.println("Enter book author: ");
        book.setAuthor(s.next());
        System.out.println("Enter book publisher: ");
        book.setPublisher(s.next());
        System.out.println("Enter book collection adress: ");
        book.setAdress(s.next());
        System.out.println("Enter book price: ");
        book.setPrice(s.nextDouble());
        System.out.println("Enter borrowing copies: ");
        book.setBrwcopies(s.nextInt());
        s.close();
        library.addBook(book);
        System.out.println("Book added succesfully\n");
        user.menu(library,user);



    }
    private static String getInput(){
        Scanner s=new Scanner(System.in);
        return  s.nextLine();
    }

    public void oper(List<String> bookList){
        System.out.println("Eklemek istediğiniz kitabı girin:");
        String input=getInput();
        if(input!=null && input.isEmpty()){
            bookList.add(input);
        }
    }

    public static boolean checkItemsInList(List<String> books, String book){
        return books.contains(book);
    }
}
