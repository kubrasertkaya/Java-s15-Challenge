package com.workintech.library.model;

public class Exit implements Operatable{
    @Override
    public void oper(Library library, User user, Databases databases) {
        System.out.println("Sistemden ayrılıyorsunuz...");
    }
}
