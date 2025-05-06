package com.Praktikum.Users;

import com.Praktikum.Action.AdminAction;

import java.util.Scanner;

public class Admin extends User implements AdminAction {
    private String username;
    private String password;
    Scanner scanner = new Scanner(System.in);

    public Admin (String username, String password){
        super("", "");
        this.username = username;
        this.password = password;
    }
    public Admin (){
        super("","");
        //
    }

    @Override
    public boolean login(String user, String pass) {
        if (user.equalsIgnoreCase(username)&&pass.equals(pass)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Login sebagai Admin berhasil.");
        System.out.println("Username: " + username);
    }

    @Override
    public void displayAppMenu() {
        int i = 0;
        System.out.println("menu:");
        System.out.println("1. Kelola Laporan Barang");
        System.out.println("2. Kelola Data Mahasiswa");
        System.out.println("0. logout");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        input.nextLine();
        switch (i){
            case 1:
                manageItems();
                break;
            case 2:
                manageItems();
                break;
            case 0:
                break;
            default:
                System.out.println("Input error");
        }
    }

    @Override
    public void manageItems() {
        System.out.println(">>Fitur kelola barang belum tersedia<<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">>Fitur kelola mahasiswa belum tersedia<<");
    }
}
