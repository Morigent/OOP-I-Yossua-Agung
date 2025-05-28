module application.tugas_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.tugas_javafx to javafx.fxml;
    opens data;
    opens Users;
    exports application.tugas_javafx;
}