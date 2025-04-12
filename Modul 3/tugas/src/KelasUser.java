import java.util.Scanner;

public class KelasUser {
    private String nama;
    private long NIM;

    public KelasUser(String nama, long NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    void setNama (String nama){
        this.nama = nama;
    }

    String getNama(){
        return nama;
    }

    void setNIM(long NIM){
        this.NIM = NIM;
    }
    long getNIM(){
        return NIM;
    }
    void login(){
        String nama;
        long NIM;

        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.printf("Masukkan NIM: ");
        NIM = input.nextLong();

        if ()
    }
}
