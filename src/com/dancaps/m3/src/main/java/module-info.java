module com.dancaps.m3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.dancaps.m3 to javafx.fxml;
    exports com.dancaps.m3;
}