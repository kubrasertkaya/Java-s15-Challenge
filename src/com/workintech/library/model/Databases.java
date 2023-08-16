package com.workintech.library.model;

import com.workintech.library.main.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Databases {
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<String> usernames = new ArrayList<String>();
    private List<Book> books = new ArrayList<Book>();

    private ArrayList<String> booknames = new ArrayList<String>();


    private File usersfile = new File("C:\\wit\\java\\Java-s15-Challenge\\Data\\Users");
    private File booksfile = new File("C:\\wit\\java\\Java-s15-Challenge\\Data\\Books");
    private File folder = new File("C:\\wit\\java\\Java-s15-Challenge\\Data");

    public Databases() {
        if (!folder.exists()) {
            folder.mkdirs();
        }
        if (!usersfile.exists()) {
            try {
                usersfile.createNewFile();
            } catch (Exception e) {
            }
        }
        if (!booksfile.exists()) {
            try {
                booksfile.createNewFile();
            } catch (Exception e) {
            }
        }
        getUser();
    }

    public void AddUser(User s) {
        users.add(s);
        usernames.add(s.getName());
        saveUser();

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

    public void AddBook(Book book) {
        books.add(book);
        booknames.add(book.getName());
        saveBooks();
    }

    private void getUser() { //usersfile dosyasını okumak için bir metot
        String text1 = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(usersfile));
            String s1;
            while ((s1 = br1.readLine()) != null) {
                text1 = text1 + s1;
            }
            br1.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        if (!text1.matches("") || !text1.isEmpty()) {
            String[] a1 = text1.split("<NewUser/>");
            for (String s : a1) {
                String[] a2 = s.split("<N/>");
                //if (a2[3].matches("Admin")) {
                // User user = new Admin(a2[0], a2[1], a2[2]);
                //users.add(user);
                //usernames.add(user.getName());
                //} else {
                //User user = new NormalUser(a2[0], a2[1], a2[2]);
                //users.add(user);
                //usernames.add(user.getName());
                //}
            }
        }
    }

    private void saveUser() { //users listesindeki kullanıcı bilgilerini bir dosyaya kaydetmek için
        String text1 = " ";
        for (User user : users) {
            text1 = text1 + users.toString() + "<NewUser/>\n";
        }
        try {
            PrintWriter pw = new PrintWriter(usersfile); //usersfile adlı dosyayı yazmak için bir PrintWriter nesnesi oluşturur.
            pw.print(text1);
            pw.close();
            System.out.println("Data saved");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveBooks() {
        String text1 = "";
        for (Book book : books) {
            text1 = text1 + book.toString2() + "<NewBook/>\n";
        }
        try {
            PrintWriter pw = new PrintWriter(booksfile);
            pw.print(text1);
            pw.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    private void getBooks() {
        String text1 = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(booksfile));
            String s1;
            while ((s1 = br1.readLine()) !=null) {
                text1 = text1 + s1;
            }
            br1.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        if (!text1.matches("") || !text1.isEmpty()) {
            String[] a1 = text1.split("<NewBook/>");
            for (String s : a1) {
                Book book = parseBook(s);
                books.add(book);
                booknames.add(book.getName());
            }
        }
    }

    public Book parseBook(String s){
        String[]a=s.split("<N/>");
        Book book =new Book();
        book.setName(a[0]);
        book.setAuthor(a[1]);
        book.setPublisher(a[2]);
        book.setAdress(a[3]);
        book.setQty(Integer.parseInt(a[4]));
        book.setPrice(Double.parseDouble(a[5]));
        book.setBrwcopies(Integer.parseInt(a[6]));
        return book;

    }
}
