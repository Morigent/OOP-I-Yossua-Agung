package com.Praktikum.Users;

import com.Praktikum.Action.AdminAction;
import com.Praktikum.data.Item;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.Praktikum.main.LoginSystem.itemList;
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
        System.out.print("pilihan:");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        input.nextLine();
        switch (i){
            case 1:
                manageItems();
                break;
            case 2:
                manageUsers();
                break;
            case 0:
                break;
            default:
                System.out.println("Input error");
        }
    }

    @Override
    public void manageItems() {
        try{
            System.out.println("Menu kelola Laporan Kehilangan:");
            System.out.println("1. Lihat semua barang");
            System.out.println("2. tandai barang yang sudah diambil(Claimed)");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1:
                    System.out.println("==============================================================================");
                    System.out.println("| Name            | Description               | Location        | Status     |");
                    System.out.println("==============================================================================");
                    for(Item item : itemList) {
                        System.out.println(item);
                        System.out.println("==============================================================================");
                    }
                    break;
                case 2:
                    System.out.println("==============================================================================");
                    System.out.println("No | Name            | Description               | Location        | Status     |");
                    System.out.println("==============================================================================");
                    for(int i = 0; i < itemList.size(); i++) {
                        System.out.println(i + ". |" + "\t" + itemList.get(i).getItemName() + "\t" + itemList.get(i).getDescription() + "\t" + itemList.get(i).getLocation()+ "\t" + itemList.get(i).getStatus());
                        System.out.println("==============================================================================");
                    }
                    System.out.print("Masukkan index yang ingin dirubah:");
                    try {
                        int index = input.nextInt();
                        input.nextLine();
                        if (0 > index && index < itemList.size()) {
                            itemList.get(index).setStatus("Claimed");
                            System.out.println("Status berhasil dirubah");
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException e ) {
                        System.out.println("index melebihi batas");
                    }
                    catch (InputMismatchException e){
                        System.out.println("Input Harus Angka");
                    }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Input Harus Angka");
        }
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
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            try {
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
                                }
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Babayy!");
                        con = false;
                        break;

                }
            }
            catch (InputMismatchException e){
                System.out.println("Input Harus Angka");
                continue;
            }
        }while (con);

    }
}
