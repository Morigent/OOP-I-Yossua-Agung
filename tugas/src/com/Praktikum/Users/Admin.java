package com.Praktikum.Users;

import com.Praktikum.Action.AdminAction;

import java.util.Scanner;
import static com.Praktikum.main.LoginSystem.userList;

public class Admin extends User implements AdminAction {
    private String username;
    private String password;
    Scanner input = new Scanner(System.in);

    public Admin (String username, String password){
        super(username, password);
        this.username = username;
        this.password = password;
    }
    public Admin (){
        super("","");
        //
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
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
        int p = 0;
        String nama;
        String nim;
        boolean con = true;
        do {
            System.out.println("Menu kelola data mahasiswa:");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.print("Masukkan pilihan: ");
            p = input.nextInt();
            input.nextLine();

            switch (p) {
                case 1:
                    System.out.printf("Masukkan Nama Mahasiswa: ");
                    nama = input.nextLine();
                    System.out.printf("Masukkan Nim mahasiswa: ");
                    nim = input.nextLine();

                    userList.add(new Mahasiswa(nama, nim));
                    System.out.println("mahasiswa ditambahkan");
                    con = false;
                    break;
                case 2:
                    System.out.printf("Masukkan Nim mahasiswa: ");
                    nim = input.nextLine();

                    for (int i = 0; i < userList.size(); i++) {
                        User user = userList.get(i);
                        if (user instanceof Mahasiswa) {
                            Mahasiswa mhs = (Mahasiswa) user;
                            if (mhs.getNim().equals(nim)) {
                                userList.remove(i);
                                System.out.println("mahasiswa dihapus");
                                con = false;
                            }
                        }
                    }
            }
        }while (!con);

    }
}
