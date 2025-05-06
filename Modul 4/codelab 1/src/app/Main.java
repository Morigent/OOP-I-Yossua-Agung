package app;
import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
            Buku buku = new NonFiksi ("Bitcoin Psychology", "Kalimasada", "Keuangan");
            Buku buku1 =  new Fiksi("Llama - Llama red pajama", "Anna Dewdney","Buku Tidur");
            buku.displayInfo();
            buku1.displayInfo();

            Anggota saya = new Anggota("Yossua Agung Budianto","i391");
            Anggota teman = new Anggota("Muhammad Aditya Wibawa", "i407");

            saya.pinjamBuku(buku.getJudul());
            teman.pinjamBuku(buku1.getJudul(), 7);
            System.out.println();

            teman.kembalikanBuku(buku1.getJudul());
            saya.kembalikanBuku(buku.getJudul());
    }
}