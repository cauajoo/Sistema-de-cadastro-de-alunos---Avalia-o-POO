package br.com.poo.registrationsystem.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("cadastroView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cadastro");
        stage.setScene(scene);
        stage.show();

    }
}
