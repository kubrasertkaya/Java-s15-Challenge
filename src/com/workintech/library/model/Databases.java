package com.workintech.library.model;

import com.workintech.library.main.Main;

import java.io.*;
import java.util.ArrayList;

public class Databases {
     private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<String> usernames = new ArrayList<String>();
    private ArrayList<Book> books=new ArrayList<Book>();
    private ArrayList<String> booknames=new ArrayList<String >();





    private File usersfile=new File("C:\\wit\\java\\Java-s15-Challenge\\Data\\Users");
    private File booksfile=new File("C:\\wit\\java\\Java-s15-Challenge\\Data\\Books");
    public Databases(){
        if(!usersfile.exists()){
           usersfile.mkdirs();
        }
        if(!booksfile.exists()){
            booksfile.mkdirs();
        }
    }

    public void AddUser(User s) {
        users.add(s);
        usernames.add(s.getName());

    }

    public int login(String phoneNumber, String email) {
        int n = -1;
        for (User s : users) {
            if (s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email)) {
                n=users.indexOf(s);
                break;
            }
        }
        return n;
    }

    public User getUser(int n){
        return users.get(n);
    }

    public  void AddBook(Book book){
        books.add(book);
        booknames.add(book.getName());
    }

    private void getUser(){ //usersfile dosyasını okumak için bir metot
        String text1=" ";
        try{
            BufferedReader br1=new BufferedReader(new FileReader(usersfile));
            String s1;
            while ((s1=br1.readLine())!=null){
                text1= text1 + s1;
            }
            br1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(!text1.matches("") || !text1.isEmpty()){  // eğer metin dizisi içeriği boş değilse veya içeriği
            String[] a1=text1.split("<NewUser/>");   //boş bir dize değilse, bloğun içindeki işlemler çalışır.
            for(String s:a1){
                String[] a2 =s.split("<N/>");
                if(a2[3].matches("Admin")){
                    User user=new Admin(a2[0],a2[1],a2[2]);
                    users.add(user);
                    usernames.add(user.getName());
                }
            }
        }
    }

    private void saveUser(){ //users listesindeki kullanıcı bilgilerini bir dosyaya kaydetmek için
        String text1=" ";
        for(User user:users){
            text1=text1+users.toString()+"<NewUser/>\n";
        }
        try {
            PrintWriter pw=new PrintWriter(usersfile); //usersfile adlı dosyayı yazmak için bir PrintWriter nesnesi oluşturur.
            pw.print(text1);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
