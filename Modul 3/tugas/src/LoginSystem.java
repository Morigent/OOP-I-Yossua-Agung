import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Admin admin1 = new Admin("sayaAdmin", "Sayalupa123");
        Mahasiswa mahasiswa1 = new Mahasiswa("Yossua Agung Budianto", "202410370110391");
        int pilihan;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan login: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

             switch (pilihan) {
                  case 1:
                     admin1.login();
                     break;
                  case 2:
                     mahasiswa1.login();
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
