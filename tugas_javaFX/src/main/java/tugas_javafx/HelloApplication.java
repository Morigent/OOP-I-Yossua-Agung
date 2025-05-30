package tugas_javafx;

import Users.Admin;
import Users.Mahasiswa;
import Users.User;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static Main.LoginSystem.*;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox(10);
        Separator separator = new Separator();
        separator.setPadding(new Insets(10,0,10,0));
        HBox hBox =new HBox(10);


            Label header = new Label("Login System: Lost & found 📦");
            header.setStyle("-fx-font-family:'Poppins'; -fx-font-weight: bold; -fx-text-fill:#ffffff; -fx-font-size: 20px;");

            TextField namaField = new TextField();
            namaField.setPromptText("Nama");
            namaField.setStyle("-fx-background-color: #170214; " +
                    "-fx-border-color: #7d2aa1; " +
                    "-fx-border-width: 1px; " +
                    "-fx-border-radius: 10px; " +
                    "-fx-prompt-text-fill:white;" +
                    "-fx-text-fill: white;");

            TextField nimField = new TextField();
            nimField.setPromptText("NIM");
            nimField.setStyle("-fx-background-color: #170214;" +
                    "-fx-border-color: #7d2aa1; " +
                    "-fx-border-width: 1px;" +
                    "-fx-border-radius: 10px; " +
                    "-fx-prompt-text-fill:white;" +
                    "-fx-text-fill: white;");
            Label valid = new Label();
            Button login = new Button("Login");
            login.setStyle("-fx-text-fill: white; " +
                    "-fx-background-color: #7d2aa1");

            hBox.setAlignment(Pos.CENTER);
            hBox.setStyle("-fx-background-color: #170214;");

            root.setStyle("-fx-background-color: #170214;");
            root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(header, namaField, nimField, valid, login);
            hBox.getChildren().addAll(root);

            root.getChildren().addAll();

            login.setOnAction(event -> {
                String nama = namaField.getText();
                String nim = nimField.getText();
                for (User users : userList.getItems()) {
                    if (users instanceof Mahasiswa mahasiswa && nama.equalsIgnoreCase(users.getNama()) && nim.equalsIgnoreCase(users.getNim())) {
                        System.out.println("test");
                        mahasiswa.displayMahasiswa();
                        stage.close();
                    } else if (users instanceof Admin admin && nama.equalsIgnoreCase(users.getNama()) && nim.equalsIgnoreCase(users.getNim())) {
                        admin.displayAdmin();
                        System.out.println("admin");
                        stage.close();
                    }
                }
            });



        Scene scene = new Scene(hBox, 400, 300);
        stage.setTitle("Lost & found kampus");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}