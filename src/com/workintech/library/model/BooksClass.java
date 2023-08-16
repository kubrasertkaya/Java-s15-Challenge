package com.workintech.library.model;

import java.util.HashMap;
import java.util.Map;

public class BooksClass {
    public static void main(String[] args) {
        Map<Integer,String> books=new HashMap<>();
        books.put(1,"yedi güzel adam");
        books.put(2,"dönüşüm");
        books.put(3,"yüzbaşının kızı ");
        System.out.println(books);
    }
}
