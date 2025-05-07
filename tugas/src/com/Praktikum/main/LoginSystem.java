package com.Praktikum.main;
import com.Praktikum.Users.*;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        User [] users = { //object instance in array
                new Admin("sayaAdmin", "Sayalupa123"),
                new Mahasiswa("Yossua Agung Budianto", "202410370110391"),
                new Mahasiswa("Aditya Wibawa", "202410370110407")
        };

        int pilihan;
        do {//menu
            System.out.println("Menu: ");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan login: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

             switch (pilihan) {
                  case 1: //admin
                      System.out.print("Masukkan username: ");
                      String inUser = scanner.nextLine();
                      System.out.print("Masukkan password: ");
                      String pass = scanner.nextLine();
                      User userLoggined = null;

                      for (User user : users){
                          if (user.login(inUser,pass)){
                              userLoggined = new Admin(inUser,pass);
                              break;
                          }
                      }
                      if (userLoggined != null){
                          System.out.println("berhasil!");
                          userLoggined.displayAppMenu();
                      }
                      else {
                          System.out.println("login gagal");
                      }
                      break;
                 case 2: //mahasiswa
                     System.out.print("Masukkan Nama: ");
                     inUser = scanner.nextLine();
                     System.out.print("Masukkan NIM: ");
                     pass = scanner.nextLine();
                      userLoggined = null;

                     for (User user : users){
                         if (user.login(inUser,pass)){
                             userLoggined = new Mahasiswa(inUser,pass);
                             break;
                         }
                     }
                     if (userLoggined != null){
                         System.out.println("berhasil!");
                         userLoggined.displayAppMenu();
                     }
                     else {
                         System.out.println("login gagal");
                     }
                     break;
                 case 3:
                      System.out.println("babayyy!!");
                      break;
                  default:
                      System.out.println("Pilihan invalid.");
                      break;
             }
        }while (pilihan != 3);

    }

}
