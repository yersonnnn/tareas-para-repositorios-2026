module org.example {
// ═══ Módulos JavaFX requeridos ═══
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
// ═══ Abrir paquetes a JavaFX para reflexión (FXML + controllers) ═══
    opens org.example to javafx.fxml;
    opens org.example.controller to javafx.fxml;
// ═══ Exportar paquete principal ═══
    exports org.example;
}
