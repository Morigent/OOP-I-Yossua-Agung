package application.codelab;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private int randomNumber;
    private int attemptCount;
    private Label attemptLabel;
    private Label resultLabel;
    private TextField inputField;
    private Button guessButton;

    @Override
    public void start(Stage stage) {

        mulaiGame();


        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-border-color: #ccc; -fx-border-width: 1px; -fx-background-color:#c3e3fa;");


        Label title = new Label("🎯 Hayo tebakk 1 - 100!");
        title.setStyle(
                "-fx-font-family: 'Bebas neue';" +
                        "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: #004a80;" +
                        "-fx-text-alignment: center;"
        );

        inputField = new TextField();
        inputField.setPromptText("Masukkan tebakan...");

        guessButton = new Button("🎲 Coba tebak!");
        guessButton.setStyle("-fx-background-color: #2ed600; -fx-text-fill:white;");

        resultLabel = new Label();
        resultLabel.setStyle(
                "-fx-font-family: 'Bebas neue';" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: #212121;" +
                        "-fx-text-alignment: center;"
        );

        attemptLabel = new Label("Percobaan ke: 0");

        HBox inputBox = new HBox(10);
        inputBox.setAlignment(Pos.CENTER);
        inputBox.getChildren().addAll(inputField, guessButton);

        Separator separator = new Separator();
        separator.setPadding(new Insets(10, 0, 10, 0));

        root.getChildren().addAll(title, inputBox, resultLabel, attemptLabel, separator);


        guessButton.setOnAction(event -> handleGuess());


        Scene scene = new Scene(root, 500, 400);
        scene.setFill(Color.TRANSPARENT);
        stage.setTitle("Tebak Angka Advance");
        stage.setScene(scene);
        stage.show();
    }

    private void mulaiGame() {
        randomNumber = (int)(Math.random() * 101) + 1; // 1-100
        attemptCount = 0;
        if (attemptLabel != null) {
            attemptLabel.setText("Percobaan ke: 0");
        }
        if (resultLabel != null) {
            resultLabel.setText("");
            resultLabel.setStyle("-fx-text-fill: #212121;");
        }
        if (inputField != null) {
            inputField.clear();
        }
        if (guessButton != null) {
            guessButton.setText("🎲 Coba tebak!");
        }
    }

    private void handleGuess() {
        try {
            int guess = Integer.parseInt(inputField.getText());
            attemptCount++;
            attemptLabel.setText("Percobaan ke: " + attemptCount);

            if (guess == randomNumber) {
                resultLabel.setText("Horeeee beneerrrr!!!");
                resultLabel.setStyle("-fx-text-fill:#2ecc71;");
                guessButton.setText("Main Lagi");

                // Ubah handler untuk memulai game baru
                guessButton.setOnAction(event -> {
                    mulaiGame();
                    guessButton.setOnAction(e -> handleGuess()); // Kembalikan handler asli
                });
            }
            else if (guess > randomNumber) {
                resultLabel.setText("KEBESARAAAAANNN");
                resultLabel.setStyle("-fx-text-fill:#ff6d05;");
            }
            else {
                resultLabel.setText("kekecilan");
                resultLabel.setStyle("-fx-text-fill:#3498db;");
            }
        }
        catch (NumberFormatException e) {
            resultLabel.setText("Input harus angka!");
            resultLabel.setStyle("-fx-text-fill:#e74c3c;");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}