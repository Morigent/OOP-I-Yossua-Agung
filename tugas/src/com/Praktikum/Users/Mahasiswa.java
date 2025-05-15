package com.Praktikum.Users;

import com.Praktikum.Action.MahasiswaAction;
import com.Praktikum.data.Item;

import java.util.Scanner;

import static com.Praktikum.main.LoginSystem.itemList;

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
    public void displayInfo(){
        System.out.println("Login sebagai Users.Mahasiswa berhasil.");

        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }

    @Override
    public void displayAppMenu() {
        boolean con = true;
        while(con){
            int i;
            System.out.println("menu:");
            System.out.println("1. Laporan barang temuan/hilang");
            System.out.println("2. Lihat daftar laporan");
            System.out.println("0. logout");
            System.out.print("Pilihan: ");
            i = input.nextInt();
            input.nextLine();
            switch (i) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItem();
                    break;
                case 0:
                    con = false;
                    break;
                default:
                    System.out.println("input Salah!");

                }
        }


    }

    @Override
    public void reportItem() {

        String itemName;
        String description;
        String location;

        System.out.printf("Nama Barang yang hilang atau ditemukan: ");
        itemName = input.nextLine();
        System.out.printf("Deskripsi Barang: ");
        description = input.nextLine();
        System.out.printf("Lokasi ditemukan: ");
        location = input.nextLine();

        itemList.add(new Item(itemName,description,location));
        viewReportedItem();
    }

    @Override
    public void viewReportedItem() {
        for (Item item : itemList){
            System.out.println("==============================================================================");
            System.out.println("| Name            | Description               | Location        | Status     |");
            System.out.println("==============================================================================");
            System.out.println(item);
            System.out.println("==============================================================================");
        }
    }
}
