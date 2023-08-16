package com.workintech.library.model;

public class ViewBook implements Operatable{
    @Override
    public void oper(Databases databases,User user) {
        System.out.println("View Books");
    }
}
