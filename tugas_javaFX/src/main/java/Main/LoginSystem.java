package Main;
import Users.Admin;
import Users.Mahasiswa;
import Users.User;
import data.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;


import java.util.ArrayList;
public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static TableView<Item> itemList = new TableView<>();

    static {
        itemList.getItems().addAll(
                new Item("Hape", "Redmi Note 11", "Lab A-B"),
                new Item("Buku", "Warna Hijau", "Lab C-D")
        );
    };

    static  {
        userList.add(new Mahasiswa("Yossua Agung Budianto", "202410370110391"));
        userList.add(new Mahasiswa("Aditya Berwibawa", "202410370110407"));
        userList.add(new Admin("SayaAdmin", "sayaLupa123"));
    }
}
