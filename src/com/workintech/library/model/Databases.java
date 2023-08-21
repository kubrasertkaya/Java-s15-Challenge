package com.workintech.library.model;

import com.workintech.library.main.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Databases {

    private int lastId;


    private ArrayList<User> users = new ArrayList<User>();


    public Databases() {

    }

    public void AddUser(User s) {
        lastId=lastId+1;
        s.setId(lastId);
        users.add(s);

    }

    public int login(String phoneNumber, String email) {
        int n = -1;
        for (User s : users) {
            if (s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email)) {
                n = users.indexOf(s);
                break;
            }
        }
        return n;
    }

    public User getUser(int n) {
        return users.get(n);
    }



}











