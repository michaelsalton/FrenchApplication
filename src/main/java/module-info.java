module com.example.frenchapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.frenchapplication to javafx.fxml;
    exports com.example.frenchapplication;
}