module com.example.cseproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cseproject to javafx.fxml;
    exports com.example.cseproject;
}