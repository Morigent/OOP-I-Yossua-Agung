package Users;


import Main.LoginSystem;
import data.Item;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.Scanner;


import static Main.LoginSystem.itemList;

public class Mahasiswa extends User  {
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

    public void displayMahasiswa(){
        VBox root = new VBox(10);
        root.setStyle("-fx-background-color: #390e4a;");

        Label hello = new Label();
        hello.setText("Hallo, " + nama);
        hello.setStyle("-fx-text-fill: white");

        Label title = new Label();
        title.setText("Laporkan Barang hilang/temuan 📦");
        title.setStyle("-fx-text-fill: white");

        TableColumn<Item, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));

        TableColumn<Item, String> deskirpCol = new TableColumn<>("Deskripsi");
        deskirpCol.setCellValueFactory(new PropertyValueFactory<>("description"));

        TableColumn<Item, String> locationCol = new TableColumn<>("Lokasi");
        deskirpCol.setCellValueFactory(new PropertyValueFactory<>("location"));

        TableColumn<Item,String> statusCol = new TableColumn<>("Status");
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        itemList.getColumns().addAll(namaCol, deskirpCol, locationCol, statusCol);

        root.getChildren().addAll(hello,title,itemList);

        itemList.setItems(LoginSystem.data);
        Scene scene = new Scene(root,400,200);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Mahasiswa");
        stage.show();

    }

}
