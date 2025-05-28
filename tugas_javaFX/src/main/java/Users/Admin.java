package Users;

import java.util.Scanner;

public class Admin extends User {
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

}
