module Action.tugas_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens tugas_javafx to javafx.fxml;
    opens data;
    opens Users;
    exports tugas_javafx;
}