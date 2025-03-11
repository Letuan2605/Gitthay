/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitthay;

/**
 *
 * @author ADMIN
 */
public class User {
    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public static void main(String[] args) {
        // Tạo một user mới
        User user = new User("U123", "example@email.com");

        // Hiển thị email ban đầu
        System.out.println("Email ban đầu: " + user.getEmail());

        // Cập nhật email
        user.updateEmail("newemail@email.com");

        // Hiển thị email sau khi cập nhật
        System.out.println("Email mới: " + user.getEmail());
    }
}

