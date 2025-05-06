import java.util.Scanner;

public class Admin extends User {
    private String username;
    private String password;
    Scanner scanner = new Scanner(System.in);

    public Admin (String username, String password){
        super("", "");
        this.username = username;
        this.password = password;
    }

    @Override
    public void login(){
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPass = scanner.nextLine();

        if (this.username.equals(inputUsername) && this.password.equals(inputPass)){
            displayInfo();
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Login sebagai Admin berhasil.");
        System.out.println("Username: " + username);
    }

}
