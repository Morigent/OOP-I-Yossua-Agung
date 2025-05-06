package com.Praktikum.Users;

import com.Praktikum.Action.MahasiswaAction;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaAction {
    private String nama;
    private String nim;
    Scanner input = new Scanner(System.in);
    
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
        this.nama = nama;
        this.nim = nim;
    }
    public Mahasiswa(){
        super("","");
    }

    @Override
    public boolean login(String user, String pass) {
        if (user.equalsIgnoreCase(nama)&&pass.equals(nim)){
            return true;
        }
        else{
            return false;
        }
    }


    @Override
    public void displayInfo(){
        System.out.println("Login sebagai Users.Mahasiswa berhasil.");

        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }

    @Override
    public void displayAppMenu() {
        int i = 0;
        System.out.println("menu:");
        System.out.println("1. Laporan barang temuan/hilang");
        System.out.println("2. Lihat daftar laporan");
        System.out.println("0. logout");
        input.nextInt(i);
        input.nextLine();
        switch (i){
            case 1:
                reportItem();
                break;
            case 2:
                viewReportedItem();
                break;
            case 0:
                break;
            default:
                System.out.println("Input error");
        }


    }

    @Override
    public void reportItem() {
        System.out.printf("Nama Barang yang hilang atau ditemukan: ");
        input.nextLine();
        System.out.printf("Deskripsi Barang: ");
        input.nextLine();
        System.out.printf("Lokasi ditemukan: ");
        input.nextLine();
    }

    @Override
    public void viewReportedItem() {
        System.out.println(">>Fitur lihat laporan belum tersedia<<");
    }
}
