module org.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    opens org.example.designpattternscode.Singleton to javafx.graphics;

    // This allows the Main class to be accessible by the JavaFX launcher
    exports org.example.designpattternscode.Singleton;
}