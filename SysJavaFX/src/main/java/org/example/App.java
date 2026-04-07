package org.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

/**
 * Hello world!
 *
 */
public class App extends javafx.application.Application
{
    public static void main( String[] args ){
        launch(args);
    }
    {
        System.out.println( "Hello World!" );
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vfxml/vfxml.fxml"));
        Scene scene = new Scene(loader.load());
        //scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Calc Basic");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.sizeToScene();
        stage.show();
    }
}
