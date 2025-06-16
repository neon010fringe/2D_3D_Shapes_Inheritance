module com.example.cmsc_335_shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cmsc_335_shapes to javafx.fxml;
    exports com.example.cmsc_335_shapes;
}