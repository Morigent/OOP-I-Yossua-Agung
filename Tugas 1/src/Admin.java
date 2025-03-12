import java.util.Scanner;

public class Admin {
    String username;
    String password;
    boolean loginAdmin = false;
    Scanner input = new Scanner(System.in);
    void loginAdmin(String inputUser, String inputPass){
        if(username.equals(inputUser) & password.equals(inputPass))
            loginAdmin = true;
    }
}
