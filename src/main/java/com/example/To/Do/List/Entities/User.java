package com.example.To.Do.List;

import jakarta.servlet.http.HttpSession;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    String userName;

    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    String passWord;

    @Column
    boolean isLoggedIn;

    public User(String userName, String email, String passWord, boolean isLoggedIn) {
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.isLoggedIn = isLoggedIn;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return passWord;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

   // public static boolean userValidation(User user, User userFromDB, HttpSession session) {
       // if (user.getUserName() == null || user.getPassWord() == null) {
         //   return false;
        //} else if () {

        //}
    //}
}
