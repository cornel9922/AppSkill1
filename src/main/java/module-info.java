module main.appskill1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens main.appskill1 to javafx.fxml;
    exports main.appskill1;
}