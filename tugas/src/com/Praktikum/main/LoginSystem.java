package com.Praktikum.main;
import com.Praktikum.Users.*;
import com.Praktikum.data.Item;

import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> itemList = new ArrayList<>();


    static  {
        userList.add(new Mahasiswa("Yossua Agung Budianto", "202410370110391"));
        userList.add(new Mahasiswa("Aditya Berwibawa", "202410370110407"));
        userList.add(new Admin("SayaAdmin", "sayaLupa123"));
    }

    public static User login(String user, String pass){
        for (User users : userList){

            if (users instanceof Mahasiswa mhs && users.getNama().equalsIgnoreCase(user) && users.getNim().equalsIgnoreCase(pass) ){
                return mhs;
            }
            else if (users instanceof Admin admin && users.getNama().equalsIgnoreCase(user) && users.getNim().equalsIgnoreCase(pass)){
                return admin;
            }
        }
        return null;
    }
    public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);



        int pilihan;
        int limit = 0;
        boolean bool = true;
        do {//menu
            System.out.println("Menu: ");
            System.out.println("1. Login");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan login: ");
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1: //admin
                        System.out.print("Masukkan username/nama: ");
                        String inUser = scanner.nextLine();
                        System.out.print("Masukkan password/nim: ");
                        String pass = scanner.nextLine();

                        User userLoggined = login(inUser, pass);

                        if (userLoggined != null) {
                            System.out.println("Selamat Datang!");
                            if (userLoggined instanceof Mahasiswa) {
                                userLoggined.displayInfo();
                                userLoggined.displayAppMenu();
                            } else {
                                userLoggined.displayInfo();
                                userLoggined.displayAppMenu();
                            }
                        } else {
                            System.out.println("password atau username salah");
                            limit++;
                        }
                    case 3:
                        System.out.println("babayyy!!");
                        bool = false;
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("input harus angka");
                limit++;
                continue;
            }
        }while (bool || limit != 3);

    }

}
