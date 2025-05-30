package Users;

import java.util.Scanner;
import Action.AdminAction;
import data.Item;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static Main.LoginSystem.*;


public class Admin extends User implements AdminAction {
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

    public void displayAdmin(){
        VBox root = new VBox(10);
        VBox kiri = new VBox(5);
        VBox kanan = new VBox(5);
        HBox table = new HBox(10);
        HBox kurleb = new HBox(5);

        Label halo = new Label();
        halo.setText("Hallo min");

        TableColumn<User, String> mahasiswaCol = new TableColumn<>("Nama");
        mahasiswaCol.setCellValueFactory(new PropertyValueFactory<>("nama"));

        TableColumn<User, String> nimCol = new TableColumn<>("NIM");
        nimCol.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TextField nama = new TextField();
        nama.setPromptText("Nama");

        TextField nim = new TextField();
        nim.setPromptText("NIM");

        Button remove = new Button("Hapus");

        Button add = new Button("Tambah");

        userList.getColumns().addAll(mahasiswaCol,nimCol);

        kurleb.getChildren().addAll(nama,nim,add,remove);

        kiri.getChildren().addAll(userList,kurleb);

        //============================================================================

        TableColumn<Item, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));

        TableColumn<Item, String> deskirpCol = new TableColumn<>("Deskripsi");
        deskirpCol.setCellValueFactory(new PropertyValueFactory<>("description"));

        TableColumn<Item, String> locationCol = new TableColumn<>("Lokasi");
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));

        TableColumn<Item,String> statusCol = new TableColumn<>("Status");
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        itemList.getColumns().addAll(namaCol, deskirpCol, locationCol, statusCol);

        Button claimed = new Button("Tandai Claimed");

        kanan.getChildren().addAll(itemList, claimed);

        //======================================================================

        table.getChildren().addAll(kiri,kanan);

        root.getChildren().addAll(halo,table);

        Scene scene = new Scene(root,800,600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void manageItems() {

    }

    @Override
    public void manageUsers() {

    }
}
