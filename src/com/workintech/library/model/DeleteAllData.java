package com.workintech.library.model;

public class DeleteAllData implements Operatable{
    @Override
    public void oper(Library library,User user,Databases databases) {
           library.deleteAllData();
        System.out.println("Bütün kitaplar silindi.");
    }
}
