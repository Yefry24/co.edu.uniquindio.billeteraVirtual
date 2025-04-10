package co.edu.uniquindio.billeteravirtual.billeteravirtual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TransaccionApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TransaccionApplication.class.getResource("Usuario.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("App Transaccion");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}