module application.codelab {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.codelab to javafx.fxml;
    exports application.codelab;
}