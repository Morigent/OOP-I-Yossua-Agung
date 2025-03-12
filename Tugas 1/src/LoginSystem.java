import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Admin mimin = new Admin();
        Scanner input = new Scanner(System.in);
        byte inputUser;
        String inputNIM;
        String inputNama;
        String inputUsername;
        String inputPass;

        mahasiswa1.nama = "Yossua Agung B";
        mahasiswa1.nim = "202410370110391";

        mimin.username = "SayaAdmin123";
        mimin.password = "Sayalupa123";

        System.out.println("Menu: ");
        System.out.println("1. Login Mahasiswa");
        System.out.println("2. Login Admin");
        System.out.printf("Masukkan Pilihan(1/2): ");
        inputUser = input.nextByte();
        input.nextLine();

        switch (inputUser){
            case 1:
                System.out.printf("Masukkan Nama Mahasiswa:");
                inputNama = input.nextLine();

                System.out.printf("Masukkan NIM Mahasiswa:");
                inputNIM = input.nextLine();

                mahasiswa1.login(inputNama, inputNIM);

                if(mahasiswa1.login){
                    System.out.println("Login Mahasiswa Berhasil!");
                    mahasiswa1.displayInfo();
                }
                else{
                    System.out.println("Login Gagal");
                }
                break;
            case 2:
                System.out.printf("Masukkan Username Admin: ");
                inputUsername = input.nextLine();

                System.out.printf("Masukkan Password Admin: ");
                inputPass = input.nextLine();

                mimin.loginAdmin(inputUsername, inputPass);

                if(mimin.loginAdmin)
                    System.out.println("Login Admin Berhasil!");
                else
                    System.out.println("Login Admin Gagal");

                break;
        }



    }

}